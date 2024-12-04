package hometask4;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskManager {
   private ArrayList <Task> tasks;

   //конструктор
   public TaskManager (ArrayList<Task> tasks) {
       this.tasks = tasks;
   }

   //создаем пустую структуру данных
   public TaskManager () {
       this.tasks = new ArrayList<>();
   }

   public ArrayList<Task> getTasks () {
       return this.tasks;
   }

   //добавляем новую таску в нашу структуру данных tasks
   public void addTask (Task newTask) {
       this.tasks.add(newTask);
   }

   public void removeTask (Task oldTask) {
       this.tasks.remove(oldTask);
   }

    /**comparingInt создаёт компаратор, который говорит:
     * "Сравнивать нужно значения, которые возвращает метод getPriority".
     * Метод sort вызывает компаратор для каждой пары задач*/
   public void sortTasksByPriority () {
       tasks.sort (Comparator.comparingInt(Task::getPriority));
   }

   public void displayTasks () {
       for (Task task : tasks) {
           System.out.println(task);
       }
   }





}


