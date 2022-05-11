/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oven.model;

/**
 *
 * @author ASUS
 */
public class oven {
    private String Id;
    private String nama;
    private String tglBeli;
    private String merk;
    private String pembayaran;

    public oven(String Id, String nama, String tglBeli, String merk, String pembayaran) {
        this.Id = Id;
        this.nama = nama;
        this.tglBeli = tglBeli;
        this.merk = merk;
        this.pembayaran = pembayaran;
    }

    public void setid(String Id) {
        this.Id = Id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglBeli(String tglBeli) {
        this.tglBeli = tglBeli;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getId() {
        return Id;
    }

    public String getNama() {
        return nama;
    }

    public String getTglBeli() {
        return tglBeli;
    }

    public String getMerk() {
        return merk;
    }

    public String getPembayaran() {
        return pembayaran;
    }
}