package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;

public class UserId {
	public static void main(String[] args) {
		 Date date = new Date();
		List<String> list = new ArrayList< >();
		List<Date> datelist = new ArrayList< >();
		 for(int a = 0 ; a < 30 ; a++) {
			 DateTime offsetDay = DateUtil.offsetDay(date, -1);
			 date = offsetDay.toJdkDate();
			 datelist.add(date);
			 list.add( DatePattern.NORM_DATETIME_FORMAT.format(offsetDay.toJdkDate()));
		 }
		 System.out.println(list.toString());
		 datelist.sort(( ord1, ord2) -> ord1.compareTo(ord2));
		 
		 
		 
		 for(Date daa : datelist) 
			 System.out.println( DatePattern.NORM_DATETIME_FORMAT.format(daa));
		 
		 
	}

}
