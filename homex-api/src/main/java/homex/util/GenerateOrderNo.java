package homex.util;

import org.apache.commons.lang3.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateOrderNo {
	private  static String img = "IMG";

    // 使用单例模式，不允许直接创建实例
    private GenerateOrderNo() {
    }
    // 创建一个空实例对象，类需要用的时候才赋值
    private static GenerateOrderNo instance = null;
    // 单例模式--懒汉模式
    public static synchronized GenerateOrderNo getInstance() {
        if (instance == null) {
            instance = new GenerateOrderNo();
        }
        return instance;
    }

    // 格式化的时间字符串
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    // 获取当前时间年月日时分秒毫秒字符串
    private static String getNowDateStr() {
        return sdf.format(new Date());
    }
    public static  String imgNo() {
    	return Generate(img);
    }
    /*
     * 生成一个订单号
     */
    public static synchronized String Generate(String param) {
        int random = RandomUtils.nextInt(1,999999);
        int countInteger = 6 - String.valueOf(random).length();// 算补位
        String extra = "";// 补字符串
        for (int i = 0; i < countInteger; i++) {
            extra += "0";
        }
        String dataStr = getNowDateStr();
        return param + dataStr + extra + random;
    }

}
