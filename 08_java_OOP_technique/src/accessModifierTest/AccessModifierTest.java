package accessModifierTest;


class Test1 extends AccessModifierTest {
	void printData() {
	System.out.println(publicV); 		// 같은 프로젝트므로 접근 가능
	System.out.println(defaultV); 		// 같은 패키지로 접근 가능
	System.out.println(protectedV); 	// 상속관계이므로 접근 가능
//	System.out.println(privateV); 		// 불가 : 다른 클래스로 접근 불가능
	
	publicM();
	defaultM();
	protectedM();
//	priavateM();
	
	}
}

public class AccessModifierTest {

	
	// 접근제어자는 클래스, 변수, 메서드에만 붙일 수 있다. 
	// 파이썬은 public과 priavate만 있다. 
	public int publicV; 			// 프로젝트 접근
	int defaultV; 					// 같은 패키지 접근
	protected int protectedV; 		// 다른 패키지는 상속관계만 접근
	private int privateV; 			// 클래스 내부에서 접근
	
	public void publicM() {}; 		// 프로젝트 접근
	void defaultM() {}; 			// 같은 패키지 접근
	protected void protectedM() {}; 	// 다른 패키지는 상속관계만 접근
	private void privateM() {}; 	// 클래스 내부에서 접근
	
}

