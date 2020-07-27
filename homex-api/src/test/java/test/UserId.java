package test;

import cn.hutool.core.util.IdUtil;

public class UserId {
	public static void main(String[] args) {
		String objectId = IdUtil.objectId();
		System.out.println(objectId);
	}

}
