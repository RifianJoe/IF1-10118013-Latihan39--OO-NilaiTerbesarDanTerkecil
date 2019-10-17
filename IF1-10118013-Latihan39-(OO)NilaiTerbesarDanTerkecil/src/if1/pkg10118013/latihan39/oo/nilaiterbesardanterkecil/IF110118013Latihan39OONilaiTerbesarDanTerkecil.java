/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan39.oo.nilaiterbesardanterkecil;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menampilkan Nilai Terbesar dan Terkecil
 */
public class IF110118013Latihan39OONilaiTerbesarDanTerkecil {
    public static String namaPetugas;
    public static int jumlahMahasiswa;
    public static int[] nilaiMahasiswa;
    public static int nilaiTerbesar;
    public static int nilaiTerkecil;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        namaPetugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        nilaiMahasiswa = new int[jumlahMahasiswa];
        System.out.print("Masukkan Nilai Mahasiswa Ke-" + 1 + " = ");
        nilaiMahasiswa[0] = scanner.nextInt();
        nilaiTerbesar = nilaiMahasiswa[0]; nilaiTerkecil = nilaiMahasiswa[0];
        for ( int i = 1; i < jumlahMahasiswa; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
            if (nilaiMahasiswa[i] > nilaiTerbesar)
                nilaiTerbesar = nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] < nilaiTerkecil)
                nilaiTerkecil = nilaiMahasiswa[i];
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        System.out.println(Arrays.toString(nilaiMahasiswa));

        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Petugas : " + namaPetugas );
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
