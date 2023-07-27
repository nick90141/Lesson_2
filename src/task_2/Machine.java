package task_2;

public class Machine {

    public static int year;
    public static String colour;

    public Machine (int year, String colour){
        this.year = year;
        this.colour = colour;
    }
    public Machine (int year){
        this.year = year;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Machine.year = year;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Machine.colour = colour;
    }
}
