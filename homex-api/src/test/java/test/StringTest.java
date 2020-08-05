package test;

public class StringTest {
	public static void main(String[] args) {
		/**
		 * 1,提取数字，【当存在数字的时候】当不存在数字的时候直接 用 ascll 比较
		 */
		String s = "MCS-504";
	// 	String a = "MCS-604";
		String b = "MCS-512";
		char t = 'h';
		char i = 's';
		char[] charArray1 = s.toCharArray();
	//	char[] charArray2 = a.toCharArray();
		char[] charArray3 = b.toCharArray();
		int o1 = 0;
		int o2 = 0;
		int o3 = 0;
		for(char j : charArray1) {
			o1 += j ;
		}
	//	for(char j : charArray2) 
	//		o2 += j ;
		for(char j : charArray3) 
			o3 += j ;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}

}
