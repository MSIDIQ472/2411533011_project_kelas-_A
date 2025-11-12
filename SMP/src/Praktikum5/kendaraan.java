package Praktikum5;

public abstract class  kendaraan {
	private String merk;
	private String model;
	private int tahunProduksi;
	public kendaraan(String merk, String model, int tahunProduksi) {
		this.merk=merk;
		this.model=model;
		this.tahunProduksi=tahunProduksi;
		
	}
public abstract void nyalakanMesin();
public final void tampilkanInfo() {
	System.out.println("merk: "+ merk);
	System.out.println("model: "+ model);
	System.out.println("tahun produksi: " + tahunProduksi);
}
}
