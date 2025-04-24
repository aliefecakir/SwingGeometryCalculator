
public class Kure extends Sekil {
private float yaricap;

public float getYaricap() {
	return yaricap;
}

public void setYaricap(float yaricap) {
	if(yaricap<0) {
		System.err.println("\nYarıçap değerini negatif girdiniz. Girilen değer pozitife çeviriliyor...\n");
		this.yaricap = yaricap*(-1.0f);
	}
	else {
		this.yaricap = yaricap;
	}
}

public float kYuzeyAlani() {
	float pi = 3.14f;
	return (4.0f*pi*yaricap*yaricap);
}
public float kHacim() {
	float pi = 3.14f;
	return (4.0f/3.0f)*(pi*yaricap*yaricap*yaricap);
}
}
