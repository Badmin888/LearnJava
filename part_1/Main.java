package homework;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, temp, odd = 0, even = 0, oddSum = 0, evenSum = 0;
        Scanner prompt = new Scanner(System.in);
        a = prompt.nextInt();
        b = prompt.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        Random r = new Random();
        int[] randomNums = new int[40];

        for (int i = 0; i < randomNums.length; i++) {
            int randomNum = r.nextInt((b - a) + 1) + a;
            randomNums[i] = randomNum;
            System.out.println(randomNum);

            if (randomNum % 2 == 0) {
                even++;
                evenSum += randomNum;
            }
            else {
                odd++;
                oddSum += randomNum;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
        System.out.println("EvenSum: " + evenSum + " OddSum: " + oddSum);

        if (oddSum > evenSum) {
            temp = oddSum;
            oddSum = evenSum;
            evenSum = temp;
        }

        for (int i = 0; i < 6; i++) {
            int randomNum = r.nextInt((evenSum - oddSum) + 1) + oddSum;
            System.out.println(randomNum);
        }

    }
}

