package JavaExample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;

import JavaExample.EslTest;

//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;

//import net.miginfocom.swing.MigLayout;

import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;

import java.awt.Canvas;

import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import javax.swing.JFrame;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;

import java.awt.CardLayout;

import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
//import com.jgoodies.forms.factories.FormFactory;

import javax.swing.ScrollPaneConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JavaExample extends JFrame {

	private JTextField textIP;
	private JTextField textPort;
	private JTextField textNum;
	private JTextField textAddInitBegin;
	private JTextField textAddInitEnd;
	private JTextField textAssign;
	
	private JTextArea textMsg;
	public static EslTest test;
	//TabCtrl
	private  final JButton[] btnTab = new JButton[9];
	//the way of light
    final byte LED_Blue_On    		=  (0x01);
	final byte LED_Green_On	 		= (0x01<<1);
	final byte LED_Red_On		 	= (0x01<<2);
	final byte LED_Clear_bit		= (0x01<<6);

	final byte LED_Mode_Off   		= (0x00<<3);
	final byte LED_Mode_Blinking	= (0x01<<3);
	final byte LED_mode_On   		= (0x02<<3);
	final byte LED_mode_clear   	= (~(0x03<<3));
	
	final byte  T_RED  				= 0x01 << 2;
	final byte T_GREEN              = 0x01 << 1;
	private JPanel panel;
	private CardLayout Card;
	//private EslTest test = EslTest.Instance; 
	
	private boolean m_bIsCon = false;//the status internet
	private boolean m_bIsStart = false;//is connect pressed?
	private JTextField textP4Addr1;
	private JTextField textP4Addr2;
	private JTextField textP4Model;
	private JTextField textP4Content;
	private JTextField textP3Addr1;
	private JTextField textP3Addr2;
	private JTextField textP3Model;
	private JTextField textP3Content;
	private JTextField textA1Addr1;
	private JTextField textA1Addr2;
	private JTextField textA1Model;
	private JTextField textA1HUD;
	private JTextField textA1BK;
	private JTextField textA1TextColor;
	private JTextField textA1Content;
	private JPanel panelA2;
	private JLabel lblX_2;
	private JLabel lblY_2;
	private JLabel lblX_3;
	private JLabel label_39;
	private JLabel lblX_1;
	private JTextField textA2BKTailX1_1;
	private JTextField textA2BKTailX1_2;
	private JTextField textA2BKTailX1_3;
	private JTextField textA2BKTailX1_4;
	private JTextField textA2BKTailX1_5;
	private JTextField textA2BKTailX1_6;
	private JTextField textA2BKTailX1_7;
	private JTextField textA2BKTailX1_8;
	private JLabel lblY_1;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JLabel label_51;
	private JTextField textA2Y1_1;
	private JTextField textBKY1_1;
	private JTextField textBKX1_1;
	private JTextField textA2BKTailY1_1;
	private JTextField textA2FontDis_1;
	private JTextField textA2FontType_1;
	private JLabel label_40;
	private JLabel label_41;
	private JTextField textA2X1_1;
	private JTextField textA2X1_2;
	private JTextField textA2X1_3;
	private JTextField textA2X1_4;
	private JTextField textA2X1_5;
	private JTextField textA2X1_6;
	private JTextField textA2X1_7;
	private JTextField textA2X1_8;
	private JTextField textA2Y1_8;
	private JTextField textA2Y1_2;
	private JTextField textBKX1_2;
	private JTextField textBKY1_2;
	private JTextField textA2BKTailY1_2;
	private JTextField textA2FontDis_2;
	private JTextField textA2FontType_2;
	private JTextField textA2Y1_3;
	private JTextField textBKX1_3;
	private JTextField textBKY1_3;
	private JTextField textA2BKTailY1_3;
	private JTextField textA2FontDis_3;
	private JTextField textA2FontType_3;
	private JTextField textA2Y1_4;
	private JTextField textA2Y1_5;
	private JTextField textA2Y1_6;
	private JTextField textA2Y1_7;
	private JTextField textBKX1_4;
	private JTextField textBKY1_4;
	private JTextField textBKX1_5;
	private JTextField textA2FontType_4;
	private JTextField textA2FontDis_4;
	private JTextField textA2BKTailY1_4;
	private JTextField textBKY1_5;
	private JTextField textBKX1_6;
	private JTextField textBKY1_6;
	private JTextField textA2BKTailY1_5;
	private JTextField textA2FontDis_5;
	private JTextField textA2FontType_5;
	private JTextField textA2BKTailY1_6;
	private JTextField textBKX1_7;
	private JTextField textBKX1_8;
	private JTextField textBKY1_7;
	private JTextField textBKY1_8;
	private JTextField textA2BKTailY1_7;
	private JTextField textA2BKTailY1_8;
	private JTextField textA2FontDis_6;
	private JTextField textA2FontType_6;
	private JTextField textA2FontDis_7;
	private JTextField textA2FontType_7;
	private JTextField textA2FontDis_8;
	private JTextField textA2FontType_8;
	private JLabel lblNewLabel_4;
	private JTextField textA2Model;
	private JLabel label_42;
	private JTextField textA2Count;
	private JButton btnA2;
	private JPanel panelA3;
	private JLabel lblX;
	private JLabel label_19;
	private JLabel lblY;
	private JLabel lblX_4;
	private JLabel lblY_3;
	private JLabel lblX_5;
	private JLabel lblY_4;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JTextField textA3X1_8;
	private JTextField textA3X1_2;
	private JTextField textA3X1_1;
	private JTextField textA3X1_3;
	private JTextField textA3X1_7;
	private JTextField textA3X1_6;
	private JTextField textA3X1_5;
	private JTextField textA3X1_4;
	private JLabel label_29;
	private JTextField textA3Y1_1;
	private JTextField textA3BKX1_1;
	private JTextField textA3BKY1_1;
	private JTextField textA3BKTailX1_1;
	private JTextField textA3BKTailY1_1;
	private JTextField textA3Count_1;
	private JTextField textA3Fix_1;
	private JTextField textA3FontDis_1;
	private JTextField textA3Model;
	private JTextField textA3FontType_1;
	private JTextField textA3Y1_2;
	private JTextField textA3BKX1_2;
	private JTextField textA3Y1_3;
	private JTextField textA3Y1_4;
	private JTextField textA3Y1_5;
	private JTextField textA3Y1_6;
	private JTextField textA3Y1_7;
	private JTextField textA3Y1_8;
	private JTextField textA3BKX1_3;
	private JTextField textA3BKX1_4;
	private JTextField textA3BKX1_5;
	private JTextField textA3BKX1_6;
	private JTextField textA3BKX1_7;
	private JTextField textA3BKX1_8;
	private JTextField textA3BKY1_2;
	private JTextField textA3BKY1_3;
	private JTextField textA3BKTailX1_2;
	private JTextField textA3BKTailY1_2;
	private JTextField textA3Count_2;
	private JTextField textA3Fix_2;
	private JTextField textA3FontDis_2;
	private JTextField textA3FontType_2;
	private JTextField textA3BKY1_4;
	private JTextField textA3BKY1_5;
	private JTextField textA3BKY1_6;
	private JTextField textA3BKY1_7;
	private JTextField textA3BKY1_8;
	private JTextField textA3BKTailX1_3;
	private JTextField textA3BKTailX1_4;
	private JTextField textA3BKTailX1_5;
	private JTextField textA3BKTailX1_6;
	private JTextField textA3BKTailX1_7;
	private JTextField textA3BKTailX1_8;
	private JTextField textA3BKTailY1_3;
	private JTextField textA3BKTailY1_4;
	private JTextField textA3BKTailY1_5;
	private JTextField textA3BKTailY1_6;
	private JTextField textA3BKTailY1_7;
	private JTextField textA3BKTailY1_8;
	private JTextField textA3Count_3;
	private JTextField textA3Fix_3;
	private JTextField textA3FontDis_3;
	private JTextField textA3FontType_3;
	private JTextField textA3Count_4;
	private JTextField textA3Count_5;
	private JTextField textA3Count_6;
	private JTextField textA3Count_7;
	private JTextField textA3Count_8;
	private JTextField textA3Fix_4;
	private JTextField textA3Fix_5;
	private JTextField textA3Fix_6;
	private JTextField textA3Fix_7;
	private JTextField textA3Fix_8;
	private JTextField textA3FontDis_4;
	private JTextField textA3FontDis_5;
	private JTextField textA3FontDis_6;
	private JTextField textA3FontDis_7;
	private JTextField textA3FontDis_8;
	private JTextField textA3FontType_4;
	private JTextField textA3FontType_5;
	private JTextField textA3FontType_6;
	private JTextField textA3FontType_7;
	private JTextField textA3FontType_8;
	private JLabel label_15;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_53;
	private JLabel label_52;
	private JTextField textA3Count;
	private JButton btnA3;
	private JLabel label_20;
	private JTextField textA2FontSize_1;
	private JTextField textA2FontSize_2;
	private JTextField textA2FontSize_3;
	private JTextField textA2FontSize_4;
	private JTextField textA2FontSize_8;
	private JTextField textA2FontSize_7;
	private JTextField textA2FontSize_6;
	private JTextField textA2FontSize_5;
	private JLabel label_35;
	private JTextField textA3FontSize_1;
	private JTextField textA3FontSize_2;
	private JTextField textA3FontSize_3;
	private JTextField textA3FontSize_4;
	private JTextField textA3FontSize_5;
	private JTextField textA3FontSize_6;
	private JTextField textA3FontSize_7;
	private JTextField textA3FontSize_8;
	private JPanel panelA4;
	private JPanel panelA5;
	private JTextField textA4Model;
	private JTextField textA4Center;
	private JTextField textA5Model;
	private JTextField textA5Num;
	private JPanel panelIP;
	private JLabel lblIp_1;
	private JTextField textIPAddr;
	private JButton btnIP;
	private JTextField textField;
	private JPanel panel_T;
	private JPanel panel_G;
	private JPanel panel_Ac;
	private JTextField textTAddr;
	private JTextField textGAddr;
	private JTextField textGOper;
	private JTextField textAcOld;
	private JTextField textAcNew;
	private JPanel panel_1;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test = EslTest.Instance;
					JavaExample frame = new JavaExample();
					frame.setVisible(true);
					
					ThreadExample te = new ThreadExample(test,frame);
					Thread td = new Thread(te);
					td.start();
					
					frame.BtnTabCommand();
					test.SetEventWay(false);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//public String GetContent()
	public String GetContent()
	{
		return test.GetReturnContent();
	}
	
	/***
	 * display the text
	 * @param strContent   the text displayed
	 */
	public void AppendString(String strContent)
	{
		int iLen = textMsg.getLineCount();
		if(iLen == 9)	textMsg.setText("");		//clear the JTextArea
		
		textMsg.append(strContent);				//display the content
		textMsg.append("\r\n");
		
	}
	
	/***
	 * connect the server
	 * @return
	 */
	public boolean Connect()						//connect the server
	{
		test.SetEventWay(false);
		String strIP = textIP.getText();
		int iPort = Integer.parseInt(textPort.getText());
		int iNum  = Integer.parseInt(textNum.getText());
		int i =test.PickupSys_StartUp(null,iNum, strIP,iPort); 
		if(i == 0)
		{
			AppendString("connect successed !");
			m_bIsCon = true;
			//JOptionPane.showMessageDialog(null, "Warning", "Warnning", JOptionPane.ERROR_MESSAGE);
					
		}
		else
		{
			AppendString("failed to connect" + String.valueOf(i));
			m_bIsCon = false;
			//JOptionPane.showMessageDialog(null, "warning", "Warnning", JOptionPane.ERROR_MESSAGE);
		}
		return m_bIsCon;
	}
	/***
	 * Tab  button  command
	 */
	public void BtnTabCommand()
	{
		for(int i = 0; i < 9; i ++)
		{
			final int btnIndex = i;
			btnTab[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					BtnTabShow(btnTab[btnIndex].getText());
				}
			});
		}
	}
	
	/***
	 *  ture the TabCtrl function ture
	 * @param strBtnText the title of button clicked
	 */
	public void BtnTabShow(String strBtnText)
	{
		for(int i = 0; i < 9; i++)		//
		{
			String str = btnTab[i].getText();
			if(str.equals(strBtnText)) btnTab[i].setEnabled(false);
			else btnTab[i].setEnabled(true);
			Card.show(panel, "panel" + strBtnText);
		}
	}
	/***
	 * the model choosed for light
	 * @param bValue   the Initialize Value
	 * @param bSel     the mode
	 * @return
	 */
	public int LedModel(int bValue,int bSel)
	{
		switch(bSel)
		{
		case 0://led blinking
			bValue &=LED_mode_clear;
			bValue |= LED_Mode_Blinking;
			break;
		case 1://off
			bValue |= LED_Mode_Off;
			break;
		case 2://on
			bValue &=LED_mode_clear;
			bValue |= LED_mode_On;
			break;
		}
		return  bValue;
	}
	/**
	 *the color choosed for light
	 * @param bValue Initialize value
	 * @param bRed   Ret
	 * @param bGreen Green
	 * @param bBule  Blue
	 * @return
	 */
	public int LedLight(int bValue,boolean bRed,boolean bGreen,boolean bBule)
	{
		if(bRed)
			bValue |= LED_Red_On; 
		else 
			bValue &=~LED_Red_On;		//

		if(bGreen)
			bValue |= LED_Green_On; 
		else 
			bValue &=~LED_Green_On;

		if(bBule)
			bValue |= LED_Blue_On; 
		else 
			bValue &=~LED_Blue_On;
		return bValue;
	}
	/**
	 * Create the frame.
	 */
	public JavaExample(){
		setTitle("JavaExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(293, 10, 674, 690);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIp = new JLabel("IPAddr");
		lblIp.setBounds(0, 165, 54, 15);
		contentPane.add(lblIp);
		
		textIP = new JTextField();
		textIP.setText("192.168.0.244");
		textIP.setBounds(57, 162, 104, 21);
		contentPane.add(textIP);
		textIP.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Port");
		lblNewLabel.setBounds(171, 165, 54, 15);
		contentPane.add(lblNewLabel);
		
		textPort = new JTextField();
		textPort.setHorizontalAlignment(SwingConstants.LEFT);
		textPort.setText("6780");
		textPort.setBounds(221, 162, 66, 21);
		contentPane.add(textPort);
		textPort.setColumns(10);
		
		JLabel label = new JLabel("CtrlNum");
		label.setBounds(297, 165, 75, 15);
		contentPane.add(label);
		
		textNum = new JTextField();
		textNum.setText("1");
		textNum.setBounds(377, 162, 66, 21);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		final JButton btnConnect = new JButton("Connect");//connect the server
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				if(!m_bIsCon)
				{
					m_bIsCon = Connect();//connect the internet
				}
				else
				{
					test.PickupSys_ShutDown(Integer.parseInt(textNum.getText()));
					m_bIsCon = false;
					AppendString("Disconenct the server");
				}
				if(!m_bIsCon)
					btnConnect.setText("Connect");
				else
					btnConnect.setText("DisCon");
				/**/
				//test.PickupSys_StartUp(h, )
				//display the dialog
				//JOptionPane.showMessageDialog(null, "the text showed", 
						//"title", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		btnConnect.setBounds(467, 161, 92, 23);
		contentPane.add(btnConnect);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 190, 666, 4);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("BarAddr");
		lblNewLabel_1.setBounds(0, 205, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		textAddInitBegin = new JTextField();
		textAddInitBegin.setText("1");
		textAddInitBegin.setBounds(57, 202, 66, 21);
		contentPane.add(textAddInitBegin);
		textAddInitBegin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(134, 205, 27, 15);
		contentPane.add(lblNewLabel_2);
		
		textAddInitEnd = new JTextField();
		textAddInitEnd.setText("1");
		textAddInitEnd.setBounds(159, 202, 66, 21);
		contentPane.add(textAddInitEnd);
		textAddInitEnd.setColumns(10);
		
		JButton btnInit = new JButton("Init");			//初始化地址
		btnInit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//address begin
				int iInitBegin = Integer.parseInt(textAddInitBegin.getText());
				//address end
				int iInitEnd   = Integer.parseInt(textAddInitEnd.getText());
				//controller num
				int iNum  = Integer.parseInt(textNum.getText());
				for(int i = 0; i < (iInitEnd - iInitBegin + 1); i ++)
				{
					test.PickupSysnew_Z1(iNum, iInitBegin + i);
				}
				//the tex displayed
				String str = "Initialize：      " + "the range is  " + String.valueOf(iInitBegin)
						+"-----" + String.valueOf(iInitEnd);
				AppendString(str);
			}
		});
		btnInit.setBounds(235, 201, 93, 23);
		contentPane.add(btnInit);
		
		JLabel lblNewLabel_3 = new JLabel("BarAddr");
		lblNewLabel_3.setBounds(377, 204, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		textAssign = new JTextField();
		textAssign.setText("1");
		textAssign.setBounds(452, 202, 66, 21);
		contentPane.add(textAssign);
		textAssign.setColumns(10);
		
		JButton btnAssign = new JButton("Assgin");		//分配标签地址指令
		btnAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//结束地址
				int iAssign = Integer.parseInt(textAssign.getText());
				//控制器编号
				int iNum    = Integer.parseInt(textNum.getText());
				String str  = "Assigned addr：      " + "the address is    " + String.valueOf(iAssign);
				AppendString(str);
				test.PickupSysnew_Is(iNum, iAssign);
				
				
			}
		});
		btnAssign.setBounds(532, 201, 93, 23);
		contentPane.add(btnAssign);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(355, 190, 1, 45);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 233, 666, 2);
		contentPane.add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 666, 151);
		contentPane.add(scrollPane);
		
		textMsg = new JTextArea();
		textMsg.setLineWrap(true);
		scrollPane.setViewportView(textMsg);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 286, 666, 370);
		contentPane.add(panel);
		Card = new CardLayout(0, 0);
		panel.setLayout(Card);
		
		JPanel panelP3 = new JPanel();
		panel.add(panelP3, "panelP3");
		panelP3.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "P3-Command", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(8, 18, 640, 143);
		panelP3.add(panel_1);
		panel_1.setLayout(null);
		
		final JLabel label_10 = new JLabel("content");
		label_10.setBounds(9, 101, 54, 15);
		panel_1.add(label_10);
		
		JLabel label_6 = new JLabel("BarAddr");
		label_6.setBounds(9, 36, 54, 15);
		panel_1.add(label_6);
		
		textP3Content = new JTextField();
		textP3Content.setBounds(113, 98, 319, 21);
		panel_1.add(textP3Content);
		textP3Content.setText("1,2,3,4,5,瓶,");
		textP3Content.setColumns(10);
		
		textP3Addr1 = new JTextField();
		textP3Addr1.setBounds(73, 33, 66, 21);
		panel_1.add(textP3Addr1);
		textP3Addr1.setText("1");
		textP3Addr1.setColumns(10);
		
		JLabel label_7 = new JLabel("to");
		label_7.setBounds(127, 36, 45, 15);
		panel_1.add(label_7);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		textP3Addr2 = new JTextField();
		textP3Addr2.setBounds(170, 33, 66, 21);
		panel_1.add(textP3Addr2);
		textP3Addr2.setText("1");
		textP3Addr2.setColumns(10);
		
		JLabel label_8 = new JLabel("Model");
		label_8.setBounds(245, 36, 54, 15);
		panel_1.add(label_8);
		
		textP3Model = new JTextField();
		textP3Model.setBounds(289, 33, 66, 21);
		panel_1.add(textP3Model);
		textP3Model.setText("1");
		textP3Model.setColumns(10);
		
		JLabel label_9 = new JLabel("LedModel");
		label_9.setBounds(365, 36, 88, 15);
		panel_1.add(label_9);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		final JCheckBox checkBox = new JCheckBox("Red");
		checkBox.setBounds(413, 57, 55, 23);
		panel_1.add(checkBox);
		
		final JCheckBox checkBox_1 = new JCheckBox("Green");
		checkBox_1.setBounds(479, 57, 61, 23);
		panel_1.add(checkBox_1);
		
		final JCheckBox checkBox_2 = new JCheckBox("Blue");
		checkBox_2.setBounds(555, 57, 54, 23);
		panel_1.add(checkBox_2);
		
		final JComboBox comboBoxP3 = new JComboBox();
		comboBoxP3.setBounds(463, 33, 169, 21);
		panel_1.add(comboBoxP3);
		comboBoxP3.setModel(new DefaultComboBoxModel(new String[] {"Led blinking", "Led Off", "Led On"}));
		comboBoxP3.setSelectedIndex(0);
		
		JButton btnP3 = new JButton("P3");			//P3 command
		btnP3.setBounds(463, 97, 93, 23);
		panel_1.add(btnP3);
		btnP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//controller number
				int iNum    = Integer.parseInt(textNum.getText());
				//address begin
				int iBegin  = Integer.parseInt(textP3Addr1.getText());
				int iEnd    = Integer.parseInt(textP3Addr2.getText());
				//model num
				int iModel  = Integer.parseInt(textP3Model.getText());
				//mode choosed
				int iSel = comboBoxP3.getSelectedIndex();
				
				//the count of bar
				int iCount = iEnd - iBegin + 1;
				//pressed config
				int iColorSet = 0x80;
				iColorSet = LedModel(iColorSet,iSel);
				iColorSet = LedLight(iColorSet,checkBox.isSelected(),checkBox_1.isSelected()
						,checkBox_2.isSelected());
				
				String msg = textP3Content.getText();
				//
				int len = 0;
				try {
					len = msg.getBytes("GB2312").length;
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte[] msgBytes = null;
				try {
					msgBytes = msg.getBytes("GB2312");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//int len = msg.getBytes().length;
				//byte[] msgBytes = msg.getBytes();
				
				//the msg sended
				EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
						new EslTest.P3_infor().toArray(iCount);
				for(int i = 0; i < iCount; i ++)
				{
					msgStruts[i].addr = iBegin + i;
					msgStruts[i].modemNo = (byte)iModel;
					msgStruts[i].displaySet = (byte)iColorSet;
					
					msgStruts[i].msg = Arrays.copyOf(msgBytes, 300);
					msgStruts[i].len = len;
				}
				//send
				test.PickupSysnew_P3(iNum, msgStruts, (byte)iCount);			
			}
		});
		
		JPanel panelP4 = new JPanel();
		panel.add(panelP4, "panelP4");
		panelP4.setLayout(null);
		
		JLabel label_1 = new JLabel("BarAddr");
		label_1.setBounds(10, 21, 54, 15);
		panelP4.add(label_1);
		
		textP4Addr1 = new JTextField();
		textP4Addr1.setText("1");
		textP4Addr1.setBounds(63, 18, 66, 21);
		panelP4.add(textP4Addr1);
		textP4Addr1.setColumns(10);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setBounds(128, 21, 45, 15);
		panelP4.add(lblTo);
		
		textP4Addr2 = new JTextField();
		textP4Addr2.setText("1");
		textP4Addr2.setBounds(171, 18, 66, 21);
		panelP4.add(textP4Addr2);
		textP4Addr2.setColumns(10);
		
		JLabel label_2 = new JLabel("Model");
		label_2.setBounds(246, 21, 54, 15);
		panelP4.add(label_2);
		
		textP4Model = new JTextField();
		textP4Model.setText("1");
		textP4Model.setColumns(10);
		textP4Model.setBounds(290, 18, 66, 21);
		panelP4.add(textP4Model);
		
		JLabel label_3 = new JLabel("LedPrev");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(366, 21, 88, 15);
		panelP4.add(label_3);
		
		final JComboBox comboBoxP41 = new JComboBox();
		comboBoxP41.setModel(new DefaultComboBoxModel(new String[] {"Led blinking", "Led Off", "Led On"}));
		comboBoxP41.setSelectedIndex(0);
		comboBoxP41.setBounds(464, 18, 169, 21);
		panelP4.add(comboBoxP41);
		
		final JCheckBox checkBoxP4Red1 = new JCheckBox("Red");
		checkBoxP4Red1.setSelected(true);
		checkBoxP4Red1.setBounds(376, 45, 54, 23);
		panelP4.add(checkBoxP4Red1);
		
		final JCheckBox checkBoxP4Green1 = new JCheckBox("Green");
		checkBoxP4Green1.setBounds(447, 45, 61, 23);
		panelP4.add(checkBoxP4Green1);
		
		final JCheckBox checkBoxP4Blue1 = new JCheckBox("Blue");
		checkBoxP4Blue1.setBounds(523, 45, 72, 23);
		panelP4.add(checkBoxP4Blue1);
		
		final JCheckBox checkBoxP4Red2 = new JCheckBox("Red");
		checkBoxP4Red2.setBounds(93, 101, 55, 23);
		panelP4.add(checkBoxP4Red2);
		
		final JCheckBox checkBoxP4Green2 = new JCheckBox("Green");
		checkBoxP4Green2.setSelected(true);
		checkBoxP4Green2.setBounds(169, 101, 56, 23);
		panelP4.add(checkBoxP4Green2);
		
		final JCheckBox checkBoxP4Blue2 = new JCheckBox("Blue");
		checkBoxP4Blue2.setBounds(249, 100, 63, 23);
		panelP4.add(checkBoxP4Blue2);
		
		JLabel label_4 = new JLabel("LedAfter");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 73, 88, 15);
		panelP4.add(label_4);
		
		final JComboBox comboBoxP42 = new JComboBox();
		comboBoxP42.setModel(new DefaultComboBoxModel(new String[] {"Led blinking", "Led Off", "Led On"}));
		comboBoxP42.setSelectedIndex(0);
		comboBoxP42.setBounds(114, 70, 169, 21);
		panelP4.add(comboBoxP42);
		
		final JCheckBox checkBoxP4Clear = new JCheckBox("Clear");
		checkBoxP4Clear.setBounds(6, 101, 66, 23);
		panelP4.add(checkBoxP4Clear);
		
		//P4 command
		JButton btnP4 = new JButton("P4");
		btnP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				// controller number
				int iNum    = Integer.parseInt(textNum.getText());
				//address begin
				int iBegin  = Integer.parseInt(textP4Addr1.getText());
				int iEnd    = Integer.parseInt(textP4Addr2.getText());
				//model
				int iModel  = Integer.parseInt(textP4Model.getText());
				//model
				int iWayBefore = comboBoxP41.getSelectedIndex();
				int iWayLast = comboBoxP42.getSelectedIndex();
				
				//Bars count
				int iCount = iEnd - iBegin + 1;
				//press
				int iDefault = 0x80;
				int iPress   = 0x80;
				iDefault = LedModel(iDefault,iWayBefore);
				iPress = LedModel(iPress,iWayLast);
				
				//led choosed
				iDefault = LedLight(iDefault,checkBoxP4Red1.isSelected(),
						checkBoxP4Green1.isSelected(),checkBoxP4Blue1.isSelected());
				iPress = LedLight(iPress,checkBoxP4Red2.isSelected(),
						checkBoxP4Green2.isSelected(),checkBoxP4Blue2.isSelected());
				String msg = textP4Content.getText();
				
				
				
				
				int len = 0;
				
				try {
					len = msg.getBytes("GB2312").length;
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				byte[] msgBytes = null;

				try {
					msgBytes = msg.getBytes("GB2312");
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//the msg sended for P4
				EslTest.P4_infor[] msgStruts = (EslTest.P4_infor[])
						new EslTest.P4_infor().toArray(iCount);
				for(int i = 0; i < iCount; i ++)
				{
					msgStruts[i].addr = iBegin + i;
					msgStruts[i].modemNo = (byte)iModel;
					msgStruts[i].displaySet = (byte)iDefault;
					msgStruts[i].displaySetPress = (byte)iPress;
					msgStruts[i].msg = Arrays.copyOf(msgBytes, 300);
					msgStruts[i].len = len;
				}
				//send 
				test.PickupSysnew_P4(iNum, msgStruts, (byte)iCount);
				
				
			}
		});
		btnP4.setBounds(524, 126, 93, 23);
		panelP4.add(btnP4);
		
		JLabel label_5 = new JLabel("content");
		label_5.setBounds(10, 130, 54, 15);
		panelP4.add(label_5);
		
		textP4Content = new JTextField();
		textP4Content.setText("1,2,3,4,5,瓶,");
		textP4Content.setBounds(114, 127, 319, 21);
		panelP4.add(textP4Content);
		textP4Content.setColumns(10);
		
		JPanel panelA1 = new JPanel();
		panel.add(panelA1, "panelA1");
		panelA1.setLayout(null);
		
		JLabel label_11 = new JLabel("BarAddr");
		label_11.setBounds(35, 31, 54, 15);
		panelA1.add(label_11);
		
		textA1Addr1 = new JTextField();
		textA1Addr1.setText("1");
		textA1Addr1.setColumns(10);
		textA1Addr1.setBounds(88, 28, 84, 21);
		panelA1.add(textA1Addr1);
		
		JLabel label_12 = new JLabel("to");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(170, 31, 45, 15);
		panelA1.add(label_12);
		
		textA1Addr2 = new JTextField();
		textA1Addr2.setText("1");
		textA1Addr2.setColumns(10);
		textA1Addr2.setBounds(219, 28, 103, 21);
		panelA1.add(textA1Addr2);
		
		JLabel label_13 = new JLabel("model");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(372, 31, 54, 15);
		panelA1.add(label_13);
		
		textA1Model = new JTextField();
		textA1Model.setText("1");
		textA1Model.setColumns(10);
		textA1Model.setBounds(436, 28, 103, 21);
		panelA1.add(textA1Model);
		
		JLabel label_14 = new JLabel("HUD_CLR");
		label_14.setBounds(35, 80, 54, 15);
		panelA1.add(label_14);
		
		textA1HUD = new JTextField();
		textA1HUD.setText("1");
		textA1HUD.setColumns(10);
		textA1HUD.setBounds(88, 77, 84, 21);
		panelA1.add(textA1HUD);
		
		textA1BK = new JTextField();
		textA1BK.setText("1");
		textA1BK.setColumns(10);
		textA1BK.setBounds(236, 77, 103, 21);
		panelA1.add(textA1BK);
		
		JLabel label_16 = new JLabel("BK_CLR");
		label_16.setBounds(373, 80, 54, 15);
		panelA1.add(label_16);
		
		textA1TextColor = new JTextField();
		textA1TextColor.setText("1");
		textA1TextColor.setColumns(10);
		textA1TextColor.setBounds(436, 77, 103, 21);
		panelA1.add(textA1TextColor);
		
		JLabel label_17 = new JLabel("TEXT_CLR");
		label_17.setBounds(35, 135, 54, 15);
		panelA1.add(label_17);
		
		textA1Content = new JTextField();
		textA1Content.setText("WHERE IS ME");
		textA1Content.setColumns(10);
		textA1Content.setBounds(88, 132, 293, 21);
		panelA1.add(textA1Content);
		
		JButton btnA1 = new JButton("A1");// A1
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//Controller number
				int iNum    = Integer.parseInt(textNum.getText());
				//addresss begin
				int iBegin  = Integer.parseInt(textA1Addr1.getText());
				int iEnd    = Integer.parseInt(textA1Addr2.getText());
				int iModel  = Integer.parseInt(textA1Model.getText());
				
				//color
				int iHUD	= Integer.parseInt(textA1HUD.getText());
				int iBK		= Integer.parseInt(textA1BK.getText());
				int iTextClr = Integer.parseInt(textA1TextColor.getText());
				
				//content
				String msg = textA1Content.getText();
				
				int len = 0;
				
				try {
					len = msg.getBytes("GB2312").length;
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				byte[] msgBytes = null;

				try {
					msgBytes = msg.getBytes("GB2312");
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int iCount = iBegin -iEnd + 1;
				//the msg sended for A1
				EslTest.A1_infor[] msgStruts = (EslTest.A1_infor[])
						new EslTest.A1_infor().toArray(iCount);
				for(int i = 0; i < iCount; i ++)
				{
					msgStruts[i].addr = iBegin + i;
					msgStruts[i].modemNo = (byte)iModel;
					msgStruts[i].HUD_Color = (byte)iHUD;
					msgStruts[i].Bk_Color = (byte)iBK;
					msgStruts[i].Text_Color = (byte)iTextClr;
					msgStruts[i].msg = Arrays.copyOf(msgBytes, 300);
					msgStruts[i].len = len;
				}
				//send
				test.PickupSysnew_A1(iNum, msgStruts, (byte)iCount);
				
			}
		});
		btnA1.setBounds(422, 119, 93, 46);
		panelA1.add(btnA1);
		
		JLabel label_18 = new JLabel("BK_CLR");
		label_18.setBounds(182, 80, 54, 15);
		panelA1.add(label_18);
		
		panelA2 = new JPanel();
		panel.add(panelA2, "panelA2");
		panelA2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lblNewLabel_4 = new JLabel("model");
		panelA2.add(lblNewLabel_4, "4, 4, center, default");
		
		textA2Model = new JTextField();
		textA2Model.setText("1");
		panelA2.add(textA2Model, "6, 4, fill, default");
		textA2Model.setColumns(10);
		
		label_42 = new JLabel("Text_count");
		panelA2.add(label_42, "8, 4, center, default");
		
		textA2Count = new JTextField();
		textA2Count.setText("1");
		panelA2.add(textA2Count, "10, 4, fill, default");
		textA2Count.setColumns(10);
		
		btnA2 = new JButton("A2");//A2
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//the arrays
				String[][] strArray = new String[9][8];
				strArray[0][0] = textA2X1_1.getText();		//X-begin
				strArray[0][1] = textA2X1_2.getText();
				strArray[0][2] = textA2X1_3.getText();
				strArray[0][3] = textA2X1_4.getText();
				strArray[0][4] = textA2X1_5.getText();
				strArray[0][5] = textA2X1_6.getText();
				strArray[0][6] = textA2X1_7.getText();
				strArray[0][7] = textA2X1_8.getText();
				
				strArray[1][0] = textA2Y1_1.getText();		//Y-end
				strArray[1][1] = textA2Y1_2.getText();
				strArray[1][2] = textA2Y1_3.getText();
				strArray[1][3] = textA2Y1_4.getText();
				strArray[1][4] = textA2Y1_5.getText();
				strArray[1][5] = textA2Y1_6.getText();
				strArray[1][6] = textA2Y1_7.getText();
				strArray[1][7] = textA2Y1_8.getText();
				
				strArray[2][0] = textBKX1_1.getText();		//X-BK-BEGIN
				strArray[2][1] = textBKX1_2.getText();		
				strArray[2][2] = textBKX1_3.getText();		
				strArray[2][3] = textBKX1_4.getText();		
				strArray[2][4] = textBKX1_5.getText();		
				strArray[2][5] = textBKX1_6.getText();		
				strArray[2][6] = textBKX1_7.getText();		
				strArray[2][7] = textBKX1_8.getText();		
				
				strArray[3][0] = textBKY1_1.getText();		//Y-BK_BEGIN
				strArray[3][1] = textBKY1_2.getText();
				strArray[3][2] = textBKY1_3.getText();
				strArray[3][3] = textBKY1_4.getText();
				strArray[3][4] = textBKY1_5.getText();
				strArray[3][5] = textBKY1_6.getText();
				strArray[3][6] = textBKY1_7.getText();
				strArray[3][7] = textBKY1_8.getText();
		
				strArray[4][0] = textA2BKTailX1_1.getText();		//X-BK-END
				strArray[4][1] = textA2BKTailX1_2.getText();		
				strArray[4][2] = textA2BKTailX1_3.getText();		
				strArray[4][3] = textA2BKTailX1_4.getText();		
				strArray[4][4] = textA2BKTailX1_5.getText();		
				strArray[4][5] = textA2BKTailX1_6.getText();		
				strArray[4][6] = textA2BKTailX1_7.getText();		
				strArray[4][7] = textA2BKTailX1_8.getText();		
				
				strArray[5][0] = textA2BKTailY1_1.getText();		//Y-BK-END
				strArray[5][1] = textA2BKTailY1_2.getText();		
				strArray[5][2] = textA2BKTailY1_3.getText();		
				strArray[5][3] = textA2BKTailY1_4.getText();		
				strArray[5][4] = textA2BKTailY1_5.getText();		
				strArray[5][5] = textA2BKTailY1_6.getText();		
				strArray[5][6] = textA2BKTailY1_7.getText();		
				strArray[5][7] = textA2BKTailY1_8.getText();		
				
				strArray[6][0] = textA2FontDis_1.getText();			//FONT DISTANCE
				strArray[6][1] = textA2FontDis_2.getText();
				strArray[6][2] = textA2FontDis_3.getText();
				strArray[6][3] = textA2FontDis_4.getText();
				strArray[6][4] = textA2FontDis_5.getText();
				strArray[6][5] = textA2FontDis_6.getText();
				strArray[6][6] = textA2FontDis_7.getText();
				strArray[6][7] = textA2FontDis_8.getText();
				
				strArray[7][0] = textA2FontType_1.getText();		//FONT STYLE
				strArray[7][1] = textA2FontType_2.getText();
				strArray[7][2] = textA2FontType_3.getText();
				strArray[7][3] = textA2FontType_4.getText();
				strArray[7][4] = textA2FontType_5.getText();
				strArray[7][5] = textA2FontType_6.getText();
				strArray[7][6] = textA2FontType_7.getText();
				strArray[7][7] = textA2FontType_8.getText();
				
				
				strArray[8][0] = textA2FontSize_1.getText();		//font size
				strArray[8][1] = textA2FontSize_2.getText();
				strArray[8][2] = textA2FontSize_3.getText();
				strArray[8][3] = textA2FontSize_4.getText();
				strArray[8][4] = textA2FontSize_5.getText();
				strArray[8][5] = textA2FontSize_6.getText();
				strArray[8][6] = textA2FontSize_7.getText();
				strArray[8][7] = textA2FontSize_8.getText();
				
				//controller number
				int iNum    = Integer.parseInt(textNum.getText());
				//model
				int iModel  = Integer.parseInt(textA2Model.getText());
				//text_count
				int iCount  = Integer.parseInt(textA2Count.getText());
				//the msg sended for A2
				byte[] bMsg = new byte[300];
				int iIndex = 0;						//the index of char array
				byte[] bIntType = new byte[4];
			
				for(int i = 0; i < 300; i ++)
					bMsg[i] = 0x30;
				for(int i = 0; i < iCount; i ++)
				{
					for(int j = 0; j < 9; j ++)
					{
						
						if(j < 6)			//
						{
							bIntType = strArray[j][i].getBytes();
							int iLen = strArray[j][i].getBytes().length;
							System.arraycopy(bIntType, 0, bMsg, iIndex + 4 - iLen, iLen);
							iIndex += 4;														
						}
						else if(j == 7)				//deal with font style
						{
							bIntType = strArray[j][i].getBytes();
							System.arraycopy(bIntType, 0, bMsg, iIndex, 1);
							iIndex ++;
						}
						else if(j == 6)//deal with font distance
						{
							bIntType[0] = (byte)Integer.parseInt(strArray[j][i]);
							bIntType[0] += 0x30;
							System.arraycopy(bIntType, 0, bMsg, iIndex, 1);
							iIndex ++;
						}
						else //deal with font size
						{
							bIntType = strArray[j][i].getBytes();
							System.arraycopy(bIntType, 0, bMsg, iIndex, 2);
							iIndex += 2;
						}
						
					}
					
				}
				EslTest.A2_infor[] msgStruts = (EslTest.A2_infor[])
						new EslTest.A2_infor().toArray(1);
				for(int i = 0; i < 1; i ++)
				{
					msgStruts[i].modemNo = (byte)iModel;
					msgStruts[i].set_num = (byte)iCount;
					msgStruts[i].msg = Arrays.copyOf(bMsg, 300);
					msgStruts[i].len = iIndex;
				}
				//A2发送
				test.PickupSysnew_A2(iNum, msgStruts);			
			}
		});
		panelA2.add(btnA2, "12, 4");
		
		label_44 = new JLabel("Para1");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_44, "4, 6");
		
		label_45 = new JLabel("Para2");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_45, "6, 6");
		
		label_46 = new JLabel("Para3");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_46, "8, 6");
		
		label_47 = new JLabel("Para4");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_47, "10, 6");
		
		label_48 = new JLabel("Para5");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_48, "12, 6");
		
		label_49 = new JLabel("Para6");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_49, "14, 6");
		
		label_50 = new JLabel("Para7");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_50, "16, 6");
		
		label_51 = new JLabel("Para8");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		panelA2.add(label_51, "18, 6");
		
		label_41 = new JLabel("X-begin");
		panelA2.add(label_41, "2, 8, right, default");
		
		textA2X1_1 = new JTextField();
		textA2X1_1.setText("74");
		textA2X1_1.setColumns(10);
		panelA2.add(textA2X1_1, "4, 8, fill, default");
		
		textA2X1_2 = new JTextField();
		textA2X1_2.setText("64");
		textA2X1_2.setColumns(10);
		panelA2.add(textA2X1_2, "6, 8, fill, default");
		
		textA2X1_3 = new JTextField();
		textA2X1_3.setText("64");
		panelA2.add(textA2X1_3, "8, 8, fill, default");
		textA2X1_3.setColumns(10);
		
		textA2X1_4 = new JTextField();
		textA2X1_4.setText("64");
		panelA2.add(textA2X1_4, "10, 8, fill, default");
		textA2X1_4.setColumns(10);
		
		textA2X1_5 = new JTextField();
		textA2X1_5.setText("82");
		panelA2.add(textA2X1_5, "12, 8, fill, default");
		textA2X1_5.setColumns(10);
		
		textA2X1_6 = new JTextField();
		textA2X1_6.setText("286");
		panelA2.add(textA2X1_6, "14, 8, fill, default");
		textA2X1_6.setColumns(10);
		
		textA2X1_7 = new JTextField();
		textA2X1_7.setText("287");
		panelA2.add(textA2X1_7, "16, 8, fill, default");
		textA2X1_7.setColumns(10);
		
		textA2X1_8 = new JTextField();
		textA2X1_8.setText("1");
		panelA2.add(textA2X1_8, "18, 8, fill, default");
		textA2X1_8.setColumns(10);
		
		lblY_1 = new JLabel("Y-begin");
		panelA2.add(lblY_1, "2, 10, right, default");
		
		textA2Y1_1 = new JTextField();
		textA2Y1_1.setText("39");
		panelA2.add(textA2Y1_1, "4, 10, fill, default");
		textA2Y1_1.setColumns(10);
		
		textA2Y1_2 = new JTextField();
		textA2Y1_2.setText("70");
		panelA2.add(textA2Y1_2, "6, 10, fill, default");
		textA2Y1_2.setColumns(10);
		
		textA2Y1_3 = new JTextField();
		textA2Y1_3.setText("97");
		panelA2.add(textA2Y1_3, "8, 10, fill, default");
		textA2Y1_3.setColumns(10);
		
		textA2Y1_4 = new JTextField();
		textA2Y1_4.setText("124");
		panelA2.add(textA2Y1_4, "10, 10, fill, default");
		textA2Y1_4.setColumns(10);
		
		textA2Y1_5 = new JTextField();
		textA2Y1_5.setText("151");
		panelA2.add(textA2Y1_5, "12, 10, fill, default");
		textA2Y1_5.setColumns(10);
		
		textA2Y1_6 = new JTextField();
		textA2Y1_6.setText("206");
		panelA2.add(textA2Y1_6, "14, 10, fill, default");
		textA2Y1_6.setColumns(10);
		
		textA2Y1_7 = new JTextField();
		textA2Y1_7.setText("206");
		panelA2.add(textA2Y1_7, "16, 10, fill, default");
		textA2Y1_7.setColumns(10);
		
		textA2Y1_8 = new JTextField();
		textA2Y1_8.setText("1");
		panelA2.add(textA2Y1_8, "18, 10, fill, default");
		textA2Y1_8.setColumns(10);
		
		lblX_1 = new JLabel("X-BKBegin");
		panelA2.add(lblX_1, "2, 12, right, default");
		
		textBKX1_1 = new JTextField();
		textBKX1_1.setText("74");
		textBKX1_1.setColumns(10);
		panelA2.add(textBKX1_1, "4, 12, fill, default");
		
		textBKX1_2 = new JTextField();
		textBKX1_2.setText("64");
		panelA2.add(textBKX1_2, "6, 12, fill, default");
		textBKX1_2.setColumns(10);
		
		textBKX1_3 = new JTextField();
		textBKX1_3.setText("64");
		panelA2.add(textBKX1_3, "8, 12, fill, default");
		textBKX1_3.setColumns(10);
		
		textBKX1_4 = new JTextField();
		textBKX1_4.setText("64");
		panelA2.add(textBKX1_4, "10, 12, fill, default");
		textBKX1_4.setColumns(10);
		
		textBKX1_5 = new JTextField();
		textBKX1_5.setText("82");
		panelA2.add(textBKX1_5, "12, 12, fill, default");
		textBKX1_5.setColumns(10);
		
		textBKX1_6 = new JTextField();
		textBKX1_6.setText("287");
		panelA2.add(textBKX1_6, "14, 12, fill, default");
		textBKX1_6.setColumns(10);
		
		textBKX1_7 = new JTextField();
		textBKX1_7.setText("287");
		panelA2.add(textBKX1_7, "16, 12, fill, default");
		textBKX1_7.setColumns(10);
		
		textBKX1_8 = new JTextField();
		textBKX1_8.setText("1");
		panelA2.add(textBKX1_8, "18, 12, fill, default");
		textBKX1_8.setColumns(10);
		
		lblY_2 = new JLabel("Y-BKBEGIN");
		panelA2.add(lblY_2, "2, 14, right, default");
		
		textBKY1_1 = new JTextField();
		textBKY1_1.setText("39");
		panelA2.add(textBKY1_1, "4, 14, fill, default");
		textBKY1_1.setColumns(10);
		
		textBKY1_2 = new JTextField();
		textBKY1_2.setText("70");
		panelA2.add(textBKY1_2, "6, 14, fill, default");
		textBKY1_2.setColumns(10);
		
		textBKY1_3 = new JTextField();
		textBKY1_3.setText("97");
		panelA2.add(textBKY1_3, "8, 14, fill, default");
		textBKY1_3.setColumns(10);
		
		textBKY1_4 = new JTextField();
		textBKY1_4.setText("124");
		panelA2.add(textBKY1_4, "10, 14, fill, default");
		textBKY1_4.setColumns(10);
		
		textBKY1_5 = new JTextField();
		textBKY1_5.setText("151");
		panelA2.add(textBKY1_5, "12, 14, fill, default");
		textBKY1_5.setColumns(10);
		
		textBKY1_6 = new JTextField();
		textBKY1_6.setText("206");
		panelA2.add(textBKY1_6, "14, 14, fill, default");
		textBKY1_6.setColumns(10);
		
		textBKY1_7 = new JTextField();
		textBKY1_7.setText("206");
		panelA2.add(textBKY1_7, "16, 14, fill, default");
		textBKY1_7.setColumns(10);
		
		textBKY1_8 = new JTextField();
		textBKY1_8.setText("1");
		panelA2.add(textBKY1_8, "18, 14, fill, default");
		textBKY1_8.setColumns(10);
		
		lblX_2 = new JLabel("X-BKEND");
		panelA2.add(lblX_2, "2, 16, right, default");
		
		textA2BKTailX1_1 = new JTextField();
		textA2BKTailX1_1.setText("320");
		panelA2.add(textA2BKTailX1_1, "4, 16, fill, default");
		textA2BKTailX1_1.setColumns(10);
		
		textA2BKTailX1_2 = new JTextField();
		textA2BKTailX1_2.setText("320");
		panelA2.add(textA2BKTailX1_2, "6, 16, fill, default");
		textA2BKTailX1_2.setColumns(10);
		
		textA2BKTailX1_3 = new JTextField();
		textA2BKTailX1_3.setText("320");
		textA2BKTailX1_3.setColumns(10);
		panelA2.add(textA2BKTailX1_3, "8, 16, fill, default");
		
		textA2BKTailX1_4 = new JTextField();
		textA2BKTailX1_4.setText("320");
		textA2BKTailX1_4.setColumns(10);
		panelA2.add(textA2BKTailX1_4, "10, 16, fill, default");
		
		textA2BKTailX1_5 = new JTextField();
		textA2BKTailX1_5.setText("286");
		textA2BKTailX1_5.setColumns(10);
		panelA2.add(textA2BKTailX1_5, "12, 16, fill, default");
		
		textA2BKTailX1_6 = new JTextField();
		textA2BKTailX1_6.setText("320");
		textA2BKTailX1_6.setColumns(10);
		panelA2.add(textA2BKTailX1_6, "14, 16, fill, default");
		
		textA2BKTailX1_7 = new JTextField();
		textA2BKTailX1_7.setText("320");
		textA2BKTailX1_7.setColumns(10);
		panelA2.add(textA2BKTailX1_7, "16, 16, fill, default");
		
		textA2BKTailX1_8 = new JTextField();
		textA2BKTailX1_8.setText("1");
		textA2BKTailX1_8.setColumns(10);
		panelA2.add(textA2BKTailX1_8, "18, 16, fill, default");
		
		lblX_3 = new JLabel("Y-BKEND");
		panelA2.add(lblX_3, "2, 18, right, default");
		
		textA2BKTailY1_1 = new JTextField();
		textA2BKTailY1_1.setText("63");
		textA2BKTailY1_1.setColumns(10);
		panelA2.add(textA2BKTailY1_1, "4, 18, fill, default");
		
		textA2BKTailY1_2 = new JTextField();
		textA2BKTailY1_2.setText("90");
		panelA2.add(textA2BKTailY1_2, "6, 18, fill, default");
		textA2BKTailY1_2.setColumns(10);
		
		textA2BKTailY1_3 = new JTextField();
		textA2BKTailY1_3.setText("117");
		panelA2.add(textA2BKTailY1_3, "8, 18, fill, default");
		textA2BKTailY1_3.setColumns(10);
		
		textA2BKTailY1_4 = new JTextField();
		textA2BKTailY1_4.setText("144");
		panelA2.add(textA2BKTailY1_4, "10, 18, fill, default");
		textA2BKTailY1_4.setColumns(10);
		
		textA2BKTailY1_5 = new JTextField();
		textA2BKTailY1_5.setText("231");
		panelA2.add(textA2BKTailY1_5, "12, 18, fill, default");
		textA2BKTailY1_5.setColumns(10);
		
		textA2BKTailY1_6 = new JTextField();
		textA2BKTailY1_6.setText("230");
		panelA2.add(textA2BKTailY1_6, "14, 18, fill, default");
		textA2BKTailY1_6.setColumns(10);
		
		textA2BKTailY1_7 = new JTextField();
		textA2BKTailY1_7.setText("230");
		panelA2.add(textA2BKTailY1_7, "16, 18, fill, default");
		textA2BKTailY1_7.setColumns(10);
		
		textA2BKTailY1_8 = new JTextField();
		textA2BKTailY1_8.setText("1");
		panelA2.add(textA2BKTailY1_8, "18, 18, fill, default");
		textA2BKTailY1_8.setColumns(10);
		
		label_39 = new JLabel("FontDis");
		panelA2.add(label_39, "2, 20, center, default");
		
		textA2FontDis_1 = new JTextField();
		textA2FontDis_1.setText("1");
		textA2FontDis_1.setColumns(10);
		panelA2.add(textA2FontDis_1, "4, 20, fill, default");
		
		textA2FontDis_2 = new JTextField();
		textA2FontDis_2.setText("1");
		panelA2.add(textA2FontDis_2, "6, 20, fill, default");
		textA2FontDis_2.setColumns(10);
		
		textA2FontDis_3 = new JTextField();
		textA2FontDis_3.setText("1");
		panelA2.add(textA2FontDis_3, "8, 20, fill, default");
		textA2FontDis_3.setColumns(10);
		
		textA2FontDis_4 = new JTextField();
		textA2FontDis_4.setText("1");
		panelA2.add(textA2FontDis_4, "10, 20, fill, default");
		textA2FontDis_4.setColumns(10);
		
		textA2FontDis_5 = new JTextField();
		textA2FontDis_5.setText("1");
		panelA2.add(textA2FontDis_5, "12, 20, fill, default");
		textA2FontDis_5.setColumns(10);
		
		textA2FontDis_6 = new JTextField();
		textA2FontDis_6.setText("1");
		panelA2.add(textA2FontDis_6, "14, 20, fill, default");
		textA2FontDis_6.setColumns(10);
		
		textA2FontDis_7 = new JTextField();
		textA2FontDis_7.setText("1");
		panelA2.add(textA2FontDis_7, "16, 20, fill, default");
		textA2FontDis_7.setColumns(10);
		
		textA2FontDis_8 = new JTextField();
		textA2FontDis_8.setText("1");
		panelA2.add(textA2FontDis_8, "18, 20, fill, default");
		textA2FontDis_8.setColumns(10);
		
		label_40 = new JLabel("FontStyle");
		panelA2.add(label_40, "2, 22, right, default");
		
		textA2FontType_1 = new JTextField();
		textA2FontType_1.setText("g");
		textA2FontType_1.setColumns(10);
		panelA2.add(textA2FontType_1, "4, 22, fill, default");
		
		textA2FontType_2 = new JTextField();
		textA2FontType_2.setText("g");
		panelA2.add(textA2FontType_2, "6, 22, fill, default");
		textA2FontType_2.setColumns(10);
		
		textA2FontType_3 = new JTextField();
		textA2FontType_3.setText("g");
		panelA2.add(textA2FontType_3, "8, 22, fill, default");
		textA2FontType_3.setColumns(10);
		
		textA2FontType_4 = new JTextField();
		textA2FontType_4.setText("g");
		panelA2.add(textA2FontType_4, "10, 22, fill, default");
		textA2FontType_4.setColumns(10);
		
		textA2FontType_5 = new JTextField();
		textA2FontType_5.setText("n");
		panelA2.add(textA2FontType_5, "12, 22, fill, default");
		textA2FontType_5.setColumns(10);
		
		textA2FontType_6 = new JTextField();
		textA2FontType_6.setText("g");
		panelA2.add(textA2FontType_6, "14, 22, fill, default");
		textA2FontType_6.setColumns(10);
		
		textA2FontType_7 = new JTextField();
		textA2FontType_7.setText("a");
		panelA2.add(textA2FontType_7, "16, 22, fill, default");
		textA2FontType_7.setColumns(10);
		
		textA2FontType_8 = new JTextField();
		textA2FontType_8.setText("1");
		panelA2.add(textA2FontType_8, "18, 22, fill, default");
		textA2FontType_8.setColumns(10);	
		
		label_20 = new JLabel("FontSize");
		panelA2.add(label_20, "2, 24, right, default");
		
		textA2FontSize_1 = new JTextField();
		textA2FontSize_1.setText("24");
		textA2FontSize_1.setColumns(10);
		panelA2.add(textA2FontSize_1, "4, 24, fill, default");
		
		textA2FontSize_2 = new JTextField();
		textA2FontSize_2.setText("20");
		panelA2.add(textA2FontSize_2, "6, 24, fill, default");
		textA2FontSize_2.setColumns(10);
		
		textA2FontSize_3 = new JTextField();
		textA2FontSize_3.setText("0");
		panelA2.add(textA2FontSize_3, "8, 24, fill, default");
		textA2FontSize_3.setColumns(10);
		
		textA2FontSize_4 = new JTextField();
		textA2FontSize_4.setText("20");
		panelA2.add(textA2FontSize_4, "10, 24, fill, default");
		textA2FontSize_4.setColumns(10);
		
		textA2FontSize_5 = new JTextField();
		textA2FontSize_5.setText("80");
		panelA2.add(textA2FontSize_5, "12, 24, fill, default");
		textA2FontSize_5.setColumns(10);
		
		textA2FontSize_6 = new JTextField();
		textA2FontSize_6.setText("24");
		panelA2.add(textA2FontSize_6, "14, 24, fill, default");
		textA2FontSize_6.setColumns(10);
		
		textA2FontSize_7 = new JTextField();
		textA2FontSize_7.setText("10");
		panelA2.add(textA2FontSize_7, "16, 24, fill, default");
		textA2FontSize_7.setColumns(10);
		
		textA2FontSize_8 = new JTextField();
		textA2FontSize_8.setText("1");
		panelA2.add(textA2FontSize_8, "18, 24, fill, default");
		textA2FontSize_8.setColumns(10);
		
		panelA3 = new JPanel();
		panel.add(panelA3, "panelA3");
		panelA3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		label_52 = new JLabel("model");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_52, "4, 2, center, default");
		
		textA3Model = new JTextField();
		textA3Model.setText("1");
		textA3Model.setColumns(10);
		panelA3.add(textA3Model, "6, 2, fill, default");
		
		label_53 = new JLabel("text_count");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_53, "8, 2, right, default");
		
		textA3Count = new JTextField();
		textA3Count.setText("1");
		textA3Count.setColumns(10);
		panelA3.add(textA3Count, "10, 2, fill, default");
		
		btnA3 = new JButton("A3");		//A3
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//
				String[][] strArray = new String[11][8];
				strArray[0][0] = textA3X1_1.getText();		//X-begin
				strArray[0][1] = textA3X1_2.getText();
				strArray[0][2] = textA3X1_3.getText();
				strArray[0][3] = textA3X1_4.getText();
				strArray[0][4] = textA3X1_5.getText();
				strArray[0][5] = textA3X1_6.getText();
				strArray[0][6] = textA3X1_7.getText();
				strArray[0][7] = textA3X1_8.getText();
				
				strArray[1][0] = textA3Y1_1.getText();		//Y-end
				strArray[1][1] = textA3Y1_2.getText();
				strArray[1][2] = textA3Y1_3.getText();
				strArray[1][3] = textA3Y1_4.getText();
				strArray[1][4] = textA3Y1_5.getText();
				strArray[1][5] = textA3Y1_6.getText();
				strArray[1][6] = textA3Y1_7.getText();
				strArray[1][7] = textA3Y1_8.getText();
				
				strArray[2][0] = textA3BKX1_1.getText();		//X-bkbegin
				strArray[2][1] = textA3BKX1_2.getText();		
				strArray[2][2] = textA3BKX1_3.getText();		
				strArray[2][3] = textA3BKX1_4.getText();		
				strArray[2][4] = textA3BKX1_5.getText();	
				strArray[2][5] = textA3BKX1_6.getText();		
				strArray[2][6] = textA3BKX1_7.getText();		
				strArray[2][7] = textA3BKX1_8.getText();		
				
				strArray[3][0] = textA3BKY1_1.getText();		//Y-bk begin
				strArray[3][1] = textA3BKY1_2.getText();
				strArray[3][2] = textA3BKY1_3.getText();
				strArray[3][3] = textA3BKY1_4.getText();
				strArray[3][4] = textA3BKY1_5.getText();
				strArray[3][5] = textA3BKY1_6.getText();
				strArray[3][6] = textA3BKY1_7.getText();
				strArray[3][7] = textA3BKY1_8.getText();
		
				strArray[4][0] = textA3BKTailX1_1.getText();		//X-bkend
				strArray[4][1] = textA3BKTailX1_2.getText();		
				strArray[4][2] = textA3BKTailX1_3.getText();		
				strArray[4][3] = textA3BKTailX1_4.getText();		
				strArray[4][4] = textA3BKTailX1_5.getText();		
				strArray[4][5] = textA3BKTailX1_6.getText();		
				strArray[4][6] = textA3BKTailX1_7.getText();		
				strArray[4][7] = textA3BKTailX1_8.getText();		
				
				strArray[5][0] = textA3BKTailY1_1.getText();		//Y-bkend
				strArray[5][1] = textA3BKTailY1_2.getText();		
				strArray[5][2] = textA3BKTailY1_3.getText();		
				strArray[5][3] = textA3BKTailY1_4.getText();		
				strArray[5][4] = textA3BKTailY1_5.getText();		
				strArray[5][5] = textA3BKTailY1_6.getText();		
				strArray[5][6] = textA3BKTailY1_7.getText();		
				strArray[5][7] = textA3BKTailY1_8.getText();		
				
				strArray[6][0] = textA3Count_1.getText();			//text_count
				strArray[6][1] = textA3Count_2.getText();
				strArray[6][2] = textA3Count_3.getText();
				strArray[6][3] = textA3Count_4.getText();
				strArray[6][4] = textA3Count_5.getText();
				strArray[6][5] = textA3Count_6.getText();
				strArray[6][6] = textA3Count_7.getText();
				strArray[6][7] = textA3Count_8.getText();
				
				strArray[7][0] = textA3Fix_1.getText();				//content
				strArray[7][1] = textA3Fix_2.getText();
				strArray[7][2] = textA3Fix_3.getText();
				strArray[7][3] = textA3Fix_4.getText();
				strArray[7][4] = textA3Fix_5.getText();
				strArray[7][5] = textA3Fix_6.getText();
				strArray[7][6] = textA3Fix_7.getText();
				strArray[7][7] = textA3Fix_8.getText();
				
				strArray[8][0] = textA3FontDis_1.getText();			//font distance
				strArray[8][1] = textA3FontDis_2.getText();
				strArray[8][2] = textA3FontDis_3.getText();
				strArray[8][3] = textA3FontDis_4.getText();
				strArray[8][4] = textA3FontDis_5.getText();
				strArray[8][5] = textA3FontDis_6.getText();
				strArray[8][6] = textA3FontDis_7.getText();
				strArray[8][7] = textA3FontDis_8.getText();
				
				strArray[9][0] = textA3FontType_1.getText();		//font sytle
				strArray[9][1] = textA3FontType_2.getText();
				strArray[9][2] = textA3FontType_3.getText();
				strArray[9][3] = textA3FontType_4.getText();
				strArray[9][4] = textA3FontType_5.getText();
				strArray[9][5] = textA3FontType_6.getText();
				strArray[9][6] = textA3FontType_7.getText();
				strArray[9][7] = textA3FontType_8.getText();
				
				
				strArray[10][0] = textA3FontSize_1.getText();		//font size
				strArray[10][1] = textA3FontSize_2.getText();
				strArray[10][2] = textA3FontSize_3.getText();
				strArray[10][3] = textA3FontSize_4.getText();
				strArray[10][4] = textA3FontSize_5.getText();
				strArray[10][5] = textA3FontSize_6.getText();
				strArray[10][6] = textA3FontSize_7.getText();
				strArray[10][7] = textA3FontSize_8.getText();
				
				/////////////////////////////////////////////////
				//controller number
				int iNum    = Integer.parseInt(textNum.getText());
				//model
				int iModel  = Integer.parseInt(textA3Model.getText());
				//text_count
				int iCount  = Integer.parseInt(textA3Count.getText());
				//the msg sended for A3
				byte[] bMsg = new byte[300];
				int iIndex = 0;						//字符索引
				byte[] bIntType = new byte[4];
				for(int i = 0; i < 300; i ++)
					bMsg[i] = 0x30;
				for(int i = 0; i < iCount; i ++)
				{
					for(int j = 0; j < 11; j ++)
					{
						
						if(j < 6)			//
						{
							bIntType = strArray[j][i].getBytes();
							int iLen = strArray[j][i].getBytes().length;
							System.arraycopy(bIntType, 0, bMsg, iIndex + 4 - iLen, iLen);
							iIndex += 4;														
						}
						else if(j == 9)				//font style
						{
							bIntType = strArray[j][i].getBytes();
							System.arraycopy(bIntType, 0, bMsg, iIndex, 1);
							iIndex ++;
						}
						else if(j == 6 || j == 8)//text_count or font distance
						{
							bIntType[0] = (byte)Integer.parseInt(strArray[j][i]);
							bIntType[0] += 0x30;
							System.arraycopy(bIntType, 0, bMsg, iIndex, 1);
							iIndex ++;
						}
						else if(j == 7)			//fixed content
						{
							try {
								byte[] bTemp = strArray[j][i].getBytes("GB2312");	//
								int iLen = strArray[j][i].getBytes("GB2312").length;//
								int iCopyLen = Integer.parseInt(strArray[6][i]);	//
								int iFactLen = iLen > iCopyLen ? iCopyLen :iLen;
								System.arraycopy(bTemp, 0, bMsg, iIndex, iFactLen);
								iIndex += iCopyLen;
								
							} catch (UnsupportedEncodingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						else 	//font size
						{
							bIntType = strArray[j][i].getBytes();
							System.arraycopy(bIntType, 0, bMsg, iIndex, 2);
							iIndex += 2;
						}
						
					}
					
				}
				EslTest.A3_infor[] msgStruts = (EslTest.A3_infor[])
						new EslTest.A3_infor().toArray(1);
				for(int i = 0; i < 1; i ++)
				{
					msgStruts[i].modemNo = (byte)iModel;
					msgStruts[i].set_num = (byte)iCount;
					msgStruts[i].msg = Arrays.copyOf(bMsg, 300);
					msgStruts[i].len = iIndex;
				}
				//A3
				test.PickupSysnew_A3(iNum, msgStruts);	
			}
		});
		panelA3.add(btnA3, "12, 2");
		
		label_29 = new JLabel("Param1");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_29, "4, 4");
		
		label_15 = new JLabel("Param2");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_15, "6, 4");
		
		label_30 = new JLabel("Param3");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_30, "8, 4");
		
		label_31 = new JLabel("Param4");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_31, "10, 4");
		
		label_32 = new JLabel("Param5");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_32, "12, 4");
		
		label_33 = new JLabel("Param6");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_33, "14, 4");
		
		label_34 = new JLabel("Param7");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		panelA3.add(label_34, "16, 4");
		
		label_19 = new JLabel("Param8");
		panelA3.add(label_19, "18, 4");
		
		lblX = new JLabel("X-Begin");
		panelA3.add(lblX, "2, 6, right, center");
		
		textA3X1_1 = new JTextField();
		textA3X1_1.setText("7");
		panelA3.add(textA3X1_1, "4, 6, fill, default");
		textA3X1_1.setColumns(10);
		
		textA3X1_2 = new JTextField();
		textA3X1_2.setText("10");
		panelA3.add(textA3X1_2, "6, 6, fill, default");
		textA3X1_2.setColumns(10);
		
		textA3X1_3 = new JTextField();
		textA3X1_3.setText("10");
		panelA3.add(textA3X1_3, "8, 6, fill, default");
		textA3X1_3.setColumns(10);
		
		textA3X1_4 = new JTextField();
		textA3X1_4.setText("10");
		panelA3.add(textA3X1_4, "10, 6, fill, default");
		textA3X1_4.setColumns(10);
		
		textA3X1_5 = new JTextField();
		textA3X1_5.setText("18");
		panelA3.add(textA3X1_5, "12, 6, fill, default");
		textA3X1_5.setColumns(10);
		
		textA3X1_6 = new JTextField();
		textA3X1_6.setText("18");
		panelA3.add(textA3X1_6, "14, 6, fill, default");
		textA3X1_6.setColumns(10);
		
		textA3X1_7 = new JTextField();
		textA3X1_7.setText("254");
		panelA3.add(textA3X1_7, "16, 6, fill, default");
		textA3X1_7.setColumns(10);
		
		textA3X1_8 = new JTextField();
		textA3X1_8.setText("1");
		panelA3.add(textA3X1_8, "18, 6, fill, center");
		textA3X1_8.setColumns(10);
		
		lblY = new JLabel("Y-begin");
		panelA3.add(lblY, "2, 8, right, default");
		
		textA3Y1_1 = new JTextField();
		textA3Y1_1.setText("39");
		textA3Y1_1.setColumns(10);
		panelA3.add(textA3Y1_1, "4, 8, fill, default");
		
		textA3Y1_2 = new JTextField();
		textA3Y1_2.setText("70");
		textA3Y1_2.setColumns(10);
		panelA3.add(textA3Y1_2, "6, 8, fill, default");
		
		textA3Y1_3 = new JTextField();
		textA3Y1_3.setText("97");
		textA3Y1_3.setColumns(10);
		panelA3.add(textA3Y1_3, "8, 8, fill, default");
		
		textA3Y1_4 = new JTextField();
		textA3Y1_4.setText("124");
		textA3Y1_4.setColumns(10);
		panelA3.add(textA3Y1_4, "10, 8, fill, default");
		
		textA3Y1_5 = new JTextField();
		textA3Y1_5.setText("162");
		textA3Y1_5.setColumns(10);
		panelA3.add(textA3Y1_5, "12, 8, fill, default");
		
		textA3Y1_6 = new JTextField();
		textA3Y1_6.setText("196");
		textA3Y1_6.setColumns(10);
		panelA3.add(textA3Y1_6, "14, 8, fill, default");
		
		textA3Y1_7 = new JTextField();
		textA3Y1_7.setText("40");
		textA3Y1_7.setColumns(10);
		panelA3.add(textA3Y1_7, "16, 8, fill, default");
		
		textA3Y1_8 = new JTextField();
		textA3Y1_8.setText("1");
		textA3Y1_8.setColumns(10);
		panelA3.add(textA3Y1_8, "18, 8, fill, default");
		
		lblX_4 = new JLabel("X-BKBe");
		panelA3.add(lblX_4, "2, 10, right, default");
		
		textA3BKX1_1 = new JTextField();
		textA3BKX1_1.setText("7");
		textA3BKX1_1.setColumns(10);
		panelA3.add(textA3BKX1_1, "4, 10, fill, default");
		
		textA3BKX1_2 = new JTextField();
		textA3BKX1_2.setText("10");
		textA3BKX1_2.setColumns(10);
		panelA3.add(textA3BKX1_2, "6, 10, fill, default");
		
		textA3BKX1_3 = new JTextField();
		textA3BKX1_3.setText("10");
		textA3BKX1_3.setColumns(10);
		panelA3.add(textA3BKX1_3, "8, 10, fill, default");
		
		textA3BKX1_4 = new JTextField();
		textA3BKX1_4.setText("10");
		textA3BKX1_4.setColumns(10);
		panelA3.add(textA3BKX1_4, "10, 10, fill, default");
		
		textA3BKX1_5 = new JTextField();
		textA3BKX1_5.setText("18");
		textA3BKX1_5.setColumns(10);
		panelA3.add(textA3BKX1_5, "12, 10, fill, default");
		
		textA3BKX1_6 = new JTextField();
		textA3BKX1_6.setText("18");
		textA3BKX1_6.setColumns(10);
		panelA3.add(textA3BKX1_6, "14, 10, fill, default");
		
		textA3BKX1_7 = new JTextField();
		textA3BKX1_7.setText("254");
		textA3BKX1_7.setColumns(10);
		panelA3.add(textA3BKX1_7, "16, 10, fill, default");
		
		textA3BKX1_8 = new JTextField();
		textA3BKX1_8.setText("1");
		textA3BKX1_8.setColumns(10);
		panelA3.add(textA3BKX1_8, "18, 10, fill, default");
		
		lblY_3 = new JLabel("Y-bkbe");
		panelA3.add(lblY_3, "2, 12, right, default");
		
		textA3BKY1_1 = new JTextField();
		textA3BKY1_1.setText("39");
		textA3BKY1_1.setColumns(10);
		panelA3.add(textA3BKY1_1, "4, 12, fill, default");
		
		textA3BKY1_2 = new JTextField();
		textA3BKY1_2.setText("70");
		textA3BKY1_2.setColumns(10);
		panelA3.add(textA3BKY1_2, "6, 12, fill, default");
		
		textA3BKY1_3 = new JTextField();
		textA3BKY1_3.setText("97");
		textA3BKY1_3.setColumns(10);
		panelA3.add(textA3BKY1_3, "8, 12, fill, default");
		
		textA3BKY1_4 = new JTextField();
		textA3BKY1_4.setText("124");
		panelA3.add(textA3BKY1_4, "10, 12, fill, default");
		textA3BKY1_4.setColumns(10);
		
		textA3BKY1_5 = new JTextField();
		textA3BKY1_5.setText("162");
		panelA3.add(textA3BKY1_5, "12, 12, fill, default");
		textA3BKY1_5.setColumns(10);
		
		textA3BKY1_6 = new JTextField();
		textA3BKY1_6.setText("196");
		panelA3.add(textA3BKY1_6, "14, 12, fill, default");
		textA3BKY1_6.setColumns(10);
		
		textA3BKY1_7 = new JTextField();
		textA3BKY1_7.setText("40");
		panelA3.add(textA3BKY1_7, "16, 12, fill, default");
		textA3BKY1_7.setColumns(10);
		
		textA3BKY1_8 = new JTextField();
		textA3BKY1_8.setText("1");
		panelA3.add(textA3BKY1_8, "18, 12, fill, default");
		textA3BKY1_8.setColumns(10);
		
		lblX_5 = new JLabel("X-bkend");
		panelA3.add(lblX_5, "2, 14, right, default");
		
		textA3BKTailX1_1 = new JTextField();
		textA3BKTailX1_1.setText("74");
		textA3BKTailX1_1.setColumns(10);
		panelA3.add(textA3BKTailX1_1, "4, 14, fill, default");
		
		textA3BKTailX1_2 = new JTextField();
		textA3BKTailX1_2.setText("64");
		panelA3.add(textA3BKTailX1_2, "6, 14, fill, default");
		textA3BKTailX1_2.setColumns(10);
		
		textA3BKTailX1_3 = new JTextField();
		textA3BKTailX1_3.setText("64");
		panelA3.add(textA3BKTailX1_3, "8, 14, fill, default");
		textA3BKTailX1_3.setColumns(10);
		
		textA3BKTailX1_4 = new JTextField();
		textA3BKTailX1_4.setText("64");
		panelA3.add(textA3BKTailX1_4, "10, 14, fill, default");
		textA3BKTailX1_4.setColumns(10);
		
		textA3BKTailX1_5 = new JTextField();
		textA3BKTailX1_5.setText("82");
		panelA3.add(textA3BKTailX1_5, "12, 14, fill, default");
		textA3BKTailX1_5.setColumns(10);
		
		textA3BKTailX1_6 = new JTextField();
		textA3BKTailX1_6.setText("82");
		panelA3.add(textA3BKTailX1_6, "14, 14, fill, default");
		textA3BKTailX1_6.setColumns(10);
		
		textA3BKTailX1_7 = new JTextField();
		textA3BKTailX1_7.setText("298");
		panelA3.add(textA3BKTailX1_7, "16, 14, fill, default");
		textA3BKTailX1_7.setColumns(10);
		
		textA3BKTailX1_8 = new JTextField();
		textA3BKTailX1_8.setText("1");
		panelA3.add(textA3BKTailX1_8, "18, 14, fill, default");
		textA3BKTailX1_8.setColumns(10);
		
		lblY_4 = new JLabel("Y-bkend");
		panelA3.add(lblY_4, "2, 16, right, default");
		
		textA3BKTailY1_1 = new JTextField();
		textA3BKTailY1_1.setText("63");
		textA3BKTailY1_1.setColumns(10);
		panelA3.add(textA3BKTailY1_1, "4, 16, fill, default");
		
		textA3BKTailY1_2 = new JTextField();
		textA3BKTailY1_2.setText("90");
		panelA3.add(textA3BKTailY1_2, "6, 16, fill, default");
		textA3BKTailY1_2.setColumns(10);
		
		textA3BKTailY1_3 = new JTextField();
		textA3BKTailY1_3.setText("117");
		panelA3.add(textA3BKTailY1_3, "8, 16, fill, default");
		textA3BKTailY1_3.setColumns(10);
		
		textA3BKTailY1_4 = new JTextField();
		textA3BKTailY1_4.setText("144");
		panelA3.add(textA3BKTailY1_4, "10, 16, fill, default");
		textA3BKTailY1_4.setColumns(10);
		
		textA3BKTailY1_5 = new JTextField();
		textA3BKTailY1_5.setText("186");
		panelA3.add(textA3BKTailY1_5, "12, 16, fill, default");
		textA3BKTailY1_5.setColumns(10);
		
		textA3BKTailY1_6 = new JTextField();
		textA3BKTailY1_6.setText("220");
		panelA3.add(textA3BKTailY1_6, "14, 16, fill, default");
		textA3BKTailY1_6.setColumns(10);
		
		textA3BKTailY1_7 = new JTextField();
		textA3BKTailY1_7.setText("60");
		panelA3.add(textA3BKTailY1_7, "16, 16, fill, default");
		textA3BKTailY1_7.setColumns(10);
		
		textA3BKTailY1_8 = new JTextField();
		textA3BKTailY1_8.setText("1");
		panelA3.add(textA3BKTailY1_8, "18, 16, fill, default");
		textA3BKTailY1_8.setColumns(10);
		
		label_25 = new JLabel("textcount");
		panelA3.add(label_25, "2, 18, right, default");
		
		textA3Count_1 = new JTextField();
		textA3Count_1.setText("5");
		textA3Count_1.setColumns(10);
		panelA3.add(textA3Count_1, "4, 18, fill, default");
		
		textA3Count_2 = new JTextField();
		textA3Count_2.setText("5");
		panelA3.add(textA3Count_2, "6, 18, fill, default");
		textA3Count_2.setColumns(10);
		
		textA3Count_3 = new JTextField();
		textA3Count_3.setText("5");
		panelA3.add(textA3Count_3, "8, 18, fill, default");
		textA3Count_3.setColumns(10);
		
		textA3Count_4 = new JTextField();
		textA3Count_4.setText("5");
		panelA3.add(textA3Count_4, "10, 18, fill, default");
		textA3Count_4.setColumns(10);
		
		textA3Count_5 = new JTextField();
		textA3Count_5.setText("4");
		panelA3.add(textA3Count_5, "12, 18, fill, default");
		textA3Count_5.setColumns(10);
		
		textA3Count_6 = new JTextField();
		textA3Count_6.setText("5");
		panelA3.add(textA3Count_6, "14, 18, fill, default");
		textA3Count_6.setColumns(10);
		
		textA3Count_7 = new JTextField();
		textA3Count_7.setText("4");
		panelA3.add(textA3Count_7, "16, 18, fill, default");
		textA3Count_7.setColumns(10);
		
		textA3Count_8 = new JTextField();
		textA3Count_8.setText("1");
		panelA3.add(textA3Count_8, "18, 18, fill, default");
		textA3Count_8.setColumns(10);
		
		label_26 = new JLabel("FixText");
		panelA3.add(label_26, "2, 20, right, default");
		
		textA3Fix_1 = new JTextField();
		textA3Fix_1.setText("");
		textA3Fix_1.setColumns(10);
		panelA3.add(textA3Fix_1, "4, 20, fill, default");
		
		textA3Fix_2 = new JTextField();
		textA3Fix_2.setText("");
		panelA3.add(textA3Fix_2, "6, 20, fill, default");
		textA3Fix_2.setColumns(10);
		
		textA3Fix_3 = new JTextField();
		textA3Fix_3.setText("");
		panelA3.add(textA3Fix_3, "8, 20, fill, default");
		textA3Fix_3.setColumns(10);
		
		textA3Fix_4 = new JTextField();
		textA3Fix_4.setText("");
		panelA3.add(textA3Fix_4, "10, 20, fill, default");
		textA3Fix_4.setColumns(10);
		
		textA3Fix_5 = new JTextField();
		textA3Fix_5.setText("");
		panelA3.add(textA3Fix_5, "12, 20, fill, default");
		textA3Fix_5.setColumns(10);
		
		textA3Fix_6 = new JTextField();
		textA3Fix_6.setText("");
		panelA3.add(textA3Fix_6, "14, 20, fill, default");
		textA3Fix_6.setColumns(10);
		
		textA3Fix_7 = new JTextField();
		textA3Fix_7.setText("");
		panelA3.add(textA3Fix_7, "16, 20, fill, default");
		textA3Fix_7.setColumns(10);
		
		textA3Fix_8 = new JTextField();
		textA3Fix_8.setText("");
		panelA3.add(textA3Fix_8, "18, 20, fill, default");
		textA3Fix_8.setColumns(10);
		
		label_27 = new JLabel("FontDis");
		panelA3.add(label_27, "2, 22, right, default");
		
		textA3FontDis_1 = new JTextField();
		textA3FontDis_1.setText("2");
		textA3FontDis_1.setColumns(10);
		panelA3.add(textA3FontDis_1, "4, 22, fill, default");
		
		textA3FontDis_2 = new JTextField();
		textA3FontDis_2.setText("2");
		panelA3.add(textA3FontDis_2, "6, 22, fill, default");
		textA3FontDis_2.setColumns(10);
		
		textA3FontDis_3 = new JTextField();
		textA3FontDis_3.setText("2");
		panelA3.add(textA3FontDis_3, "8, 22, fill, default");
		textA3FontDis_3.setColumns(10);
		
		textA3FontDis_4 = new JTextField();
		textA3FontDis_4.setText("2");
		panelA3.add(textA3FontDis_4, "10, 22, fill, default");
		textA3FontDis_4.setColumns(10);
		
		textA3FontDis_5 = new JTextField();
		textA3FontDis_5.setText("2");
		panelA3.add(textA3FontDis_5, "12, 22, fill, default");
		textA3FontDis_5.setColumns(10);
		
		textA3FontDis_6 = new JTextField();
		textA3FontDis_6.setText("2");
		panelA3.add(textA3FontDis_6, "14, 22, fill, default");
		textA3FontDis_6.setColumns(10);
		
		textA3FontDis_7 = new JTextField();
		textA3FontDis_7.setText("1");
		panelA3.add(textA3FontDis_7, "16, 22, fill, default");
		textA3FontDis_7.setColumns(10);
		
		textA3FontDis_8 = new JTextField();
		textA3FontDis_8.setText("1");
		panelA3.add(textA3FontDis_8, "18, 22, fill, default");
		textA3FontDis_8.setColumns(10);
		
		label_28 = new JLabel("FontType");
		panelA3.add(label_28, "2, 24, right, default");
		
		textA3FontType_1 = new JTextField();
		textA3FontType_1.setText("g");
		textA3FontType_1.setColumns(10);
		panelA3.add(textA3FontType_1, "4, 24, fill, default");
		
		textA3FontType_2 = new JTextField();
		textA3FontType_2.setText("g");
		panelA3.add(textA3FontType_2, "6, 24, fill, default");
		textA3FontType_2.setColumns(10);
		
		textA3FontType_3 = new JTextField();
		textA3FontType_3.setText("g");
		panelA3.add(textA3FontType_3, "8, 24, fill, default");
		textA3FontType_3.setColumns(10);
		
		textA3FontType_4 = new JTextField();
		textA3FontType_4.setText("g");
		panelA3.add(textA3FontType_4, "10, 24, fill, default");
		textA3FontType_4.setColumns(10);
		
		textA3FontType_5 = new JTextField();
		textA3FontType_5.setText("g");
		panelA3.add(textA3FontType_5, "12, 24, fill, default");
		textA3FontType_5.setColumns(10);
		
		textA3FontType_6 = new JTextField();
		textA3FontType_6.setText("g");
		panelA3.add(textA3FontType_6, "14, 24, fill, default");
		textA3FontType_6.setColumns(10);
		
		textA3FontType_7 = new JTextField();
		textA3FontType_7.setText("a");
		panelA3.add(textA3FontType_7, "16, 24, fill, default");
		textA3FontType_7.setColumns(10);
		
		textA3FontType_8 = new JTextField();
		textA3FontType_8.setText("1");
		panelA3.add(textA3FontType_8, "18, 24, fill, default");
		textA3FontType_8.setColumns(10);
		
		label_35 = new JLabel("FontSize");
		panelA3.add(label_35, "2, 26, right, default");
		
		textA3FontSize_1 = new JTextField();
		textA3FontSize_1.setText("24");
		panelA3.add(textA3FontSize_1, "4, 26, fill, default");
		textA3FontSize_1.setColumns(10);
		
		textA3FontSize_2 = new JTextField();
		textA3FontSize_2.setText("20");
		panelA3.add(textA3FontSize_2, "6, 26, fill, default");
		textA3FontSize_2.setColumns(10);
		
		textA3FontSize_3 = new JTextField();
		textA3FontSize_3.setText("20");
		panelA3.add(textA3FontSize_3, "8, 26, fill, default");
		textA3FontSize_3.setColumns(10);
		
		textA3FontSize_4 = new JTextField();
		textA3FontSize_4.setText("20");
		panelA3.add(textA3FontSize_4, "10, 26, fill, default");
		textA3FontSize_4.setColumns(10);
		
		textA3FontSize_5 = new JTextField();
		textA3FontSize_5.setText("24");
		panelA3.add(textA3FontSize_5, "12, 26, fill, default");
		textA3FontSize_5.setColumns(10);
		
		textA3FontSize_6 = new JTextField();
		textA3FontSize_6.setText("24");
		panelA3.add(textA3FontSize_6, "14, 26, fill, default");
		textA3FontSize_6.setColumns(10);
		
		textA3FontSize_7 = new JTextField();
		textA3FontSize_7.setText("10");
		panelA3.add(textA3FontSize_7, "16, 26, fill, default");
		textA3FontSize_7.setColumns(10);
		
		textA3FontSize_8 = new JTextField();
		textA3FontSize_8.setText("1");
		panelA3.add(textA3FontSize_8, "18, 26, fill, default");
		textA3FontSize_8.setColumns(10);
		
		panelA4 = new JPanel();
		panel.add(panelA4, "panelA4");
		panelA4.setLayout(null);
		
		textA4Model = new JTextField();
		textA4Model.setBounds(149, 29, 66, 21);
		panelA4.add(textA4Model);
		textA4Model.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Num");
		lblNewLabel_6.setBounds(238, 32, 54, 15);
		panelA4.add(lblNewLabel_6);
		
		textA4Center = new JTextField();
		textA4Center.setBounds(312, 29, 66, 21);
		panelA4.add(textA4Center);
		textA4Center.setColumns(10);
		
		JButton btnA4 = new JButton("A4");//A4
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//controller number
				int iNum = Integer.parseInt(textNum.getText());
				//A4
				EslTest.A4_infor[] msgStruts = (EslTest.A4_infor[])
						new EslTest.A4_infor().toArray(1);
			
				msgStruts[0].modem_no = (byte)Integer.parseInt(textA4Model.getText());
				msgStruts[0].pos_num = (byte)Integer.parseInt(textA4Center.getText());
				//send
				test.PickupSysnew_A4(iNum, msgStruts);	
				
			}
		});
		btnA4.setBounds(391, 28, 93, 23);
		panelA4.add(btnA4);
		
		JLabel lblModel = new JLabel("model");
		lblModel.setHorizontalAlignment(SwingConstants.CENTER);
		lblModel.setBounds(72, 32, 54, 15);
		panelA4.add(lblModel);
		
		panelA5 = new JPanel();
		panel.add(panelA5, "panelA5");
		panelA5.setLayout(null);
		
		JLabel label_21 = new JLabel("Model");
		label_21.setBounds(65, 39, 54, 15);
		panelA5.add(label_21);
		
		textA5Model = new JTextField();
		textA5Model.setBounds(145, 36, 66, 21);
		panelA5.add(textA5Model);
		textA5Model.setColumns(10);
		
		JLabel label_22 = new JLabel("ReNum");
		label_22.setBounds(241, 39, 83, 15);
		panelA5.add(label_22);
		
		textA5Num = new JTextField();
		textA5Num.setBounds(345, 36, 66, 21);
		panelA5.add(textA5Num);
		textA5Num.setColumns(10);
		
		JButton btnA5 = new JButton("A5");//A5
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//Ctrl_no
				int iNum = Integer.parseInt(textNum.getText());
				//A5
				EslTest.A5_infor[] msgStruts = (EslTest.A5_infor[])
						new EslTest.A5_infor().toArray(1);
			
				msgStruts[0].modem_no = (byte)Integer.parseInt(textA5Model.getText());
				msgStruts[0].ret_num = (byte)Integer.parseInt(textA5Num.getText());
				//send msg 
				test.PickupSysnew_A5(iNum, msgStruts);	
				
			}
		});
		btnA5.setBounds(430, 35, 93, 23);
		panelA5.add(btnA5);
		
		panelIP = new JPanel();
		panel.add(panelIP, "panelIP");
		panelIP.setLayout(null);
		
		lblIp_1 = new JLabel("IP");
		lblIp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIp_1.setBounds(33, 27, 54, 15);
		panelIP.add(lblIp_1);
		
		textIPAddr = new JTextField();
		textIPAddr.setBounds(103, 24, 155, 21);
		panelIP.add(textIPAddr);
		textIPAddr.setColumns(10);
		
		btnIP = new JButton("IP");//IP
		btnIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//ctrl nunber
				int iNum = Integer.parseInt(textNum.getText());
				//Ip struct 
				EslTest.IP_infor[] msgStruts = (EslTest.IP_infor[])
						new EslTest.IP_infor().toArray(1);
				
				msgStruts[0].len = textIPAddr.getText().getBytes().length;
				msgStruts[0].msg = Arrays.copyOf(textIPAddr.getText().getBytes(),
						300);	
				//send msg to server
				test.PickupSysnew_IPSetting(iNum, msgStruts);	
			}
		});
		btnIP.setBounds(306, 23, 93, 23);
		panelIP.add(btnIP);
		
		JPanel panelT_G_Ac = new JPanel();
		panel.add(panelT_G_Ac, "panelT_G_Ac");
		panelT_G_Ac.setLayout(null);
		
		panel_T = new JPanel();
		panel_T.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8D27\u67B6\u6307\u793A\u706F\u5355\u70B9I/O\u6307\u4EE4", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_T.setBounds(10, 10, 638, 79);
		panelT_G_Ac.add(panel_T);
		panel_T.setLayout(null);
		
		JLabel lblBaraddr = new JLabel("BarAddr");
		lblBaraddr.setBounds(135, 34, 54, 15);
		panel_T.add(lblBaraddr);
		
		textTAddr = new JTextField();
		textTAddr.setBounds(199, 31, 66, 21);
		panel_T.add(textTAddr);
		textTAddr.setColumns(10);
		
		final JCheckBox checkTRed = new JCheckBox("Red");
		checkTRed.setSelected(true);
		checkTRed.setBounds(292, 17, 66, 23);
		panel_T.add(checkTRed);
		
		final JCheckBox checkTGreen = new JCheckBox("Green");
		checkTGreen.setBounds(292, 42, 66, 23);
		panel_T.add(checkTGreen);
		
		JButton btnTSet = new JButton("SET");//I/O  T-command
		btnTSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				//controller index
				int iNum = Integer.parseInt(textNum.getText());
				int iAddr = Integer.parseInt(textTAddr.getText());
				int uValue = 0x04;
				if(checkTRed.isSelected())	uValue |= T_RED;//红灯
				else	uValue &= (~T_RED);

				if(checkTGreen.isSelected())	uValue |= T_GREEN;//绿灯
				else	uValue &= (~T_GREEN);
				//T-Command Send
				test.PickupSysnew_T(iNum, iAddr, uValue);
				
			}
		});
		btnTSet.setBounds(364, 30, 66, 23);
		panel_T.add(btnTSet);
		
		panel_G = new JPanel();
		panel_G.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6761\u7801\u8BFB\u53D6\u673A\u754C\u9762", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_G.setBounds(10, 117, 638, 79);
		panelT_G_Ac.add(panel_G);
		panel_G.setLayout(null);
		
		JLabel label_23 = new JLabel("BarAddr");
		label_23.setBounds(135, 38, 54, 15);
		panel_G.add(label_23);
		
		textGAddr = new JTextField();
		textGAddr.setColumns(10);
		textGAddr.setBounds(199, 35, 66, 21);
		panel_G.add(textGAddr);
		
		JLabel lblOpen = new JLabel("Open/Close");
		lblOpen.setBounds(287, 38, 63, 15);
		panel_G.add(lblOpen);
		
		textGOper = new JTextField();
		textGOper.setColumns(10);
		textGOper.setBounds(360, 35, 66, 21);
		panel_G.add(textGOper);
		
		JButton btnGSet = new JButton("SET");//G-Command
		btnGSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
				
				//controller index
				int iNum = Integer.parseInt(textNum.getText());
				int iAddr = Integer.parseInt(textGAddr.getText());
				String strOper = textGOper.getText();
				// G-command  send
				test.PickupSysnew_G(iNum, iAddr, strOper);
			}
		});
		btnGSet.setBounds(451, 35, 66, 23);
		panel_G.add(btnGSet);
		
		panel_Ac = new JPanel();
		panel_Ac.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6807\u7B7E\u5730\u5740\u8BBE\u7F6E", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_Ac.setBounds(10, 234, 638, 79);
		panelT_G_Ac.add(panel_Ac);
		panel_Ac.setLayout(null);
		
		JLabel lblOldaddr = new JLabel("OldAddr");
		lblOldaddr.setBounds(135, 37, 54, 15);
		panel_Ac.add(lblOldaddr);
		
		textAcOld = new JTextField();
		textAcOld.setColumns(10);
		textAcOld.setBounds(199, 35, 66, 21);
		panel_Ac.add(textAcOld);
		
		JLabel lblNewaddr = new JLabel("NewAddr");
		lblNewaddr.setBounds(287, 37, 54, 15);
		panel_Ac.add(lblNewaddr);
		
		textAcNew = new JTextField();
		textAcNew.setColumns(10);
		textAcNew.setBounds(360, 35, 66, 21);
		panel_Ac.add(textAcNew);
		
		JButton btnAcSet = new JButton("SET");
		btnAcSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!m_bIsCon)
				{
					AppendString("You can't do anything unless you connect server success");
					return;
				}
			}
		});
		btnAcSet.setBounds(451, 35, 66, 23);
		panel_Ac.add(btnAcSet);
		btnTab[0] = new JButton("P3");
		btnTab[0].setBounds(0, 258, 54, 23);
		contentPane.add(btnTab[0]);
		
		btnTab[1] = new JButton("P4");
		btnTab[1].setBounds(53, 258, 54, 23);
		contentPane.add(btnTab[1]);
		
		btnTab[2] = new JButton("A1");
		btnTab[2].setBounds(107, 258, 54, 23);
		contentPane.add(btnTab[2]);
		
		btnTab[3] = new JButton("A2");
		btnTab[3].setBounds(159, 258, 54, 23);
		contentPane.add(btnTab[3]);
		
		btnTab[4] = new JButton("A3");
		btnTab[4].setBounds(210, 258, 54, 23);
		contentPane.add(btnTab[4]);
		
		btnTab[5] = new JButton("A4");
		btnTab[5].setBounds(262, 258, 54, 23);
		contentPane.add(btnTab[5]);
		
		btnTab[6] = new JButton("A5");
		btnTab[6].setBounds(313, 258, 54, 23);
		contentPane.add(btnTab[6]);
		
		btnTab[7] = new JButton("IP");
		btnTab[7].setBounds(364, 258, 54, 23);
		contentPane.add(btnTab[7]);
		
		btnTab[8] = new JButton("T_G_Ac");
		btnTab[8].setBounds(415, 258, 80, 23);
		contentPane.add(btnTab[8]);
		
		BtnTabShow("P3");
		JButton btnNewButton_1 = new JButton("fs");
		btnNewButton_1.setBounds(488, 258, 54, 23);
		contentPane.add(btnNewButton_1);
		
	
	}
}
