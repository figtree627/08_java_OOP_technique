package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *
 *	- this.변수 : 자신의 변수 
 *	  super.변수 : 부모의 변수
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {
	String name = "parent";
	int age = 70;

	Parent() {
		this("익명", -1);
		System.out.println("(P-기본) 부모클래스의 기본 생성자 실행");
	}

	Parent(String name, int age) {
		System.out.println("(P-추가) 부모클래스의 추가된 생성자 실행");
	}
	void testMethod() {
		System.out.println("(P)부모클래스 메서드");
	}
}

class Child extends Parent {
	String name = "child";
	int age = 40;

	Child() {
//		super(); // 부모클래스의 기본 생성자를 실행(기본적으로 생략돼 있다.)
		super("익명부모", -999); // // 부모클래스의 추가된 생성자를 실행
		System.out.println("(C-기본) 자녀클래스의 기본 생성자 실행");
	}

	Child(String name, int age) {
//		this();
//		super();
		super("익명부모2", -777);
		System.out.println("(C-추가) 자녀클래스의 추가된 생성자 실행");
	}
	void testMethod() {
		System.out.println("(C) 자녀클래스 메서드");
	}
	void printData() {
		System.out.println(super.name);// 부모클래스의 변수
		System.out.println(super.age);// 부모클래스의 변수
		System.out.println(this.name + " / " + name );// 자신의 변수
		System.out.println(this.age + " / " + age);//자신의 변수 
		System.out.println();
		
		super.testMethod(); // 부모 클래스 testMethod 호출
		this.testMethod(); // 자신의 testMethod 호출
		testMethod(); // 자신의 testMethod 호출(this를 생략해도 된다.) 
	}

}

public class TechniqueEx08 {

	public static void main(String[] args) {

		// 1번 Child기본 생성자 - super()일 때
		new Parent();
		System.out.println(); // 부모추가 => 부모 기본

		new Child();
		System.out.println(); // 부모 추가 => 부모 기본 => 자녀 기본

		Child object = new Child("익명자녀", 30);
		System.out.println(); // 부모추가 => 부모기본 => 자녀 기본 => 자녀 추가
		
		object.printData();
		
		 
	}

}
