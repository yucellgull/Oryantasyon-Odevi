/*Kullanıcı tarafından girilen iki sayı arasındaki 
7 ye tam bölünen sayıları bulan program
*/
import java.util.Scanner;
public class soru9 { 

    
    public static void main(String[]args) {
        
        int i,n,m;
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("Başlangıç Sayısı:");
        n = klavye.nextInt();

        System.out.print("Bitiş Sayısı:");
        m = klavye.nextInt();

        for(i=n; i<m; i++){
            if(i%7==0)System.out.println("-"+i);
        }
      
      

    }
    
}