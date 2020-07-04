package Interfata;

import Clase.Angajat;
import Clase.Comanda;
import Clase.Evenimente;

import java.util.List;


public interface InterfataProiect {
    void adaugaAngajat(Angajat angajat);
    void stergeAngajat(int index);
    void adaugaComanda(Comanda comanda);
    void listeazaAngajati();
    void listeazaMeniul();
    void listeazaMasini();
    void listeazaEvenimente();
    void adaugaEveniment(Evenimente eveniment);

}
