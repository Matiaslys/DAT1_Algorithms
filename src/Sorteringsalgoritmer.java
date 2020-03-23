import java.util.Arrays;

public class Sorteringsalgoritmer {

//     Bubble Sort
    public static String Bubble(int[] Array) {
        for (int f = Array.length - 1 ; f > 0 ; f--) {
            for (int i = Array.length - 2; i > -1; i--) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;
                }
            }
        }
        return Arrays.toString(Array);
    }

    public static String Insertion(int[] Array) {
        for (int i = 1; i < Array.length ; i++) {
            int key = Array[i];
            int f = i - 1;
                while (f >= 0 && Array[f] > key) {
                    Array[f + 1] = Array[f];
                    f = f - 1;
                    }
                Array[f + 1] = key;
            }
        return Arrays.toString(Array);
    }



}
