
package toros;

public class Karakter {

    private final String ad;
    private int seviye;
    private int can;
    private final Lonca lonca;
    private Silah silah;

    public Karakter(String ad, Lonca lonca) {
        // TODO: Ad uzunluğunu (3-15) doğrula.
        // TODO: Lonca null kontrolünü yap.

        this.ad = ad;
        this.lonca = lonca;
        this.seviye = 1;
        this.can = azamiCan();
        this.silah = null;
    }

    public final int azamiCan() {
        return 100 + seviye * 10;
    }

    public final boolean hayattaMi() {
        return can > 0;
    }

    protected void hayattaOldugunuDogrula() {
        if (!hayattaMi()) {
            throw new IllegalStateException(
                "Karakter hayatta değil!"
            );
        }
    }

    protected void kayitYaz(String olay) {
        System.out.println("[" + ad + "] " + olay);
    }

if (miktar <= 0) {
    throw new IllegalArgumentException("Hasar pozitif olmalı.");
}

can = Math.max(0, can - miktar);
  
    }

    public void iyiles(int miktar) {
        // TODO: Pozitif miktar ve hayatta olma kontrolü.
        // TODO: Can azamiCan() değerini geçmemeli.
    }

    public int getCan() {
        return can;
    }

    public int getSeviye() {
        return seviye;
    }

    public String getAd() {
        return ad;
    }

    public Lonca getLonca() {
        return lonca;
    }

