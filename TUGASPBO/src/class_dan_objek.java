/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class class_dan_objek {
     int pengunjung=0;
    
    void buka(){
        System.out.println("supermarket OPEN");
    }
    void setTambah(int tambahpengunjung){
        pengunjung = pengunjung + tambahpengunjung;
    }
    void setKurang(int kurangpengunjung){
        pengunjung = pengunjung - kurangpengunjung;
        System.out.println("pengunjung telah dilayani   :"+kurangpengunjung);
    }
    int getpengunjung(){
        return pengunjung;
    }
    void tutup(){
        System.out.println("supermarket CLOSED");
    }
}
    

