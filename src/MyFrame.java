import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	private JPanel mainPanel;
    private JButton dikdortgenButton, paralelkenarButton, prizmaButton, kureButton, cikisButton;
    private JTextArea resultArea;
    private Dikdortgen d = new Dikdortgen();
    private Paralelkenar p = new Paralelkenar();
    private Kure k = new Kure();
    private DikdortgenlerPrizmasi dp = new DikdortgenlerPrizmasi();

    public MyFrame() {
        
        setTitle("Şekil Hesaplama Paneli");				//Panele bir başlık belirler.
        setSize(600, 600);								//Panelin genişlik ve yüksekliğini belirler.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        mainPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        add(mainPanel);

        dikdortgenButton = new JButton("Dikdörtgen Hesaplama");
        paralelkenarButton = new JButton("Paralelkenar Hesaplama");
        prizmaButton = new JButton("Dikdörtgenler Prizması Hesaplama");		//Burada butonlar ve sonuç paneli oluşturulur.
        kureButton = new JButton("Küre Hesaplama");
        cikisButton = new JButton("Çıkış");
        resultArea = new JTextArea(10, 40);									
        resultArea.setEditable(false);										//Sonuç paneline yazı yazılmasını engeller.
        JScrollPane scrollPane = new JScrollPane(resultArea);

        mainPanel.add(dikdortgenButton);
        mainPanel.add(paralelkenarButton);
        mainPanel.add(prizmaButton);
        mainPanel.add(kureButton);											//Butonlar panele eklenir.
        mainPanel.add(cikisButton);
        mainPanel.add(scrollPane);

        dikdortgenButton.addActionListener(e -> dikdortgenHesapla());
        paralelkenarButton.addActionListener(e -> paralelkenarHesapla());
        prizmaButton.addActionListener(e -> prizmaHesapla());				//Butonlara basıldığında ne olacağı belirlenir. 
        kureButton.addActionListener(e -> kureHesapla());	
        cikisButton.addActionListener(e -> System.exit(0));

        setVisible(true); 													// Pencere görünür yapılır.
    }

    private void dikdortgenHesapla() {
        try {
            String uzun = JOptionPane.showInputDialog(this, "Uzun Kenarı Giriniz:");
            String kisa = JOptionPane.showInputDialog(this, "Kısa Kenarı Giriniz:");
            float uzunKenar = Float.parseFloat(uzun);
            float kisaKenar = Float.parseFloat(kisa);
            d.setUzun(uzunKenar);
            d.setKisa(kisaKenar);
            resultArea.setText("Dikdörtgenin Alanı: " + d.alan() + "\nDikdörtgenin Çevresi: " + d.cevre() +
            								"\nGirdiğiniz verilere uygun şekil konsol ekranına çizilmiştir");
            d.dikdortgen();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hatalı Giriş!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void paralelkenarHesapla() {
        try {
            String yukseklik = JOptionPane.showInputDialog(this, "Yüksekliği Giriniz:");
            String genislik = JOptionPane.showInputDialog(this, "Genişliği Giriniz:");
            float y = Float.parseFloat(yukseklik);
            float g = Float.parseFloat(genislik);
            p.setYukseklik(y);
            p.setGenislik(g);
            resultArea.setText("Paralelkenarın Alanı: " + p.alan() + "\nParalelkenarın Çevresi: " + p.cevre() + 
            									"\nGirdiğiniz verilere uygun şekil konsol ekranına çizilmiştir");
            
            p.paralelkenar();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hatalı Giriş!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void prizmaHesapla() {
        try {
            String uzunluk = JOptionPane.showInputDialog(this, "Prizmanın Uzunluğunu Giriniz:");
            String genislik = JOptionPane.showInputDialog(this, "Prizmanın Genişliğini Giriniz:");
            String yukseklik = JOptionPane.showInputDialog(this, "Prizmanın Yüksekliğini Giriniz:");
            float u = Float.parseFloat(uzunluk);
            float g = Float.parseFloat(genislik);
            float y = Float.parseFloat(yukseklik);
            dp.setUzunluk(u);
            dp.setGenislik(g);
            dp.setYukseklik(y);
            resultArea.setText("Dikdörtgenler Prizmasının Yüzey Alanı: " + dp.DPYuzeyAlani() +
                    "\nDikdörtgenler Prizmasının Hacmi: " + dp.DPHacim() + 
                    "\nGirdiğiniz verilere uygun şekil konsol ekranına çizilmiştir");
            System.out.println(dp.prizma());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hatalı Giriş!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void kureHesapla() {
        try {
            String yaricap = JOptionPane.showInputDialog(this, "Kürenin Yarıçapını Giriniz:");
            float r = Float.parseFloat(yaricap);
            k.setYaricap(r);
            resultArea.setText("Kürenin Yüzey Alanı: " + k.kYuzeyAlani() +
                    "\nKürenin Hacmi: " + k.kHacim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hatalı Giriş!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}
