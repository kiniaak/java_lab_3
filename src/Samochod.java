public class Samochod {
protected String marka;
private String kolor;
Integer przebieg;

    public Samochod(String marka,String kolor,Integer przebieg) {
        this.marka = marka;
        this.kolor=kolor;
        this.przebieg=przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Integer getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(Integer przebieg) {
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", przebieg=" + przebieg +
                '}';
    }
}
