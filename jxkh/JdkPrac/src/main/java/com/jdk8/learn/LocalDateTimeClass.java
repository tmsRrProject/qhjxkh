package com.jdk8.learn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		localDateMethods();
	}

	public static void localDateMethods() {

		LocalDate date = LocalDate.now();
		System.out.println("getYear===" + date.getYear()); // ��ȡ��->2018
		System.out.println("getMonth===" + date.getMonth()); // ��ȡ��Ӣ��->JUNE
		System.out.println("getMonthValue==" + date.getMonthValue());// ��ȡ��ֵ->6
		System.out.println("getDayOfMonth===" + date.getDayOfMonth());// ��ȡ��->28
		System.out.println("getDayOfYear===" + date.getDayOfYear());// ��ȡ������һ��ĵڼ���->179
		System.out.println("getDayOfWeek===" + date.getDayOfWeek());// ��ȡ???->THURSDAY
		date = date.plusMonths(-1);// ��һ����
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");// ��ʽ������
		System.out.println("plusMonths===" + date.format(formatter));// ��ʽ�����ڽ��->2018-05

	}
}