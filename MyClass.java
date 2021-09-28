public class MyClass 
{
    public static void main (String args[]) 
    {
        int a=10;
        int b=20;
        int temp =a;
        System.out.println("Before Swapping: a and b = "+ a +" " + b);

        a=b;
        b=temp;
      

      System.out.println("After Swapping: a and b = "+ a + " " + b);
    }
}