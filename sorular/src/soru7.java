
/*Girilen sayını tek ya da çift olduğunu söyleyen program
*/
import java.util.Scanner;
public class soru7 { 

    
    public static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Kontrol edilecek sayıyı giriniz:");
        int sayi = klavye.nextInt();

        if(sayi%2==0)System.out.println("Girilen Sayı Çifttir");
                else System.out.println("Girilen Sayı Tektir");
        }

    }
    