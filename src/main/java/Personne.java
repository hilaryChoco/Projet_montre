public class Personne {
    String nom;
    Montre m;

    Personne(String nom) {
        this.nom = nom;
        this.m = null;
    }

   void attribuerMontre(Montre m) {
        if (this.m == null ) {
            this.m = m;
            System.out.println("La montre a bien été attribuée à: "+ this.nom);
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("Désolé, nous ne pouvons pas vous donner une autre montre car vous en avez déja une");
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
    }

   void enleveMontre(){
        if(this.m != null){
            this.m = null;
            System.out.println("La montre a bien été retirée à: "+ this.nom);
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("Impossible de vous retirer une montre car vous n'en avez aucune");
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
    }

   public String donneHeure(){
        if(this.m != null){
            return this.m.heure + "h" + this.m.minute + "min";
        }
        else {
            return "Désolé, vous n'avez pas de montre pour lire l'heure";
        }
    }

    void demandeHeure(Personne p){
        p.donneHeure();
    }

}

