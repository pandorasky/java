class Factorial{
    int Fact(int n) {
        int result;
        if(n==1) return 1;
        result =  Fact (n-1) * n;
        return result;
    }
}
class Recursion {
    public static void main(String args[]){
        Factorial F = new Factorial();
    System.out.println("factorial of 3 is" + F.Fact(3));
    System.out.println("factorial of 4 is "+ F.Fact(4));
    System.out.println("factorial of 5 is "+ F.Fact(5));
    }
}