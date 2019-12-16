package BlackJack;

public class StrategieAleatoire implements Strategie {

  public StrategieAleatoire(){

  }

  public void play(Joueurs j) {
      j.demanderCarte(j.getJeu());
  }

}