package task_3;

public class Machine {
    public static int year;
    public static double speed;
    public static int weight;
    public static String colour;

    public Machine(){

    }
    public Machine (int year){
        this.year = year;
    }
    public Machine (int year, double speed){
        this.year = year;
        this.speed = speed;
    }
    public Machine (int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Machine (int year, double speed, int weight, String colour){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
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
