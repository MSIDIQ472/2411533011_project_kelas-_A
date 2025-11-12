package pkg;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku dari berbagai jenis
        Book novel = new Novel("Laskar Pelangi", "Andrea Hirata", "Drama");
        Magazine Magazine = new Magazine("National Geographic", "Various Authors", "Science");
        Book textbook = new Book("Pemrograman Java", "Anonymous");

        // Membuat objek user
        User user = new User();

        // Menampilkan detail buku menggunakan polymorphism
        System.out.println("=== Detail Buku ===");
        user.viewBookDetails(novel);
        user.viewBookDetails(Magazine);
        user.viewBookDetails(textbook);
        System.out.println();
     // Meminjam buku
        System.out.println("=== Proses Peminjaman Buku ===");
        user.borrowBook(novel);
        user.borrowBook(Magazine);

        // Menampilkan status ketersediaan
        System.out.println("\nStatus Buku Setelah Dipinjam:");
        System.out.println(novel.getTitle() + " tersedia: " + novel.isAvailable());
        System.out.println(Magazine.getTitle() + " tersedia: " + Magazine.isAvailable());

        // Mengembalikan buku
        System.out.println("\n=== Proses Pengembalian Buku ===");
        user.returnBook(novel);

        // Menampilkan status ketersediaan setelah pengembalian
        System.out.println("\nStatus Buku Setelah Dikembalikan:");
        System.out.println(novel.getTitle() + " tersedia: " + novel.isAvailable());
    }
}