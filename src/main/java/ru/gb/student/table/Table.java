package ru.gb.student.table;

import ru.gb.student.forks.Fork;
import ru.gb.student.forks.ForksList;
import ru.gb.student.philosophers.Philosopher;
import ru.gb.student.philosophers.PhilosopherList;

public class Table {
    private final PhilosopherList philosopherList;
    private final ForksList forksList;

    public Table() {
        philosopherList = new PhilosopherList();
        forksList = new ForksList();
        createPhilosophersList();
        createForksList();

    }

    private void createPhilosophersList() {
        philosopherList.addPhilosopher(new Philosopher("Луций"));
        philosopherList.addPhilosopher(new Philosopher("Эпиктет"));
        philosopherList.addPhilosopher(new Philosopher("Диоген"));
        philosopherList.addPhilosopher(new Philosopher("Цицерон"));
        philosopherList.addPhilosopher(new Philosopher("Гераклит"));
    }

    private void createForksList() {
        forksList.addFork(new Fork("Гараклита/Луция"));
        forksList.addFork(new Fork("Луция/Эпиктета"));
        forksList.addFork(new Fork("Эпиктета/Диогена"));
        forksList.addFork(new Fork("Диогена/Цицерона"));
        forksList.addFork(new Fork("Цициерона/Гераклита"));
    }

    public PhilosopherList getPhilosopherList() {
        return philosopherList;
    }

    public ForksList getForksList() {
        return forksList;
    }


}
