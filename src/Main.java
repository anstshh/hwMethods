public class Main {
    public static void main(String[] args) {
        int year = 2020;

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Год является високосным");
        }  else {
            System.out.println("Год не является високосным");
        }
    }
}