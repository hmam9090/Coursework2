import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    boolean checker (String[] L){
        for (int i=0; i < L.length-1; i++){
            if(L[i].compareTo(L[i+1])>0){
                return false;
            }
        }
        return true;
    }

    @Test
    void mergeSort() {
        String[] dwarfs = {"Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"};
        assertTrue(checker(Main.mergeSortWrapper(dwarfs)));
    }
}