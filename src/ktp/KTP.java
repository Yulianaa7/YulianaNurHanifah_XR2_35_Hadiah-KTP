/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class KTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nik,nama,ttl,jeniskelamin,alamat,rtrw,desa,kec,agama,statusperkawinan,pekerjaan,kewarganegaraan;
        
        //pengisian data
        System.out.println("PENGISIAN KARTU TANDA PENDUDUK");
        System.out.print("Masukkan NIK                  : ");
        nik = input.nextLine();
        System.out.print("Masukkan Nama                 : ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat/Tanggal Lahir : ");
        ttl = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin        : ");
        jeniskelamin = input.nextLine();
        System.out.print("Masukkan Alamat               : ");
        alamat = input.nextLine();
        System.out.print("Masukkan RT/RW                : ");
        rtrw = input.nextLine();
        System.out.print("Masukkan Desa                 : ");
        desa = input.nextLine();
        System.out.print("Masukkan Kecamatan            : ");
        kec = input.nextLine();
        System.out.print("Masukkan Agama                : ");
        agama = input.nextLine();
        System.out.print("Masukkan Status Perkawinan    : ");
        statusperkawinan = input.nextLine();
        System.out.print("Masukkan Pekerjaan            : ");
        pekerjaan = input.nextLine();
        System.out.print("Masukkan Kewarganegaraan      : ");
        kewarganegaraan = input.nextLine();
        System.out.println("Terima kasih telah mengisi. KTP Anda sedang diproses");
        System.out.println("______________Loading_________________");
        
        //Hasil ktp
        
        System.out.println("            KARTU TANDA PENDUDUK");
        System.out.println("NIK                  : "+nik);
        System.out.println("Nama                 : "+nama);
        System.out.println("Tempat/Tanggal Lahir : "+ttl);
        System.out.println("Jenis Kelamin        : "+jeniskelamin);
        System.out.println("Alamat               : "+alamat);
        System.out.println("RT/RW                : "+rtrw);
        System.out.println("Desa                 : "+desa);
        System.out.println("Kecamatan            : "+kec);
        System.out.println("Agama                : "+agama);
        System.out.println("Status Perkawinan    : "+statusperkawinan);
        System.out.println("Pekerjaan            : "+pekerjaan);
        System.out.println("Kewarganegaraan      : "+kewarganegaraan);
        
    }
    
}
