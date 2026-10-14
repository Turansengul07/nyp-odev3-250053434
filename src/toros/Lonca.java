
package toros;

public class Lonca {

    private final String ad;
    private final int kurulusYili;
    private String duyuru;

    public Lonca(String ad, int kurulusYili, String duyuru) {
        // Alan doğrulamalarını burada yapacağız.
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        duyuruDegistir(duyuru);
    }

    public void duyuruDegistir(String yeniDuyuru) {
        // Duyuru doğrulamasını burada yazacağız.
        this.duyuru = yeniDuyuru;
    }

    public String getAd() {
        return ad;
    }

    public String bilgiMetni() {
        return ad + " (kuruluş " + kurulusYili
                + ") - Duyuru: " + duyuru;
    }
}

