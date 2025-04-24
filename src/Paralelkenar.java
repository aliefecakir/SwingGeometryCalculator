import java.util.Scanner;

public class Paralelkenar extends Sekil {
	private float yukseklik;
	private float genislik;
	
	public float getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(float yukseklik) {
		if(yukseklik<0) {
			System.err.println("\nYükseklik değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
			this.yukseklik = yukseklik*(-1.0f);
		}
		else {
			this.yukseklik = yukseklik;
		}
	}
	public float getGenislik() {
		return genislik;
	}
	public void setGenislik(float genislik) {
		if(genislik<0) {		
			System.err.println("\nGenişlik değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
			this.genislik = genislik*(-1.0f);
		}
		else {
			this.genislik = genislik;
		}
	}
	
	public float alan() {
		return genislik*yukseklik;
	}
	
	public float cevre() {
		return (genislik+yukseklik)*2;
	}
	
	
	 public void paralelkenar() {				// Paralelkenarı ekrana 2 boyutlu olarak çizdirme metodu.
		
		int i,j,k;
		//Kullanıcıya girdiği değerleri geri bildirmek.
		System.out.println("\nYükseklik " + getYukseklik() + " olarak alındı.");
		System.out.println("Genişlik " + getGenislik() + " olarak alındı.");
		System.out.println("\nBelirtilen boyutlarda paralelkenarınız: \n");
		
		
		
		for(i=0;i<yukseklik;i++) {
			for(j=0;j<yukseklik-i-1;j++) {
				System.out.print("   ");
			}
			for(k=0;k<genislik;k++) {
				if(i==0 || i==yukseklik-1 || k==0|| k==genislik-1) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			
			System.out.println();
			
		}
	}
}
