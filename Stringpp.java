import java.util.Scanner;

public class Stringpp

{

public static void main(String args[])

{

String first=" ",second=" ";

Scanner s=new Scanner(System.in);

System.out.println("String operation");

System.out.println();

System.out.println("Enter the first string");

first=s.nextLine();

System.out.println("Enter the second string");

second=s.nextLine();

System.out.println("The string are:"+first+" "+second);

System.out.println("THe length of the first string is:"+first.length());

System.out.println("The length of the Second string is:"+second.length());

System.out.println("The concatenation of the first and second string is :"+first.concat(" "+second));

System.out.println("The character of "+first+"is :"+first.charAt(0));

System.out.println("The uppercase of"+first+"is:"+first.toUpperCase());

System.out.println("The Substrinf of the "+first+" Starting from index 3 ans ending at 6 is:"+first.substring(3,7));

System.out.println("Replacing 'a' with 'o' in"+first.replace('a','o'));
}
}
