package com.jdk8.learn;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		/**
		 * predicate ν��ӿڣ�����˼�壬�����еġ��ǡ��롮���ǡ��������﷨��ν�
		 * ͬ���ĸýӿڶ�Ӧ�ķ���Ϊ����һ������������һ��Boolean����ֵ���������ж�����ˣ�
		 * ��Ȼ����԰������������Funcation������Ϊ�˱����������壬���ǵ����Ļ���һ���ӿڣ�ʹ��test()����ִ�������Ϊ
		 */
		Predicate<Integer> predOdd = integer -> integer % 2 == 1;
		System.out.println(predOdd.test(5));
		// ����̨��� 5
	}

}
