import java.util.Scanner;

class Patient {
    int pId;
    String pName;
    int pAge;
    String pDisease;
    String dName;  
}

class Doctor {
    int dId;
    String dName;
    String pName;
}

class PatientDoctorApp {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of Patients: ");
        int p = s.nextInt();
        System.out.println("Number of Doctors: ");
        int d = s.nextInt();

        Patient [] pat = new Patient[p];
        Doctor [] doc = new Doctor[d];

        for(int i = 0; i <= pat.length - 1; i++) {
            pat[i] = new Patient();
        }

        for(int i = 0; i <= doc.length - 1; i++) {
            doc[i] = new Doctor();
        }

        for(int i = 0; i <= pat.length - 1; i++) {
            System.out.println("Enter Patient Id: ");
            pat[i].pId = s.nextInt();
            System.out.println("Enter Patient Name: ");
            pat[i].pName = s.next();
            System.out.println("Enter Patient Age: ");
            pat[i].pAge = s.nextInt();
            System.out.println("Enter Patient Disease: ");
            pat[i].pDisease = s.next();
            System.out.println("Enter Patient's Doctor Name: ");
            pat[i].dName = s.next();
        }

        for(int i = 0; i <= doc.length - 1; i++) {
            System.out.println("Enter Doctor Id: ");
            doc[i].dId = s.nextInt();
            System.out.println("Enter Doctor Name: ");
            doc[i].dName = s.next();
            System.out.println("Enter Doctor's Patient Name: ");
            doc[i].pName = s.next();
        }

        for(int i = 0; i <= pat.length - 1; i++) {
            System.out.println("ID: "+pat[i].pId+" Name: "+pat[i].pName+" Age: "+pat[i].pAge+" Disease: "+pat[i].pDisease+" Doctor Name: "+pat[i].dName);
        }

           for(int i = 0; i <= pat.length - 1; i++) {
            System.out.println("ID: "+doc[i].dId+" Name: "+doc[i].dName+" Patiebnt Name: "+doc[i].pName);
        }
    }
}
