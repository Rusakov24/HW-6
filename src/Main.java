public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация цикла " + i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Интерация цикла " + i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }
        System.out.println("Задания 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание 7");
        int number = 1;
        for (int i = 0; i < 9; i++) {
            System.out.println(number *= 2);
        }
        System.out.println();

        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
        }
        System.out.println(total);

        System.out.println("Задание 9");
        int salary2= 29000;
        double total2 = 0.01;
        for (int i = 0; i < 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + i + " Итого " + total2);}
        System.out.println(total2);

        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
