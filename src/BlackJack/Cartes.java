package BlackJack;

public class Cartes {

  public Integer [] Valeur={1,2,3,4,5,6,7,8,9,10,10,10,10};

  public Integer figure;

    public Jeu myJeu;
    public Croupier myCroupier;
    public Cartes(){

    }

  public int getValeur() {
    int nbrRandom =(int)(Math.random()*Valeur.length);

    return Valeur[nbrRandom];
  }

  public int getValeurTwice(){
      int nbrRandom =(int)(Math.random()*Valeur.length);
      int nbrRandom2 =(int)(Math.random()*Valeur.length);

      return Valeur[nbrRandom]+Valeur[nbrRandom2];
  }

}