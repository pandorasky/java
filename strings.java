import java.util.Scanner;



public class Strings



{



public static void main(String args[])



{



String first=new String(" ");

String second=new String(" ");



Scanner s=new Scanner(System.in);



System.out.println("String operations");



System.out.println();



System.out.println("Enter the first string");



first=s.nextLine();



System.out.println("Enter the second string");



second=s.nextLine();



System.out.println("The strings are:"+first+" and "+second);



System.out.println("The length of the first string is:"+first.length());



System.out.println("The length of the Second string is:"+second.length());



System.out.println("The concatenation of the first and second string is :"+first.concat(" "+second));



System.out.println("The first character of "+first+" is :"+first.charAt(0));



System.out.println("The uppercase of "+first+" is:"+first.toUpperCase());



System.out.println("The Sub string of the "+first+" Starting from index 3 and ending at 5 is:"+first.substring(3,5));



System.out.println("Replacing 'a' with 'o' in "+first+" is :"+first.replace('a','o'));

}

}