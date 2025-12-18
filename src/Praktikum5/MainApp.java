package Praktikum5;

public class MainApp {
    public static void main(String[] args) {
        // untuk membuat mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, "Automatic"); 
        
        // Panggil metode untuk menampilkan info mobil
        mobil1.tampilkanInfo(); 
        mobil1.nyalakanMesin();
        System.out.println("Jenis Bahan Bakar: " + mobil1.jenisBahanBakar()); 
        mobil1.infoKonsumsi(); 
        mobil1.fiturMobil(); 
        //utnuk membuat bus
        Bus bus1 = new Bus("Mercedes-Benz", "Bus Pariwisata", 2018, "Eksekutif");
        // Panggil metode untuk menampilkan info bus
        bus1.tampilkanInfo(); 
        bus1.nyalakanMesin();
        System.out.println("Jenis Bahan Bakar: " + bus1.jenisBahanBakar());
        bus1.infoKonsumsi();
        System.out.println("Kapasitas Penumpang: " + bus1.kapasitasPenumpang() + " penumpang");
        bus1.fiturBus();
        //pennjadwalan
        Bus.JadwalPerjalanan jadwal = bus1.new JadwalPerjalanan("Jakarta - Bandung", "08:00");
        jadwal.tampilkanJadwal();
        System.out.println("\n Pesawat");
        Pesawat pesawat1 = new Pesawat("Garuda", "Boeing 737", 100, "PK-GHA");
        pesawat1.tampilkanInfo(); // final method dari Kendaraan
        pesawat1.nyalakanMesin(); // Implementasi dari Kendaraan
        System.out.println("Jenis Bahan Bakar: " + pesawat1.jenisBahanBakar()); // dari TransportasiUdara (BahanBakar)
        System.out.println("Jenis Penerbangan: " + pesawat1.jenisPenerbangan()); // dari TransportasiUdara
        System.out.println("Nama Maskapai: " + pesawat1.namaMaskapai()); // dari Maskapai
        
    }
}