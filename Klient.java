import java.util.ArrayList;

public class Klient {

    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient(String imie, String nazwisko, String email) {
        setImie(imie);
        setNazwisko(nazwisko);
        setEmail(email);
    }

    public Klient(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
        setImie(imie);
        setNazwisko(nazwisko);
        setEmail(email);
        setListaRezerwacji(listaRezerwacji);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dokonajRezerwacji(Wydarzenie wydarzenie) {
        if (wydarzenie.czySaWolneMiejsca()) {
            wydarzenie.zarezerwujMiejsce();
            listaRezerwacji.add(wydarzenie);
            System.out.println("Zarezerwowano wydarzenie: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Brak miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }

    public void wyswietlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            System.out.println("Rezerwacje klienta " + imie + " " + nazwisko + ":");
            for (Wydarzenie w : listaRezerwacji) {
                System.out.println("- " + w.getNazwa() + " (" + w.getData() + ")");
            }
        }
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        if (listaRezerwacji.contains(wydarzenie)) {
            listaRezerwacji.remove(wydarzenie);
            wydarzenie.anulujMiejsce();
            System.out.println("Anulowano rezerwację: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Rezerwacja nie istnieje.");
        }
    }

}