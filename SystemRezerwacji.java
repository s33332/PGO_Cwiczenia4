import java.util.ArrayList;

public class SystemRezerwacji {

    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(String nazwa, double cena) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena);
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena, String data) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena, data);
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(String imie, String nazwisko, String email) {
        Klient klient = new Klient(imie, nazwisko, email);
        klienci.add(klient);
    }

    public void dodajKlienta(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listarezerwacji) {
        Klient klient = new Klient(imie, nazwisko, email, listarezerwacji);
        klienci.add(klient);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dokonajRezerwacji(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public void wyswietlKlientow() {
        for (Klient k : klienci) {
            System.out.println(k.getImie() + " " + k.getNazwisko());
        }
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }
}