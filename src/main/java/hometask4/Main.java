package hometask4;

public class Main {
    public static void main (String[] args) {
        Task task1 = new Task();
        Task task2 = new Task("Read a book", 1);
        Task task3 = new Task ("Create a presentation", 2);
        Task task4 = new Task ("Mop the kitchen", 4);

        TaskManager taskManager = new TaskManager ();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        System.out.println("Список всех добавленных задач: " + taskManager.getTasks());

        taskManager.removeTask(task4);
        System.out.println("Список после удаления задачи: " + taskManager.getTasks());

        taskManager.sortTasksByPriority();
        System.out.println("Задачи отсортированные по приоритету:");
        taskManager.displayTasks();







    }
}

