
/*Kullanıcı tarafından girilen İki sayının 
toplamını ve ortalamasını hesaplayan program
*/
import java.util.Scanner;
public class soru2 { 

    
    public static void main(String[]args) {
        
        int sayi1,sayi2,toplam;
        float ortalama;
        Scanner klavye = new Scanner(System.in);

        System.out.print("1.Sayi:");
        sayi1 = klavye.nextInt();

        System.out.print("2.Sayi:");
        sayi2 = klavye.nextInt();

        toplam =sayi1+sayi2;
        ortalama =(float)toplam/2;

        System.out.println("Toplam="+toplam);
        System.out.println("Ortalama="+ortalama);


    }
    
}
