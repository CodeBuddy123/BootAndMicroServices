package com.ashsoft;

import java.lang.reflect.Field;

public class MyApp {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class cls= Class.forName("com.ashsoft.User");
		Object obj = cls.newInstance();
		
		Field declaredField = cls.getDeclaredField("name");
		declaredField.setAccessible(true);
		declaredField.set(obj, "Ashish");
		System.out.println(declaredField.get(obj));
		
		//Injecting an Object to a private field
		
		Field field2= cls.getDeclaredField("reportDao");
		field2.setAccessible(true);
		field2.set(obj, new ReportDao());
		System.out.println(field2.get(obj));
	}
}
