package Milos_Kos;

import java.util.ArrayList;

public abstract class Planinar implements Comparable<Planinar>{
    private int id;
    private String ime, prezime;
    private ArrayList<Planina> planine;
    private double maxUspon;

    public Planinar(int id, String ime, String prezime, ArrayList<Planina> planine, double maxUspon) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.planine = planine;
        this.maxUspon = maxUspon;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Planina> getPlanine() {
        return planine;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }
    public abstract boolean uspesanUspon(Planina p);
    public abstract double clanarina();

    @Override
    public int compareTo(Planinar o) {
        return Double.compare(o.clanarina(),this.clanarina());
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "ID planinara: " + id + ", ime='" + ime + ", prezime: " + prezime + ", planine: " + planine + ", maxUspon=" + maxUspon;
    }
}
