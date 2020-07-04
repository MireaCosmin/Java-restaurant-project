package service;

import Clase.Angajat;
import Clase.Evenimente;

import java.io.*;

public class MainService {
    private String filePath = "C:\\Cosmin e un Boss\\UNIBUC\\PAO\\Proiect_Partea_3\\src\\repository\\ReportData";

    public void writeDataToReport(Angajat angajat){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true))){
            bufferedWriter.append(angajat.getNume());
            bufferedWriter.append(",");
            bufferedWriter.append(angajat.getPrenume());
            bufferedWriter.append(",");
            bufferedWriter.append( String.valueOf(angajat.getVarsta()));
            bufferedWriter.append(",");
            bufferedWriter.append(angajat.getJob());
            bufferedWriter.append(",");
            bufferedWriter.append((char) angajat.getSalariu());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void initReportHeader() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))){
            bufferedWriter.append("Nume");
            bufferedWriter.append(",");
            bufferedWriter.append("Prenume");
            bufferedWriter.append(",");
            bufferedWriter.append("Varsta");
            bufferedWriter.append(",");
            bufferedWriter.append("Job");
            bufferedWriter.append(",");
            bufferedWriter.append("Salariu");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsv() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1] + " " + recordData[2] + " " + recordData[3] + " " + recordData[4]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /////////////////////////////////////////

    private String filePath2 = "C:\\Cosmin e un Boss\\UNIBUC\\PAO\\Proiect_Partea_3\\src\\repository\\data";

    public void writeDataToReport2(Evenimente evenimente){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2,true))){
            bufferedWriter.append(evenimente.getNume());
            bufferedWriter.append(",");
            bufferedWriter.append(evenimente.getData());
            bufferedWriter.append(",");
            bufferedWriter.append( evenimente.getOra());
            bufferedWriter.append(",");
            bufferedWriter.append((char) evenimente.getNrinvitati());
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void initReportHeader2() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2))){
            bufferedWriter.append("Nume");
            bufferedWriter.append(",");
            bufferedWriter.append("Data");
            bufferedWriter.append(",");
            bufferedWriter.append("Ora");
            bufferedWriter.append(",");
            bufferedWriter.append("Invitati");
            bufferedWriter.append("\n");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readDataFromCsv2() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath2))){
            String record;
            while((record = bufferedReader.readLine()) != null) {
                String [] recordData = record.split(",");
                System.out.println(recordData[0] + " " + recordData[1] + " " + recordData[2] + " " + recordData[3]);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}