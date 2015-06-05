package com.realdolmen;

/**
 * Created by jeansmits on 4/06/15.
 */
public class Fraction {
    private int teller;
    private int deler;

    public Fraction(int teller, int deler) {
        this.teller = teller;
        this.deler = deler;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getDeler() {
        return deler;
    }

    public void setDeler(int deler) {this.deler = deler; }

    public int fraction(int a,int b){
        return 0;
    }

    public Fraction simplify(){
    int i = Utilities.greatestCommonFactor(teller,deler);
    teller = teller/i;
    deler = deler/i;
    return new Fraction(teller,deler);
    }

    public String toString(){
        return teller + "/" + deler;
    }

    public double changeToDouble (){
        double kommagetal = (double)teller/(double)deler;
        return kommagetal;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return this.teller * other.deler == other.teller * this.deler;
    }
}
