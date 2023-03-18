import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy","Grumpy"};

    }
    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first half
        mergeSort(a, from, mid);
        // sort the second half
        mergeSort(a, mid + 1, to);

    }// end mergeSort


}