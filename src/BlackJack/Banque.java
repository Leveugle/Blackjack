package BlackJack;

public class Banque extends Joueurs {

    public Banque(){
        super(new StrategieBanque());
    }

}