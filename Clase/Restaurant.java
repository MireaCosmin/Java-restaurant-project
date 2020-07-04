package Clase;

import Interfata.InterfataProiect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Restaurant implements InterfataProiect{
    private String oras;
    private String adresa;
    private int capacitate;
    private List<Angajat> angajati=new ArrayList<>();
    private List<Preparat> preparate = new ArrayList<>();
    private List<Comanda> comenzi = new ArrayList<>();
    private List<Masina> masini = new ArrayList<>();
    private List<Evenimente> evenimente = new ArrayList<>();

    public Restaurant(String oras,String adresa,int capacitate)
    {
        this.oras=oras;
        this.adresa=adresa;
        this.capacitate=capacitate;
    }
    public Restaurant(String oras,String adresa,int capacitate,List<Angajat> angajati, List<Preparat> preparate, List<Comanda> comenzi,List<Masina> masini,List<Evenimente> evenimente)
    {
        this.oras=oras;
        this.adresa=adresa;
        this.capacitate=capacitate;
        this.angajati=angajati;
        this.preparate=preparate;
        this.comenzi=comenzi;
        this.masini=masini;
        this.evenimente=evenimente;
    }

    public List<Angajat> getAngajati()
    {
        return angajati;
    }

    public List<Evenimente> getEvenimente()
    {
        return evenimente;
    }
///////////////////////
    public boolean addAng(Angajat angajat) {
        angajati.add(angajat);
        return true;
    }

    public boolean deleteAng(String nume) {
        angajati = angajati.stream()
                .filter(ang -> !ang.getNume().equals(nume))
                .collect(Collectors.toList());
        return true;
    }
//////////////////////////

        @Override
    public void listeazaAngajati()
    {
        for(Angajat i : angajati)
        {
            System.out.println(i);
        }
    }

    @Override
    public void listeazaMeniul()
    {
        for(Preparat i : preparate)
        {
            System.out.println(i);
        }
    }

    @Override
    public void listeazaMasini()
    {
        for(Masina i : masini)
        {
            System.out.println(i);
        }
    }

    @Override
    public void listeazaEvenimente()
    {
        for(Evenimente i : evenimente)
        {
            System.out.println(i);
        }
    }

    @Override
    public void adaugaAngajat(Angajat angajat) {
        this.angajati.add(angajat);
        System.out.println("Angajat adaugat cu succes!");
    }


    @Override
    public void stergeAngajat(int index) {
        this.angajati.remove(index);
        System.out.println("Angajat sters cu succes!");
    }

    @Override
    public void adaugaComanda(Comanda comanda) {
        this.comenzi.add(comanda);
        System.out.println("Comanda a fost inregistrata!\nSumar:");
        System.out.println(comanda);
    }

    @Override
    public void adaugaEveniment(Evenimente eveniment) {
        this.evenimente.add(eveniment);
        System.out.println("Eveniment adaugat cu succes!");
        System.out.println(eveniment);
    }

    @Override
    public String toString() {
        return "Va asteptam la noul nostru restaurant din " +
                oras +
                " de pe strada " + adresa + " cu o capacitate de " + capacitate + " locuri.";
    }
}
