package Chapter_3_If_else;

public class If_else {
    public static void main(String[] args) {
        int value = 10;
        // boolean test = value > 0;
        if (value > 0) {
            System.out.println("Число является положительным");
        } else if (value < 0) {
            System.out.println("Число является отрицательным");
        } else if (value < 1000) {
            System.out.println("Число является отрицательным");
        } else if (value < 0) {
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число является нулем");
        }
    }
}
