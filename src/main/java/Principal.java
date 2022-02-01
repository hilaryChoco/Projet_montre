
public class Principal {

    public static void main(String[] args){
        Montre m = new Montre(9,25);
        Montre n = new Montre(m);
        Personne p = new Personne("Hilary");
        Personne l = new Personne("Amos");

        m.Affiche();
        n.Affiche();

        p.porteMontre(m);
        l.porteMontre(n);
        p.porteMontre(m);
        l.demandeHeure(p);
        p.enleveMontre();
        l.avance();
        l.m.Affiche();



    }
}
