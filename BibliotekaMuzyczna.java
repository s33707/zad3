import java.util.ArrayList;
public class BibliotekaMuzyczna {
    public static void main(String[] args){

        private ArrayList<String> utwory;
        private ArrayList<Playlista> playlisty;
    }
    public BibliotekaMuzyczna(){
        utwory = new ArrayList<String>();
        playlisty = new ArrayList<Playlista>();
    }
    public void dodajUtwor(String tytul) {
        utwory.add(tytul);
        System.out.println("dodano utwór: " + tytul);
    }

    public void usunUtwor(int indeks){
        if (indeks >= 0 && indeks < utwory.size()) {
            String usuniety = utwory.get(indeks);
            utwory.remove(indeks);
            System.out.println("usunięto utwór: " + tytul);

            for (Playlista playlista : playlisty) {
                playlista.usunUtwor(tytul);
            }
        } else {
            System.out.println("nie znaleziono utworu" + tytul);
        }
    }
    public void utworzPlayliste(String nazwa) {
        Playlista nowa = new Playlista(nazwa);
        playlisty.add(nowa);
        System.out.println("utworzono playliste: " + nazwa);
    }

    public void dodajUtworyDoPlaylisty(String tytulUtworu, String nazwaPlaylisty) {
        if (utwory.contains(tytulUtworu)) {
            dodajUtwor(tytulUtworu);
        }

        Playlista playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista == null) {
            utworzPlayliste(nazwaPlaylisty);
            playlista = znajdzPlayliste(nazwaPlaylisty);
        }
        playlista.dodajUtwor(tytulUtworu);
        System.out.println(" dodano " + tytulUtworu + "do playlisty" + nazwaPlaylisty);
    }
    private Playlista znajdzPlayliste(String nazwa) {
        for (Playlista playlista ; playlisty) {
            if (playlista.getNazwa().equals(nazwa)) {
                return playlista;
            }
        }
        return null;
    }

    public ArrayList<String> wyszukajUtwory(String fraza) {
        ArrayList<String> wyniki = new ArrayList<String>();

        for (String utwor ; utwory) {
            if (utwor.toLowerCase().contains(fraza.toLowerCase)) {
                wyniki.add(utwor);
            }
        }
    }
    public void wyswietlWszystkieUtwory() {
        System.out.println("wszystkie utwory" + utwory.size());

        if (utwory.isEmpty()) {
            System.out.println("biblioteka jest pusta");
            return;
        }
        for (int i = 0; i < utwory.size(); i++) {
            System.out.println((i +1) + utwory.get(i));
        }
    }
    public void wyswietlWszystkiePlaylisty() {
        System.out.println("wszystkie playlisty" + playlisty.size());

        if (playlisty.isEmpty()) {
            System.out.println("brak playlist");
            return;
        }

        for (int i = 0; i < playlisty.size(); i++) {
            Playlista playlista = playlisty.get(i);
            System.out.println((i + 1) + playlista.getNazwa() + playlista.getLiczbaUtworow() + "utworow");
        }
    }

    public void wyswietlPlayliste(String nazwa) {
        Playlista playlista = znajdzPlayliste(nazwa);

        if (playlista) != null) {
    System.out.println(zawartosc playlisty + nazwa);
    playlista.wyswietlUtworzy();
        }else{
    System.out.println("nie znaleziono playlisty " + nazwa);
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }

    class Playlista {
        private String nazwa;
        private ArrayList<String> utwory;

        public Playlista(String nazwa) {
            this.nazwa = nazwa;
            this.utwory = new ArrayList<String>();
        }
        public String getNazwa() {
            return nazwa;
        }
        public void dodajUtwor(String utwor) {
            if (utwory.contains(utwor)) {
                utwory.add(utwor);
            }
        }

        public void usunUtwor(String utwor) {
            utwory.remove(utwor);
        }

        public int getLiczbaUtworow() {
            return utwory.size();
        }

        public void wyswietlUtwory() {
            if (utwory.isEmpty()) {
                System.out.println("playlista jest pusta");
                return;
            }

            for (int i = 0; i <utwory.size(); i++) {
                System.out.println((i +1) + utwory.get(i));
            }
        }
    }
}