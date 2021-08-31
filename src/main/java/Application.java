public class Application {

    final static private int maxValue = 100;
    final static private int minValue = 1;

    public static void main(String[] args) {
        int value;
        do {
            System.out.print("Integer value: ");
            value = Prompt.getInteger();
        } while (value <= Application.minValue || Application.maxValue <= value);

    }
}
