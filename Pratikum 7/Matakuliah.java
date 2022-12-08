public class Matakuliah {
    private String namaMatkul;
    private Dosen dosen;
    
    public Matakuliah(String namaMatkul, Dosen dosen) {
       this.namaMatkul = namaMatkul;
       this.dosen = dosen;
    }
    
    public void setDosen(Dosen dosen) {
       this.dosen = dosen;
    }
    
    public Dosen getDosen() {
       return dosen;
    }
    
    public String getNamaMatkul() {
       return namaMatkul;
    }
 }