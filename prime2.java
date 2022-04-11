import java.io.*;

import java.util.Scanner;

class Prime1

{

public static void main(String[] args)

{

int start,end;

Scanner sc= new Scanner(System.in);

System.out.println("Enter the first number:");

start=sc.nextInt();

System.out.println("Enter the Second number:");

end=sc.nextInt();

for(int i=start;i<end;i++) //here you can give your own range

{

         int k=0;

         for(int j=2;j<i;j++)

         {

                  if(i%j==0)

                  k++;

         }

         if(k==0)

         System.out.print(i+"   ");

}

}

}