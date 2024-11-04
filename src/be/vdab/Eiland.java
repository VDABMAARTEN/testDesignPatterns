package be.vdab;
// SINGLETON WANT ER KAN MAAR 1 EILAND ZIJN
// OBSERVER VOOR HET GEDRAG BIJ UITBARSTING

import java.util.LinkedHashSet;
import java.util.Set;

enum Eiland {
    INSTANCE;

    //    ---OBSERVER---
    private final Set<Observer> observers = new LinkedHashSet<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }


    //    --- VULKAANUITBARSTING ---
    public void uitbarsting() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!\nDE VULKAAN BARST UIT\n");
        observers.forEach(Observer::reageerOpVulkaanuitbarsting);
    }

    //    --- GETTERS ---

    public Set<Observer> getObservers() {
        return observers;
    }


}


// IN OPLOSSING 1 ZAT ALLES IN DE SINGLETON, MAAR DE OPDRACHT VRAAGT FLEXIBILITEIT IN HET TYPE INWONERS DUS DE FACTORY
//WORDT IN MAIN GEPLAATST SAMEN MET EEN STRATEGY AANPAK
//ORIGINELE AANPAK BEVATTE CLASSES VOOR VOGEL EN ZOOGDIER, DIE STAAN IN IGNOREME EN MOGEN GENEGEERD WORDEN


/*    //    --- SIMPLE FACTORY MAAKT BEWONERS EN VOEGT ZE TOE AAN DE LIJST OBSERVERS ---
    void maakBewoner(String bewoner) {

        var typeInwoner = bewoner.substring(0,1).toLowerCase();
        switch (typeInwoner) {
            case "v" -> {
                var vogel = new Vogel(bewoner.substring(1));
                observers.add(vogel);
            }
            case "z" -> {
                var zoogdier = new Zoogdier(bewoner.substring(1));
                observers.add(zoogdier);
            }
            default -> System.out.println("error");
        }
    }*/