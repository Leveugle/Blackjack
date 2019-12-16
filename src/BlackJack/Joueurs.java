package BlackJack;

import java.util.Vector;


public class Joueurs {

  public Integer Gain;
  public Integer Score;
  private Strategie strategie;


  public Joueurs(Strategie strategie){
        this.strategie=strategie;
        this.Gain=50;
        this.Score=0;

    }

    /**
   * 
   * @element-type BlackJack.Strategie
   */


    public void play(){
      strategie.play(this);
    }

  public void Miser(int gain) {
        this.Gain+=gain;
  }

  public void VisualiserCartes() {
  }
  public void demanderCarte(Jeu jeu){
        jeu.croupier.Distribuer1Carte();

  }
  public void secoucher(){

  }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }
}