import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konsolVeri = new Scanner(System.in);

        //KULLANICI TARAFINDAN GİRİLEN 3 SAYININ EN BÜYÜĞÜNÜ BULMA
        /*int sayi1,sayi2,sayi3;
        System.out.println("1. SAYIYI GİRNİZ \n");
        sayi1=konsolVeri.nextInt();
        System.out.println("2. SAYIYI GİRNİZ \n");
        sayi2=konsolVeri.nextInt();
        System.out.println("3. SAYIYI GİRNİZ \n");
        sayi3=konsolVeri.nextInt();

        if (sayi1>sayi2&&sayi1>sayi3){
            System.out.println("En büyük sayı : "+sayi1);
        }
        else if (sayi2>sayi1&&sayi2>sayi3){
            System.out.println("En büyük sayı : "+sayi2);
        }
        else {
            System.out.println("En büyük sayı : "+sayi3);
        }*/

        //SWITCH CASE İLE HESAP MAKİNESİ YAPIMI BASİT
        /*
        int sayi1 , sayi2;
        System.out.println("İLK SAYIYI GİRİNİZ:\n");
        sayi1=konsolVeri.nextInt();
        System.out.println("İKİNCİ SAYIYI GİRİNİZ:\n");
        sayi2=konsolVeri.nextInt();
        System.out.println("--YAPMAK İSTEDİNİZ İŞLEMİ SEÇİN--");
        System.out.println("TOPLAMA İÇİN: +");
        System.out.println("ÇIKARMA İÇİN -");
        System.out.println("ÇARPMA İÇİN *");
        System.out.println("BÖLME İÇİN /");
        char hesap = konsolVeri.next().charAt(0);
        int sonuc;

        switch (hesap){
            case '-':{
               sonuc=sayi1-sayi2;
                System.out.println("SONUÇ: "+sonuc);
                break;
            }
            case '+':{
                sonuc=sayi1+sayi2;
                System.out.println("SONUÇ: "+sonuc);
                break;
            }
            case '*':{
                sonuc=sayi1*sayi2;
                System.out.println("SONUÇ: "+sonuc);
                break;
            }
            case '/':{
                sonuc=sayi1/sayi2;
                System.out.println("SONUÇ: "+sonuc);
                break;
            }
        }
        */
        //FOR DÖNGÜSÜ İLE GİREN SAYIYA GELENE KADAR SIFIRDAN TOPLAMA
        /*
        int sayi = 0;
        int sonuc =0;
        System.out.println("SAYI GİRİNİZ:");
        sayi = konsolVeri.nextInt();
        for (int i=0;i<=sayi;i++){
            sonuc+=i;

        }
        System.out.println("SONUC:"+sonuc);
        */
        //WHILE DÖNGÜSÜ İLE SAYIYI BİR BİR AZALTARAK YAZMA
        /*
        int sayi=0;
        System.out.println("Sayı Giriniz:");
        sayi = konsolVeri.nextInt();
        while(0<sayi){
            sayi--;
            System.out.println(sayi);
        }
         */
        //DO WHILE DONGUSU İLE 0 GİRİLENE KADAR SAYI GİRME
        /*
        int sayi=015;
        do {
            System.out.println("SAYI GİRİNİZ:");
            sayi=konsolVeri.nextInt();
        }
        while(sayi!=0);
        System.out.println("SIFIR GİRDİĞİNİZ İÇİN DÖNGÜ KAPANMIŞTIR");
         */
        //DİZİLER İLE ÇALIŞMAK 1
        /*
        int []dizi ={1,2,3,4};
        int []dizi1 = new int[4];
        dizi1[0]=5;
        dizi1[1]=6;
        dizi1[2]=7;
        dizi1[3]=8;

        for (int i =0;i<dizi.length;i++){
            System.out.println(dizi[i]);
            System.out.println(dizi1[i]);
        }
        for (int sayi:dizi1){
            System.out.println(sayi);
        }
        */

        //DİZİLERDE ÖRNEKLER
        /*
        double[]dizi3 = {1.2,1.3,1.5,4.4};
        double max = 0 ;
        double toplam = 0;

        for (double sayi:dizi3){
            if (max<sayi){
                max=sayi;
            }
            toplam+=sayi;
        }
        System.out.println("EN BÜYÜK SAYİ"+max);
        System.out.println("TOPLAM:"+toplam);
        */


    }
}
