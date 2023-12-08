package step8_01.technique;



/*
 * 
 *  # 캡슐화 (Capsulation)
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 *  - 클래스에는 package , public 접근제어자만 사용 가능하다.
 *  - 하나의 클래스 파일에는 하나의 public 클래스만 사용할 수 있다.
 * 
 * */

class AccessModifierTest1{ // private의 영역은 {     } 안에서만 
	private int a; // 숨기고
	public int b; // 드러내는 것
	
	// setter라는 뒷문을 만들어 private에 접근해서 수정한다.
	// getter라는 뒷문을 통해 private에 접근해서 가져온다. 

	public int getA() {  
		// private변수를 클래스 외부로 반환하는 메서드 getter
		// 변수명 앞에 get을 추가하여 메서드 이름을 작성한다.
		// get+변수명(첫글자대문자)
		return a; // this.a
	}
	
	public void setA(int a) {
		// private변수를 클래스 외부에서 수정하는 메서드 setter
		// 변수명 앞에 set을 추가하여 메서드 이름을 작성한다.
		// set+변수명(첫글자대문자)
		this.a=a;
	}
}
// DTO : Data Transfer Object : 데이터 전송 객체
// VO : Value Object : 값(데이터) 객체
// BO : Business Object : 비즈니스 객체
class ProductDTO1 {
		
	// getter,setter 자동완성 연습용
	
	// getter & setter 생성 단축키
	// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	private String productCd;
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrandCd() {
		return brandCd;
	}
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	private String productNm;
	private int price;
	private String brandCd;
	private String brandNm;
}

public class TechniqueEx02_01_필기 {

	public static void main(String[] args) {

		AccessModifierTest obj = new AccessModifierTest();
		// private 변수는 클래스 외부에서 접근 불가
		//obj.a= 1000;
		//System.out.println(obj.a);
		
		obj.setA(1000);					// setter를 사용해 private변수 데이터를 수정한다.
		System.out.println(obj.getA()); // getter를 사용해 private변수 데이터를 반환한다.
		obj.b = 2000;
		System.out.println(obj.b);
		
	}

}
