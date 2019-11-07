package homework;
import java.util.Scanner;

public class C {
    public int a, b, c;

    public void method1() {
        Scanner prompt = new Scanner(System.in);
        a = prompt.nextInt();
        b = prompt.nextInt();
        c = prompt.nextInt();
    }

    public int method2() {
        return a % 10;
    }

    public int method3() {
        while (b >= 10)
            b /= 10;
        return b;
    }

    public int method4() {
        int sum = 0;
        while(c != 0) {
            sum += c % 10;
            c /= 10;
        }
        return sum;
    }

    public int method5() {
        return method2() * method3();
    }

    public void method6() {
        System.out.println(method3() + method5());
    }

}



