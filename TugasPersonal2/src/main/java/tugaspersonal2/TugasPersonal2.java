/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tugaspersonal2;

import java.util.Scanner;

/**
 *
 * @author WINDA LORENZA SINURAT
 */
public class TugasPersonal2 {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       char choice;
       do{
           String baris1 = "Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial";
           String baris2 = "Masukkan banyak angka yang mau di cetak [2..10] : ";
           String baris3 = "Masukkan beda masing-masing angka {2..9} : " ;
           
           System.out.println(baris1);
           System.out.println(baris2);
           int banyakAngka = sc.nextInt();
           System.out.println(baris3);
           int bedaAngka = sc.nextInt();
           
           String deret1 = "Deret Aritmatika : ";
           String deret2 = "Deret Geometri : ";
           String deret3 = "Faktorial dari " +banyakAngka + " : ";
           
//           Aritmatika
           System.out.print("\n" + deret1 + "\n");
           int a = 1, total = 0;
           for(int i = 1; i <=banyakAngka; i++){
               System.out.print(a + total);
                a = a + bedaAngka;
                if (i<banyakAngka){
                System.out.print(" ");
                } else{
                System.out.print("");
           }
       }
//           Geometri
         System.out.print("\n" + deret1 + "\n");
           int b = 1, total2 = 0;
           for(int i = 1; i <=banyakAngka; i++){
               System.out.print(b + total2);
                b = b * bedaAngka;
                if (i<banyakAngka){
                System.out.print(" ");
                } else{
                System.out.print("");
           }
       }
//          Faktorial
        System.out.print("\n" + deret3 + "\n");
        
       for (int i = banyakAngka; i >= 1; i--) {
        System.out.print(i + " ");
        }
        System.out.println("= " + factorial(banyakAngka));
        
        System.out.println("Anda mau ulang [Y/T] : ");
        choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y') ;
        sc.close();
        }
        public static int factorial(int n){
        if (n==1){
        return 1;
        }else{
        return n * factorial(n - 1);
        }
    }
}