package homework_2;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Assignment 1, 2
        createFile();
        readFile("function.txt");

        // Assignment 3
        Assignment_3 test = new Assignment_3(18, 565);
        test.method_1();
        test.method_2();
        test.method_3();
        char res = test.method_4();
        System.out.println(res);
    }

    public static void createFile() {

        for (double x = 1; x < 2.01; x += 0.01) {
            x = Math.round(x * 100.0) / 100.0;
            double y = x * x + 2 * x + 3;
            y = Math.round(y * 100.0) / 100.0;

            try(FileWriter writer = new FileWriter("function.txt", true)) {
                String numberAsString = String.valueOf(y);
                writer.append(numberAsString + "\n");
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

        }
    }

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            double min = Double.parseDouble(line);
            double max = min;
            while (line != null) {
                System.out.println(line);
                double temp = Double.parseDouble(line);
                if (temp < min) min = temp;
                else if (temp > max) max = temp;
                line = reader.readLine();
            }
            System.out.println("Min: " + min + " Max: " + max);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}

