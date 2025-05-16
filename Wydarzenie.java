public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        setNazwa(nazwa);
        setCena(cena);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        setNazwa(nazwa);
        setCena(cena);
        setData(data);
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        setNazwa(nazwa);
        setCena(cena);
        setData(data);
        setMiejsce(miejsce);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public boolean czySaWolneMiejsca() {
        return dostepneMiejsca < maxLiczbaMiejsc;
    }

    public void zarezerwujMiejsce() {
        if (czySaWolneMiejsca()) {
            dostepneMiejsca++;
        } else {
            System.out.println("Brak wolnych miejsc na wydarzenie: " + nazwa);
        }
    }

    public void anulujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
        }
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", miejsce='" + miejsce + '\'' +
                ", maxLiczbaMiejsc=" + maxLiczbaMiejsc +
                ", dostepneMiejsca=" + dostepneMiejsca +
                ", cena=" + cena +
                '}';
    }
}