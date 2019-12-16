package BlackJack;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Banque banque = new Banque();
        JoueurHumain franck = new JoueurHumain(new StrategieAleatoire(),"franck");
        JoueurHumain pierre = new JoueurHumain(new StrategieAleatoire(),"pierre");
        Vector joueurHumainVector = new Vector();
        joueurHumainVector.add(franck);
        joueurHumainVector.add(pierre);
        Jeu jeu = new Jeu(banque,joueurHumainVector);
        jeu.DebutJeu();
        for (int i = 0; i < 3; i++) {
            jeu.playTour();
            System.out.println("Franck à :" + franck.getScore());
            System.out.println("Pierre à:"+ pierre.getScore());
            System.out.println("La banque à :"+ banque.getScore());
        }
    }


}
