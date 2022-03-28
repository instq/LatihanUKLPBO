
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


public class Member implements User {
    
    private ArrayList <String> namaMember = new ArrayList <String> ();
    private ArrayList <String> alamat = new ArrayList <String> ();
    private ArrayList <String> telepon = new ArrayList <String> ();
    private ArrayList <Integer> saldo = new ArrayList <Integer> ();
    
    public Member(){
       this.namaMember.add("Inas");
       this.alamat.add("Kediri");
       this.telepon.add("21062006");
       this.saldo.add(600000);
       
       this.namaMember.add("Jeno");
       this.alamat.add("Surabaya");
       this.telepon.add("23042000");
       this.saldo.add(500000);
       
       this.namaMember.add("D.O.");
       this.alamat.add("Jogja");
       this.telepon.add("12011993");
       this.saldo.add(400000);
       
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    
    //untuk perubahan saldo member 
    public void editSaldo(int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    
    public int getJmMember(){
        return this.namaMember.size(); 
//size=mengetahui jumlah data arraylist nama member 
    }
    
     

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
        //To change body of generated methods, choose Tools | Templates.
    }
    
    }
