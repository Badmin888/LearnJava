package com.company;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createFile();
        readFile();

    }

    public static void createFile() {

        Scanner input = new Scanner(System.in);
        int n;
        Random r = new Random();

        do {
            n = input.nextInt();
        } while (n <= 10);


        for (int i = 0; i <= n; i++) {
            int randNum = r.nextInt((12 + 48) + 1) - 48;
            try {
                FileWriter fileWriter = new FileWriter("number.txt", true);
                String numAsString = String.valueOf(randNum);
                fileWriter.append(numAsString + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void readFile() {
        try {
            File file = new File("number.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            long mult = 1;
            while (line != null) {
                int num = Integer.parseInt(line);
                if (num < 0)
                    mult *= num;
                line = reader.readLine();
            }
            System.out.println(mult);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
