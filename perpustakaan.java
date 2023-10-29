import java.util.ArrayList;
import java.util.List;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }
}

public class perpustakaan {
    public static void main(String[] args) {
        List<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(new Buku("PBO dengan Java", "Indrajani", "Elexmedia", 2007, 1));
        daftarBuku.add(new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004, 1));
        daftarBuku.add(new Buku("Komputer & Pemrograman", "Abdul Kadir", "Andi Offset", 2003, 3));

        System.out.println("======================================================================================");
        System.out.println("Daftar Buku yang Tersedia");
        System.out.println("======================================================================================");
        System.out.println("No\tJudul\tPengarang\tPenerbit\tTahun\tKategori");
        System.out.println("======================================================================================");

        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku buku = daftarBuku.get(i);
            System.out.println(i + 1 + "\t" + buku.judul + "\t" + buku.pengarang + "\t" + buku.penerbit + "\t" + buku.tahun + "\t" + kategoriToString(buku.kategori));
            if (buku.kategori == 1) {
                bukuTeknik++;
            } else if (buku.kategori == 2) {
                bukuManajemen++;
            } else if (buku.kategori == 3) {
                bukuFiksi++;
            } else {
                bukuLainnya++;
            }

            if (buku.tahun < 2000) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }

        System.out.println("Jumlah buku yang tersedia: " + daftarBuku.size());
        System.out.println("Buku Teknik: " + bukuTeknik);
        System.out.println("Buku Manajemen: " + bukuManajemen);
        System.out.println("Buku Fiksi: " + bukuFiksi);
        System.out.println("Buku Lainnya: " + bukuLainnya);
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);
    }

    public static String kategoriToString(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            default:
                return "Lainnya";
        }
    }
}