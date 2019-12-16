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
       joueur.Score = croupier.Distribuer2Cartes();
       joueur.play();
   }
 }
    /**
   * 
   * @element-type BlackJack.Cartes
   */
  public Vector  myCartes;
    public Croupier myCroupier;
    /**
   * 
   * @element-type BlackJack.Joueurs
   */
  public Vector  myJoueurs;

  public void DebutJeu(Jeu jeu) {
      for(Joueurs joueur : this.joueurs){
          jeu.joueurs=this.joueurs;
      }
  }

  public void TerminerJeu() {
  }

}