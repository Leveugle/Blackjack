package BlackJack;

public class StrategieBanque implements Strategie {

    public StrategieBanque(){

    }
  public void play(Joueurs j){
    int seuil=15;
    if (j.getScore() <= seuil)
      j.demanderCarte(j.getJeu());
//    System.out.println("le score est:"+ j.Score);/**/
  }

}