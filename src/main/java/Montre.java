import java.util.prefs.Preferences;

public class Montre {

    int heure, minute;
    //Personne p;

    Montre(int h, int m) {
        this.heure = h;
        this.minute = m;
    }

    Montre(Montre m){
        this.heure = m.heure;
        this.minute = m.minute;
    }

    void avance(){
        if(this.minute==59){
            if(this.heure == 23){
                this.heure = 0;
            }
            else {
                this.heure = this.heure++;
            }
            this.minute = 00;
            this.heure++;
        }
        else {
            this.minute++;
        }
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

