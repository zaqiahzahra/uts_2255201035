/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_2255201035;
import java.util.Scanner;

public class MainReptil {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

     System.out.print("Masukkan nama reptil: ");
        String namaReptil = scanner.nextLine();
        
        System.out.print("Masukkan panjang ekor reptil (dalam cm): ");
        int panjangEkorReptil = scanner.nextInt();
        System.out.println("==========================");
        // Membuat objek Reptil
        Reptil reptil = new Reptil(namaReptil, panjangEkorReptil );

        // Menampilkan informasi, membuat suara, dan memeriksa keberacunan reptil
        reptil.displayInfo();
        
        System.out.print("Apakah reptil ini beracun? (true/false): ");
        boolean isToxic = scanner.nextBoolean();
        reptil.checkToxicity(isToxic);
        System.out.println("==========================");
        // Membuat objek Ular dan KuraKura
        Ular ular = new Ular("Kobra", 150);
        KuraKura kuraKura = new KuraKura("Turtle", 30);

        ular.displayInfo();
        ular.makeSound();
        ular.checkToxicity(true);
        

        scanner.close();
    }
}
