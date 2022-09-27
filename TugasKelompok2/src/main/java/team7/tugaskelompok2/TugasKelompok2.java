/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package team7.tugaskelompok2;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author WINDA LORENZA SINURAT
 */
public class TugasKelompok2 {

    public static void main(String[] args) {
       
        String nama, nim, lagi = "y";
        boolean done=false;
        boolean done2=false;
        boolean done3=false;
        while(lagi.equals("y")){
        int samelength=10, jml_angka, no_genap=0, no_ganjil=0, b_genap=0, 
                jml_b_genap=0, b_ganjil=0, jml_b_ganjil=0, past, current, 
                fibonacci, jml_current=0;
        int minLengthNama = 1, maxLengthNama=25, batasawal=5, batasakhir=20;
        
        Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("\t     Selamat Datang di Program Algoritma Pengulangan");
        
        do {
            System.out.print("Masukan Nama Anda [1-25 Karakter]: ");
	    nama = input.nextLine();
            if(nama.length() <= maxLengthNama && nama.length() >= minLengthNama)
                {
                       done2=true;
                   }else{
                       System.out.println("Karakter Nama Tidak Sesuai Ketentuan");
                }
            
            }while(!done2);
                   
        do {
            System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
            nim=input.nextLine();

            if(nim.length() == samelength )
                {
                    done=true;
                    }else{
                    System.out.print("\n"+"Karakter NIM Tidak Sesuai Ketentuan"+"\n");
                }
           }while(!done);
      
                System.out.println("\n"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+"\n");
                System.out.println("Registrasi Sukses..."+"\n");
                System.out.println(" Selamat datang " + nama + " [ NIM : " + nim + " ]..^^ "+ "\n");
                System.out.println(" Mari belajar macam-macam deret bilangan...");
                System.out.println("\n"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+"\n");
                System.out.println("Deret Bilangan\n"
                                +"###################### \n");
                
                do{
                    System.out.print("Masukan Sembarang Angka [5..20] : ");
                    jml_angka=input.nextInt();
                    
                  if(jml_angka < 5 || jml_angka > 20)
                   {
                    System.out.println("\n"+ "Inputan yang Anda Masukkan Tidak Ada di antara [5..20]"+"\n");
                    }else{
                    done3=true;
                    }   
                }while(!done3);
                //perhitungan bilangan genap
                System.out.println("\n"+jml_angka + " Bilangan Genap : ");

                    while(no_genap < jml_angka)
                    {
                        b_genap++;
                        
                        if(b_genap%2==0 && no_genap<=jml_angka)
                        {
                            System.out.print(b_genap + " ");
                            no_genap++;
                            jml_b_genap += b_genap;
                        }
                    }
                
                System.out.println("\n" + "Hasil Penjumlahan = " + jml_b_genap + "\n");
                //perhitungan bilangan gajil
                System.out.print(jml_angka + " Bilangan Ganjil : "+"\n");
                
                while(no_ganjil < jml_angka)
                    {
                        b_ganjil++;
                        
                        if(b_ganjil%2 != 0 && no_ganjil<=jml_angka)
                        {
                            System.out.print(b_ganjil + " ");
                            no_ganjil++;
                            jml_b_ganjil += b_ganjil;
                        }
                    }
                
                System.out.println("\n" + "Hasil Penjumlahan = " + jml_b_ganjil + "\n");
                
                //perhitungan bilangan fibonanci
                System.out.print(jml_angka + " Bilangan Fibonacci : "+"\n");
                
                past = 1;
                current = 0;
                fibonacci = 1;
                for (int i = 0; i < jml_angka; i++){
                    //System.out.print(current + " ");
                    fibonacci = past + current;
                    System.out.print(fibonacci + " ");
                    past = current;
                    current = fibonacci;
                    jml_current += fibonacci;
               }

            System.out.println("\n" + "Hasil Penjumlahan = " + jml_current + "\n");

            System.out.println("Anda Ingin Mengulang [y/t] : ");
            Scanner x = new java.util.Scanner(System.in);
            lagi = x.nextLine().toLowerCase();

        }
        System.out.print("\n Terimakasih Sudah Mencoba Program Perulangan...");
    }
    
}
