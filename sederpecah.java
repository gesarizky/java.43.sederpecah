package biasa;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class sederpecah {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai a (dari pecahan  a/b) ");
        System.out.println(" *************************************************************");

        int a  = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai b (dari pecahan " + a + "/b)");
        System.out.println(" ************************************************************* ");

        int b = sc.nextInt();
        int a1,b1;
        a1=a;
        b1=b;
        
        int fpb;
            fpb = a1 % b1;
            while (fpb != 0) {

                a1 = b1;

                b1 = fpb;

                fpb = a1 % b1;
           
            }

        int a2 = a/b1;
        int b2 = b/b1;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Bentuk Sederhana  dari pecahan " + a + "/" + b);
        System.out.println(" *Dengan FPB Pecahan  = " + b1);
        System.out.println(" *Setelah disederhanakan menjadi  = " + a2 + "/" + b2);
        System.out.println(" ********************************************************** ");
    }

}
