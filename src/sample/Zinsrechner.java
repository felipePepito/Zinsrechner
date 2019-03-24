package sample;

public class Zinsrechner {

    public double berechneZinsen(double zinssatz, double anlagebetrag, int dauer) {
        double basis = zinssatz * 0.01 + 1;
        System.out.println(basis);
        double auszahlung = anlagebetrag * Math.pow(basis, dauer);
        System.out.println(auszahlung);
        return auszahlung - anlagebetrag;
    }

    public double rundeBetrag(double betrag) {
        return Math.round(betrag * 100.0) / 100.0;
    }
}
