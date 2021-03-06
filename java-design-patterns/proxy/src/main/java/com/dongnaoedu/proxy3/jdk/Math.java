package com.dongnaoedu.proxy3.jdk;

/**
 * 实现一个计算的类Math、完成加、减、乘、除功能
 * 
 * @author allen
 */
public class Math implements IMath {
	// 加
	public int add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result);
		return result;
	}

	// 减
	public int sub(int n1, int n2) {
		int result = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result);
		return result;
	}

	// 乘
	public int mut(int n1, int n2) {
		int result = n1 * n2;
		System.out.println(n1 + "X" + n2 + "=" + result);
		return result;
	}

	// 除
	public int div(int n1, int n2) {
		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
		return result;
	}
}
