public class methodoverloading1{
    public static void main(String[] args)
    {
        methodoverloading1 m1=new methodoverloading1();
        System.out.println("first function answer is : " + m1.add(2,3));
        int b=m1.add(1,2,5);
        System.out.println("the second method answer is : " + b);

        System.out.println( "the third meethod answer is : " + m1.add(2,3));



    }
    public int  add(int a,int b)
    {
        return a+b;

    }
  public  int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a, double b)
    {
        return a+b;
    }

    

    

    
}