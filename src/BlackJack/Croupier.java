package BlackJack;

import java.util.Vector;

public class Croupier {

    public Jeu myJeu;
    /**
   * 
   * @element-type BlackJack.Cartes
   */
  public Vector  myCartes;
  Cartes cartes=new Cartes();

  public Croupier(){

  }

  public int Distribuer2Cartes() {


      return cartes.getValeurTwice();
  }

  public int Distribuer1Carte() {

       return cartes.getValeur();
  }

  public void DistribuerGain() {
  }

  public void FindePartie() {
  }

  public void DebutMise() {
  }

  public void FindeMise() {
  }

  public void DebutdePartie() {
  }

}