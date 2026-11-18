package Pertemuan12;
import java.util.Arrays;
    
public class ArrayBilangan22 {
    public static void main(String[] args) {
    int[] bil = {22, 30, -2, 27};
    // bil[0] = 22;
    // bil[1] = 30;
    // bil[2] = -2;
    // bil[3] = 27;

    for (int i = 0; i < bil.length; i++) {
        System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
    }

    for (int nilai : bil) {
        System.out.println(nilai);
        
    }
    System.out.println(Arrays.toString(bil));
    }
}
