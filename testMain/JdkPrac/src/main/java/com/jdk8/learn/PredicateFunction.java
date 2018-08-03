package com.jdk8.learn;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		/**
		 * predicate 谓语接口，顾名思义，中文中的‘是’与‘不是’是中文语法的谓语，
		 * 同样的该接口对应的方法为接收一个参数，返回一个Boolean类型值，多用于判断与过滤，
		 * 当然你可以把他理解成特殊的Funcation，但是为了便于区分语义，还是单独的划了一个接口，使用test()方法执行这段行为
		 */
		Predicate<Integer> predOdd = integer -> integer % 2 == 1;
		System.out.println(predOdd.test(5));
		// 控制台输出 5
	}

}
