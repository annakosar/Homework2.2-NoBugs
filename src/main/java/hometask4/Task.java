package hometask4;

public class Task {
    private String task;
    private int priority;

   //конструктор 1, где мы сразу задаем значения полей
    public Task () {
        task = "Write a poem";
        priority = 3;
    }
     //конструктор 2, который позволяет задать значения полей в мэйне
    Task (String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    public String getTask () {
        return this.task;
    }

    public int getPriority () {
        return this.priority;
    }
    @Override
    public String toString () {
        return task + ", priority: " + priority;
}
}
