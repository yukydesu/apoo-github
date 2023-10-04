public class CompteEnBanque {

    private Personne titulaire;
    private Date dateValideCarteIdd;
    private String numeroCompte;
    private Date getDateOuverture;
    private double solde;

    CompteEnBanque(Personne nTitulaire, Date nDateValideCarteIdd, String nNumeroCompte,
                   Date nDateOuverture, double nSolde) {
        titulaire = nTitulaire;
        dateValideCarteIdd = nDateValideCarteIdd;
        numeroCompte = nNumeroCompte;
        getDateOuverture = nDateOuverture;
        solde = nSolde;}
    public Personne getTitulaire() {return titulaire;}
    public Date getDateValideCarteIdd() {return dateValideCarteIdd;}
    public String getNumeroCompte() {return numeroCompte;}
    public Date getGetDateOuverture() {return getDateOuverture;}
    public double getSolde() {return solde;}
    public void setDateValideCarteIddr(int nAnnee, int nMois, int nJour) {
        dateValideCarteIdd = new Date(nAnnee, nMois, nJour);}
    public void retrait(double nRetrait) {
        if((nRetrait >= 0) && (nRetrait < solde))
            solde = solde - nRetrait;
        else{System.out.println("Retrait trop élevé");}}
    public void depot(double nDepot) {
        if(nDepot >= 0)
            solde = solde + nDepot;
        else{System.out.println("Dépot négatif");}}
    public void virement(double nVirement, Personne nCompteDestinataire) {
        if((nVirement >= 0 ) && (nVirement <= solde)) {
            CompteEnBanque

        }
    }
    }
