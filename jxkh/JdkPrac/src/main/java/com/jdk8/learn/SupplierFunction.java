package com.jdk8.learn;

import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {
		/**
		 * Supplier 接口翻译过来就是提供者,和上面的消费者相反，该接口对应的方法类型为不接受参数，
		 * 但是提供一个返回值，通俗的理解为这种接口是无私的奉献者，不仅不要参数，还返回一个值,使用get()方法获得这个返回值
		 */
		Supplier<String> getInstance = () -> "HelloWorld!";
		System.out.println(getInstance.get());
		// 控偶值台输出 HelloWorld
	}
	
}
