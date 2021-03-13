package chrvk.javaelementary.hw12.task2;

import java.util.*;

public class Iterator {
    private final int[] arr;
    private final int size;
    private int index = 0;

    public Iterator(int[][] arr) {
        this.arr = Arrays.stream(arr).flatMapToInt(Arrays::stream).sorted().toArray();
        this.size = this.arr.length;
    }

    public boolean hasNext() {
        return index < size;
    }

    public int next() {
        if (index < size) {
            return arr[index++];
        } else {
            throw new NoSuchElementException("No such element.");
        }
    }
}
