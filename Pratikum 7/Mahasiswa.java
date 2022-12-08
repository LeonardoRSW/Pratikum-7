public class Mahasiswa {
    private String nama;
    private Matakuliah[] matakuliah;
    
    public Mahasiswa(String nama) {
       this.nama = nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
     }
     
     public String getNama() {
        return nama;
     }

    public void setMatakuliah(Matakuliah[] matakuliah) {
       this.matakuliah = matakuliah;
    }
    
    public Matakuliah[] getMatakuliah() {
       return matakuliah;
    }
    
    public void lihatMatkul() {
       for(Matakuliah matakuliah : matakuliah) {
          System.out.println(matakuliah.getNamaMatkul());
       }
    }
 }