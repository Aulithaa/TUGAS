/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

class enkapsulasi{
    private String nama;
    private int alamat;
public int get_alamat(){
    return alamat;
}
public String get_nama(){
    return nama;
}
public void set_alamat(String alamat_baru){
}
    public void set_nama(String nama_baru){
    nama=nama_baru;
    }
}
public class main{
    public static void main (String[] args){
        enkapsulasi obj=new enkapsulasi();
        
        obj.set_nama("Aulitha");
        obj.set_alamat("PURWOSARI");
        
        System.out.println("nama : "+obj.get_nama());
        System.out.println("alamat: "+obj.get_alamat());
    }
}