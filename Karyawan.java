
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
public class Karyawan implements User{
    
    private ArrayList<String> namaKaryawan=new ArrayList<String>();
    private ArrayList<String> alamat=new ArrayList<String>();
    private ArrayList<String> telepon=new ArrayList<String>();
    private ArrayList<Integer> jabatan=new ArrayList<Integer>();

    public Karyawan(){
        this.namaKaryawan.add("admin");
        this.alamat.add("Padang");
        this.telepon.add("30051995");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
    this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int JmlKaryawan(){
        return this.namaKaryawan.size();
    }
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
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
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
