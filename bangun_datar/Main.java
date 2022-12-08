/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_datar;

/**
 *
 * @author CharderraEkaBagasSanjaya 20210801088
 */
public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10, 5, 12);
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);

        System.out.println("===== Segitiga =====");
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());
        System.out.println(" ");
        System.out.println("===== Persegi Panjang =====");
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
    }

}
