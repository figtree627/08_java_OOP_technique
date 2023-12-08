package step8_01.technique;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 멤버변수 초기화
class GoodsDTO {
	String goodsCd;
	String goodsNm;
	int goodsPrice;
	
	void setData(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	GoodsDTO(){}
	GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}


	void printData() {
		System.out.println(this.goodsCd + " / " + this.goodsNm + " / " + this.goodsPrice);
	}
}


public class TechniqueEx04_02 {

	public static void main(String[] args) {
		GoodsDTO goodsDTO = new GoodsDTO();
//		goodsDTO.goodsCd ="0x000"; 
//		goodsDTO.goodsCd ="기계식키보드"; 
//		goodsDTO.goodsPrice =45000; 
		
		
//		goodsDTO.setData("0x001","기계식키보드", 45000);
//		goodsDTO.printData();
		
		// (after) 생성자를 사용한 객체변수 초기화
		GoodsDTO goods1 = new GoodsDTO("0x001", "기계식키보드", 45000);
		GoodsDTO goods2 = new GoodsDTO("0x002", "무선마우스", 27000);
		GoodsDTO goods3 = new GoodsDTO("0x003", "장패드", 5000);
		goods1.printData();
		goods2.printData();
		goods3.printData();
		
		// 사용예시
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#,##0");
	}

}
