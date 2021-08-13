package testrensiki;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.println("Masukkan panjang array");
        int panjang = in.nextInt();
        System.out.println("");
        int[] data = new int[panjang];
        int c;
        data[0] = -2;
        data[1] = -2;
        data[2] = -2;
        data[3] = 9;
        data[4] = 9;
        data[5] = 9;
        data[6] = -2;
        data[7] = 7;
        data[8] = 9;
        Solution(data);
    }

    public static void Solution(int[] data ){
        int c;
        ArrayList<Integer> hasil = new ArrayList<Integer>();
        int[] b = new int[data.length];
        for (int i = 0; i < b.length; i++) {
            c = 1;
            if (data[i] == -1) {
                b[i] = 0;
            } else {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[i] == data[j]) {
                        c++;
                        data[j] = -1;
                    }
                }
                b[i] = c;
            }
        }
        int m=b[0];
        for (int i = 1; i <data.length ; i++) {
            if(b[i]>=m){
                m=b[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if(b[i]==m)
                hasil.add(data[i]);
        }
        System.out.println(hasil.get(0));
    }
}
