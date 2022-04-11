import java.util.Scanner;

public class table
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,k;
        System.out.println("Enter the number");
        i=sc.nextInt();
        System.out.println("Table of "+i); 
        for(int j=1; j<=10; j++){
           k=i*j;
           System.out.println(i+" * "+j+" = "+k);
       }
    }
}