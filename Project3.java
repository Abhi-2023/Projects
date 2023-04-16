import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
interface Doc {
    public void Entry();
    public void docList();
}
interface Pat{
    public void Entry();
    public void patList();
}
interface Fac{
    public void Entry();
    public void faclist();
}
interface Med{
    public void Entry();
    public void medlist();
}
interface Stf{

}
class Doctor implements Doc{
    ArrayList<String> docID = new ArrayList<String>(); 
    ArrayList <String> docName = new ArrayList<String>();
    ArrayList <Integer> docAge = new ArrayList<Integer>();
    ArrayList <String> docSpecs = new ArrayList<String>();
    ArrayList<String> docGen = new ArrayList<String>();
    
    public void Entry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter doctor ID.");
        String id = sc.nextLine();
        docID.add(id);
        System.out.println("Please enter doctor name.");
        String Name = sc.nextLine();
        docName.add(Name);
        System.out.println("Please enter doctor's speciality.");
        String Specs = sc.nextLine();
        docSpecs.add(Specs);
        System.out.println("Please mention the doctor's gender.");
        String Gen = sc.nextLine();
        docGen.add(Gen);
        System.out.println("Please enter doctor's age.");
        int Age = sc.nextInt();
        docAge.add(Age);
    }
    public void docList(){
        for(int i = 0; i < docID.size(); i++){
                System.out.print(docID.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(docName.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(docAge.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(docSpecs.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(docGen.get(i));
                System.out.println();
        }
    }
}

class Patient implements Pat{
    ArrayList<String> patID = new ArrayList<String>(); 
    ArrayList <String> patName = new ArrayList<String>();
    ArrayList <Integer> patAge = new ArrayList<Integer>();
    ArrayList <String> patDisease = new ArrayList<String>();
    ArrayList<String> patGen = new ArrayList<String>();
    public void Entry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter patient's ID.");
        String id = sc.nextLine();
        patID.add(id);
        System.out.println("Please enter patient's name.");
        String Name = sc.nextLine();
        patName.add(Name);
        System.out.println("Please enter patient's disease.");
        String Specs = sc.nextLine();
        patDisease.add(Specs);
        System.out.println("Please mention the patient's gender.");
        String Gen = sc.nextLine();
        patGen.add(Gen);
        System.out.println("Please enter patient's age.");
        int Age = sc.nextInt();
        patAge.add(Age);
    }
    public void patList(){
        for(int i = 0; i < patID.size(); i++){
                System.out.print(patID.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(patName.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(patAge.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(patGen.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(patDisease.get(i));
                System.out.println();
        }
    }

}

class Facility implements Fac{
    ArrayList<String> faclity = new ArrayList<String>();
    public void Entry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter new facility.");
        String fac = sc.nextLine();
        faclity.add(fac);
    }
    public void faclist(){
        for(int i = 0; i < faclity.size(); i++){
            System.out.println(faclity.get(i));
            System.out.println();
        }
    }
}
class Medicine implements Med{
    ArrayList<String> medName = new ArrayList<String>();
    ArrayList<Double> medCost = new ArrayList<Double>();
    public void Entry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The New Medicine Name.");
        String Name = sc.nextLine();
        medName.add(Name);
        System.out.println("Enter The Cost Of Medicine.");
        Double cost = sc.nextDouble();
        medCost.add(cost);
    }
    public void medlist(){
        for(int i = 0; i < medName.size(); i++){
            System.out.println(medName.get(i));
            System.out.println("\t");
            System.out.println("\t");
            System.out.println(medCost.get(i));
            System.out.println();

        }
    }
}

class Staff{
    ArrayList<String> perName = new ArrayList<String>();
    ArrayList<String> perID = new ArrayList<String>();
    ArrayList<Integer> perAge = new ArrayList<Integer>();
    ArrayList<String> perDesgN = new ArrayList<String>();
    ArrayList<String> perDesgSG = new ArrayList<String>();
    ArrayList<String> perDesgS = new ArrayList<String>();
    ArrayList<String> perGen = new ArrayList<String>();
    ArrayList<Integer> perSal = new ArrayList<Integer>();
    public void NurseEntry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter person's ID.");
        String id = sc.nextLine();
        perID.add(id);
        System.out.println("Please enter person's name.");
        String Name = sc.nextLine();
        perName.add(Name);
        System.out.println("Please enter person's designation.");
        String Designation = sc.nextLine();
        perDesgN.add(Designation);
        System.out.println("Please mention the person's gender.");
        String Gen = sc.nextLine();
        perGen.add(Gen);
        System.out.println("Please enter person's age.");
        int Age = sc.nextInt();
        perAge.add(Age);
        System.out.println("Please enter person's salary");
        int salary = sc.nextInt();
        perSal.add(salary);
    }
    public void SecurityGuardEntry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter person's ID.");
        String id = sc.nextLine();
        perID.add(id);
        System.out.println("Please enter person's name.");
        String Name = sc.nextLine();
        perName.add(Name);
        System.out.println("Please enter person's designation.");
        String Designation = sc.nextLine();
        perDesgSG.add(Designation);
        System.out.println("Please mention the person's gender.");
        String Gen = sc.nextLine();
        perGen.add(Gen);
        System.out.println("Please enter person's age.");
        int Age = sc.nextInt();
        perAge.add(Age);
        System.out.println("Please enter person's salary");
        int salary = sc.nextInt();
        perSal.add(salary);
    }

    public void SanitationDeptEntry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter person's ID.");
        String id = sc.nextLine();
        perID.add(id);
        System.out.println("Please enter person's name.");
        String Name = sc.nextLine();
        perName.add(Name);
        System.out.println("Please enter person's designation.");
        String Designation = sc.nextLine();
        perDesgS.add(Designation);
        System.out.println("Please mention the person's gender.");
        String Gen = sc.nextLine();
        perGen.add(Gen);
        System.out.println("Please enter person's age.");
        int Age = sc.nextInt();
        perAge.add(Age);
        System.out.println("Please enter person's salary");
        int salary = sc.nextInt();
        perSal.add(salary);
    }
    public void Nurselist(){
        for(int i = 0; i < perDesgN.size(); i++){
                System.out.print(perID.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perName.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perAge.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perGen.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perSal.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perDesgN.get(i));
                System.out.println();

        }
    }
    public void SecurityGuardlist(){
        for(int i = 0; i < perDesgSG.size(); i++){
                System.out.print(perID.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perName.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perAge.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perGen.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perSal.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perDesgSG.get(i));
                System.out.println();

        }
    }
    public void SanitationDeptlist(){
        for(int i = 0; i < perDesgS.size(); i++){
                System.out.print(perID.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perName.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perAge.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perGen.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perSal.get(i));
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(perDesgS.get(i));
                System.out.println();

        }
    }
}
class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doctor doc = new Doctor();
        Patient pat = new Patient();
        Staff stf = new Staff();
        Facility fac = new Facility();
        Medicine med = new Medicine();
        String pattern = "MM/dd/yyyy";

        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String date1 = df.format(today);
       System.out.println("----------------------------------------------------------");
       System.out.println("**************** Welcome to city hospital ****************");
       System.out.println("Please Enter Your Name.");
       String name = sc.nextLine();
       System.out.println("Please enter your password.");
       int password = sc.nextInt();
       System.out.print("Welcome : " + name);
       System.out.print("\t");
       System.out.print("\t");
       System.out.println("Date : " + date1); 
       System.out.println();
       if (password == 1234)
       { 
        int Status =1; int s1 , s2 , s3 , s4, s5; int c1, c2, c3,c4,c5;
        while(Status == 1){
         System.out.println("\t````````````````Main Menu```````````````````");
         System.out.println("\t--------------------------------------------");
         System.out.println("Press 1. Doctor Section.");
         System.out.println("Press 2. Patient Section.");
         System.out.println("Press 3. Staff Section.");
         System.out.println("Press 4. Facility Section.");
         System.out.println("Press 5. Medicine Section.");
         System.out.println("Press 6. Exit.");
         int choice = sc.nextInt();
         switch(choice){
             case 1 : {
                System.out.println("\t````````````````Doctors Menu```````````````````");
         System.out.println("\t--------------------------------------------");
                 s1=1;
                 while(s1 ==1){
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                    System.out.println();
                     System.out.println("1. Add New Entry.\n2. Existing Doctor's List.");
                     c1 = sc.nextInt();
                         switch(c1){
                           case 1:{
                             doc.Entry();
                             break;
                         }
                          case 2: 
                            {   System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                 System.out.println("Doctor ID\t Doctor Name \t Doctor Age\t Doctor Speciality\t Doctor Gender");
                             doc.docList();
                             break;
                         }
                     }
                         System.out.println("To retrun to Doctor option list press 1 & To exit press 0.");
                         s1 = sc.nextInt();
                     }
                     break;
             }
             case 2 :{
                System.out.println("\t````````````````Patient Menu```````````````````");
         System.out.println("\t--------------------------------------------");
                s2 =1;
                while(s2 ==1){
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("1.Add New Entry. \n2. Existing Patient List.");
                    c2 = sc.nextInt();
                    switch(c2){
                        case 1 :{
                            pat.Entry();
                            break;
                        }
                        case 2:{
                            System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                            System.out.println("Patient ID\t Patient Name\t Patient Age\t Patient Gender\t Patient Disease");
                            pat.patList();
                            break;
                        }

                    }
                    System.out.println("To return to patient option list press 1 & To exit press 0.");
                    s2 = sc.nextInt();
                }
                break;
             }
             case 3 :{
                System.out.println("\t````````````````Staff Menu```````````````````");
                System.out.println("\t--------------------------------------------");
                s3 = 1; 
                while(s3 == 1){
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("1.Add New Entry.\n2.Existing List");
                    c3 = sc.nextInt();
                    switch(c3){
                        case 1: {
                            int st1 = 1;
                            while(st1 == 1){
                                System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                System.out.println("1.Nurse Entry\n2.Security Guard Entry\n3.Santition Department Entry");
                                int l1 = sc.nextInt();
                                switch(l1){
                                    case 1 :{
                                        stf.NurseEntry();
                                        break;
                                    }
                                    case 2 : {
                                        stf.SecurityGuardEntry();
                                        break;
                                    }
                                    case 3 :{
                                        stf.SanitationDeptEntry();
                                        break;
                                    }
                                }
                                System.out.println("To Return Press 1 or Press 0 to exit");
                                st1 = sc.nextInt();
                            }
                            
                            break;
                        }
                        case 2 :{
                            int st = 1;
                            while(st ==1){
                                System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                System.out.println("1.Nurses List.\n2.Security Guard List.\n3.Sanitation Department List.");
                                int l = sc.nextInt();
                                switch(l){
                                    case 1: {
                                        System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                        System.out.println("Nurse ID\t Nurse Name\t Nurse Age\t Nurse Gender\t Nurse Salary"); 
                                        stf.Nurselist(); 
                                         break;
                                    }
                                    case 2: {
                                        System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                        System.out.println("Gurad ID\t Guard Name\t Guard Age\t Guard Gender\t Guard Salary");
                                        stf.SecurityGuardlist();

                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                        System.out.println("Worker ID\t Worker Name\t Worker Age\t Worker Gender\t Worker Salary");
                                        stf.SanitationDeptlist();
                                    }
                                }
                                System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                                System.out.println("Return to back press 1 and for main menu press 0");
                                st = sc.nextInt(); 
                            }
                            break;
                        }
                    }
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("Return to Staff Section options list press 1 and for main menu press 0");
                    s3 = sc.nextInt();

                }

                break;
             }
             case 4 :{
                System.out.println("\t````````````````Facility Menu```````````````````");
                System.out.println("\t--------------------------------------------");
                s4 = 1;
                while(s4 == 1){
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("1.Add New Faciltiy\n2.Existing Facility List");
                    c4 = sc.nextInt();
                    switch(c4){
                        case 1:{
                            fac.Entry();
                            break;
                        }
                        case 2 :{
                            System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                            System.out.println("Facility Name");
                            fac.faclist();   
                        }
                    }
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("To return to Facility option list press 1 or press 0 to exit");
                    s4 = sc.nextInt();
                }
                break;
             }

             case 5 :{
                System.out.println("\t````````````````Medicine Menu```````````````````");
                System.out.println("\t--------------------------------------------");
                s5 =1;
                while(s5 ==1){
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("1.Add New Medicine\n2.Existing Medicine List");
                    c5 = sc.nextInt();
                    switch(c5){
                        case 1:{
                            med.Entry();
                            break;
                        }
                        case 2 :{
                            System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                            System.out.println("Medcine Name\t Medicine Cost");
                            med.medlist();
                            break;
                        }
                    }
                    System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                    System.out.println("To return to Medicine Option List press 1 or press0 to exit");
                    s5 = sc.nextInt();

                }
                break;
             }
             case 6 :{
                System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
                System.exit(0);;
             }
             default:{
                System.out.println("Enter correct number.!!!!!!!!!");
             }
 
         }
         System.out.println("\t<<<<<<<<<<<<<<...............>>>>>>>>>>>>>>>>>");
                                System.out.println();
         System.out.println("Return to Main menu press 1 or exit press 0.");
         Status = sc.nextInt();
        }
    }else{
        System.out.println("The password is incorrect!!!!");
        System.out.println("Programme Failed!!!!!!!!!");
    }

    }
}
