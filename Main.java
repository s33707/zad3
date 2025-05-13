public class Main {
    public static void main(String[] args) {
        BibliotekaMuzyczna mojaBiblioteka = new BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");
        mojaBiblioteka.dodajUtwor("Led Zeppelin - Stairway to Heaven");
        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters");

        mojaBiblioteka.wyswietlWszystkieUtwory();

        mojaBiblioteka.utworzPlayliste("Ulubione");
        mojaBiblioteka.utworzPlayliste("Na imprezę");

        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody", "Ulubione");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb", "Ulubione");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black", "Na imprezę");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters", "Na imprezę");

        mojaBiblioteka.wyswietlWszystkiePlaylisty();

        mojaBiblioteka.wyswietlPlayliste("Ulubione");

        mojaBiblioteka.wyszukajUtwory("Queen");

        mojaBiblioteka.usunUtwor("AC/DC - Back in Black");

        mojaBiblioteka.wyswietlPlayliste("Na imprezę");

        System.out.println("Łączna liczba utworów w bibliotece: " + mojaBiblioteka.getLiczbaUtworow());

        System.out.println("Łączna liczba playlist: " + mojaBiblioteka.getLiczbaPlaylist());

    }
}
