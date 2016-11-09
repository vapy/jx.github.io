package com.vapy.structure.Flyweght;

/**
 * 
 * @author vapy 2016年11月9日
 *
 */

public class FlyweightTest {
	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "B";
		String str3 = "AB";
		
		String str4;
		str4 = str1 + str2;
		
		System.out.println(str3 == str4);
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
		
		Integer int1 = 100;
		Integer int2 = 100;
		Integer int3 = 1000;
		Integer int4 = 1000;
		
		System.out.println(int1 == int2);
		System.out.println(int3 == int4);
	}
}