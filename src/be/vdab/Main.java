package be.vdab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        // Het is de bedoeling dat er later nog soorten inwoners kunnen toegevoegd worden
        // Dit lees ik als aanpassen aan client side, waardoor we een strategy gebruiken:
        // simple factory na inlezen file bepaalt welk gedrag gesteld wordt door welk type, kan aangepast worden door client

        try {
//            inlezen file
            var stream = Files.lines(Path.of("src/be/vdab/Bewoners.txt"));
//            OBV eerste karakter bepalen welk type inwoner het is: SIMPLE FACTORY maar dan niet in een aparte class
            stream.forEach(bewoner -> {
                var typeInwoner = bewoner.substring(0, 1);
                switch (typeInwoner) {
                    case "V" -> {
                        var vogel = new Inwoner(bewoner.substring(1));
                        vogel.setReactie("gaat hoger vliegen");
                        Eiland.INSTANCE.addObserver(vogel);
                    }
                    case "Z" -> {
                        var zoogdier = new Inwoner(bewoner.substring(1));
                        zoogdier.setReactie(" verstopt zich in zijn hol");
                        Eiland.INSTANCE.addObserver(zoogdier);
                    }
                    default -> System.out.println("--- ERROR: " + bewoner + " type is verkeerd ---");
                }
            });
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

//        vulkaan barst uit
        Eiland.INSTANCE.uitbarsting();
    }
}
