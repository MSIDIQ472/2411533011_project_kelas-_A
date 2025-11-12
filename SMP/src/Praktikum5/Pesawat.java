package Praktikum5;

public class Pesawat extends kendaraan implements TransportasiUdara, Maskapai {
    private String namaPanggilan;
    public Pesawat(String merk, String model, int tahunProduksi, String namaPanggilan) {
        super(merk, model, tahunProduksi);
        this.namaPanggilan = namaPanggilan;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Nyalakan Mesin: Bersiap lepas landas");
    }
    @Override
    public String jenisBahanBakar() {
        return "Avtur";
    }
    @Override
    public String jenisPenerbangan() {
        return "Komersial";
    }
    @Override
    public String namaMaskapai() {
        return "Garuda Indonesia"; 
    }
    public void tampilkanNamaPanggilan() {
        System.out.println("Nama Panggilan: " + namaPanggilan);
    }
}