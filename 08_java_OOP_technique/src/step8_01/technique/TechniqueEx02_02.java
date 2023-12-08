package step8_01.technique;

import accessModifierTest.AccessModifierTest;

// public class PublicC{} 		// (가능) 하나의 자바(클래스)파일에는 하나의 public클래만 존재할 수 있다. 
class DefaultC{}				// 가능 
//protected class ProtectedC{}	// 불가능
//private class PrivateC{}		// 불가능 : class 앞에는 public, default만 사용할 수 있다.

class Test2 extends AccessModifierTest {
	void printData() {
	System.out.println(publicV); 		// 같은 프로젝트므로 접근 가능
//	System.out.println(defaultV); 		// (X) 다른 패키지므로 접근 불가능
	System.out.println(protectedV); 	// 상속관계이므로 접근 가능
//	System.out.println(privateV); 		// (X)다른 클래스로 접근 불가능
	
	publicM();		// 같은 프로젝트므로 접근 가능
//	defaultM();		// (X) 다른 패키지므로 접근 불가능
	protectedM();	// 상속관계이므로 접근 가능
//	priavateM();	// (X)다른 클래스로 접근 불가능
	
	}
}

public class TechniqueEx02_02 {

	public static void main(String[] args) {
		
	}

}
