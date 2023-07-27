package task_2;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(2010, "black");
        System.out.println(machine.getYear() + " " + machine.getColour());

        Machine machine2 = new Machine(2023);
        System.out.println(machine2.getYear());

    }
}
