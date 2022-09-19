package Milos_Kos;

public class Planina {
    private String ime;
    private double visina;

    public Planina(String ime, double visina) {
        this.ime = ime;
        this.visina = visina;
    }

    public String getIme() {
        return ime;
    }

    public double getVisina() {
        return visina;
    }

    @Override
    public String toString() {
        return "Ime planine: " + ime + ", visina: " + visina + "  |  ";
    }
}
