package manager;

import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * This version of the TwoWaySerialComm example makes use of the
 * SerialPortEventListener to avoid polling.
 *
 */

public class MySerial {
    private DataCallBack mDataCallBack;
    public MySerial(DataCallBack dataCallBack){
        mDataCallBack=dataCallBack;
    }
    public SerialPort connect (String portName, int rate) throws Exception
    {
        SerialPort serialPort =null;
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if ( portIdentifier.isCurrentlyOwned() )
        {
            System.out.println("Error: Port is currently in use");
        }
        else
        {
            CommPort commPort = portIdentifier.open(this.getClass().getName(),2000);

            if ( commPort instanceof SerialPort)
            {
                serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(rate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

                InputStream in = serialPort.getInputStream();

                serialPort.addEventListener(new SerialReader(in,mDataCallBack));
                serialPort.notifyOnDataAvailable(true);

            }
            else
            {
                System.out.println("Error: Only serial ports are handled by this example.");
            }
        }
        return serialPort;
    }

    /**
     * Handles the input coming from the serial port. A new line character
     * is treated as the end of a block in this example.
     */
    public static class SerialReader implements SerialPortEventListener
    {
        private InputStream in;
        private byte[] buffer = new byte[1024];

        private DataCallBack mDataCallBack;

        public SerialReader (InputStream in, DataCallBack dataCallBack)
        {
            this.in = in;
            this.mDataCallBack=dataCallBack;
        }

        public void serialEvent(SerialPortEvent arg0) {
            int data;

            try
            {
                int len = 0;
                while ( ( data = in.read()) > -1 )
                {
                    if ( data == '\n' ) {
                        break;
                    }
                    buffer[len++] = (byte) data;
                }
//                System.out.print(new String(buffer,0,len));
                if(this.mDataCallBack!=null){
                  mDataCallBack.onReceive(new String(buffer,0,len));
                }
            }
            catch ( IOException e )
            {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }

interface DataCallBack{
        void onReceive(String result);
}


    public static void main ( String[] args )
    {}
}
