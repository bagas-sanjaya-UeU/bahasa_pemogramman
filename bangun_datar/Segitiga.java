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
public class Segitiga extends BangunDatar {
     private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return alas + tinggi + sisiMiring;
    }
}
