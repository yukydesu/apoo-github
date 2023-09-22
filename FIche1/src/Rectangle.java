class Rectangle {

    double longueur;
    double largeur;

    Rectangle(double nLongueur, double nLargeur) {
        longueur = nLongueur;
        largeur = nLargeur;
    }

    double calculerAire() {
        return longueur * largeur;
    }

    double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }
}
