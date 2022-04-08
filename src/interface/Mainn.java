/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacea;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pilih1;
        int pilih;
        int harga = 0;
        Scanner input = new Scanner(System.in);
        //pemanggilan object
        interfaceb obj = new interfaceb();
        System.out.println("SELAMAT DATANG DI CAFE RAKHA FAMILI");

        obj.merk();

        System.out.println("Silahkan pilih:");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                obj.soda();
                break;

            case 2:
                obj.airmineral();
                break;
            case 3:
                obj.teh();
                break;    
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Silahkan pilih minuman:");
        pilih1 = input1.nextLine();
        if (pilih1.equals("COCA COLA")) {
            harga = 8000;
        } else if (pilih1.equals("PEPSI")) {
            harga = 5000;
        } else if (pilih1.equals("TEBS")) {
            harga = 5000;
        } else if (pilih1.equals("TEH BOTOL")) {
            harga = 4000;
        } else if (pilih1.equals("TEH GELAS")) {
            harga = 1000;    
        } else if (pilih1.equals("TEH KOTAK")) {
            harga = 3000;    
        } else if (pilih1.equals("AQUA")) {
            harga = 2000;
        } else if (pilih1.equals("LE MINERALE")) {
            harga = 5000;    
        } else if (pilih1.equals("CLEO")) {
            harga = 3000;
        }
        System.out.println("===============================");
        System.out.println("Anda memilih minuman " + pilih1);
        System.out.println("Harga yang harus anda bayar adalah " + harga);
        System.out.println("Silahkan tunggu sebentar...");
        System.out.println(" ");
    }

}
