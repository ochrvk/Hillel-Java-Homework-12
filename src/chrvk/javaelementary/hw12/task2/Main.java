package chrvk.javaelementary.hw12.task2;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {2, 3},
                {1, 3, 4, 7}
        };

        Iterator iterator = new Iterator(arr);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
