/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author user
 */
class Age {
    private int yearBirth,yearNow;
    private final String red = "\u001B[31m";
    

    public Age(int yearNow) {
       
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }


    
    public int hitungUmur(){

        return yearNow - yearBirth;
   
    }
    
    public int tandanyaKamu (int umur){
        Scanner input = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();
        yearNow  = kalender.get(Calendar.YEAR);
        System.out.print("Masukan Tahun Lahir Anda :  ");
        yearBirth= input.nextInt();
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun lahir anda : " +getYearBirth());
        System.out.println("Hari ini Tahun : "+getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+hitungUmur());
        umur = hitungUmur();
        
        if(umur>=0 && umur<=5){
            System.out.println("Itu Tandanya Kamu"+red+" Lagi lucu-lucunya");
        }else if(umur>5 && umur<=10){
            System.out.println("Itu Tandanya Kamu"+red+" Masih anak-anak");
        }else if (umur>10 && umur<=13){
            System.out.println("Itu Tandanya Kamu"+red+" Masih Remadja");
        }else if (umur>13 && umur<=19){
            System.out.println("Itu Tandanya Kamu"+red+" Alay");
        }else if (umur>19 && umur<=29){
            System.out.println("Itu Tandanya Kamu"+red+" Lagi Galau Nyari Jodoh");
        }else if (umur>29 && umur<=35){
            System.out.println("Itu Tandanya Kamu"+red+" Lagi Sibuk Nyari Uang");
        }else if (umur>35 && umur<=150){
            System.out.println("Itu Tandanya Kamu"+red+" Sudah Tua");
        }else{
            System.out.println(red+"Tidak Terdeteksi Kehidupan");
        }
        
        
        return umur;


}
    
}
