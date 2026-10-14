
package toros;

public class Silah {

    private final String ad;
    private final int hasar;
    private int dayaniklilik;

    public Silah(String ad, int hasar) {
        // Ad ve hasar doğrulamalarını ekleyeceğiz.
        this.ad = ad;
        this.hasar = hasar;
        this.dayaniklilik = 100;
    }

    public int kullan() {
        if (dayaniklilik == 0) {
            throw new IllegalStateException("Silah kırık");
        }

        dayaniklilik = Math.max(0, dayaniklilik - 10);
        return hasar;
    }

    public void tamirEt() {
        dayaniklilik = 100;
    }

    public int getDayaniklilik() {
        return dayaniklilik;
    }

    public String bilgiMetni() {
        return ad + " (hasar " + hasar
                + ", dayanıklılık " + dayaniklilik + ")";
    }
}

