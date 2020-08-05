package homex.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class IdUtil {
	private static final String NOTICE = "NT";
	private static final String TODO = "TD";
    private IdUtil() {}
    private static IdUtil instance = null;
    public static synchronized IdUtil getInstance() {
        if (instance == null) {
        	instance = new IdUtil();
        }
        return instance;
    }
    private static int count = 1;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    private static String getNowDateStr() {
        return sdf.format(new Date());
    }
    private static String now = null;
    private final static ReentrantLock lock=new ReentrantLock();
    private static String GetRandom(final String haed){
    	String Newnumber=null;
    	String dateStr=getNowDateStr();
    	lock.lock();//加锁
    	//判断是时间是否相同
    	if (dateStr.equals(now)) {
    		try {
       		 if (count >= 10000)
                    count = 1;
           	 if (count<10) 
           		 Newnumber = haed + getNowDateStr()+"000"+count;
       		else if (count<100) 
       			Newnumber = haed + getNowDateStr()+"00"+count;
       		else if(count<1000)
       			 Newnumber = haed + getNowDateStr()+"0"+count;
       		else  
       			 Newnumber = haed + getNowDateStr()+count;
            count++;
   		} catch (Exception e) {
   		}finally{
   			lock.unlock();
   		}
		}else{
			count=1;
			now =getNowDateStr();
			try {
				 if (count >= 10000)
	                    count = 1;
	           	 if (count<10) 
	           		 Newnumber = haed + getNowDateStr()+"000"+count;
	       		else if (count<100) 
	       			Newnumber = haed + getNowDateStr()+"00"+count;
	       		else if(count<1000)
	       			 Newnumber = haed + getNowDateStr()+"0"+count;
	       		else 
	       			 Newnumber = haed + getNowDateStr()+count;
	                count++;
			} catch (Exception e) {
			}finally{
				lock.unlock();
			}
		}
         return Newnumber;//返回的值
    }

    public static String getNotice() {
    	return GetRandom(NOTICE);
    }
    public static String getTodo() {
    	return GetRandom(TODO);
    }
}
