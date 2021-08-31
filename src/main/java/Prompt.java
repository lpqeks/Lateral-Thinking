import java.util.Scanner;

public class Prompt {

    public static int getInteger() {
        int number = 0;
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
            try {
                number = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Incorrect type...try again");
                number = -1;
            }
        return number;
    }
}
