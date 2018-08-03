package com.jdk8.learn;

import java.util.function.Consumer;

public class CustomerFunction {

	public static void main(String[] args) {
		/**
		 * Consumer 接口翻译过来就是消费者,
		 * 顾名思义，该接口对应的方法类型为接收一个参数，没有返回值，可以通俗的理解成将这个参数'消费掉了'，
		 * 一般来说使用Consumer接口往往伴随着一些期望状态的改变或者事件的发生,
		 * 例如最典型的forEach就是使用的Consumer接口，虽然没有任何的返回值，但是却向控制台输出了语句。
		 * Consumer 使用accept对参数执行行为
		 */
		Consumer<String> printString = s -> System.out.println(s);
		printString.accept("helloWorld!");
		printString.accept("what?");
		// 控制台输出 helloWorld!
	}

}
