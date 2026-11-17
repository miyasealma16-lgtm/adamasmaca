package oyun;


import java.util.Random;

public class deneme1 {
    public static void main(String[] args) {
        
        String[] kelimeler = {"algoritma", "bilgisayar", "muhendislik", "yazilim", "degisken"};
        
        Random random = new Random(); 
        
        String secilenKelime = kelimeler[random.nextInt(kelimeler.length)];
        
        System.out.println("Seçilen Kelime (Test amaçlı): " + secilenKelime);
        
    }
}

