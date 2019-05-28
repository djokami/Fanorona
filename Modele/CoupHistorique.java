package Modele;

/*
Classe pour représenter les coups dans l'historique:
Rajoute le nombre de pions capturés, le joueur qui a joué le coup
*/

public class CoupHistorique extends Coup{
    private static final long serialVersionUID = 5945574586292838844L;

    private int nbPionsCaptures;
    private int joueur;
    private Direction precedenteDirection;
    private Coordonnees precedentPion;
    public CoupHistorique(Coup C,int pionsCaptures,int joueur,Direction precedenteDirection,Coordonnees precedentPion) {
        super(C);
        nbPionsCaptures = pionsCaptures;
        this.joueur = joueur;
        this.precedenteDirection = precedenteDirection;
        this.precedentPion = precedentPion;
    }

    public CoupHistorique(CoupHistorique C) { //Copie le coupHistorique
        super(C);
        nbPionsCaptures = C.pionsCaptures();
        this.joueur = C.joueur();
        this.precedenteDirection = new Direction(C.precedenteDirection);
        if (C.precedentPion!= null)
            this.precedentPion = new Coordonnees(C.precedentPion);
        else
            this.precedentPion = null;

    }


    public Coordonnees precedentPion() {
        return precedentPion;
    }

    public Direction precedenteDirection() {
        return precedenteDirection;
    }

    public int pionsCaptures() {
        return nbPionsCaptures;
    }

    public int joueur() {
        return joueur;
    }

    //Transforme coupHistorique en coup
    public Coup toCoup() {
        return new Coup(pion(),destination(),action());
    }

    public String toString() {
        return "Joueur:"+joueur+": "+pion()+"->"+destination();
    }

}