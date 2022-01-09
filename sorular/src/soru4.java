
/*Kullanıcı tarafından girilen vize(%40) ve final(%60)
hesaplayan,eğer 50 den büyükse geçti değilse kaldı yazan program
*/
import java.util.Scanner;
public class soru4 { 

    
    public static void main(String[]args) {
        
        double vize,fnl,ortalama;
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("Vize Notu:");
        vize = klavye.nextInt();

        System.out.print("Final Notu:");
        fnl = klavye.nextInt();

        ortalama = vize*0.4+fnl*0.6;
      
        System.out.println("Ortalamanız="+ortalama);
        
        if(ortalama>50)System.out.print("Geçtiniz");
        else System.out.print("Kaldınız");


    }
    
}
