class swap
{
  public static void main(String args[])
  {
    System.out.println("Before swapping");
    System.out.println("a=5,b=10");
    int a=5;
    int b=10;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping");
    System.out.println("a=" +a);
    System.out.println("b="+b);
    //the values are swapped
    /*output
    Before swapping
    a=5,b=10
    After swapping
    a=10
    b=5
     */
        



  }
}
    