/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JO11;

import java.util.Locale;

/**
 *
 * @author Asus
 */
public class CobaOperasiString {
    public static void main(String[] args){
        String identitas = "Mohammad Daffa Khalfani Sujatmiko / X-RPL-3 / 23";
        System.out.println("Identitas : "+ identitas);
        
        String x = "operasi";
        System.out.println("isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y= "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
    }
}