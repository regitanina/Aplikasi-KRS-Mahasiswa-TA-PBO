package PBO356;

class pembayaran extends Matkul {
    String bank  ;
    int sks , hasil , a ;

    public pembayaran (String Bank ,String Matkul ,String Nama , String Kelas ,String Nim, String Jurusan ,String Smst , String Universitas ) {
        super(Nama , Kelas ,Nim, Jurusan ,Smst , Universitas, Matkul);
        this.bank = Bank;
        this.sks   = 8 ;
        this.a = 50000;
        this.hasil = this.sks*a ;
    }
    void data_pembayaran() {

        super.mhs_Mahasiswa();
        System.out.println("======================================================");
        System.out.println(" 3. PEMBAYARAN ");
        System.out.println("======================================================");
        System.out.println("Bank                   : "+ bank );
        System.out.println("Jumlah Sks             : "+ this.sks);
        System.out.println("Pembayaran(per sks)    : Rp."+ this.a);
        System.out.println("Total Pembayaran       : Rp."+ this.hasil);

    }

}

