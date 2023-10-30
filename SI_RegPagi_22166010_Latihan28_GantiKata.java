/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan28_gantikata;
import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO28
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Ganti Kata
 */
public class SI_RegPagi_22166010_Latihan28_GantiKata {

    public static void main(String[] args) {
        
        System.out.println("=======  Program Mengganti Kata =======");
        Scanner input = new Scanner(System.in);
        String sentence, oldWord, newWord;

        System.out.print("Masukkan kalimat: ");
        sentence = input.nextLine();

        System.out.print("Ganti Kata: ");
        oldWord = input.nextLine();

        System.out.print("Menjadi Kata: ");
        newWord = input.nextLine();
        
        System.out.println("======= Hasil Formatting =======");
        String oldSentence = sentence.replace(oldWord, oldWord);
        String newSentence = sentence.replace(oldWord, newWord);
        System.out.println("Kalimat awal: " + oldSentence);
        System.out.println("Kalimat baru: " + newSentence);
    
    }
}
