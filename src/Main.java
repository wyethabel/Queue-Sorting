// Main runner class for unit testing the queue and sorting functionality.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyQueue queue = new MyQueue();

        for (int i = 0; i < 5; i++) {
            System.out.print("First Name: ");
            String firstTemp = input.nextLine();
            System.out.print("Last Name: ");
            String lastTemp = input.nextLine();
            System.out.print("Age: ");
            int ageTemp = Integer.parseInt(input.nextLine());
            queue.enqueue(new Person(firstTemp, lastTemp, ageTemp));
        }

        queue.queueCheck();
        System.out.println("Sorted by last name: ");
        queue.sortedByLast();
        queue.queueCheck();
        System.out.println("Sorted by age: ");
        queue.sortedByAge();
        queue.queueCheck();
        input.close();
    }
}
