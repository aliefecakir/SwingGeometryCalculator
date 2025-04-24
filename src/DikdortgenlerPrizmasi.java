
public class DikdortgenlerPrizmasi extends Sekil {
private float yukseklik;
private float genislik;
private float uzunluk;
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
public float getUzunluk() {
	return uzunluk;
}
public void setUzunluk(float uzunluk) {
	if(uzunluk<0) {
		System.err.println("\nUzunluk değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
		this.uzunluk = uzunluk*(-1.0f);
	}
	else {
		this.uzunluk = uzunluk;
	}
}

public float DPHacim() {
	return uzunluk*genislik*yukseklik;
}

public float DPYuzeyAlani() {
	return ((uzunluk*genislik*2)+(uzunluk*yukseklik*2)+(yukseklik*genislik*2));
}

public String prizma() {
    int genis = Math.round(genislik);
    int yuksek = Math.round(yukseklik);
    int derin = Math.round(uzunluk);
    
    System.out.println("\nUzunluk " + (float)derin + " olarak alındı.");
    System.out.println("Genişlik " + (float)genis + " olarak alındı.");
    System.out.println("Yükseklik " + (float)yuksek + " olarak alındı.");
	System.out.println("\nBelirtilen boyutlarda Dikdörtgenler Prizmanız: \n");
    
    int maxGenis = genis + derin - 1;
    int maxYuksek = yuksek + derin - 1;
    char[][] ch = new char[maxYuksek][maxGenis];
    char yildiz = '*';

    
    int basla = maxGenis - genis;
    for (int col = basla; col < basla + genis; col++) {
        ch[0][col] = yildiz;
    }

    
    int bitir = basla + genis - 2;
    basla--;
    for (int row = 1; row <= derin - 2; row++) {
        ch[row][basla] = yildiz;
        ch[row][bitir] = yildiz;
        basla--;
        bitir--;
    }

    
    for (int sutun = 0; sutun < genis; sutun++) {
        ch[derin - 1][sutun] = yildiz;
    }

   
    basla = 0;
    bitir = genis - 1;
    for (int satir = derin; satir < maxYuksek - 1; satir++) {
        ch[satir][basla] = yildiz;
        ch[satir][bitir] = yildiz;
    }

    
    int sutun = maxGenis - 1;
    for (int row = 1; row < yuksek; row++) {
        ch[row][sutun] = yildiz;
    }
    sutun--;
    for (int row = yuksek; row < maxYuksek; row++) {
        ch[row][sutun--] = yildiz;
    }

    
    for (int col = 0; col < genis; col++) {
        ch[maxYuksek - 1][col] = yildiz;
    }

    
    StringBuilder builder = new StringBuilder();
    for (int satir = 0; satir < maxYuksek; satir++) {
        for (int colIdx = 0; colIdx < maxGenis; colIdx++) {
            builder.append(ch[satir][colIdx] == 0 ? ' ' : ch[satir][colIdx]);
        }
        builder.append(System.lineSeparator());
    }

    return builder.toString();
}
}
