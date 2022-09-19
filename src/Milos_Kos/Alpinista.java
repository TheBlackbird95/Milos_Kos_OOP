package Milos_Kos;

import java.util.ArrayList;

public class Alpinista extends Planinar{
    private int godineIskustva;

    public Alpinista(int id, String ime, String prezime, ArrayList<Planina> planine, double maxUspon, int godineIskustva) {
        super(id, ime, prezime, planine, maxUspon);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (p.getVisina() >= getMaxUspon()){
            getPlanine().add(p);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double clanarina() {
        int brojac = 0;
        for (Planina planina : getPlanine()){
            if (planina.getVisina()>2000){
                brojac++;
            }
        }
//        double cena = 1500;
//        for (int i = 0; i < brojac; i++) {
//            cena = cena * 0.95;
//        }
        double popust = 5 * brojac;
        return 1500 - 1500 * popust / 100;
    }
}
