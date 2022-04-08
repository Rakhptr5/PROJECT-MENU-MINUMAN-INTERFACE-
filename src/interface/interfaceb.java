/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacea;


/**
 *
 * @author LENOVO
 */
public class interfaceb implements interfaceA {
  @Override
    public void merk() { //value untuk merk minuman
        System.out.println(" ");
        System.out.println("Jenis minuman yang tersedia : ");
        System.out.println("1.Soda, 2.Air mineral, 3.Teh");

        System.out.println("====================================");
    }

    @Override
    public void soda() { //value untuk merk minuman soda
        System.out.println("====================================");
        System.out.println("Minuman Soda yang tersedia : ");
        System.out.println("Coca Cola, Pepsi, Tebs");
        System.out.println("====================================");
    }
    @Override
    public void teh() { //value untuk merk minuman teh
        System.out.println("====================================");
        System.out.println("Minuman Teh yang tersedia : ");
        System.out.println("Teh Botol, Teh Gelas, Teh Kotak");
        System.out.println("====================================");
    }

    @Override
    public void airmineral() { //value untuk merk minuman air
        System.out.println("====================================");
        System.out.println("Minuman Air Mineral yang tersedia : ");
        System.out.println("Aqua, Cleo, Le Minerale");

    }
}
