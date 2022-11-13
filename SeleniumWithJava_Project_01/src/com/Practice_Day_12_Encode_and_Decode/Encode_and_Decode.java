package com.Practice_Day_12_Encode_and_Decode;

import org.apache.commons.codec.binary.Base64;

public class Encode_and_Decode {

	public static void main(String[] args) {
		
		String str="Azad@123";
		
		byte[] encodeString=Base64.encodeBase64(str.getBytes());
		System.out.println("Encode string: "+new String(encodeString));
		
		byte[] decodeString=Base64.decodeBase64(encodeString);
		System.out.println("Decode string: "+new String(decodeString));

	}

}
