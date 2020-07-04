
import Clase.Angajat;
import Clase.Comanda;
import Clase.Preparat;
import Clase.Evenimente;
import Clase.Restaurant;
import Clase.Masina;
import Restaurante.Restaurants;
import service.MainService;

import javax.swing.*;
import java.awt.event.ActionListener;
import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath  = "C:\\Cosmin e un Boss\\UNIBUC\\PAO\\Proiect_Partea_3\\src\\repository\\data";

        Restaurant restaurant=new Restaurants().initializare();
        Scanner scanner=new Scanner(System.in);
        MainService mainService = new MainService();

        System.out.println("Alegeti o operatie:");
        System.out.println("1.Adauga angajat");
        System.out.println("2.Faceti o comanda noua.");
        System.out.println("3.Scriere in fisier.");
        System.out.println("4.Vezi meniul.");
        System.out.println("5.Vezi masinile.");
        System.out.println("6.Vezi evenimentele.");
        System.out.println("7.Adauga eveniment.");
        System.out.println("8.Generare raport angajati sortat crescator dupa nume.");
        System.out.println("9.Generare raport angajati sortat descrescator dupa nume.");
        System.out.println("10.Afisare raport angajati in consola.");
        System.out.println("11.Stergere angajat.");
        System.out.println("12.Generare raport evenimente.");
        System.out.println("13.Iesire");
        while (true)
        {
            System.out.println("Operatie: ");
            String optiune = scanner.next();
            switch(optiune)
            {
                case "1":
                    System.out.println("Numele angajatului:");
                    String nume=scanner.next();
                    System.out.println("Prenumele angajatului:");
                    String prenume=scanner.next();
                    System.out.println("Varsta angajatului:");
                    int varsta =scanner.nextInt();
                    System.out.println("Jobul angajatului:");
                    String job=scanner.next();
                    System.out.println("Salariul angajatului:");
                    int salariu=scanner.nextInt();
                    Angajat angajat=new Angajat(nume,prenume,varsta,job,salariu);
                    restaurant.adaugaAngajat(angajat);
                    break;

                case "2":
                    System.out.println("Numarul comenzii:");
                    int numar=scanner.nextInt();
                    System.out.println("Pretul comenzii:");
                    int pret=scanner.nextInt();
                    Comanda comanda=new Comanda(numar,pret);
                    restaurant.adaugaComanda(comanda);
                    break;
                case "3":
                    System.out.println("Angajatii:");
                    restaurant.listeazaAngajati();
                    break;
                case "4":
                    System.out.println("Meniul:");
                    restaurant.listeazaMeniul();
                    break;
                case "5":
                    System.out.println("Masinile:");
                    restaurant.listeazaMasini();
                    break;
                case "6":
                    /*System.out.println("Evenimentele:");
                    restaurant.listeazaEvenimente();*/
                    mainService.readDataFromCsv2();
                    break;
                case "7":
                    System.out.println("Numele evenimentului:");
                    String numeev = scanner.next();
                    System.out.println("Data evenimentului:");
                    String data = scanner.next();
                    System.out.println("Ora evenimentului:");
                    String ora = scanner.next();
                    System.out.println("Numarul invitatilor:");
                    int nr = scanner.nextInt();
                    Evenimente eveniment = new Evenimente(numeev, data, ora, nr);
                    restaurant.adaugaEveniment(eveniment);
                    break;
                case "8":
                    Collections.sort(restaurant.getAngajati(), Comparator.comparing(Angajat::getNume));
                    mainService.initReportHeader();
                    restaurant.getAngajati().forEach(angajt -> mainService.writeDataToReport(angajt));
                    System.out.println("Raport generat cu succes!");
                    break;
                case "9":
                    Collections.sort(restaurant.getAngajati(), Comparator.comparing(Angajat::getNume).reversed());
                    mainService.initReportHeader();
                    restaurant.getAngajati().forEach(angajt -> mainService.writeDataToReport(angajt));
                    System.out.println("Raport generat cu succes!");
                    break;
                case "10":
                    mainService.readDataFromCsv();
                    break;
                case "11":
                    System.out.println("Introduceti indexul angajatului ce va fi sters: ");
                    String index = scanner.next();
                    restaurant.stergeAngajat(Integer.valueOf(index));
                    break;
                case "12":
                    mainService.initReportHeader2();
                    restaurant.getEvenimente().forEach(event -> mainService.writeDataToReport2(event));
                    System.out.println("Raport generat cu succes!");
                    break;
                case "13":
                    System.out.println("O zi buna!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Operatie inexistenta.");

            }
        }

    }
}
