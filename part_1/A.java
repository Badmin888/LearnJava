package homework;
import java.util.Scanner;

public class A {
    public int x;

    public A() {
        System.out.println("Hello");
    }

    public void method1() {
        Scanner prompt = new Scanner(System.in);
        x = prompt.nextInt();
    }

    public void method2() {
        System.out.println(x + 12);
    }

    public void method3() {
        if (x % 2 == 0)  System.out.println("Even");
        else System.out.println("Odd");
    }

}

