package ru.gb.student;

import ru.gb.student.service.Service;

public class Main {
    public static void main(String[] args){
        Service service = new Service();
        try {
            service.run();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
