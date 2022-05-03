package com.javaex.ex01;

class EmoloyeeInfo {
	public int rank;

	EmoloyeeInfo(int rank) {
		this.rank = rank;
	}
}

class CoPerson<T, S> {
	public T info;
	public S id;

	CoPerson(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//Person<EmoloyeeInfo, int> p1 = new Person<EmoloyeeInfo, info>(new EmoloyeeInfo(1), 1);
		// int --> wrapper class 사용
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10); 
		CoPerson<EmployeeInfo, Integer> p1 = new CoPerson<EmployeeInfo, Integer>(e, i);
		//intValue() : static이 아니며 Integer 객체에서 int형 값을 뽑아내는 메소드
		//사용 이유 : 객체에 내용 값을 정수로 변환하기 위함.
		i.intValue();
		
        //System.out.println(p1.id.intValue()); 
		
	}
}
