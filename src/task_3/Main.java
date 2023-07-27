package task_3;

public class Main {
    public static void main(String[] args) {
        Machine Machine0 = new Machine();

        Machine Machine = new Machine(2009);
        System.out.println(Machine.getYear());

        Machine Machine1 = new Machine(2010, 240.6);
        System.out.println(Machine.getYear() + " " + Machine.getSpeed());

        Machine Machine2 = new Machine(2011, 250.7, 3100);
        System.out.println(Machine.getYear() + " " + Machine.getSpeed() + " " + Machine.getWeight());

        Machine Machine3 = new Machine(2012, 260.8, 3200, "White");
        System.out.println(Machine.getYear() + " " + Machine.getSpeed() + " " + Machine.getWeight() + " " + Machine.getColour());

    }
}
