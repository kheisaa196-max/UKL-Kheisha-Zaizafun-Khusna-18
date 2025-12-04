import java.util.Scanner;

public class uangpecahan {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]pecahan={100000,50000,20000,10000,5000,2000,1000,500,200,100,50,25,10,5,1};
        int nominal;
        
        System.out.println("Masukkan nominal yang akan di pecahkan");
         nominal = input.nextInt();
         
         for(int i = 0;i<pecahan.length;i++){
           int jumlah= nominal / pecahan [i];//jumlah lembar
           nominal = nominal%pecahan[i];//sisa nominal
               
           if(jumlah>0){
                  if(pecahan[i]>=1000){
               System.out.println(jumlah + " Lembar" + pecahan[i]);
           }else{
                System.out.println(jumlah+" koin"+pecahan[i]);  
               }
             }

        }
    }
}
