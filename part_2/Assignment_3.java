package homework_2;

public class Assignment_3 implements numsInterface {
    int a, b;

    public Assignment_3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void method_1() {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public void method_2() {
        for (int i = 1; i <= a;i++)
            if (a % i == 0)
                System.out.println(i);
    }

    public void method_3() {
        for (int i = 2; i * i <= b; i++) {
            if (b % i == 0) {
                System.out.println(i);
                while(b % i == 0)  {
                    b  /=  i;
                }
            }
        }
        if(b != 1) {
            System.out.println(b);
        }
    }

    public char method_4() {
        int [] myarray = new int[256];
        String num = String.valueOf(b);

        for (int i = 0; i < num.length(); i++)
            if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
                myarray[num.charAt(i)]++;

         char p, j;
         for (p = '0', j = '1'; j <= '9'; j++)
             if (myarray[j] > myarray[p]) p = j;

        return p;
    }
}

