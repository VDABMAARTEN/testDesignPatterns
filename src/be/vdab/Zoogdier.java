package be.vdab;

public class Zoogdier implements Observer {

    private String naam;

    Zoogdier(String naam){
        this.naam = naam;
    }

    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(naam + " kruipt in zijn hol.");
    }

    public String getNaam() {
        return naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }
}
