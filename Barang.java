
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inas
 */
public class Barang {
    
    private ArrayList<String> namaBarang=new ArrayList<String>();
    private ArrayList<Integer> stok=new ArrayList<Integer>();
    private ArrayList<Integer> harga=new ArrayList<Integer>();
  
    public Barang(){
        this.namaBarang.add("Pelembab");
        this.stok.add(20);
        this.harga.add(50000);
        
        this.namaBarang.add("Kapas");
        this.stok.add(30);
        this.harga.add(10000);
        
        this.namaBarang.add("Toner");
        this.stok.add(40);
        this.harga.add(150000);
        
        this.namaBarang.add("Serum");
        this.stok.add(24);
        this.harga.add(55000);
        
        this.namaBarang.add("Sabun");
        this.stok.add(35);
        this.harga.add(30000);
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);        
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga (int idBarang){
        return this.harga.get(idBarang);
    }
}
