package Milos_Kos;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Planina prva = new Planina("Visuljka", 2900);
        Planina druga = new Planina("Visuljka", 1900);
        Planina treca = new Planina("Visuljka", 1600);
        Planina cetvrta = new Planina("Visuljka", 900);
        Planina peta = new Planina("Visuljka", 3900);
        Planina sesta = new Planina("Visuljka", 2500);
        Planina sedma = new Planina("Visuljka", 2000);
        Planina osma = new Planina("Visuljka", 3200);
        Planina deveta = new Planina("Visuljka", 3800);

        ArrayList<Planina> planine1 = new ArrayList<>(List.of(prva,druga,treca,cetvrta));
        ArrayList<Planina> planine2 = new ArrayList<>(List.of(peta,sesta,sedma,osma));
        ArrayList<Planina> planine3 = new ArrayList<>(List.of(prva,peta,deveta));

        Alpinista prvi = new Alpinista(1,"pera","peric", planine1, 2400, 6);
        Alpinista drugi = new Alpinista(2,"mare","maric",planine2,2000,3);
        Alpinista treci = new Alpinista(3,"zare","zaric",planine3,3500,7);

        Rekreativac r1 = new Rekreativac(99,"jova","jovic", planine1,1900,2.6);
        Rekreativac r2 = new Rekreativac(98,"joca","jocic", planine2,1000,4.3);
        Rekreativac r3 = new Rekreativac(97,"jova","jovic", planine1,2500,5);
        Rekreativac r4 = new Rekreativac(96,"jova","jovic", planine3,2300,5);

        System.out.println(r1.uspesanUspon(druga));
        System.out.println(r2.uspesanUspon(druga));
        System.out.println(r3.uspesanUspon(druga));
        System.out.println(r4.uspesanUspon(druga));

        ArrayList<Planinar> grupaMoze = new ArrayList<>(List.of(prvi,r1,r2,r3));
        ArrayList<Planinar> grupaNeceDaMoze = new ArrayList<>(List.of(drugi,treci,r4,r3));

        PlaninarskoDrustvo drustvoMoze = new PlaninarskoDrustvo(grupaMoze);
        System.out.println(drustvoMoze.popniSeNaPlaninu(druga));

        PlaninarskoDrustvo neceDaMoze = new PlaninarskoDrustvo(grupaNeceDaMoze);
        System.out.println(neceDaMoze.popniSeNaPlaninu(druga));

        ArrayList<Planinar> celoDrustvo = new ArrayList<>(List.of(prvi,drugi,treci,r1,r2,r3,r4));
        PlaninarskoDrustvo celoDrustvoTuJe = new PlaninarskoDrustvo(celoDrustvo);

        System.out.println(celoDrustvoTuJe.najuspesnijiPlaninar());
        System.out.println(celoDrustvoTuJe.prosecnaClanarinaPlaninara());

//        for (Planinar planinar : celoDrustvo){
//            System.out.println(planinar.getId() + " " + planinar.clanarina());
//        }

        System.out.println(celoDrustvoTuJe.getPlaninari());
        celoDrustvoTuJe.sortPlaninariPoClanarini();
        System.out.println(celoDrustvoTuJe.getPlaninari());
        celoDrustvoTuJe.izbaciPlaninara(97);
        System.out.println(celoDrustvoTuJe.getPlaninari());
    }
}
