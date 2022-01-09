
/*1'den Kullanıcı tarafından girilen sayıya kadar
olan tek sayıların toplamı
*/
import java.util.Scanner;
public class soru6 { 

    
    public static void main(String[]args) {
        
        int i,toplam,n;
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        n = klavye.nextInt();

        toplam = 0;
        for(i=1; i<n; i++){
            if(i%2==1)toplam+=i;
        }
         System.out.println("Birden "+n+"'e kadar tek sayıların toplamı:"+toplam);
        }

    }
    
