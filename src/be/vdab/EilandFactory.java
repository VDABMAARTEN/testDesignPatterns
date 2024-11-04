package be.vdab;
// SINGLETON MET SIMPLE FACTORY EN OBSERVER ERIN
// SINGLETON WANT ER KAN MAAR 1 EILAND ZIJN
// SIMPLE FACTORY VOOR HET AANMAKEN VAN BEWONERS
// OBSERVER VOOR HET GEDRAG BIJ UITBARSTING

import java.util.LinkedHashSet;
import java.util.Set;

enum Eiland {
    INSTANCE;

    //    list voor observers
    private final Set<Observer> observers = new LinkedHashSet<>();


    //    --- SIMPLE FACTORY MAAKT BEWONERS EN VOEGT ZE TOE AAN DE LIJST OBSERVERS ---
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
    }

    //    --- VULKAANUITBARSTING ---
    public void uitbarsting() {
        observers.forEach(Observer::reageerOpVulkaanuitbarsting);
    }

    //    --- GETTERS ---

    public Set<Observer> getObservers() {
        return observers;
    }
}