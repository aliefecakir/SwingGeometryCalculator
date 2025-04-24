import java.io.IOException;
import java.util.Scanner;

// --------------------------------------------------------------------------------------------------------------------------

public class Test {
	/*
	 
	 //BURADAKİ METOT VE DEĞİŞKENLER SWİNG KULLANMAYA BAŞLAMADAN ÖNCE YAPILMIŞTI SWİNGE GEÇİNCE BURADAKİ METOTLARA GEREK KALMADI.
	  
	public Scanner oku=new Scanner(System.in); 	//Statik bir scanner oluşturdum ki kenarları sorarken sürekli scanner yazmayalım.
	public Dikdortgen d = new Dikdortgen();								//Dikdörtgenin nesnesini oluşturduk.
	public Paralelkenar p= new Paralelkenar();							//Paralelkenarın nesnesini oluşturduk.
	public Kure k= new Kure();											//Kürenin nesnesini oluşturduk.
	public DikdortgenlerPrizmasi dp = new DikdortgenlerPrizmasi(); 		//Dikdörtgenler Prizmasının nesnesini oluşturduk.


// ------------------------------------------------- Uzunluk Bilgileri ------------------------------------------------------


	public void pkenarlar() {		//Paralelkenarın uzunluklarını kullanıcıdan almak.
	System.out.print("Yüksekliği giriniz: ");
	float y=oku.nextFloat();
	p.setYukseklik(y);
	System.out.print("Genişliği giriniz: ");
	float g=oku.nextFloat();
	p.setGenislik(g);
}

	public void dpkenarlar() {							//Dikdörtgenler prizmasının kenarlarını kullanıcıdan almak.
	System.out.print("Prizmanın uzunluğunu giriniz: ");
	float u=oku.nextFloat();
	dp.setUzunluk(u);
	
	System.out.print("Prizmanın genişliğini giriniz: ");
	float g=oku.nextFloat();
	dp.setGenislik(g);
	
	System.out.print("Prizmanın yüksekliğini giriniz: ");
	float y=oku.nextFloat();
	dp.setYukseklik(y);
}

	public void dkenarlar() {							//Dikdörtgenin kenarlarını kullanıcıdan almak.
	System.out.print("Uzun kenarı giriniz: ");
	float u=oku.nextFloat();
	d.setUzun(u);
	
	System.out.print("Kısa kenarı giriniz: ");
	float k=oku.nextFloat();
	d.setKisa(k);
}

	public void kyaricap() {							//Kürenin yarıçapını kullanıcıdan almak.
	System.out.print("Yarıçap değerini giriniz: ");
	float r=oku.nextFloat();
	k.setYaricap(r);
}

// ------------------------------------------------------ Hesaplamalar ------------------------------------------------------


	public void palan() {			//			Paralelkenarın alanını yazdırma metodu.
	System.out.println("\nParalelkenarın alanı: " + p.alan() + "\n");
}


	public void pcevre() {			//			Paralelkenarın çevresini yazdırma metodu.
	System.out.println("Paralelkenarın çevresi: " + p.cevre() + "\n");
}





	public void dalan() {			//			Dikdörtgenin alanını yazdırma metodu.
	System.out.println("\nDikdörtenin alanı: " + d.alan() + "\n");
}


	public void dcevre() {			//			Dikdörtgenin çevresini yazdırma metodu.
	System.out.println("Dikdörtgenin çevresi: " + d.cevre() + "\n");
}





	public void dpalan() {			//			Dikdörtgenler prizmasının yüzey alanını yazdırma metodu.
	System.out.println("Dikdörtgenler prizmasının yüzey alanı: " + dp.DPYuzeyAlani() + "\n");
}


	public void dphacim() {			//			Dikdörtgenler prizmasının hacmini yazdırma metodu.
	System.out.println("\nDikdörtgenler prizmasının hacmi: " + dp.DPHacim() + "\n");
}

	public void dpciz() {			//			Dikdörtgenler prizmasını ekranda çizmek.
	System.out.println(dp.prizma());
}



	public void kalan() {			//			Kürenin yüzey alanını yazdırma metodu.
	System.out.println("Kürenin yüzey alanı: " + k.kYuzeyAlani() + "\n");
}


	public void khacim() {			//			Kürenin hacmini yazdırma metodu.
	System.out.println("\nKürenin hacmi: " + k.kHacim() + "\n");
}




//--------------------------------------------------------------------------------------------------------------------------




static void Menu() {							// Ana Menü metodu.
		
		System.out.println("Aşağıdaki seçeneklerden birini (1 - 5) seçiniz:\n" + "\n1. Dikdortgenin çizimi, alanı ve çevresi\n" + "\n2. Paralelkenarın çizimi, alanı ve çevresi\n" + "\n3. Dikdörtgenler Prizmasının alanı ve çevresi\n" + "\n4. Kürenin alanı ve çevresi\n" + "\n5. Çıkış");
	}
	



static void Bekle() throws IOException {		//Bekleme metodu.
	System.out.println("Devam etmek için bir tuş girişi yapın...");
    System.in.read();
    System.out.println("Devam ediliyor...\n\n");
    System.out.println("-------------------------------------------\n\n");
}

*/

//------------------------------------------------------- Main Metodu ------------------------------------------------------



	public static void main(String[] args) {
		
	MyFrame frame = new MyFrame();
	
	/*Scanner secim = new Scanner(System.in);
	int sec;
	do {
		Menu();
		sec=secim.nextInt();
		secim.nextLine();

		switch(sec) {
		
		case 1:
			dkenarlar();
			d.dikdortgen();
			dalan();
			dcevre();
			Bekle();
			break;
		case 2:
			pkenarlar();
			p.paralelkenar();
			palan();
			pcevre();
			Bekle();
			break;

		case 3:						//BU MAİN METHODUNUN ESKİ HALİYDİ SWING KULLANMAYA BAŞLAYINCA DEVRE DIŞI BIRAKTIK.
			dpkenarlar();
			dpciz();
			dphacim();
			dpalan();
			Bekle();
			break;
		case 4:
			kyaricap();
			khacim();
			kalan();
			Bekle();
			break;
		case 5:
			System.out.println("Çıkış yaptınız. İyi günler!");
			break;
		default:
			System.err.println("\n\n\nSadece 1-5 arası seçim yapabilirsiniz.\n\n\n");
		}
	}while(sec!=5);
	*/
	}

}
