package Clase;


import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int numar;
    private float pret;
    private float reducere;
    private List<Preparat> preparatecomanda = new ArrayList<>();

    public Comanda(int numar, float pret) {
        this.numar=numar;
        this.pret= pret;
    }
    public Comanda(int numar, float pret,  List<Preparat> preparatecomanda) {
        this.numar=numar;
        this.pret = pret;
        this.preparatecomanda = preparatecomanda;
    }

    public void setNumar(int x)
    {
        numar=x;
    }

    public void setpret(float x)
    {
        pret=x;
    }

    /*public void setpret()
    {
        float pret=0;
        for(Preparat i : preparatecomanda)
            pret=pret+ i.getpret();
        this.pret=pret;
    }*/

    public void setreducere()
    {
        if(this.pret>100)
            this.reducere=0.1f*pret;
        else
            this.reducere=0;
    }

    public void setPreparatecomanda(List<Preparat> preparatecomanda)
    {
        this.preparatecomanda=preparatecomanda;
    }

    public int getNumar()
    {
        return numar;
    }

    public float getreducere()
    {
        return reducere;
    }
    public float getpret()
    {
        return pret-reducere;
    }

    public List<Preparat> getPreparatecomanda()
    {
        return preparatecomanda;
    }

    @Override
    public String toString() {
        return "Comanda:" +
                "\nNumar comanda: " + numar +
                "\nPret: " + pret +
                "\nReducere: " + reducere /*+
                "\nPreparate: " + preparatecomanda*/;
    }


}
