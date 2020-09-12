/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class action {
 public static void main(String [] args){
  class_dan_objek acc =new class_dan_objek();
        
        acc.buka();
        acc.setTambah(10);
        System.out.println("pengunjung sekarang   :"+acc.getpengunjung());
        acc.setKurang(7);
        System.out.println("pengunjung sekarang   :"+acc.getpengunjung());
        acc.tutup();
    }
    
}
    

