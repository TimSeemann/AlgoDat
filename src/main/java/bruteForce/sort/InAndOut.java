package bruteForce.sort;

import java.util.Random;

public class InAndOut {
    public static int[] getZahlen(int anz, int max){
        int[] zahlen = new int[anz];
        Random ran = new Random();
        for(int i =0;i<anz;i++){
            zahlen[i]=ran.nextInt(max);
        }
        return zahlen;
    }
    public static void out(int[] out){
        for (int j : out) {
            System.out.println(j);
        }
    }
}
