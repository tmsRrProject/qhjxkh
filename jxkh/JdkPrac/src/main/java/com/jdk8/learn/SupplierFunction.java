package com.jdk8.learn;

import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {
		/**
		 * Supplier �ӿڷ�����������ṩ��,��������������෴���ýӿڶ�Ӧ�ķ�������Ϊ�����ܲ�����
		 * �����ṩһ������ֵ��ͨ�׵����Ϊ���ֽӿ�����˽�ķ����ߣ�������Ҫ������������һ��ֵ,ʹ��get()��������������ֵ
		 */
		Supplier<String> getInstance = () -> "HelloWorld!";
		System.out.println(getInstance.get());
		// ��żֵ̨��� HelloWorld
	}
	
}
