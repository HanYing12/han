package javarun;

import MySqlData.MySqlDemo;
import entity.P4Class;
import java.util.List;
import java.util.Map;

public class ApplyRun implements Runnable {
	//有数据的时候boolean为false；
	static boolean over=true;

	public void mysqlRun()  {
		MySqlDemo mySqlDemo = new MySqlDemo();
		// 替换
        GetServiceInfo getServiceInfo=new GetServiceInfo();
		// 一个循环
		while (true) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Map<String, List<P4Class>> ck = null;
			Map<String, List<P4Class>> rk = null;
			Map<String, List<P4Class>> pd = null;
			// 出库判断
			//ck = getServiceInfo.postServiceOutStockData();
			ck = getServiceInfo.ckMian();
				if (ck != null) {
				for (String key : ck.keySet()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					if(key!=null) {
						new ApplyTest(ck.get(key), 1).start();
						over=false;
					}

				}
				ck.clear();
			}
			// 入库判断
			//rk = getServiceInfo.postServiceStorageData();
			rk = getServiceInfo.rkMian();
			if (rk != null) {
				for (String key : rk.keySet()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(key!=null) {
						new ApplyTest(rk.get(key), 2).start();
					}

				}
				rk.clear();
			}


            //盘点判断
			//pd = getServiceInfo.postServiceInventoryData();
			//pd =  getServiceInfo.pdMian();
			pd=null;
			if (pd != null) {
				for (String key : pd.keySet()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(key!=null) {
						new ApplyTest(pd.get(key), 3).start();
					}

				}
				pd.clear();
			}

			//垃圾回收
			System.gc();

		}
	}

	public synchronized void run() {
		mysqlRun();
	}


}
