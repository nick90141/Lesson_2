package task_4;

public class Main {
    public static void main(String[] args) {
        Machine Machine = new Machine();

        Machine Machine1 = new Machine(2010);
        System.out.println(Machine.getYear());

        Machine Machine2 = new Machine(2011, 260.1);
        System.out.println(Machine.getYear() + " " + Machine.getSpeed());

        Machine Machine3 = new Machine(2012, 270.1, 3300);
        System.out.println(Machine.getYear() + " " + Machine.getSpeed() + " " + Machine.getWeight());

        Machine Machine4 = new Machine(2014, 280.2, 2700, "White");
        System.out.println(Machine.getYear() + " " + Machine.getSpeed() + " " + Machine.getWeight() + " " + Machine.getColour());

    }
}
