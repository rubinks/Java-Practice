import java.util.*;
public class strings
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "Rubin KS";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,5));
        System.out.println(str.contains("KS"));
        System.out.println(str.compareTo("Rubin KS"));    //if output is zero means value same || output negative means not same
        System.out.println(str.startsWith("Ru"));
        System.out.println(str.endsWith("KS"));
        System.out.println(str.startsWith("Ru"));   
        System.out.println(str.indexOf('u'));          //prints the index of given letter
        System.out.println(str.lastIndexOf('n'));      //prints the last index value of given letter

        String str1 = "java is easy";
        String arr[] = str1.split(" ");
	    for(String i : arr)
	    {
	        System.out.println(i);
	    }


	    String test="";
	    System.out.println(test.isEmpty());


	    String a="Hello";
	    String b = "World";
	    System.out.println(a+b);


	    System.out.println(a.charAt(0));//H
	    System.out.println(a.charAt(a.length()-1));//o
	    char []ch=a.toCharArray();//{'H','e','l','l','o'}
	    
	    for(char i : ch)
	    {
	        System.out.print(i);
	    }
	    
	}
}

        
