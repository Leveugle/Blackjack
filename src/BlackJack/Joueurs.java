package BlackJack;

import java.util.Vector;


public class Joueurs {

  private Integer Gain;
  private Integer Score;
  private Strategie strategie;
  private Jeu jeu;


  public Joueurs(Strategie strategie){
        this.strategie=strategie;
        this.Gain=50;
        this.Score=0;

    }


    public void play(){
      strategie.play(this);
    }

  public void Miser(int gain) {
        this.Gain+=gain;
  }

  public void VisualiserCartes() {
  }
  public void demanderCarte(Jeu jeu){
        Score+=jeu.croupier.Distribuer1Carte();

  }
  public void secoucher(){

  }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }
}