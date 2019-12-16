package BlackJack;

public class StrategieAleatoire implements Strategie {

  Jeu jeu1;
  public StrategieAleatoire(Jeu jeu){
    this.jeu1=jeu;

  }

  public void play(Joueurs j) {
      j.demanderCarte(jeu1);
  }

}