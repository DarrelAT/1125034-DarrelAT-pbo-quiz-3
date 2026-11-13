package quiz3.controller;
import java.util.*;
import java.util.Scanner;

import quiz3.model.*;

public class main extends MahasiswaDataView{
    DataView<Mahasiswa> data = new DataView<>();

    MataKuliah mk = new MataKuliah(null, null, 0, 0);
    Ruangan r = new Ruangan(null, null, 0, 0);

    @Override 
    protected abstract String getPrimaryKeyValue(Mahasiswa data){
        return data.getNama();
    }

    @Override
    protected String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    @Override
    protected Mahasiswa convertValueToModel(String[] value) {
        return new Mahasiswa(value[0], value[1], value[2], 
        Integer.parseInt(value[3]));
    }

    @Override
    protected String[] convertModelTovalues(Mahasiswa data) {
        return new String[]{data.getNim(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur())};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataView<Mahasiswa> data = new DataView<>();

        MataKuliah mk = new MataKuliah(null, null, 0, 0);
        Ruangan r = new Ruangan(null, null, 0, 0);

        System.out.println("=== Pilih Menu ===");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Mata Kuliah");
        System.out.println("3. Ruangan");

        int pilih = sc.nextInt();

        if(pilih == 1){
            System.out.println("Pilih Aksi");
            System.out.println("1. show all data");
            System.out.println("2. find one data");
            System.out.println("3. add data");
            System.out.println("4. change data");
            System.out.println("5. Delete data");
            int subpilih = sc.nextInt();

            if(subpilih == 1){
                mk.show
            }else if(subpilih == 2){

            }else if(subpilih == 3){
                
            }else if(subpilih == 4){
                
            }else if(subpilih == 5){

            }else{

            }
        }
    }
}
