/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3.interfacelatihan1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class Sarjana1841720209Abdulloh extends Mahasiswa1841720209Abdulloh implements ICumlaude1841720209Abdulloh, IBerprestasi1841720209Abdulloh {

    public Sarjana1841720209Abdulloh(String nama) {
        super(nama);
    }

    @Override
    public void menjaraiKompetisi() {
        System.out.println("Saya menjuarai kompetisi INTERNASIONAL");

    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");

    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");

    }
}
