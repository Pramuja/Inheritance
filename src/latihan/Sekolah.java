/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class Sekolah {
    int NIP;
    String Namagr;
    String Matpel;
    //konstruktor
    public Sekolah(int nip, String namagr, String matpel)
    {
        this.NIP = nip;
        this.Namagr = namagr;
        this.Matpel = matpel;
    }
    //method
    public void Cetak()
    {
        System.out.println("NIP : " + this.NIP);
        System.out.println("Nama Guru : " + this.Namagr);
        System.out.println("Mata Pelajaran : " + this.Matpel);
    }
}
