package guru.qa;

public class JavaPractice {
    public static void main(String[] args) {

        int a = 920;
        int b = 45;

        System.out.println("Сложение : " + (a + b));
        System.out.println("Вычитание : " + (a - b));
        System.out.println("Умножение : " + (a * b));
        System.out.println("Деление : " + (a / b));
        System.out.println("Остаток деления : " + (a % b));

        if (a == b) System.out.println("a равно b");
        else if (a != b) System.out.println("a не равно b");
        else if (a >= b || a <= b) System.out.println("а больше или равно ИЛИ меньше или равно б");
        else if (a > b && b < a) System.out.println("а больше и меньше б");

        int Int = 200;
        double Double = 49.5;
        System.out.println("Сложение : " + (Int + Double));
        System.out.println("Вычитание : " + (Int - Double));
        System.out.println("Деление : " + (Int / Double));
        System.out.println("Умножение : " + (Int * Double));
        System.out.println("Остаток деления : " + (Int % Double));
        String message = Int > Double ? "Int" : "Double";
        System.out.println(message);

        int studentAssessment = 4;
        switch (studentAssessment) {
            case 1:
                System.out.println("Нет слов...");
                break;
            case 2:
                System.out.println("Двоечник!");
                break;
            case 3:
                System.out.println("Среднячок");
                break;
            case 4:
                System.out.println("Хорошист");
                break;
            case 5:
                System.out.println("Отличник!");
                break;
        }

            byte x = 127;
            byte y = 1;
            byte p;
            int np;
            p = (byte) (x + y);
            np = x + y;
            System.out.println(x + y);
            System.out.println("Переполнено : " + p);
            System.out.println("Не переполнено : " + np);
    }
}