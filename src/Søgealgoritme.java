
import java.util.Arrays;

public class Søgealgoritme {

    public static String find(int[] Array, int x) {
        for (int i = 0; i < Array.length; i++) {
            if (i == x) {
                return "Tallet er fundet til at være " + x +" og det er indenfor arrayet";
            }
        }
        return "Tallet er desværre ikke indenfor arrayet";

    }

    public static String findAlle(int[] Array, int x) {
        int gange = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == x) {
                gange++;
            }
        }
            if (gange > 1) {
                return "Tallet er fundet og det er " + gange + " gange i arrayet";
            } else if (gange == 1) {
                return "Tallet er fundet og det er " + gange + " gang i arrayet";
            }
            return "Tallet er desværre ikke indenfor arrayet";
    }

    public static String findMax(int[] Array) {
        // Metode jeg brugte først.
//        int f;
//        for (int i = 0; i < Array.length; i++) {
//            for ( f = 0; f < Array.length; f++) {
//                if (Array[i] < Array[f] || f == Array.length - 1) {
//                    if (f == Array.length -1){
//                        max = Array[i];
//                    }
//                    break;
//                }
//            }
//            if (f == Array.length - 1) {
//                break;
//            }
//        }
        //en bedre metode jeg fandt.
        int max = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max){
                max = Array[i];
            }
        }
        return "Største tal i arrayet er " + max;
    }
}
