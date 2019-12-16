package BlackJack;

public class StrategieBanque implements Strategie {

    Jeu jeu1;
    public StrategieBanque(Jeu jeu){
        this.jeu1=jeu;

    }
  public void play(Joueurs j){
    int seuil=15;
    if (j.Score <= seuil)
      j.demanderCarte(jeu1);
    System.out.println("le score est:"+ j.Score);
  }

}