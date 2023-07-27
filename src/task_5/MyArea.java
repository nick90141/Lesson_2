package task_5;

import java.util.Scanner;

public class MyArea {
    final public static double PI = 3.14;

    public static double areaOfCircle() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение радиуса: ");
        double radius = in.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Площадь круга: " + area);

        return area;
    }

}
