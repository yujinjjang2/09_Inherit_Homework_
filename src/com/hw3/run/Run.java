package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		Product product1 = new Product("Samsung", "Galaxy S9", "Blue", 960000);
		Product product2 = new Product("LG", "G6", "Red", 820000);
		
		System.out.println("생성한 첫 번째 객체의 값 : " + product1.toString());
		System.out.println("생성한 두 번째 객체의 값 : " + product2.toString());
		
		System.out.println("=================================================================");
		
		System.out.println("생성한 두 객체의 값이 같은가 : " + product1.equals(product2));
		
		System.out.println("=================================================================");
		
		System.out.println("첫 번째 객체의 해쉬코드 값 : " + product1.hashCode());
		System.out.println("두 번째 객체의 해쉬코드 값 : " + product2.hashCode());
		
		System.out.println("=================================================================");
		
		Product copy = product.clone(product1);
//		Product copy = new Product();
//		copy = product1;
		
//		System.out.println(copy.clone());
		System.out.println("복제한 객체의 값 : " + copy.toString());
		
		System.out.println("=================================================================");
		
		System.out.println("첫 번째 객체와 복제 객체가 주소 값이 일치하는가 : " + product1.equals(copy));
		//System.out.println("첫 번째 객체와 복제 객체의 필드 값이 일치하는가 : " + product1.hashCode().equals(copy.hashCode()));
		
		
		
	}

}
