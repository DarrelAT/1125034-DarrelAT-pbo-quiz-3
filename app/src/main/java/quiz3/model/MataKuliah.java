package quiz3.model;

public class MataKuliah{
    private String kode; 
    private String nama; 
    private int jumlahSks;
    private int semester;

    public MataKuliah(String kode, String nama, int jumlahSks, int semester){
        this.kode = kode; 
        this.nama = nama; 
        this.jumlahSks = jumlahSks;
        this.semester = semester;
    }
}