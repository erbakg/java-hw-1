import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
            throws IOException {

        //1
        String twoWords;
        //2
        int NUM = 2;
        //3
        String word = "apples";
        //4
        twoWords = 2 + word;
        //5
        System.out.println(twoWords);

        //6
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        //7
        System.out.println("Your name ?");
        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));

        // String reading internally
        String str = bfn.readLine();

        System.out.println("Hello " + str);
    }
}