package homex.util;

import java.io.*;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;
public class ImageBase64Utils {
	public static final Log log = LogFactory.get();
    private static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
    }
    /**
     * 读取文本文件内容
     * @param filePath 文件所在路径
     * @return 文本内容
     * @throws IOException 异常
     * @author cn.outofmemory
     * @date 2013-1-7
     */
    public static String readFile(String filePath) throws IOException {
        StringBuffer sb = new StringBuffer();
        readToBuffer(sb, filePath);
        return sb.toString();
    }
    /**
	 * base64字符串转换成图片
	 * @param imgStr		base64字符串
	 * @param imgFilePath	图片存放路径
	 * @return
     * @throws IOException 
	 */
	public static boolean Base64ToImage(String imgStr,String imgFilePath) throws IOException {
		//imgStr =StrUtil.subSuf(imgStr,"data:image/jpeg;base64,".length() );
		// 对字节数组字符串进行Base64解码并生成图片
		if (StrUtil.isEmpty(imgStr)) // 图像数据为空
			return false;
		File dir = FileUtil.file(imgFilePath);
		byte bytes[] = new byte[512];
		bytes = imgStr.getBytes();
		int b = bytes.length; // 是字节的长度，不是字符串的长度
		FileOutputStream fos = new FileOutputStream(dir);
//		fos.write(bytes, 0, b);
		fos.write(bytes);
		fos.flush();
		fos.close();
			return true;
	}
 
   
}
