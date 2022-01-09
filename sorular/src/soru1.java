
//kullanıcıdan ismini alarak "Merhaba isim" yazan program

import java.util.Scanner;
public class soru1{
    public static void main(String[] args) {
        String isim;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen İsminizi Giriniz:");
        isim = klavye.nextLine();
           
        System.out.println("Merhaba " + isim);
    }
  }