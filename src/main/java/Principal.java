
public class Principal {

    public static void main(String[] args){
        Montre m = new Montre(9,25);
        Montre n = new Montre(m);
        Personne p = new Personne("Hilary");
        Personne l = new Personne("Amos");

        p.attribuerMontre(m);
        l.attribuerMontre(n);
        l.demandeHeure(p);
        p.enleveMontre();



    }
}
