package Restaurante;

import Abstract.RestaurantAbstract;
import Clase.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurants extends RestaurantAbstract{
    @Override
    public Restaurant initializare()
    {
        //Angajati
        Angajat angajat1=new Angajat("Mirea"," Andrei", 16,"ajutor ospatar", 3000);
        Angajat angajat2=new Angajat("Carlos"," Gil", 15, "ospatar", 2500);
        List<Angajat> angajati=new ArrayList<>();
        angajati.add(angajat1);
        angajati.add(angajat2);


        //Preparate
        Preparat preparat1=new Preparat("Pizza",25,300);
        Preparat preparat2=new Preparat("Burger", 35, 500);
        Preparat preparat3=new Preparat("Supa de pui", 15, 200);
        Preparat preparat4=new Preparat("Cheese cake",15,150);
        List<Preparat> preparate=new ArrayList<>();
        preparate.add(preparat1);
        preparate.add(preparat2);
        preparate.add(preparat3);
        preparate.add(preparat4);

        //Comenzi
        Comanda comanda1=new Comanda(01,25, Arrays.asList(preparat1));
        Comanda comanda2=new Comanda(02,60, Arrays.asList(preparat1,preparat2));
        List<Comanda> comenzi=new ArrayList<>();
        comenzi.add(comanda1);
        comenzi.add(comanda2);

        //Masini
        Masina masina1=new Masina("Dacia", "Logan", "GPL");
        Masina masina2=new Masina("Toyota", "Prius", "Electric");
        List<Masina> masini=new ArrayList<>();
        masini.add(masina1);
        masini.add(masina2);

        //Evenimente
        Evenimente eveniment1=new Evenimente("Majorat","17/04/2020", "16:00",20);
        Evenimente eveniment2=new Evenimente("Botez","16/04/2020", "16:00",20);
        List<Evenimente> evenimente=new ArrayList<>();
        evenimente.add(eveniment1);
        evenimente.add(eveniment2);

        return new Restaurant(
                "Constanta",
                "Prel. Liliacului 14",
                100,
                angajati,preparate,comenzi,masini,evenimente);
    }
}
