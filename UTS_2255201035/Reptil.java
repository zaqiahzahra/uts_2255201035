/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2255201035;
import java.util.Scanner;
public class Reptil {
    private String nama;
    private int panjangEkor;

    public Reptil(String nama, int panjangEkor) {
        this.nama = nama;
        this.panjangEkor = panjangEkor;
    }

    // Metode untuk menampilkan informasi reptil
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Panjang Ekor: " + panjangEkor + " cm");
    }

    // Metode untuk menghasilkan suara reptil
    public void makeSound() {
        System.out.println("Reptil mengeluarkan suara.");
    }

    // Metode berparameter untuk menentukan apakah reptil beracun
    public void checkToxicity(boolean isToxic) {
        if (isToxic) {
            System.out.println("Reptil ini beracun!");
        } else {
            System.out.println("Reptil ini tidak beracun.");
        }
    }
}

// Kelas turunan yang mewarisi dari Reptil
class Ular extends Reptil {
    // Konstruktor
    public Ular(String nama, int panjangEkor) {
        super(nama, panjangEkor);
    }

    // Override metode makeSound() untuk ular
    @Override
    public void makeSound() {
        System.out.println("Sss... ular bersiul!");
    }
}

// Kelas turunan lainnya yang mewarisi dari Reptil
class KuraKura extends Reptil {
    // Konstruktor
    public KuraKura(String nama, int panjangEkor) {
        super(nama, panjangEkor);
    }

    // Override metode makeSound() untuk kura-kura
    @Override
    public void makeSound() {
        System.out.println("Kura-kura mengeluarkan suara 'munch munch' saat makan.");
    }
}