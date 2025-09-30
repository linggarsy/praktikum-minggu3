public class ExceptionThrows {
    // Method yang mendeklarasikan throws
    public static void cekBagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan nol!");
        }
        int hasil = a / b;
        System.out.println("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        try {
            cekBagi(10, 0); // ini akan melempar ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
