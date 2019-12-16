package BlackJack;

public class JoueurHumain extends Joueurs {

  public String nom;
  public JoueurHumain(Strategie strategie,String nom){
    super(strategie);
    this.nom=nom;
  }

}