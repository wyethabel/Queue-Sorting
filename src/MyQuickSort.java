import java.util.*;

public class MyQuickSort {
    public static <T> void myQuickSort(List<T> list, int low, int high, Comparator<T> comp) {
        if (low < high) {
            int i = partition(list, low, high, comp);
            myQuickSort(list, low, i - 1, comp);
            myQuickSort(list, i + 1, high, comp);
        }
    }

    private static <T> int partition(List<T> list, int low, int high, Comparator<T> comp) {
        T pivotPoint = list.get(high);
        int i = low - 1;
        for (int x = low; x < high; x++) {
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