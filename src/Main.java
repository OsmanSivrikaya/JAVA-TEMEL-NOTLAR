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

        //DİZİLERDE ÖRNEKLER"
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

        //GİRİLEN SAYININ ASAL OLUP OLMADIĞINI BULMA
        /*System.out.println("SAYİ GİRİNİZ:");
        int sayi = konsolVeri.nextInt();
        int sayac =0;
        for (int i=2;i<sayi;i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("GİRİLEN SAYI ASALDIR");
        }
        else
            System.out.println("GİRİLEN SAYI ASAL DEĞİLDİR");
         */

        //KALIN SESLİ VE İNCE SESLİ HARFLERİ BULMA
        /*
        System.out.println("HARF GİRİNİZ:");
        char harf = konsolVeri.next().charAt(0);
        switch (harf)
        {
            case'A':
            case'a':
            case'I':
            case'ı':
            case'O':
            case'o':
            case'U':
            case'u':{
                System.out.println("KALIN SESLİ HARFDİR");
                break;
            }
            default:
                System.out.println("İNCE SESLİ HARFDİR");
        }
         */

        //GİRİLEN SAYININ MÜKEMMEL OLUP OLMADIĞINI HESAPLAYAN PROGRAM
        /*
        int sayi = 0;
        int sonuc = 0;
        System.out.println("SAYİ GİRİNİZ:");
        sayi = konsolVeri.nextInt();
        for (int i=1;i<sayi;i++)
        {
            if (sayi%i==0) {
                sonuc += i;
            }
        }
        if (sonuc==sayi){
            System.out.println("GİRİLEN SAYI MÜKEMMEL SAYIDIR");
        }
        else
            System.out.println("GİRİLEN SAYI MÜKEMMEL SAYI DEĞİLDİR");
         */

        //GİRİLEN SAYILARIN ARKADAŞ OLUP OLMADIĞINI BULAN PROGRAM
        /*
        System.out.println("SAYI GİRİNİZ:");
        int sayi1 = konsolVeri.nextInt();
        System.out.println("SAYI GİRİNİZ:");
        int sayi2 = konsolVeri.nextInt();
        int toplam1=0,toplam2=0;
        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0){
                toplam1+=i;
            }
        }
        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                toplam2+=i;
            }
        }
        if (toplam1==sayi2&&toplam2==sayi1){
            System.out.println("GİİLEN SAYILAR ARKADAŞ SAYILARDIR");
        }
        else
            System.out.println("GİRİLEN SAYILAR ARKADAŞ SAYI DEĞİLDİR");
            */

        //DİZİ İÇİNDE SAYI ARAYAN PROGRAM
        /*
        int []sayilar = {1,2,3,4,5,6,7};
        System.out.println("ARANCAK SAYIYI GİRİNİZ:");
        int arancak = konsolVeri.nextInt();
        boolean varmi= false;

        for (int sayi:sayilar){
            if (arancak==sayi){
                varmi = true;
            }
        }
        if (varmi==true){
            System.out.println("ARANCAK SAYI DİZİDE VAR");

        }
        else
            System.out.println("ARANCAK SAYI DİZİDE YOK");
         */
        //SAYI BULMA METHODU ÇAĞIRMA KODU
        //sayiBulmaca();

        //TOPLA METHODUNU KULLANMA
        //System.out.println(topla(5,2));

        //TOPLA VARIABLE ARGUMENTS METHOD KULLANIMI
        System.out.println(topla(1,2,3,4,5));




    }


    //camel casing=isimlendirme kuralı



    //METHOD
    /*
    public static void sayiBulmaca (){
        Scanner konsolVeri = new Scanner(System.in);
        int []sayilar = {1,2,3,4,5,6,7};
        System.out.println("ARANCAK SAYIYI GİRİNİZ:");
        int arancak = konsolVeri.nextInt();
        boolean varmi= false;

        for (int sayi:sayilar){
            if (arancak==sayi){
                varmi = true;
            }
        }
        if (varmi==true){
            mesajver("ARANCAK SAYI DİZİDE VAR"+arancak);

        }
        else
            mesajver("ARANCAK SAYI DİZİDE YOK"+arancak);
    }

    //PARAMETRELİ METHOT
    public static void mesajver(String mesaj){
        System.out.println(mesaj);
    }

     */

    //GERİ DÖNDÜRME YAPAN METHOD
    /*
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
     */

    //VARIABLE ARGUMENTS METHOD
    public static int topla(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
