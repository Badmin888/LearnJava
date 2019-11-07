package homework;
import java.util.Scanner;

public class B extends A {
    public int y;

    public void method1() {
        super.method1();
        Scanner prompt = new Scanner(System.in);
        y = prompt.nextInt();
    }

    public int method4() {
        return x + y;
    }

}
