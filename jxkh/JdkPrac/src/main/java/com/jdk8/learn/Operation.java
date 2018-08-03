package com.jdk8.learn;

import java.util.function.Function;

public class Operation {

	/*
	 * ���������������һ��int���Ͳ���a,����a+1,����������˵�Ľ���һ������,����һ��ֵ
	 * ��������������ͷ���Function�ӿڵĶ���,��Ҫ��ô����,����������
	 */
	public static final int addOne(int a) {
		return a + 1;
	}

	/*
	 * �÷����ڶ�����������һ��function���͵���Ϊ,Ȼ�����apply����aִ�������Ϊ
	 */
	public static int oper(int a, Function<Integer, Integer> action) {
		return action.apply(a);
	}

	/* ����������oper����,��addOne������Ϊ�������� */
	public static void main(String[] args) {
		int x = 1;
		// int y = oper(x,Operation::addOne);
		int y = oper(x, e -> addOne(x));// ������Ի��ɷ������õ�д�� int y = oper(x,Operation::addOne)
		System.out.printf("x= %d, y = %d", x, y); // ��ӡ��� x=1, y=2

		/* ��Ȼ��Ҳ����ʹ��lambda���ʽ����ʾ�����Ϊ,ֻҪ��֤һ������,һ������ֵ����ƥ�� */
		y = oper(x, e -> x + 3 ); // y = 4
		System.out.printf("x= %d, y = %d", x, y);
		y = oper(x, e -> x * 3); // y = 3
		System.out.printf("x= %d, y = %d", x, y);
	}

}
