class BibliotekaMuzyczna {
        private String nazwaBiblioteki;
        private String wlasciciel;
        private ArrayList<String> utwory;
        private ArrayList<Playlista> playlisty;
    
    public BibliotekaMuzyczna(String nazwaBiblioteki, String wlasciciel) {
        this.nazwaBibilioteki = nazwaBiblioteki;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }
    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
        utwory.add(tytul);
        System.out.println("dodano utwór: " + utwor);
    } else {
            System.out.println("utwór " + utwor + "juz istnieje w bibliotece ");
        }
}

    public void usunUtwor(String utwor){
        if (utwory.remove(utwor)) {
            System.ou.println("Usuniety utwór: " + utwor " z biblioteki.");
            for (Playllista playlista : playlisty) {
                playlista.usunUtwor(utwor);
            } else {
                System.out.println("Nie znaleziono utworu " + tytul);
        }
    }

      public void wyswietlUtwory() {
        System.out.println("wszystkie utwory" + utwory.size());
        if (utwory.isEmpty()) {
            System.out.println("biblioteka jest pusta");
        } else {
        for (int i = 0; i < utwory.size(); i++) {
            System.out.println((i +1) + utwory.get(i));
        }
    }
          System.out.println();
      }

        public void wyszukajUtwory(String fraza) {
            System.out.println("Utwory zawierające frazę " + fraza + " :"
            boolean znaleziono = false;
            for(String utwor ; utwory) {
                if (utwor.toLowerCase().contains(fraza.toLowerCase)) {
                    System.out.println(" - " + utwor);
                    znaleziono = true;
            }
        }
            if (!znaleziono){
                System.out.println(" Nie znaleziono utworów z tą frazą");
            }
            System.out.println():
        }
    
    public void utworzPlayliste(String nazwa) {
        if (znajdzPlayliste(nazwa) == null) {
            playlisty.add(new Playlista(nazwa));
            System.out.println("Playlista o nazwie " + nazwa "już istnieje");
        }
    }

        private Playlista znajdzPlayliste(String nazwa) {
        for (Playlista playlista ; playlisty) {
            if (playlista.getNazwa().equals(nazwa)) {
                return playlista;
            }
        }
        return null;
    }
    
    public void dodajUtworyDoPlaylisty(String tytulUtworu, String nazwaPlaylisty) {
        Playlisty playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista != null && utwory.contains(utwor)) {
            playlista.dodajUtwor(utwor);
            System.out.println("Dodano utwór "+ utwor + "do playlisty " + nazwaPlaylisty);
        } else if (playlista == null) {
            System.out.println("Nie znaleziono playlisty o nazwie " + nazwaPlaylisty + " w bibliotece";
         } else {
            System.out.println("Nie znaleziono utworu " + utwor + " w bibliotece");
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("wszystkie playlisty");
        if (playlisty.isEmpty()) {
            System.out.println("brak playlist");
        } else {
            for (Playlista playlista : playlisty) {
                System.out.println(" - " + playlista.getNazwa());
            }
        }
        System.out.println();
    }

    public void wyswietlPlayliste(String nazwaPlaylisty) {
        Playlista playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista != null) {
            playlista.wyswietlPlayliste();
        } else {
            System.out.println("nie znaleziono playlisty " + nazwaPlaylisty);
        }
    }
    System.out.println();
}

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
