import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class all {
    public static void main(String[] args) {
        File dir= new File("Courses");
        dir.mkdir();
        String dirlocation=dir.getAbsolutePath();
        System.out.println(dirlocation);
        
      
        
        bio();
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to add another course?|\n\t1.Yes \n\t2.No ");
        int choice = input.nextInt();
        if (choice == 1) {
            for (;;) {
                bio();
                System.out.println("Do you want to add another course?|\n\t1.Yes \n\t2.No ");
                int ch = input.nextInt();
                if (ch == 1) {
                    continue;
                } else if (ch == 2) {
                    System.out.println("You already exit!");
                }
                break;
            }
        } else if (choice == 2) {
            System.out.println("You already exit!");
        }
        
    }

    public static void bio() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter yout Full name: ");
        String Name = input.nextLine();
        System.out.print("Enter yout Matric Number: ");
        int matric = input.nextInt();
        
        programme();
        System.out.println("Name: " + Name + "\t Matric: " + matric);
        
        try {
        File file = new File("Courseregistration.txt");
        file.createNewFile();
       
      Scanner scanner = new Scanner(new File("Courseregistration.txt"));
          
             FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("Name: " + Name + " \n");
          writer.write("ID: " + matric + " \n");
          
          writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void programme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which program are you in?\n\t 1.BIT \n\t 2.Architecture \n\t 3.Human Science \n\t 4.BCS");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            bitCourse();

        } else if (choice == 2) {
            ArchitectureCourse();
        } else if (choice == 3) {
        bhshcmaCourse();
        }else if (choice==4){
            Computerscience();
        }
        
    try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose: " + choice + " \n");
         writer.write("If the user choose 1 than the Program is BIT\n");
         writer.write("IF the user choose 2 than the Program is Architechture\n");
         writer.write("IF the user choose 3 than the Program is Human Science\n");
         writer.write("IF the user choose 4 than the Program is BCS\n");
         
          
          writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
  
    }

    public static void bitCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which course you want to join?\n\t1.CSCI 1300(EOP)\n\t2.INFO 1203(DBMS) \n\t3.CSCI 1303(Math1)");
        int choice = input.nextInt();
        if (choice == 1) {
            csci1300();
        } else if (choice == 2) {
            info1203();
        } else if (choice == 3) {
            csci1303();
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose course: " + choice + " \n");
         writer.write("If the user choose 1 than the course is CSCI 1300\n");
         writer.write("IF the user choose 2 than the course is INFO 1203\n");
         writer.write("IF the user choose 3 than the course is CSCI 1303\n");         
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void csci1300() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want to continue with?\n\t1.Dr.Takumi Sase \n\t2.Dr.Suriani Bint Sulaiman ");
        int choice = input.nextInt();
        if (choice == 1) {
            takumiEop();
        } else if (choice == 2) {
            surianiEop();
        }
        
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Teacher for CSCI 1300: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Takumi\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Suriani Bint Sulaiman\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void info1203() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want to continue with?\n\t1.Dr.Mohd Izzuddin Bin Mohd Tamrin \n\t2.Dr.Atikah Balqis Binti Basri ");
        int choice = input.nextInt();
        if (choice == 1) {
            dbmsIzzuddin();
        } else if (choice == 2) {
            dbmsAtikah();
        }
          try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Teacher for INFO 1203: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Mohd Izzuddin Bin Mohd Tamrin\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Atikah Balqis Binti Basri\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 

    }

    public static void csci1303() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want tocontinue with?\n\t1.Dr.Takumi Sase \n\t2.Dr.Asmarani Binti Ahmad Puzi ");
        int choice = input.nextInt();
        if (choice == 1) {
            takumiMath();
        } else if (choice == 2) {
            mathAsmarani();
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Teacher for CSCI 1303: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Takumi Sase\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Asmarani Binti Ahmad Puzi\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void takumiEop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(10:30-11:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: CSCI 1300(EOP)\t Lecturer:Dr.Takumi Sase \nTime:M-W(10:30-11:20) ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: CSCI 1300(EOP)\t Lecturer:Dr.Takumi Sase \nTime:T-TH(10:30-11:20) ");
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Class time for CSCI 1300 with Dr.Takumi: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(10:30-11:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void takumiMath() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: CSCI 1303(Math1)\t Lecturer:Dr.Takumi Sase \nTime:M-W(11:30-12:50) ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: CSCI 1303(Math1)\t Lecturer:Dr.Takumi Sase \nTime:T-TH(2:00-3:20) ");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Class time for CSCI 1303 with Dr.Takumi: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 

    }

    public static void surianiEop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: CSCI 1300(EOP)\t Lecturer:Dr.Suriani Bint Sulaiman \nTime:M-W(11:30-12:50) ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: CSCI 1300(EOP)\t Lecturer:Dr.Suriani Bint Sulaiman \nTime:T-TH(2:00-3:20) ");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("chose Class time for CSCI 1300 with Dr.Suriyani: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 

    }

    public static void dbmsIzzuddin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(10:30-11:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course:INFO 1203(DBMS) \t Lecturer:Dr.Mohd Izzuddin Bin Mohd Tamrin \nTime:M-W(10:30-11:20)");
        } else if (choice == 2) {
            complete();
            System.out.println("Course:INFO 1203(DBMS) \t Lecturer:Dr.Mohd Izzuddin Bin Mohd Tamrin \nTime:T-TH(10:30-11:20)");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for INFO 1203 with Dr.Izzuddin: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(10:30-11:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void dbmsAtikah() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course:INFO 1203(DBMS) \t Lecturer:Dr.Atikah Balqis Binti Basri \nTime:M-W(11:30-12:50)");
        } else if (choice == 2) {
            complete();
            System.out.println("Course:INFO 1203(DBMS) \t Lecturer:Dr.Atikah Balqis Binti Basri \nTime:T-TH(2:00-3:20)");
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for INFO 1203 with Dr.Atikah: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void mathAsmarani() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(10:30-11:20)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: CSCI 1303(Math1)\t Lecturer:Dr.Asmarani Binti Ahmad Puzi \nTime:M-W(10:30-11:20)");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: CSCI 1303(Math1)\t Lecturer:Dr.Asmarani Binti Ahmad Puzi \nTime:T-TH(10:30-11:20)");
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for CSCI 1303 with Dr.Asmarani: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(10:30-11:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
    
    
    // Human Science
    
    
    public static void bhshcmaCourse(){
         Scanner input= new Scanner(System.in);
         System.out.println("Which course you want to join?\n\t1.MPU 3122(Tamadun Islam and Tamadun Asia)\n\t2.RKUD 2010(Islam Aqidah) \n\t3.RKFQ 2070(Al-Fiqh al_Islami))");
         int choice=input.nextInt();
         if(choice==1){
             mpu3122();
         }
         else if(choice==2){
             rkud2010();
         }
         else if(choice==3){
             rkfq2070();
       }
          try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose course: " + choice + " \n");
         writer.write("If the user choose 1 than the course is MPU 3122\n");
         writer.write("IF the user choose 2 than the course is RKUD 2010\n");
         writer.write("IF the user choose 3 than the course is RKEQ 2070\n");         
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
}
       public static void  mpu3122(){
            Scanner input= new Scanner(System.in);
            System.out.println("Which teacher do you want to continue with?\n\t1.Dr.Az Zahara Binti Haji Abu Jamal \n\t2.Dr.Abdul Salam");
            int choice=input.nextInt();
            if(choice==1){
             zaharatamadun();
         }
         else if(choice==2){
             abdulsalamtamadun();
         }
             try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for MPU 3122: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Az Zahara Binti Haji Abu Jamal\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Abdul Salam\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 

       }
       public static void rkud2010(){
           Scanner input= new Scanner(System.in);
            System.out.println("Which teacher do you want to continue with?\n\t1.Dr.Ahmad Arif Bin Zulkefli \n\t2.Dr.Maziah Mustapha ");
            int choice=input.nextInt();
            if(choice==1){
             islamaqidahAhmad();
         }
         else if(choice==2){
             islamaqidahMaziah();
         } 
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for RKUD 2010: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Ahmad Arif Bin Zulkefli\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Maziah Mustapha\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
       }
       public static void rkfq2070(){
           Scanner input= new Scanner(System.in);
            System.out.println("Which teacher do you want tocontinue with?\n\t1.Dr.Mohd Affandi \n\t2.Sayyed Mohamed ");
            int choice=input.nextInt();
            if(choice==1){
             affandifikh();
         }
         else if(choice==2){
             sayyedfikh();
         } 
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for RKFQ 2070: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Mohd Affandi\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Sayyed Mohamed \n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
       } 
       public static void zaharatamadun(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(10:30-11:20)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
             System.out.println("Course: MPU 3122(Tamadun Islam and Tamadun Asia)\t Lecturer:Dr.Az Zahara Binti Haji Abu Jamal \nTime:M-W(10:30-11:20) "); 
         }
         else if(choice==2){
             complete();
             System.out.println("Course: MPU 3122(Tamadun Islam and Tamadun Asia)\t Lecturer:Dr.Az Zahara Binti Haji Abu Jamal \nTime:T-TH(10:30-11:20) ");
         } 
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for MPU 3122 with Dr.Az Zahara Binti Haji Abu Jamal: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(10:30-11:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
       } 
       public static void abdulsalamtamadun(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
              System.out.println("Course: MPU 3122(Tamadun Islam and Tamadun Asia)\t Lecturer:Dr.Abdul Salam\nTime:M-W(11:30-12:50) ");
         }
         else if(choice==2){
             complete();
             System.out.println("Course: MPU 3122(Tamadun Islam and Tamadun Asia)\t Lecturer:Dr.Abdul Salam \nTime:T-TH(2:00-3:20) ");
         }  
          try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for MPU 3122 with Dr.Abdul Salam: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
       }
      public static void islamaqidahAhmad(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
             System.out.println("Course: RKUD 2010(Islam Aqidah)\t Lecturer:Dr.Ahmad Arif Bin Zulkefli \nTime:M-W(11:30-12:50) ");
         }
         else if(choice==2){
             complete();
             System.out.println("Course: RKUD 2010(Islam Aqidah)\t Lecturer:Ahmad Arif Bin Zulkefli \nTime:T-TH(2:00-3:20) ");
         }  
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for RKUD 2010 with Dr.Ahmad Arif Bin Zulkefli: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
}
      public static void  islamaqidahMaziah(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(10:30-11:20)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
            System.out.println("Course:RKUD 2010(Islam Aqidah) \t Lecturer:Dr.Maziah Mustapha \nTime:M-W(10:30-11:20)"); 
         }
         else if(choice==2){
            complete(); 
            System.out.println("Course:RKUD 2010(Islam Aqidah)) \t Lecturer:Dr.Maziah Mustapha \nTime:T-TH(10:30-11:20)"); 
         } 
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for RKUD 2010 with Dr.Maziah Mustapha: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(10:30-11:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
      }       
        public static void affandifikh(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(11:30-12:50) \n\t2.T-TH(2:00-3:20)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
             System.out.println("Course:RKFQ 2070(Al-Fiqh al_Islami)) \t Lecturer:Dr.Mohd Affandi \nTime:M-W(11:30-12:50)");
         }
         else if(choice==2){
           complete(); 
           System.out.println("Course:RKFQ 2070(Al-Fiqh al_Islami) \t Lecturer:Dr.Mohd Affandi \nTime:T-TH(2:00-3:20)");
         }  
            try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for RKFQ 2070 with Dr.Mohd Affandi: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(11:30-12:50)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(2:00-3:20)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
        }  
     public static void sayyedfikh(){
            Scanner input= new Scanner(System.in);
            System.out.println("Time: \n\t1.M-W(10:30-11:20) \n\t2.T-TH(11:30-12:50)");
            int choice=input.nextInt();
            if(choice==1){
             complete();
              System.out.println("Course: RKFQ 2070(Al-Fiqh al_Islami)\t Lecturer:Dr.Sayyed Mohamed \nTime:M-W(10:30-11:20)");
         }
         else if(choice==2){
             complete();
            System.out.println("Course: RKFQ 2070(Al-Fiqh al_Islami)\t Lecturer:Sayyed Mohamed \nTime:T-TH(10:30-11:20)");
}
             try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for RKFQ 2070 with Dr.Sayyed Mohamed: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W(10:30-11:20)\n");
         writer.write("IF the user choose 2 than the class time is T-TH(11:30-12:50)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
     }
    //Architecture
    
    
    
    
    public static void ArchitectureCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which course you want to join?\n\t1.AQS 4202 = PRINCIPLES OF MEASUREMENT OF ADVANCED CIVIL ENGINEERING WORKS\n\t2.AAD 4200 = DEGREE PROJECT\n\t3.AAD 4230 =DESIGN THESIS ");
        int choice = input.nextInt();
        if (choice == 1) {
            AQS4202();
        } else if (choice == 2) {
            AAD4200();
        } else if (choice == 3) {
            AAD4230();
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose course: " + choice + " \n");
         writer.write("If the user choose 1 than the course is AQS 4202\n");
         writer.write("IF the user choose 2 than the course is AAD 4200\n");
         writer.write("IF the user choose 3 than the course is AAD 4230\n");         
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void AQS4202() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want to choose?\n\t1.DR.KHAIRUSY SYAKIRIN HAS-YUN \n\t2.DR.MOHAMAD SAIFUL NIZAM MOHD SUHAIMI ");
        int choice = input.nextInt();
        if (choice == 1) {
            Syakirin();
        } else if (choice == 2) {
            Saiful();
        }
          try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for AQS 4202: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is DR.KHAIRUSY SYAKIRIN HAS-YUN\n");
         writer.write("IF the user choose 2 than the teacher is DR.MOHAMAD SAIFUL NIZAM MOHD SUHAIMI \n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void Syakirin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M (2:00-6:00pm) \n\t2.M (9:00-1:00am)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AQS 4202\t Lecturer:KHAIRUSY SYAKIRIN HAS-YUN B. HASHIM\nTime:M-(2:00-6:00pm)  ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4202\t Lecturer:KHAIRUSY SYAKIRIN HAS-YUN B. HASHIM\nTime:M-(9:00-1:00am)");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AQS 4202 with Dr.KHAIRUSY SYAKIRIN HAS-YUN B. HASHIM: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M (2:00-6:00pm)\n");
         writer.write("IF the user choose 2 than the class time is M (9:00-1:00am)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
    }

    public static void Saiful() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.M-(2:00-6:00pm) \n\t2.M-(9:00-1:00am)");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AQS 4202\t Lecturer: MOHAMAD SAIFUL NIZAM MOHD SUHAIMI \nTime:M-(2:00-6:00pm)  ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4202\t Lecturer: MOHAMAD SAIFUL NIZAM MOHD SUHAIMI \nTime:M-(9:00-1:00am)");
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AQS 4202 with Dr.MOHAMAD SAIFUL NIZAM MOHD SUHAIMI: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-(2:00-6:00pm)\n");
         writer.write("IF the user choose 2 than the class time is M-(9:00-1:00am)\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
    }

    public static void AAD4200() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want to choose?\n\t1.DR.SUFIAN HAMAT\n\t2.DR.ZEENAT BEGAM BT YUSOF ");
        int choice = input.nextInt();
        if (choice == 1) {
            Sufian();
        } else if (choice == 2) {
            Zeenat();
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for AQS 4202: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is DR.SUFIAN HAMAT\n");
         writer.write("IF the user choose 2 than the teacher is DR.ZEENAT BEGAM BT YUSOF\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void Sufian() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.TUE	2 - 6 PM \n\t2.TUE	11 - 1 AM");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AAD 4200\t Lecturer:SUFIAN HAMAT\nTime:TUE	2 - 6 PM  ");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4200\t Lecturer:SUFIAN HAMAT\nTime:TUE	11 - 1 AM");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AAD 4200 with Dr.SUFIAN HAMAT: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is TUE	2 - 6 PM\n");
         writer.write("IF the user choose 2 than the class time is TUE	11 - 1 AM\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }   
    }

    public static void Zeenat() {

        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.WED	9 - 12 AM\n\t2.WED	2 - 5 PM");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AAD 4200\t Lecturer:ZEENAT BEGAM BT YUSOF\nTime:WED	9 - 12 AM");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4200\t Lecturer:ZEENAT BEGAM BT YUSOF\nTime:WED	2 - 5 PM");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AAD 4200 with Dr.ZEENAT BEGAM BT YUSOF: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is WED	9 - 12 AM\n");
         writer.write("IF the user choose 2 than the class time is WED	2 - 5 PM\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void AAD4230() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher do you want to choose?\n\t1.DR.SHARINA FARIHAH BT. HASAN\n\t2.DR.MOHD FAIRULLAZI BIN AYOB");
        int choice = input.nextInt();
        if (choice == 1) {
            Sharina();
        } else if (choice == 2) {
            Fairullazi();
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for AQS 4202: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is DR.SHARINA FARIHAH BT. HASAN\n");
         writer.write("IF the user choose 2 than the teacher is DR.MOHD FAIRULLAZI BIN AYOB\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void Sharina() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.WED	9 - 12 AM\n\t2.WED	2 - 5 PM");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AAD 4230\t Lecturer:SHARINA FARIHAH BT. HASAN (DR.)\nTime:THUR	3 - 5 PM");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4230\t Lecturer:SHARINA FARIHAH BT. HASAN (DR.)\nTime:THUR	9 - 12 AM");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AAD 4230 with Dr.SHARINA FARIHAH BT. HASAN: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is WED	9 - 12 AM\n");
         writer.write("IF the user choose 2 than the class time is WED	2 - 5 PM\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }

    public static void Fairullazi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Time: \n\t1.THU	9 - 12 AM\n\t2.THU	2 - 5 PM");
        int choice = input.nextInt();
        if (choice == 1) {
            complete();
            System.out.println("Course: AAD 4230\t Lecturer:MOHD FAIRULLAZI BIN AYOB\nTime:THU	3 - 5 PM");
        } else if (choice == 2) {
            complete();
            System.out.println("Course: AQS 4230\t Lecturer:MOHD FAIRULLAZI BIN AYOB\nTime:THU	9 - 12 AM");
        }
         try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for AAD 4230 with Dr.MOHD FAIRULLAZI BIN AYOB: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is THU	9 - 12 AM\n");
         writer.write("IF the user choose 2 than the class time is THU	2 - 5 PM\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
    
    //Computer Science
    
    public static void Computerscience() {
          Scanner inp = new Scanner(System.in);
          String[] courses = {"INFO 2302: Web Technologies", "CSCI 2301: Computer Networking", "CSCI 2305: Mathematics for Computing II"};
          String[] students = new String[10];
          System.out.println("Which course would you like to register for?");
        for (int i = 0; i < courses.length; i++) {
           System.out.println((i + 1) + ". " + courses[i]);
        }
         System.out.print("Enter your choice: ");
        int courseChoice = inp.nextInt();
        if(courseChoice==1){
            INFO2302();            
        }else if(courseChoice==2){
            CSCI2301();
        }else if(courseChoice==3){
            CSCI2305();   
        }
        try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose course: " + courseChoice + " \n");
         writer.write("If the user choose 1 than the course is INFO 2302\n");
         writer.write("IF the user choose 2 than the course is CSCI 2301\n");
         writer.write("IF the user choose 3 than the course is CSCI 2305\n");         
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
    public static void INFO2302() {
        Scanner inp = new Scanner(System.in);
         System.out.println("Which teacher you want to take?");
            System.out.println("1.Dr.Sharyar Wani");
            System.out.println("2.Dr.Muhamad Sadry Abu Seman");
            System.out.print("Enter your choice: ");
             int choice= inp.nextInt();
             if(choice==1){
                 DrSharyar();
             }else if(choice==2){
                 DrSeman();
             }  
              try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for INFO 2302: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Sharyar Wani\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Muhamad Sadry Abu Seman\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
     public static void DrSharyar() {
                 Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 10am-11:20am");
                 System.out.println("2.M-W 11:30m-12:50pm");
                 System.out.println("3.Tu-Th 10am-11:20am");
                 System.out.println("4.Tu-Th 11:30am-12:50pm");
                 System.out.print("Enter your choice: ");
                int choice=inp.nextInt();
                if(choice==1){
                    System.out.println("You've register your course with Dr.Sharyar and your class time is M-W 10am-11:20am");
                }else if(choice==2){
                    System.out.println("You've register your course with Dr.Sharyar and your class time is M-W 11:30m-12:50pm");
                }else if(choice==3){
                    System.out.println("You've register your course with Dr.Sharyar and your class time is Tu-Th 10am-11:20am");
                }else if(choice==4){
                    System.out.println("You've register your course with Dr.Sharyar and your class time is Tu-Th 11:30am-12:50pm");
                }
                try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for INFO 2302 with Dr.Sharyar Wani: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 11:30m-12:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 11:30am-12:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
     public static void DrSeman() {
        Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 10am-11:20am");
                 System.out.println("2.M-W 11:30m-12:50pm");
                 System.out.println("3.Tu-Th 10am-11:20am");
                 System.out.println("4.Tu-Th 11:30am-12:50pm");
                 System.out.print("Enter your choice: ");
                int choice=inp.nextInt();
                if(choice==1){
                    System.out.println("You've register your course with Dr.Seman and your class time is M-W 10am-11:20am");
                }else if(choice==2){
                    System.out.println("You've register your course with Dr.Seman and your class time is M-W 11:30am-12:50pm");
                }else if(choice==3){
                    System.out.println("You've register your course with Dr.Seman and your class time is Tu-Th 10am-11:20am");
                }else if(choice==4){
                    System.out.println("You've register your course with Dr.Seman and your class time is Tu-Th 11:30am-12:50pm");
                }
                 try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for INFO 2302 with Dr.Muhamad Sadry Abu Seman: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 11:30m-12:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 11:30am-12:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
      public static void CSCI2301() {
        Scanner inp = new Scanner(System.in);
         System.out.println("Which teacher you want to take?");
            System.out.println("1.Dr.ADAMU ABUBAKAR IBRAHIM");
            System.out.println("2.Dr.Zulkefli Bin Muhammed Yusof");
            System.out.print("Enter your choice: ");
             int choice= inp.nextInt();
             if(choice==1){
                 DrAdamu();
             }else if(choice==2){
                 DrYusof();
             } 
             try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for CSCI 2301: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.ADAMU ABUBAKAR IBRAHIM\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Zulkefli Bin Muhammed Yusof\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
      public static void DrAdamu() {
                 Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 10am-11:20am");
                 System.out.println("2.M-W 11:30m-12:50pm");
                 System.out.println("3.Tu-Th 10am-11:20am");
                 System.out.println("4.Tu-Th 11:30am-12:50pm");
                 System.out.print("Enter your choice: ");
                 int choice=inp.nextInt();
                 if(choice==1){
                     System.out.println("You've register your course with Dr.Adamu and your class time is M-W 10am-11:20pm");
                 }else if(choice==2){
                     System.out.println("You've register your course with Dr.Adamu and your class time is M-W 11:30am-12:50pm");
                 }else if(choice==3){
                     System.out.println("You've register your course with Dr.Adamu and your class time is Tu-Th 10am-11:20am");
                 }else if(choice==4){
                     System.out.println("You've register your course with Dr.Seman and your class time is Tu-Th 11:30am-12:50pm");
                 }
                  try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for CSCI 2301 with Dr.ADAMU ABUBAKAR IBRAHIM: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 11:30m-12:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 11:30am-12:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
                 
    }
      public static void DrYusof() {
        Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 10am-11:20am");
                 System.out.println("2.M-W 11:30m-12:50pm");
                 System.out.println("3.Tu-Th 10am-11:20am");
                 System.out.println("4.Tu-Th 11:30am-12:50pm");
                 System.out.print("Enter your choice: ");
                 int choice=inp.nextInt();
                 if(choice==1){
                     System.out.println("You've register your course with Dr.Yusof and your class time is M-W 10am-11:20pm");
                 }else if(choice==2){
                     System.out.println("You've register your course with Dr.Yusof and your class time is M-W 11:30am-12:50pm");
                 }else if(choice==3){
                     System.out.println("You've register your course with Dr.Yusof and your class time is Tu-Th 10am-11:20am");
                 }else if(choice==4){
                     System.out.println("You've register your course with Dr.Yusof and your class time is Tu-Th 11:30am-12:50pm");
                 }
                 try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for CSCI 2301 with Dr.Zulkefli Bin Muhammed Yusof: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 11:30m-12:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 10am-11:20am\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 11:30am-12:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }  
    }
  public static void CSCI2305() {
            Scanner inp = new Scanner(System.in);
            System.out.println("Which teacher you want to take?");
            System.out.println("1.Dr.Rawad Abdulkhaleq Abdulmolla Abdulghafor");
            System.out.println("2.Dr.Akeem Olowolayemo");
            System.out.print("Enter your choice: ");
            int choice= inp.nextInt();
            if(choice==1){
                DrRawad();
            }else if(choice==2){
                DrAkeem();
            }
             try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Teacher for CSCI 2305: " + choice + " \n");
         writer.write("If the user choose 1 than the teacher is Dr.Rawad Abdulkhaleq Abdulmolla Abdulghafor\n");
         writer.write("IF the user choose 2 than the teacher is Dr.Akeem Olowolayemo\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } 
    }
  public static void DrRawad() {
                 Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 8am-9:20am");
                 System.out.println("2.M-W 9:30m-10:50pm");
                 System.out.println("3.Tu-Th 2pm-3:20am");
                 System.out.println("4.Tu-Th 3:30am-4:50pm");
                 System.out.print("Enter your choice: ");
                 int choice=inp.nextInt();
                 if(choice==1){
                     System.out.println("You've register your course with Dr.Yusof and your class time is M-W 8am-9:20am");
                 }else if(choice==2){
                     System.out.println("You've register your course with Dr.Yusof and your class time is M-W 9:30m-10:50pm");
             }else if(choice==3){
                     System.out.println("You've register your course with Dr.Yusof and your class time is Tu-Th 2pm-3:20pm");
             }else if(choice==4){
                     System.out.println("You've register your course with Dr.Yusof and your class time is Tu-Th 3:30pm-4:50pm");
             }
                 try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for CSCI 2305 with Dr.Rawad Abdulkhaleq Abdulmolla Abdulghafor: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 8am-9:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 9:30m-10:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 2pm-3:20pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 3:30pm-4:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }  
    }
   public static void DrAkeem() {
                 Scanner inp = new Scanner(System.in);
                 System.out.println("Which time do you prefer?");
                 System.out.println("1.M-W 8am-9:20am");
                 System.out.println("2.M-W 9:30m-10:50pm");
                 System.out.println("3.Tu-Th 2pm-3:20am");
                 System.out.println("4.Tu-Th 3:30am-4:50pm");
                 System.out.print("Enter your choice: ");
                 int choice=inp.nextInt();
                 if(choice==1){
                     System.out.println("You've register your course with Dr.Akeem and your class time is M-W 8am-9:20am");
                 }else if(choice==2){
                     System.out.println("You've register your course with Dr.Akeem and your class time is M-W 9:30m-10:50pm");
             }else if(choice==3){
                     System.out.println("You've register your course with Dr.Akeem and your class time is Tu-Th 2pm-3:20am");
             }else if(choice==4){
                     System.out.println("You've register your course with Dr.Akeem and your class time is Tu-Th 3:30am-4:50pm");
             }
              try{
        FileWriter writer = new FileWriter("Courseregistration.txt", true);
   
         writer.write("choose Class time for CSCI 2301 with Dr.Akeem Olowolayemo: " + choice + " \n");
         writer.write("If the user choose 1 than the class time is M-W 8am-9:20am\n");
         writer.write("IF the user choose 2 than the class time is M-W 9:30m-10:50pm\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 2pm-3:20am\n");
         writer.write("IF the user choose 2 than the class time is Tu-Th 3:30am-4:50pm\n");
          
         writer.close();
                   
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }  

   
   }
    public static void complete() {
        System.out.println("Congratulation your registration is complete!");
    }
}
