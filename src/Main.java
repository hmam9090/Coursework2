public class Main {
    public static void main(String[] args) {
        String[] words = {"Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"};
        //mergeSort(words, 0, words.length - 1);
        mergeSortWrapper(words);
        System.out.println(String.join(",", words));
    }
    public static String[] mergeSortWrapper (String[]a){
        mergeSort(a,0,a.length-1);
        return a;
    }
    public static void mergeSort(String[] a, int from, int to) {
        if (a.length == 0){
            System.out.println("There are no words to be sorted.");
            System.exit(0);
        }
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first half
        mergeSort(a, from, mid);
        // sort the second half
        mergeSort(a, mid + 1, to);
        merging(a, from, mid, to);
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
            elment1++;
            next_space++;
        }
        // Take the bigger element and put in NewList
        // note that only one of the two loops below will be executed
        // copy any remaining entries of the second half
        while (element2 <= to) {
            NewList[next_space] = a[element2];
            element2++;
            next_space++;
        }

        // copy back from the temporary array
        for (next_space = 0; next_space < n; next_space++) {
            a[from + next_space] = NewList[next_space];
        }
    }//ending merge

}