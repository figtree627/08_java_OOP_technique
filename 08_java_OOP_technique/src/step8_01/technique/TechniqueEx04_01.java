package step8_01.technique;

/*
 *  # 생성자 ( Constructor ) 
 * 
 * 	1. 생성자는 반드시 클래스의 이름과 같아야 한다.
 *  2. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.
 *     ( 생성자도 하나의 메서드이지만 기존 메서드와의 차이점이 있다. )
 *  3. 생성자는 인스턴스를 생성할때 ( new 클래스명(); ) 호출된다.
 *  	3-1) 반드시 실행된다.
 *  	3-2) 가장 먼저 실행된다.
 *  
 *  4. 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 만든다.
 *  5. 기본 생성자란 클래스이름과 같으며 매개변수에 아무것도 없는 생성자를 의미한다.
 *  6. 생성자를 새로 정의하면 기본 생성자는 자동으로 만들어지지 않는다.
 * 
 * */


class ConstructorTest {
	// 순서는 내 마음! = 무조건, 일등으로, 리턴없이
	ConstructorTest(){
		System.out.println("생성자1유형 실행");
	}
	
	
	void method1() {
		System.out.println("테스트 메서드 1");
	}
	void method2() {
		System.out.println("테스트 메서드 2");
	}
	void method3() {
		System.out.println("테스트 메서드 3");
	}
}

public class TechniqueEx04_01 {

	public static void main(String[] args) {
		// 객체(인스턴스, 오브젝트)를 생성할 때 생성자가 실행된다. 
		ConstructorTest object = new ConstructorTest();
		
		// 메서드를 호출할 때 메서드가 실행된다. 
		object.method3();
		object.method1();
		new ConstructorTest();
		new ConstructorTest();
	}

}
