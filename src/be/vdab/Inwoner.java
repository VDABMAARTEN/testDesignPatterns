package be.vdab;

public class Inwoner implements Observer {
    private String naam;
    private String reactie;

    public void setReactie(String reactie) {
        this.reactie = reactie;
    }

    Inwoner(String naam){
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(naam + " " + reactie);
    }
}
