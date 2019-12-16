package BlackJack;

import java.util.Vector;

public class Main {

    public Banque banque = new Banque();
    public Vector joueurHumainVector = new Vector();
    public Jeu jeu = new Jeu(banque,joueurHumainVector);
    public JoueurHumain franck = new JoueurHumain(new StrategieAleatoire(jeu),"franck");
    public JoueurHumain pierre = new JoueurHumain(new StrategieAleatoire(jeu),"pierre");




    public void main(){
        joueurHumainVector.add(franck);
        joueurHumainVector.add(pierre);
        jeu.DebutJeu(jeu);
        jeu.playTour();
    }


}
