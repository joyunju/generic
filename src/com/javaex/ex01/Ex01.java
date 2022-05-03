//제네틱이란?
// : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법

package com.javaex.ex01;

class Person<T> {
	public T info;
	// info 의 데이터 타입이 T
	// 데이터 타입을 처음정의하지 않고 이후에 정의
}

public class Ex01 {
	public static void main(String[] args) {

		Person<String> pp1 = new Person<String>();

		Person<StringBuilder> p2 = new Person<StringBuilder>();
	}
}