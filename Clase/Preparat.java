package Clase;

public class Preparat {
    private String nume;
    private int pret;
    private int cantitate;


    public Preparat(String nume, int pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public void setnume(String x)
    {
        this.nume=x;
    }
    public String getnume()
    {
        return nume;
    }
    public void setpret(int x)
    {
        pret=x;
    }
    public int getpret()
    {
        return pret;
    }
    public void setCantitate(int x)
    {
        cantitate=x;
    }
    public int getCantitate()
    {
        return cantitate;
    }

    @Override
    public String toString() {
        return "Preparat: " + nume +
                ", pret: " + pret + "lei, gramaj: " + cantitate +  'g' ;
    }
}
