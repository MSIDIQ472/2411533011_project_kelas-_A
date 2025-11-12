package Praktikum5;

public interface BahanBakar {
String jenisBahanBakar();
default void infoKonsumsi() {
	System.out.println("info konsumsi: konnsumsi bahan bakar tergantung kapasitas mesin");
}
}