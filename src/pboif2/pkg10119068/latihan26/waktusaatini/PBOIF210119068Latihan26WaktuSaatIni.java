/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan26.waktusaatini;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Waktu Saat ini
 */

public class PBOIF210119068Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MM yyyy HH:mm:ss ");
        System.out.println("Hari Ini :" + dateFormat.format(date));
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
