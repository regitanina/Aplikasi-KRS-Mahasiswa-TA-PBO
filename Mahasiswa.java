package PBO356;

public class Mahasiswa {
    private String nama , nim , kelas , jurusan , smst , universitas;

    public Mahasiswa(String Nama , String Nim ,String Kelas , String Jurusan ,String Smst , String Universitas ) {
        this.nama  = Nama;
        this.kelas = Kelas;
        this.nim = Nim ;
        this.jurusan = Jurusan;
        this.smst = Smst ;
        this.universitas = Universitas;
    }

    public void mhs_Mahasiswa() {

        System.out.println("======================================================");
        System.out.println("1. DATA PRIBADI   ");
        System.out.println("======================================================");
        System.out.println("Nama Mahasiswa         : "+ nama);
        System.out.println("NIM                    : "+ nim);
        System.out.println("Kelas                  : "+ kelas);
        System.out.println("Jurusan                : "+ jurusan);
        System.out.println("Semester               : "+ smst);
        System.out.println("Universitas            : "+ universitas);

    }
}


