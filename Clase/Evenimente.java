package Clase;

public class Evenimente {
    private String nume;
    private String data;
    private String ora;
    private int nrinvitati;

    public Evenimente(String nume, String data, String ora, int nrinvitati)
    {
        this.nume=nume;
        this.data=data;
        this.ora=ora;
        this.nrinvitati=nrinvitati;
    }
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public String getNume()
    {
        return nume;
    }
    public void setData(String data)
    {
        this.data=data;
    }
    public String getData()
    {
        return data;
    }
    public void setOra(String ora)
    {
        this.ora=ora;
    }
    public String getOra()
    {
        return ora;
    }
    public void setNrinvitati(int nrinvitati)
    {
        this.nrinvitati=nrinvitati;
    }
    public int getNrinvitati()
    {
        return nrinvitati;
    }

    @Override
    public String toString() {
        return "Eveniment:" +
                "data=" + data +
                ", nume=" + nume + ", ora=" + ora + ", invitati=" + nrinvitati;
    }
}




