package com.jdk8.learn;

import java.util.function.Consumer;

public class CustomerFunction {

	public static void main(String[] args) {
		/**
		 * Consumer �ӿڷ����������������,
		 * ����˼�壬�ýӿڶ�Ӧ�ķ�������Ϊ����һ��������û�з���ֵ������ͨ�׵����ɽ��������'���ѵ���'��
		 * һ����˵ʹ��Consumer�ӿ�����������һЩ����״̬�ĸı�����¼��ķ���,
		 * ��������͵�forEach����ʹ�õ�Consumer�ӿڣ���Ȼû���κεķ���ֵ������ȴ�����̨�������䡣
		 * Consumer ʹ��accept�Բ���ִ����Ϊ
		 */
		Consumer<String> printString = s -> System.out.println(s);
		printString.accept("helloWorld!");
		printString.accept("what?");
		// ����̨��� helloWorld!
	}

}
