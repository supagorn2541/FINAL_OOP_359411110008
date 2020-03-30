package FINAL;

import java.util.List;
import java.util.Scanner;

public class PatientManagement {

    public static void main(String[] args) {

        PatientDAOlmpl dao = PatientDAOlmpl.getInstance();

        //displayALLpatient(dao);
       // addNewPatient(dao);
       // findPatient(dao);
        UpdatePatientByID(dao);
    }

    private static void UpdatePatientByID(PatientDAOlmpl dao) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Patient ID");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT =dao.findPAT(id);
        System.out.print(PAT.toString());
        System.out.print("Enter new id result for Patient ID"+PAT.getP_id());

    }

    private static void findPatient(PatientDAOlmpl dao) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Patient ID");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT =dao.findPAT(id);
        System.out.print(PAT.toString());
    }

    private static void addNewPatient(PatientDAOlmpl dao) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Patient ID.");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Patient Name.");
        String p_name=sc.nextLine();
        System.out.print("Enter Patient gender.");
        String p_gender=sc.nextLine();
        System.out.print("Enter Patient age.");
        int p_age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Patient address");
        String p_address=sc.nextLine();
        System.out.print("Enter Patient blood result");
        String p_blood_result=sc.nextLine();

        dao.addPAT(new Patient(id,p_name,p_gender,p_age,p_address,p_blood_result));
    }

    private static void displayALLpatient(PatientDAOlmpl dao) {
        List<Patient>PAT=dao.getAllPAT();
        for (Patient p:PAT){
            System.out.println(p.toString());
        }
    }
}
