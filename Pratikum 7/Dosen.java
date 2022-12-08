public class Dosen {
    private String nama;
    private Ruangan ruangan;
    
    public Dosen(String nama, Ruangan ruangan) {
       this.nama = nama;
       this.ruangan = ruangan;
    }
    
    public void setRuangan(Ruangan ruangan) {
       this.ruangan = ruangan;
    }
    
    public Ruangan getRuangan() {
       return ruangan;
    }
    
    public void ajarkan() {
       System.out.println(nama + " mengajar di ruangan " + ruangan.getNamaRuangan());
    }
 }