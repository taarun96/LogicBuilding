package techWithJatin;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping: a="+a+" b="+b);
        System.out.println("******Solution 1************");
        int temp=0;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping: a="+a+" b="+b);

        System.out.println("******Solution 2************");
        a=10;
        b=20;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+" b="+b);

        System.out.println("******Solution 3************");
        a=10;
        b=20;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a^b;
        System.out.println(a);
        b=a^b;
        System.out.println(b);
        a=a^b;
        System.out.println("After swapping: a="+a+" b="+b);
    }
}
