package PBO356;

class Matkul extends Mahasiswa {
    String matkul ;

    public Matkul (String Matkul ,String Nama , String Kelas ,String Nim, String Jurusan ,String Smst , String Universitas ) {
        super(Nama , Kelas ,Nim, Jurusan ,Smst , Universitas);
        this.matkul = Matkul;
    }
    void mahasiswa_matkul() {
        super.mhs_Mahasiswa();
        System.out.println("======================================================");
        System.out.println(" 2. MATA KULIAH YANG DI PILIH ");
        System.out.println("======================================================");
        System.out.println("Matakuliah Pilihan    : "+ matkul );

    }
    public static void main(String[] args) {
        Matkul pillihanPertama = new Matkul( "- Bahasa Indonesia = 3 sks\n\t\t\t\t\t\t- Algoritma  = 3 sks\n\t\t\t\t\t\t- Sistem Digital  = 2 sks","AMMAR AL HAKIM ASSHIDDIQI","G","2000018377","Teknik Informatika","3","Universitas Ahmad Dahlan");
        pillihanPertama.mahasiswa_matkul();
    }
}

