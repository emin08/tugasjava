/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasbil;

/**
 *
 * @author emin
 */
public class nilai {
    
    public int nilai,jenis;
    public String hasil;
    
    public void run() {
        //hasil = 2*nilai ;
        if(jenis==1) {
           hasil = Integer.toBinaryString(nilai);
        } else if(jenis==2) {
           hasil = Integer.toHexString(nilai); 
        }
        
        System.out.println("Hasil : "+hasil);
    }
}
