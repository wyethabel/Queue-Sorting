// Quick sort class designed to accept comparators to function on object attributes.

import java.util.*;

public class MyQuickSort {
    public static <T> void myQuickSort(List<T> list, int low, int high, Comparator<T> comp) {
        if (low < high) {
            // Recursively perform the pivot partition and shift elements.
            int i = partition(list, low, high, comp);
            myQuickSort(list, low, i - 1, comp);
            myQuickSort(list, i + 1, high, comp);
        }
    }

    private static <T> int partition(List<T> list, int low, int high, Comparator<T> comp) {
        // Identify the pivot and shift all items left or right of the pivot.
        T pivotPoint = list.get(high);
        int i = low - 1;
        for (int x = low; x < high; x++) {
            // Comparator utilized for the attribute shift around the pivot.
            if (comp.compare(list.get(x), pivotPoint) < 0) {
                i++;
                T temp = list.get(i);
                list.set(i, list.get(x));
                list.set(x, temp);
            }
        }
        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }
}
