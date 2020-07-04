package Clase;

public class Masina {
    private String brand;
    private String model;
    private String combustibil;

    public Masina(String brand,String model, String combustibil)
    {
        this.brand=brand;
        this.model=model;
        this.combustibil=combustibil;
    }

    @Override
    public String toString() {
        return "Masina:" +
                "\nbrand: " + brand +
                " \nmodel: " + model + "\nconsum: " + combustibil;
    }
}
