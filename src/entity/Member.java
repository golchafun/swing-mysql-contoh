/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Member {

    private String id, nama, kategori;
    private int tahunLahir;

    public Member(String id, String nama, int tahunLahir, String kategori) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.tahunLahir = tahunLahir;
    }

    public String getIdMember() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public Object[] toObjects() {
        Object[] o = {id, nama, tahunLahir, kategori};
        return o;
    }

}
