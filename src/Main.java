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

    public static void merging(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       // size of the range to be merged
        String[] NewList = new String[n];   // merge both halves into a temporary array NewList
        int elment1 = from;               // next element to consider in the first range
        int element2 = mid + 1;            // next element to consider in the second range
        int next_space = 0;                   // next open position in NewList

        // a loop that moves the smaller element to NewList as long as neither element1 nor element 2 past the end
        while (elment1 <= mid && element2 <= to) {
            if (a[elment1].compareTo(a[element2]) < 0) {
                NewList[next_space] = a[elment1];
                elment1++;
            } else {
                NewList[next_space] = a[element2];
                element2++;
            }
            next_space++;
        }
        while (elment1 <= mid) {
            NewList[next_space] = a[elment1];
            System.out.println(NewList[next_space]);
            elment1++;
            next_space++;
            System.out.println(Arrays.toString(NewList) + "  2 while");
        }


        // copy any remaining entries of the second half
        while (element2 <= to) {
            NewList[next_space] = a[element2];
            System.out.println(NewList[next_space]);
            element2++;
            next_space++;
            System.out.println(Arrays.toString(NewList) + "  3 while");
        }

    }

}