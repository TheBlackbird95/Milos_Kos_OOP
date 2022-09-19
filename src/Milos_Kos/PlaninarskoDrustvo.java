package Milos_Kos;

import java.util.ArrayList;
import java.util.Collections;

public class PlaninarskoDrustvo {
    private ArrayList<Planinar> planinari;

    public PlaninarskoDrustvo(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void izbaciPlaninara(int id){
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).getId() == id){
                planinari.remove(planinari.get(i));
            }
        }
    }

    public int najuspesnijiPlaninar(){
        int najId = -1;
        double najvisi = Double.MIN_VALUE;
        for (Planinar planinar : planinari){
            double zbir = 0;
            for (Planina planina : planinar.getPlanine()){
                zbir += planina.getVisina();
            }
            if (zbir > najvisi){
                najvisi = zbir;
                najId = planinar.getId();
            }
        }
        return najId;
    }

    public double prosecnaClanarinaPlaninara(){
        double sum = 0;
        for (Planinar planinar : planinari){
            sum += planinar.clanarina();
        }
        return sum/planinari.size();
    }

    public boolean popniSeNaPlaninu(Planina planina){
        int alpinista = 0;
        int penjac = 0;
        for (Planinar planinar : planinari){
            if (planinar instanceof Alpinista && ((Alpinista) planinar).getGodineIskustva() >= 5){
                alpinista ++;
            }
            if (planinar.uspesanUspon(planina)){
                penjac++;
            }
        }
        if (alpinista >= 1 && penjac >= 2*planinari.size()/3){
            return true;
        } else {
            return false;
        }
    }

    public void sortPlaninariPoClanarini(){
        Collections.sort(planinari);
    }
}
