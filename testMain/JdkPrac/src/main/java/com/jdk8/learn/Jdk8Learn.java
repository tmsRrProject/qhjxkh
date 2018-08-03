package com.jdk8.learn;

import java.util.Arrays;

public class Jdk8Learn {

	public static void main(String[] args) {

		jdk8lambda();

	}

	public static void jdk8lambda() {

		// ��򵥵�Lambda���ʽ���ɶ��ŷָ��Ĳ����б�->���ź��������
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

		// ��������еĲ���e���������ɱ���������ó��ģ���Ҳ������ʽָ���ò���������
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println("String == " + e));

		// ���Lambda���ʽ��Ҫ�����ӵ����飬�����ʹ�û����Ž���������������������Java�еĺ�����
		Arrays.asList("a", "b", "d").forEach(e -> {
			System.out.print("{}== " + e + ",");
			System.out.print("{}== " + e);
		});

		// Lambda���ʽ�����������Ա�;ֲ��������Ὣ��Щ������ʽ��ת����final�ģ���������������������Ч����ȫ��ͬ

		String separator = ",";
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e + separator));

		final String separators = ",";
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e + separators));

		// Lambda���ʽ�з���ֵ������ֵ������Ҳ�ɱ���������ó������Lambda���ʽ�е�����ֻ��һ�У�����Բ���ʹ��return��䣬������������Ƭ��Ч����ͬ
		Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			System.out.println("compareTo ==" + e1 + "--" + e2);
			int result = e1.compareTo(e2);
			System.out.println("compareTo ==" + result);
			return result;
		});
	}

}
