// Exercice 4.1
class Livre {

    // Attributs :
    String isbn;
    String titre;
    String auteur;
    double prix;
    int annee;
    int page;

    // Constructeur :
    Livre(char nIsbn, char nTitre, char nAuteur, double nPrix, int nAnnee, int nPage ) {

        isbn = nIsbn;
        titre = nTitre;
        auteur = nAuteur;
        prix = nPrix;
        annee = nAnnee;
        page = nPage;
    }
}
