package be.vdab;

public class Vogel implements Observer{

    private String naam;

    Vogel(String naam){
        this.naam = naam;
    }

    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(naam + " gaat hoger vliegen.");
    }

    public String getNaam() {
        return naam;
    }

    private void setVoornaam(String naam) {
        this.naam = naam;
    }
}
