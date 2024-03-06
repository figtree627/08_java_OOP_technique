package step8_02.solid.o;

/*
  
	# AsIs Model
	
	LSP_BadCase 클래스에서 eat()메서드와 , sleep() 메서드는 모든 사람에게 적용 될 수 있지만 
	excercise() 메서드는 모든 사람에게 적용이 될 수 없을 수도 있음에도 불구하고 항상 운동을 하도록 설정되어있다.
	해당 클래스를 상속받는 자식클래스에서는 예상치 못한 결과가 발생할 수 있으며 이는 LSP 원칙을 위반한다. 

*/


/*

	# ToBe Model
	
	Person 클래스에서는eat()메서드와 , sleep() 메서드만 구현을 하고 있고
	ExercisePerson 클래스에는 excercise() 운동을 하는 고유한 방법을 가지고 있다. 
	이로써 LSP를 준수할수 있게 되어 운동을 하지 않는 자녀클래스도 부모클래스로 대체할수 있게 만든다.
	
*/



public class LSP {

	public static void main(String[] args) {
		
		/*
	  
			- LSP(Liskov Substitution Principle, 리스코프 치환 원칙)는 객체지향 설계의 원칙 중 하나로 
			  하위 타입은 언제나 상위 타입으로 대체될 수 있어야 한다는 원칙이다. 
			
			- 즉 프로그램에서 부모 클래스의 인스턴스 대신에 자식 클래스의 인스턴스를 사용해도 프로그램의 정확성이 변하지 않아야 합니다.
	 
		 */
		
	}
	
}
