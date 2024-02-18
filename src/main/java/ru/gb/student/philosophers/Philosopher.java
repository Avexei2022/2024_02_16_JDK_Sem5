package ru.gb.student.philosophers;

public class Philosopher{

    private final String name;
    private int count;


    public Philosopher(String name) {
        this.name = name;
        count = 1;
    }

    public String getName() {
        return name;
    }

    public String takesFood () {
        count++;
        return " кушает спагетти " + (count-1) + " раз";
    }

    public int getCount() {
        return count;
    }

    public String philosophize() {
        return " размышляет";
    }

    @Override
    public String toString() {
        return "Философ по имени " + name;
    }


}
