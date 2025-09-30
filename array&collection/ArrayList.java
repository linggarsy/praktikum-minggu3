public class ArrayList {
    public static void main(String[] args) {
        // Membuat array String dengan ukuran tetap
        String[] nama = new String[3];

        // Menambahkan elemen
        nama[0] = "Ani";
        nama[1] = "Budi";
        nama[2] = "Citra";

        // Menampilkan isi array
        System.out.println("Isi Array:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        // "Menghapus" elemen (misalnya hapus Budi = set null)
        nama[1] = null;

        System.out.println("\nSetelah dihapus:");
        for (int i = 0; i < nama.length; i++) {
            if (nama[i] != null) {
                System.out.println(nama[i]);
            }
        }
    }
}
