package be.vdab;

public class Inwoner {
    private String naam;

    Inwoner(String naam){
        this.naam = naam;
    }

    @Override
    public void reageerOpVulkaanuitbarsting( String reactie) {
        System.out.println(naam + " " + reactie);
    }

    public String getNaam() {
        return naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }
}
