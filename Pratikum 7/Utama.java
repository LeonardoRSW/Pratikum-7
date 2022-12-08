public class Utama {
    public static void main(String[] args) {
       
       Ruangan ruangan1 = new Ruangan("Ruangan 1");
       Ruangan ruangan2 = new Ruangan("Ruangan 2");
       
       Dosen dosen1 = new Dosen("Pak Joko", ruangan1);
       Dosen dosen2 = new Dosen("Pak Budi", ruangan2);
       
       Matakuliah matakuliah1 = new Matakuliah("Matematika Diskrit", dosen1);
       Matakuliah matakuliah2 = new Matakuliah("Algoritma dan Struktur Data", dosen2);
       
       Mahasiswa mahasiswa1 = new Mahasiswa("Andi");
       Mahasiswa mahasiswa2 = new Mahasiswa("Budi");
       
       Matakuliah[] matakuliahMahasiswa1 = {matakuliah1, matakuliah2};
       Matakuliah[] matakuliahMahasiswa2 = {matakuliah1};
       
       mahasiswa1.setMatakuliah(matakuliahMahasiswa1);
       mahasiswa2.setMatakuliah(matakuliahMahasiswa2);
       
       System.out.println("Matakuliah yang diambil oleh " + mahasiswa1.getNama() + " :");
       mahasiswa1.lihatMatkul();
       
       System.out.println("\nMatakuliah yang diambil oleh " + mahasiswa2.getNama() + " :");
       mahasiswa2.lihatMatkul();
       
       dosen1.ajarkan();
       dosen2.ajarkan();
    }
 }