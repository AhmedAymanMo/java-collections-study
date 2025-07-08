package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("************************************");
            System.out.println("1-Add a task");
            System.out.println("2-View tasks");
            System.out.println("3-Remove task");
            System.out.println("4-Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1)
            {
                System.out.print("Enter the task:");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("The task has been added successfully");
            }
            else if(choice == 2)
            {
                for(int i = 0;i < tasks.size();i++)
                    System.out.println((i+1)+"-"+tasks.get(i));
            }
            else if(choice == 3)
            {
                System.out.print("Enter task number to remove:");
                int taskNumber = scanner.nextInt();
                if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                    tasks.remove(taskNumber - 1);
                    System.out.println("Task removed!");
                }
                else
                    System.out.println("Invalid task number");
            }
            else if(choice == 4)
                System.out.println("Exit");
            else
                System.out.println("Invalid choice");

        }while (choice!=4);

    }
}
