package com.company;

import java.util.Random;

public class TestClass implements TestInterface {

    int a, b;
    int[] m = new int[12];

    @Override
    public void method1() {
        Random r = new Random();
        a = r.nextInt((10 + 10) + 1) - 10;
        b = r.nextInt((10 + 10) + 1) - 10;
    }

    @Override
    public void method2() {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = r.nextInt((10 + 10) + 1) - 10;
        }
    }

    @Override
    public int method3() {
        int i, j;
        for (i = 0; i < m.length; i++) {
            if (m[i] < 0) break;
        }
        for (j = i + 1; j < m.length; j++) {
            if (m[j] < 0 && m[j] > m[i]) i = j;
        }
        return m[i];
    }

    public void method4() {
        for (int i = 0; i < m.length; i++) {
            System.out.println(""+ i + ". " + m[i]);
        }
    }

    public void method5() {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            while (m[i] != 0) {
                count++;
                m[i] /= 10;
            }
            System.out.println(count);
        }
    }
}
