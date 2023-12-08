package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	- 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
	- 메서드 오버로딩과 혼용되기 쉽다.
	
	     메서드 오버라이딩 : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     메서드 오버로딩 : 같은 클래스 안에서 메서드이름이 같음(중복 정의)

*/

class Wizard2 extends Beginner {
	// 메서드 오버라이딩(메서드 재정의)
	// 부모 클래스와 메서드 이름이 같고 구현되는 기능이 다르다. 
		void levelUp() {
			this.level++;
			this.mana +=3000;
			this.life += 100;
			this.dex += 100;
			this.power += 5;
		}
		
		// Wizard2클래스만의 메서드 추가 
		void fireBall() {
			System.out.println("Wizard - fireBall 메서드 호출 ");
		}
}

class Warrior2 extends Beginner {
	// 메서드 오버라이딩(메서드 재정의)
	// 부모 클래스와 메서드 이름이 같고 구현되는 기능이 다르다. 
		void levelUp() {
			this.level++;
			this.mana +=500;
			this.life += 100;
			this.dex += 100;
			this.power += 3000;
		}	
		
		// Wizard2클래스만의 메서드 추가 
		void dash() {
			System.out.println("Warrior2 - dash 메서드 호출");
		}
}
	

public class TechniqueEx07 {

	public static void main(String[] args) {

		Wizard2 wizard = new Wizard2();
		wizard.printData();
		wizard.levelUp();
		wizard.levelUp();
		wizard.levelUp();
		wizard.printData();
		wizard.fireBall();
		System.out.println("======================================");
		
		Warrior2 warrior = new Warrior2();
		warrior.printData();
		warrior.levelUp();
		warrior.levelUp();
		warrior.levelUp();
		warrior.printData();
		warrior.dash();
		System.out.println("======================================");
	}

}
