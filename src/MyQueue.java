/* Primary custom queue class working an a list with the options
to enqueue, dequeue, print contents, and sort by last name or age
in a descending manner. */

import java.util.*;

public class MyQueue {
    private List<Person> contents;

    public MyQueue() {
        contents = new ArrayList<>();
    }

    // Add person.
    public void enqueue(Person i) {
        contents.add(i);
    }

    // Remove person.
    public Person dequeue() {
        if (contents.isEmpty()) {
            throw new NoSuchElementException("Queue is currently empty.");
        }
        return contents.removeFirst();
    }

    // Local Empty check.
    public boolean isEmpty() {
        return contents.isEmpty();
    }

    // Show current queue.
    public void queueCheck() {
        for (Person i : contents) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Comparator sorting support method.
    private void sort(Comparator<Person> comp) {
        MyQuickSort.myQuickSort(contents, 0, contents.size() - 1, comp);
    }

    public void sortedByLast() {
        sort(new NameComp());
    }

    public void sortedByAge() {
        sort(new AgeComp());
    }
}
