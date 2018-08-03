package com.jdk8.learn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		localDateMethods();
	}

	public static void localDateMethods() {

		LocalDate date = LocalDate.now();
		System.out.println("getYear===" + date.getYear()); // 获取年->2018
		System.out.println("getMonth===" + date.getMonth()); // 获取月英文->JUNE
		System.out.println("getMonthValue==" + date.getMonthValue());// 获取月值->6
		System.out.println("getDayOfMonth===" + date.getDayOfMonth());// 获取日->28
		System.out.println("getDayOfYear===" + date.getDayOfYear());// 获取今天是一年的第几天->179
		System.out.println("getDayOfWeek===" + date.getDayOfWeek());// 获取???->THURSDAY
		date = date.plusMonths(-1);// 上一个月
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");// 格式化日期
		System.out.println("plusMonths===" + date.format(formatter));// 格式化日期结果->2018-05

	}
}