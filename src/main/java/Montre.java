import java.util.prefs.Preferences;

public class Montre {

    int heure, min;
    //Personne p;

    Montre(int h, int m) {
        this.heure = h;
        this.min = m;
    }

    Montre(Montre m){
        this.heure = m.heure;
        this.min = m.min;
    }

    public void Affiche(){
        System.out.println(this.heure + "h" + this.min + "min");
    }
}

