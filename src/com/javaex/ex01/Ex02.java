package com.javaex.ex01;

//class StudentPerson {
//	public StudentInfo info;
//
//	StudentPerson(StudentInfo info) {
//		this.info = info;
//	}
//}

//class EmoloyeePerson {
//	public EmoloyeeInfo info;
//
//	EmoloyeePerson(EmoloyeeInfo info) {
//		this.info = info;
//	}
//}

// 중복 제거하기 위해 작성
class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class AllPerson {
	public Object info;

	AllPerson(Object info) {
		this.info = info;
	}
}

public class Ex02 {
	public static void main(String[] args) {

//		StudentInfo si = new StudentInfo(2);
//		StudentPerson sp = new StudentPerson(si);
//		System.out.println(sp.info.grade); // 2
//		EmoloyeeInfo ei = new EmoloyeeInfo(2);
//		EmoloyeePerson ep = new EmoloyeePerson(ei);
//		System.out.println();

		AllPerson p1 = new AllPerson("부장");
		EmoloyeeInfo ei = (EmoloyeeInfo) p1.info;

	}

}
