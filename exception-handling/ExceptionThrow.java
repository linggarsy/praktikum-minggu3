public class ExceptionThrow {
    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur minimal 18 tahun!");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }

    public static void main(String[] args) {
        try {
            cekUmur(15); // akan lempar exception
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
