/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JO11;

/**
 *
 * @author Asus
 */
public class ConfertVokal2Angka {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConfert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    String identitas = "Mohammad Daffa Khalfani Sujatmiko / X-RPL-3 / 23";
    
    tampilJudul(identitas);
    
    private static String tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
        
    }
    String kalimat = tampilInput();
}
