

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Membuat method mengambil jumlah kambing dan menambah
                       Jumlah kambing lalu menampilkannya kelayar
 *
 */
public class KambingGlobal {

    //Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;

    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();

        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();

        //Menambah satu kambing
        kambingSusu.tambahKambing();

        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
