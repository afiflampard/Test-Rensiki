package testrensiki;

import java.util.Scanner;

public class MelipatArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang array");
        int panjang = in.nextInt();
        System.out.println("");
        int[] data = new int[panjang];
        data[0] = 0;
        data[1] = 5;
        data[2] = 3;
        data[3] = 8;
        data[4] = -1;
       // data[5] = 6;
        Solution(data);
        
    }
    
    public static void Solution(int[] data){
        
        if(data.length % 2 != 0){
            int[] newData = new int[(data.length/2)+1];
           
            for (int i = 0; i < (data.length/2)+1; i++) {
                
                if(i == (newData.length-1)){
                    
                    newData[i] = data[data.length/2];
                }else{
                    newData[i] = (data[i]+data[data.length-i-1])%10;
                }
            }
            for (int i = 0; i < newData.length; i++) {
                System.out.println(newData[i]);
            }
        }else{
           
            int[] newData = new int[data.length/2];
            
            for (int i = 0; i < data.length/2; i++) {
               
                newData[i] = (data[i]+data[data.length-i-1])%10;
            }
            for (int i = 0; i < newData.length; i++) {
                System.out.println(newData[i]);
            }
        }
    }

}
