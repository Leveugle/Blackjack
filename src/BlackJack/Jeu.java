package BlackJack;

import java.util.Vector;

public class Jeu {

    public Vector<Joueurs> joueurs;
    public Croupier croupier;

    public Jeu(Banque banque, Vector<JoueurHumain> joueurs){
        this.joueurs=new Vector<>();
        this.joueurs.add(banque);
        this.joueurs.addAll(joueurs);
        this.croupier=new Croupier();

    }
    public void playTour(){
        for (Joueurs joueur : this.joueurs) {
            joueur.setScore(croupier.Distribuer2Cartes());
            joueur.play();
        }
    }

    public Vector  myCartes;
    public Croupier myCroupier;

    public Vector  myJoueurs;

    public void DebutJeu() {
        for(Joueurs joueur : this.joueurs){
            joueur.setJeu(this);
        }
    }

    public void TerminerJeu() {
        for(Joueurs joueur : this.joueurs){
            joueur.setJeu(null);
        }
    }

}