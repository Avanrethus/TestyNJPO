package Test.Losowe;


import java.util.Arrays;

import java.util.Random;


public class LosoweLiczby {
    private long czasPrzed;
    private long czasPo;
    private long  czasSortowania;
    public long LosujLiczby(){
        int[] test = new int[10000000];
        Random rand = new Random();
        for(int i = 0; i < test.length; i++){
            test[i]= rand.nextInt();
        }
        czasPrzed = System.currentTimeMillis();
        for (int j = 0; j <30; j++){
            Arrays.sort(test);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Czas sortowania: " + (czasPo-czasPrzed)+ " ms");
        czasSortowania = (czasPo - czasPrzed);
        return czasSortowania;
    }
    public static void main(String args[]){
        LosoweLiczby ll = new LosoweLiczby();
        ll.LosujLiczby();
    }
}
