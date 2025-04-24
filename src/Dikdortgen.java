

public class Dikdortgen extends Sekil {
		
		private float uzun;
		private float kisa;
		

		public float getUzun() {
			return uzun;
		}
		public void setUzun(float uzun) {
			if(uzun<0) {
				System.err.println("\nUzun kenar değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
			this.uzun= uzun*(-1.0f);
			}
			else {
				this.uzun = uzun;
			}
		}
		public float getKisa() {
			return kisa;
		}
		public void setKisa(float kisa) {
			if(kisa<0) {
				System.err.println("\nKısa kenar değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
			this.kisa= kisa*(-1.0f);
			}
			else {
				this.kisa = kisa;
			}
		}
		
		public float alan() {
			return uzun*kisa;
		}
		
		public float cevre() {
			return (uzun+kisa)*2;
		}
		public void dikdortgen() {				//Dikdörtgeni 2 boyutlu olarak ekrana çizdirme metodu.
			
			
			//Kullanıcıya girdiği değerleri geri bildirmek.
			
			System.out.println("\nUzun kenar " + getUzun() + " olarak alındı.");
			System.out.println("Kısa kenar " + getKisa() + " olarak alındı.");
			System.out.println("\nBelirtilen boyutlarda dikdörtgeniniz: \n");
			
			
			
			for(int i=0; i<kisa; i++) {
				for(int j=0; j<uzun;j++) {
					if(i==0 || j==0 || j==(uzun-1) || i==(kisa-1)) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			System.out.println();}
			
		}
}

		