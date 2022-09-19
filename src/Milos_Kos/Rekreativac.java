package Milos_Kos;

import java.util.ArrayList;

public class Rekreativac extends Planinar {
    private double tezinaOpreme; //u kg

    public Rekreativac(int id, String ime, String prezime, ArrayList<Planina> planine, double maxUspon, double tezinaOpreme) {
        super(id, ime, prezime, planine, maxUspon);
        this.tezinaOpreme = tezinaOpreme;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if ((getMaxUspon() - 50 * Math.round(tezinaOpreme)) <= p.getVisina()) {
            getPlanine().add(p);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double clanarina() {
        double popust = 2 * getPlanine().size();
        return 1000 - 1000 * popust / 100;
    }
}
