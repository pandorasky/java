class Prime

{

public static void main(String[] args)

{

int start,end;

start= Integer.parseInt("0");

end=Integer.parseInt("10"
);



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