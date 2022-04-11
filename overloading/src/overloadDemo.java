class overloadDemo{

    void test (){
        System.out.println("no parameters");
    }

// ooverload test for two integer//
void test(int a,int b){
    System.out.println("a and b:"+ a +" "+b );
}
// overload test for a double parameter //
void test(double a){
    System.out.println("inside test (double) a: "+ a);
} 

}
class overload{
    public static void main (String args[]){
        overloadDemo ob = new overloadDemo();
        int i=88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);

        
    }
        
    }
