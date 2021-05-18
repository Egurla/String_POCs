package com.string;

public class MainClass {

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=str1.concat(str2);
		
		
		String str5=new String("abc");
		String strconstantpool=str5.intern();
		
		//intern() method
		System.out.println(strconstantpool+" --------intern()----"+str5.equals(strconstantpool));//true
		System.out.println(strconstantpool==str1);//true
		
		
		//equals() always checking the contemnt
		System.out.println(str4.equals(str2));//false
		System.out.println(str1.equals(str2));//true
		System.out.println(str2.equals(str3));//true
		System.out.println(str1.equals(str4));//false
		System.out.println(str3.equals(str4));//false
		
		//"==" 
		System.out.println("== operatoter");
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false
		System.out.println(str1==str4);//false
		System.out.println(str2==str3);//false
		System.out.println(str2==str4);//false
		System.out.println(str3==str4);//false
		
		
		String string="hello nisum";
		StringBuilder sb = new StringBuilder();
		sb.append(string);
		System.out.println(sb);
		
		
		
        String s1 = "This is Java . ";
 
        StringBuffer sb1 = new StringBuffer();
 
        // convert String to StringBuffer  using append() method 
        sb1.append(s1);
        String s2 = "java articles";
        sb1.append(s2);
        String s = "Covering string topics.";
        sb.append("\n" + s);
        System.out.println(sb1);
        
        
        
		
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        
	String first = "Java ";
    System.out.println("First String: " + first);

    String second = "Programming";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);
}
}
