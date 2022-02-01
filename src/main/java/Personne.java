public class Personne {
    String nom;
    Montre m;

    Personne(String nom) {
        this.nom = nom;
        this.m = null;
    }

   void porteMontre(Montre m) {
        if (this.m == null ) {
            this.m = m;
            System.out.println("La montre a été attribuée a: "+ this.nom);
        }
        else{
            System.out.println("Vous avez déja une montre");
        }
    }

   void enleveMontre(){
        if(this.m != null){
            this.m = null;
            System.out.println("La montre a bien été retirée à: "+ this.nom);
        }
        else{
            System.out.println("Vous n'avez aucune montre");
        }
    }

    void donneHeure(){
        if(this.m != null){
            System.out.println(this.m.heure + "h" + this.m.min + "min");
        }
        else {
            System.out.println("Désolé, vous n'avez pas de montre");
        }
    }

    void demandeHeure(Personne p){
        p.donneHeure();
    }

    void avance(){
        if(this.m.min==59){
            if(this.m.heure == 23){
                this.m.heure = 0;
            }
            else {
                this.m.heure = this.m.heure++;
            }
            this.m.min = 00;
            this.m.heure++;
        }
        else {
            this.m.min++;
        }
    }
}

