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
public class Guru extends Sekolah {
    int jml_jam;
    //konstruktor
    public Guru(int nip, String namagr, String matpel, int jumlah)
    {
        super(nip, namagr, matpel);
        this.jml_jam=jumlah;
    }
    //method
    public void cetak()
    {
        super.Cetak();
        System.out.println("Jumlah Jam : " + this.jml_jam);
    }
}
