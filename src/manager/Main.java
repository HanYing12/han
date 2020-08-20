package manager;

import gnu.io.SerialPort;

public class Main {

    public static void main(String[] args) {
        int rate=9600;

        String portName="COM3";

        SerialPort serialPort=null;

        try
        {
            serialPort= (new MySerial(new MySerial.DataCallBack() {
                @Override
                public void onReceive(String result) {
                    System.out.println("---接收到数据："+result);
                }
            })).connect(portName,rate);
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            serialPort.removeEventListener();
            serialPort.close();
        }
    }
}
