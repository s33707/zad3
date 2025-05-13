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

    public ArrayList<String> getUtwory() {
        return utwory;
    }
    public void dodajUtwor(String nazwa) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }
    public void usunUtwor(String nazwa) {
        utwory.remove(utwor);
    }
    public void wyswietlPlayliste() {
        System.out.println("Playlista: " + nazwa);
        if (utwory.isEmpty()) {
            System.out.println(" pusta ");
        } else {
            for (String utwor : utwory) {
                System.out.println(" - " + utwor);
            }
        }
        System.out.println();
    }
}