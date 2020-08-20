package JavaExample;
import java.util.ArrayList;
import java.util.List;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.StdCallLibrary;



/**
 * control title bar
 * 
 * @author Administrator
 * 
 */
public interface EslTest extends StdCallLibrary {
	EslTest Instance=(EslTest)Native.loadLibrary("C:\\Users\\Administrator\\Desktop\\WSL\\Release\\GenitopElecDll", EslTest.class);
		//Config the model of event
		public void SetEventWay(boolean bEventWay);
		
		//Get the modle of event
		public  boolean GetEventWay();
		//get the msg received
		public String GetReturnContent();
	/**
	 * Start the system
	 * 
	 * @param hwnd	handle
	 * @param controNo	controller number
	 * @param ip	IP Addrress
	 * @param ipara port
	 * @return
	 */
	public int PickupSys_StartUp(HWND hwnd, int ipara, String ip, int controNo);
	
	/**
	 * Close the system
	 * 
	 * @param controNo controller number
	 */
	public void PickupSys_ShutDown(int controNo);
	
	/**
	 * Z-command
	 * Initalize all of bars
	 * 
	 * @param controNo contoller
	 */
	public void PickupSysnew_Initializaton(int controNo);
	
	/**
	 * Pn
	 * 
	 *     struct pn_infor{
	 *     	unsigned short addr;
	 *     	unsigned char modem_no;
	 *     	char msg[PN_INFORMSG_LEN];
	 *     	unsigned int len;
	 *     };
	 *     addr:address
	 *     modern_no:model
	 *     msg：msg
	 *     len：message length
	 * 
	 * @param controNo	controller number
	 * @param arrs	the content
	 * @param eslNum
	 */
	public void PickupSysnew_Pn(int controNo, Structure[] arrs, byte eslNum);
	
	/**
	 * G--Command
	 * 
	 * @param controNo	controller number
	 * @param address	addresss
	 * @param onOff		Open(o)、Close(c)
	 */
	public void PickupSysnew_G(int controNo, int address, String onOff);

	/**
	 * T--command
	 * 
	 * @param controNo	
	 * @param address	
	 * @param ioput		Open(1)/Close(0)
	 */
	public void PickupSysnew_T(int controNo, int address, int ioput);
	
	/**
	 * Ac -Command 
	 * config the address of bars
	 * @param controNo		controller bar
	 * @param oldAddress	
	 * @param newAddress	
	 */
	public void PickupSysnew_Ac(int controNo, int oldAddress, int newAddress);
	
	/**
	 * Z1--Initialize special addresss
	 * 
	 * 
	 * @param controNo	
	 * @param address	
	 */
	public void PickupSysnew_Z1(int controNo, int address);
	
	/**
	 * Is--assigned address
	 * 
	 * @param controNo	
	 * @param address	
	 */
	public void PickupSysnew_Is(int controNo, int address);
	
	/**
	 * St
	 * 
	 * @param controNo	
	 */
	public void PickupSysnew_St(int controNo);
	
	/**
	 * Fu
	 * 
	 * 
	 * @param controNo	
	 * @param portNum	
	 * @param portId	
	 * @param eslNum	
	 * @param eslId		
	 * @param type		
	 * @param pickNo	
	 */
	public void PickupSysnew_Fu(int controNo, int portNum, int portId, int eslNum, int eslId, String type, String pickNo);
	
	
	/**
	 * P3-Command
	 * 
	 * 
	 * struct p3_infor{
	 * 	unsigned short addr;
	 * 	unsigned char modem_no;
	 * 	unsigned char display_setting;
	 * 	char msg[PN_INFORMSG_LEN];
	 * 	unsigned int len;
	 * };
	 * addr:
	 * modern_no:
	 * unsigned char display_setting;
	 * *************************************************************************************
	 * display_setting
	 * Table 1.						Display setting Bit Field 
	 * Bit								Description					Value 
	 * 0								blue setting				0/1 off/on
	 * 1								yellow setting				0/1 off/on
	 * 2								red setting					0/1 off/on 
	 * 3-4								led mode 					00   off 
	 * 																01 – blinking 
	 * 																10 – on  
	 * **************************************************************************************
	 * 
	 * msg：
	 * len：
	 * 
	 * @param controNo	
	 * @param arrs		
	 * @param eslNum	
	 */
	public void PickupSysnew_P3(int controNo, P3_infor[] arrs, byte eslNum);
	
	/**
	 * P4--Command
	 * 
	 * #define PN_INFORMSG_LEN	100
	 * struct p4_infor{
	 * 	unsigned short addr;
	 * 	unsigned char modem_no;
	 * unsigned char display_setting_default;
	 * unsigned char display_setting_Press;
	 * 	char msg[PN_INFORMSG_LEN];
	 * 	unsigned int len;
	 * };
	 * addr:
	 * modern_no:
	 * display_setting_default;
	 * /*************************************************************************************
	 * display_setting_default:
	 * Table 1.						Display setting Bit Field 
	 * Bit								Description					Value 
	 * 0								blue setting					0/1 off/on
	 * 1								yellow setting				0/1 off/on
	 * 2								red setting					0/1 off/on 
	 * 3-4								led mode 						00   off 
	 * 															01 – blinking 
	 * 															10 – on  
	 * **************************************************************************************
	 * 
	 * display_setting_Press;
	 * /*************************************************************************************
	 * display_setting_Press:
	 * Table 1.						Display setting Bit Field 
	 * Bit								Description					Value 
	 * 0								blue setting				     0/1 off/on
	 * 1								yellow setting				0/1 off/on
	 * 2								red setting					0/1 off/on 
	 * 3-4								led mode 					     00   off 
	 * 															01 – blinking 
	 * 															10 – on  
	 * 6                               clear bit                             1 - clear screen
	 * **************************************************************************************
	 * msg：
	 * len：
	 * 
	 * @param controNo	
	 * @param arrs		
	 * @param eslNum	
	 */
	public void PickupSysnew_P4(int controNo, P4_infor[] arrs, byte eslNum);
	
	/***
	 * 
	 * @param controNo	
	 * @param arrs		
	 * @param eslNum	
	 */
	public void PickupSysnew_A1(int controNo, A1_infor[] arrs, byte eslNum );
	//A1
	/***
	 * 
	 * @author Administrator
	 *
	 */
	public static class A1_infor extends Structure
	{
		// bar address
		public int addr = 1;
		//model
		public byte modemNo = 1;
		// HUD_COLOR
		public byte HUD_Color = (byte)1;
		//BK-COLOR
		public byte Bk_Color = (byte)1;

		// TEXT_COLOR
		public byte Text_Color = (byte)1;
		// CONTENT
		public byte[] msg = new byte[300];
		// MESSAGE LENGTH
		public int len;
		public A1_infor()
		{
			setAlignType(ALIGN_NONE);
		}
		@Override
			protected List<String> getFieldOrder()
		{
			List<String> retList = new ArrayList<String>();
			retList.add("addr");
			retList.add("modemNo");
			retList.add("HUD_Color");
			retList.add("Bk_Color");
			retList.add("Text_Color");
			retList.add("msg");
			retList.add("len");
			return retList;
		}
	}
	
	/**
	 * 
	 * @param controNo  
	 * @param arrs		
	 */
	public void PickupSysnew_A2(int controNo, A2_infor[] arrs );
	//A2
	/***
	 * 
	 * @author Administrator
	 *
	 */
	public static class A2_infor extends Structure
	{
	
		// message length
		public int len;
		// model number
		public byte modemNo = 1;
		// the config num
		public byte set_num = (byte)1;
		// content
		public byte[] msg = new byte[300];
	
		public A2_infor()
		{
			setAlignType(ALIGN_NONE);
		}
		@Override
			protected List<String> getFieldOrder()
		{
			List<String> retList = new ArrayList<String>();
			retList.add("len");
			retList.add("modemNo");
			retList.add("set_num");
			retList.add("msg");
			return retList;
		}
	}
	
	public void PickupSysnew_A3(int ctr_no,A3_infor[] arrs);
	/**
	 * A3
	 * 
	 * @author yinyulong
	 *
	 */
	public static class A3_infor extends Structure {
		// message length
		public int len;
		// model
		public byte modemNo = 1;
		// display set
		public byte set_num = (byte)1;
		// content
		public byte[] msg = new byte[300];
		public A3_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			retList.add("len");
			retList.add("modemNo");
			retList.add("set_num");
			retList.add("msg");
			
			return retList;
		}

	}
	//A4
	public void PickupSysnew_A4(int ctr_no,A4_infor[] arr);
	/**
	 * A4
	 * 
	 * @author yinyulong
	 *
	 */
	public static class A4_infor extends Structure {
	
		// model
		public byte modem_no = 1;
		// mumber
		public byte pos_num = (byte)1;

		public A4_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			retList.add("modem_no");
			retList.add("pos_num");		
			return retList;
		}

	}
	
	//A5
	public void PickupSysnew_A5(int ctr_no,A5_infor[] arr);
	/**
	 * A5
	 * 
	 * @author yinyulong
	 *
	 */
	public static class A5_infor extends Structure {
	
		// model
		public byte modem_no = 1;
		// number
		public byte ret_num = 1;
		

		public A5_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			retList.add("modem_no");
			retList.add("ret_num");		
			return retList;
		}

	}
	//IP-command
	public void PickupSysnew_IPSetting(int ctr_no,IP_infor[] arr);
	/**
	 * IP--struct 
	 * 
	 * @author yinyulong
	 *
	 */
	public static class IP_infor extends Structure {
	
		
		
		// message sended
		public byte[] msg = new byte[300];
		// model
		public int len;

		public IP_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			
			retList.add("msg");
			retList.add("len");		
			return retList;
		}

	}
	/**
	 * P3指令结构体
	 * 
	 * @author yinyulong
	 *
	 */
	public static class P3_infor extends Structure {
		// address
		public int addr = 1;
		// model
		public byte modemNo = 1;
		//display set
		public byte displaySet = (byte)140;
		// content
		public byte[] msg = new byte[300];
		// length
		public int len;
		
		public P3_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			retList.add("addr");
			retList.add("modemNo");
			retList.add("displaySet");
			retList.add("msg");
			retList.add("len");
			return retList;
		}

	}
	
	/**
	 * P4
	 * 
	 * @author 
	 *
	 */
	public static class P4_infor extends Structure {
		// bar --address
		public int addr = 1;
		// model
		public byte modemNo = 1;
		// display default
		public byte displaySet = (byte)138;
		// diplay pressed
		public byte displaySetPress = (byte)140;
		// messsage
		public byte[] msg = new byte[300];
		// length
		public int len;
		
		public P4_infor() {
			setAlignType(ALIGN_NONE);
		}
		
		@Override
		protected List<String> getFieldOrder() {
			List<String> retList = new ArrayList<String>();
			retList.add("addr");
			retList.add("modemNo");
			retList.add("displaySet");
			retList.add("displaySetPress");
			retList.add("msg");
			retList.add("len");
			return retList;
		}

	}
}



