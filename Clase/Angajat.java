package Clase;

public class Angajat {
    private String nume;
    private String prenume;
    private int varsta;
    private String job;
    private int salariu;

    public void setNume(String x)
    {nume=x;}

    public void setPrenume(String prenume)
    {this.prenume=prenume;}

    public void setVarsta(int x)
    {varsta=x;}

    public void setJob(String x)
    {job=x;}

    public void setSalariu(int x)
    {salariu=x;}

    public String getNume(){return nume;}
    public String getPrenume(){return prenume;}
    public int getVarsta(){return varsta;}
    public String getJob(){return job;}
    public int getSalariu(){return salariu;}

    @Override
    public String toString() {
        return "Angajat:" +
                "Nume: " + nume +
                "\nPrenume: " + prenume +
                "\nVarsta: " + varsta +
                "ani \nJob: " + job +
                "\nSalariu: " + salariu +" lei";
    }

    public Angajat(String nume, String prenume, int varsta, String job, int salariu) {
        this.nume = nume;
        this.prenume=prenume;
        this.varsta = varsta;
        this.job = job;
        this.salariu = salariu;
    }
}
