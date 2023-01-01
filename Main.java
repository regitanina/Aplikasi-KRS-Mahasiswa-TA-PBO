package PBO356;

public class Main {

    public static void main(String[] args) {
        pembayaran pembayaranPertama = new pembayaran( "Bank Republik Indonesia (BRI)","Universitas Ahmad Dahlan",
                "- Bahasa Indonesia\t= 3 sks\n\t\t\t\t\t\t- Algoritma\t\t\t= 3 sks\n\t\t\t\t\t\t- Sistem Digital\t= 2 sks",
                "AMMAR AL HAKIM ASSHIDDIQI","2000018377","G","TEKNIK INFORMATIKA","3");
        pembayaranPertama.data_pembayaran();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////");

        pembayaran pembayaranKedua = new pembayaran("Bank Syariah Indonesia (BSI)","Universitas Ahmad Dahlan",
                "- Pemrograman Web\t= 3 sks\n\t\t\t\t\t\t- Matematika Diskret\t= 3sks\n\t\t\t\t\t\t- Basis Data\t= 4 sks",
                "AHYANA KHOIRUNNISA","2000018377","G","TEKNIK INFORMATIKA","3");
        pembayaranKedua.data_pembayaran();

    }
}

