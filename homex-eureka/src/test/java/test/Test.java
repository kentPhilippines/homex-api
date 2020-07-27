package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

public class Test {
	static Log log = LogFactory.get();
	public static void main(String[] args) {
		int a = 0;
		List list = new ArrayList();
		Map map = new ConcurrentHashMap();
		while (true) {
			testkent kent = new testkent();
			kent.setName("kent."+a);
			list.add(kent);
			map.put(a, kent);
			 a++;;
			log.info("【當前運行次數："+a+"】");
			log.info("【當前運行次數："+a%2+"】");
			kent = null;
			ThreadUtil.execute(()->{
				for (int i = 0; i < 1000000; i++) {
					Object object = map.get(i);
					System.out.println(object.toString());
				}
			});
		}
	}

}
class testkent{
	private String name;
	@Override
	public String toString() {
		return "testkent [name=" + name + "]";
	}

	public testkent(String name) {
		super();
		this.name = name;
	}

	public testkent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}