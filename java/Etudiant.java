public class Etudiant {
    // Attributs

    String nom;
    int age;
    static String universite = "ESATIC";
    double moyenne;

    // constructeur par defaut

    public Etudiant(){}

    


    // Etudiant awa = new Etudiant();
    
    // awa.nom = "Awa";
    // awa.age = 20;
    // awa.moyenne = 15.5;

    // awa.afficherProfil();

    //  Avec Constructeur

    public Etudiant(String nom, int age, double moyenne){
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    // Comportement

    void afficherProfil(){
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Moyenne : " + moyenne);
    }

    

    public static void main(String[] args) {

    System.out.println(Etudiant.universite);
    Etudiant awa = new Etudiant("Awa", 20, 15.5);
    awa.afficherProfil();

    }
}
    

