
import java.util.List;
import java.util.Comparator;

public class Bonjour {

    // Record représentant un étudiant
    record Etudiant(String nom, double moyenne) {}

    public static void main(String[] args) {

        // 1. Déclaration des variables
        String nom = "Awa";
        int age = 20;

        // 2. Condition
        if (age >= 18) {
            System.out.println(nom + " est majeure");
        }

        // 3. Création d'une liste
        List<String> prenoms = List.of("Awa");

        // 4. Création d'une liste d'étudiants
        List<Etudiant> classe = List.of(
            new Etudiant("Awa", 15.5),
            new Etudiant("Koffi", 11.0),
            new Etudiant("Mariam", 17.25)
        );

        // 5. Filtrer, trier et récupérer les noms des admis
        List<String> admis = classe.stream()
            .filter(e -> e.moyenne() >= 12)
            .sorted(Comparator.comparingDouble(Etudiant::moyenne).reversed())
            .map(Etudiant::nom)
            .toList();

        // 6. Afficher les résultats
        System.out.println("\nListe des étudiants admis :");

        admis.forEach(System.out::println);
    }
}

