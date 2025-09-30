public class ExceptionTry {
    public static void main(String[] args) {
        try { // kode yang berpotensi error
            int a = 10, b = 0;
            int hasil = a / b; // error pembagian nol
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) { // penanganan error
            System.out.println("Terjadi error: " + e.getMessage());
        } finally { //// kode yang selalu dijalankan (opsional)
            System.out.println("Blok finally selalu dijalankan!");
        }
    }
}
