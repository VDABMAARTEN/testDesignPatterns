package be.vdab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        final Set<Observer> observers = new LinkedHashSet<>();

        //         while SCANNER HASNEXT oplossing zodat ie geen lijnen probeert te lezen die er niet zijn?
//        leest bestand in
        try {
            var stream = Files.lines(Path.of("src/be/vdab/Bewoners.txt"));
            stream.forEach(bewoner -> Eiland.INSTANCE.maakBewoner(bewoner));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }








//        vulkaan barst uit
        Eiland.INSTANCE.uitbarsting();

    }
}
