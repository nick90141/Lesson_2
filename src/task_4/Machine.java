package task_4;

public class Machine {
    public static int year;
    public static double speed;
    public static int weight;
    public static String colour;

    public Machine(){
        this.year = 0;
        this.speed = 0;
        this.weight = 0;
        this.colour = "Unknown";
    }
    public Machine (int year){
        this();
        this.year = year;
    }
    public Machine (int year, double speed){
        this(year);
        this.speed = speed;

    }
    public Machine (int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;

    }
    public Machine (int year, double speed, int weight, String colour){
        this(year, speed, weight);
        this.colour = colour;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Machine.year = year;
    }

    public static double getSpeed() {
        return speed;
    }

    public static void setSpeed(double speed) {
        Machine.speed = speed;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Machine.weight = weight;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Machine.colour = colour;
    }
}
