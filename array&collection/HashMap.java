public class HashMap {
    public static void main(String[] args) {
        // Simulasi HashMap sederhana dengan 2 array
        int[] nim = new int[3];
        String[] nama = new String[3];

        // Menambahkan data (key, value)
        nim[0] = 101; nama[0] = "Ani";
        nim[1] = 102; nama[1] = "Budi";
        nim[2] = 103; nama[2] = "Citra";

        // Menampilkan semua data
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < nim.length; i++) {
            if (nama[i] != null) { // hanya tampilkan jika tidak null
                System.out.println("NIM: " + nim[i] + " | Nama: " + nama[i]);
            }
        }

        // "Menghapus" data (misalnya hapus Budi dengan NIM 102)
        for (int i = 0; i < nim.length; i++) {
            if (nim[i] == 102) {
                nama[i] = null; // anggap null = sudah dihapus
            }
        }

        // Menampilkan data setelah dihapus
        System.out.println("\nSetelah Budi dihapus:");
        for (int i = 0; i < nim.length; i++) {
            if (nama[i] != null) {
                System.out.println("NIM: " + nim[i] + " | Nama: " + nama[i]);
            }
        }
    }
}
