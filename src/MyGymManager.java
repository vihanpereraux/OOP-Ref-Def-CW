import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyGymManager implements GymManager {

    private int num_of_object ;
    ArrayList<DefaultMember> list;

    public MyGymManager(int num_of_object)
    {
        this.num_of_object = num_of_object ;
        list = new ArrayList<>();
    }

    public void addMember(DefaultMember defaultMember) {
        list.add(defaultMember);
    }

    public void deleteMember(int index) {
        list.remove(index);
    }

    public void printMembers() {
        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i).toString());
        }
    }

    public void sortItems() {
//        Collections.sort(members);
//        printMembers();
    }

    public void saveMembers() {
        try
        {
            File fileOver60 = new File("over60Members.txt") ;
            File fileStudentMembers = new File("StudentMembers.txt") ;

            if(!fileOver60.exists())
            {
                fileOver60.createNewFile();
            }

            if(!fileStudentMembers.exists())
            {
                fileStudentMembers.createNewFile();
            }

            PrintWriter pwOver60 = new PrintWriter(fileOver60) ;
            for (int i = 0 ; i < list.size() ; i++)
            {
                pwOver60.println(list.get(i).getName());
            }
            pwOver60.close();

            PrintWriter pwStudentMembers = new PrintWriter(fileStudentMembers) ;
            for (int i = 0 ; i < list.size() ; i++)
            {
                pwStudentMembers.println(list.get(i).getName());
            }
            pwStudentMembers.close();


        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean playMenu()
    {
        boolean exit = false ;

        System.out.println();
        System.out.println("-----------------------------------Westminster GYM Management System-----------------------------------");
        System.out.println();


        Scanner input5 = new Scanner(System.in) ;
        int user_input ;
        while (true)
        {
            try{
                System.out.println("Enter 1 to 'Add' Members");
                System.out.println("Enter 2 to 'Delete' Members");
                System.out.println("Enter 3 to 'Print' the Members");
                System.out.println("Enter 4 to 'Sort' the Members");
                System.out.println("Enter 5 to 'Write/Save' to files");
                System.out.println("Enter 6 to 'Exit' the program");
                System.out.println();
                System.out.print("Please enter a number for the menu selection : " );
                user_input = input5.nextInt() ;
                System.out.println();
                break;
            }catch (Exception e){
                System.out.println("Please enter a number for the menu selection : " );
                input5.nextLine() ;
                //System.out.println();
            }
        }

        switch (user_input)
        {
            case 1 :

                Scanner input6 = new Scanner(System.in) ;
                int manager_vehicle ;
                while (true)
                {
                    try{
                        System.out.println("You want to enter a Over 60 member or a Student Member");
                        System.out.println("If you want to enter a over 60 member press 1");
                        System.out.println("If you want to enter a student member press 2");
                        manager_vehicle = input6.nextInt() ;
                        System.out.println();
                        break;
                    }catch (Exception e){
                        System.out.print("Please enter a number for the above field, try again ! " );
                        input6.nextLine() ;
                        System.out.println();
                    }
                }

                switch (manager_vehicle)
                {
                    case 1 :
                        System.out.println("You are going to enter a Over 60 member");

                        String memberName;
                        Scanner input7 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the name of the member ");
                            memberName = input7.nextLine();
                            System.out.println();
                            if (memberName.length() == 0) {
                                System.out.print("Don't insert a null value...Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        int memberAge ;
                        Scanner input8 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the age of the member : ");
                            memberAge  = input8.nextInt();
                            System.out.println();
                            if (memberAge == 0 && memberAge < 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        String memberAddress ;
                        Scanner input9 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the address of the member : ");
                            memberAddress  = input9.nextLine();
                            System.out.println();
                            if (memberAddress.length() == 0) {
                                System.out.print("Don't insert a null value...Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int memberPhoneNumber ;
                        Scanner input10 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the mobile number of the member : ");
                            memberPhoneNumber  = input10.nextInt();
                            System.out.println();
                            if (memberPhoneNumber == 0 && memberPhoneNumber < 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int memberYear ;
                        Scanner input11 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born year of the member : ");
                            memberYear  = input11.nextInt();
                            System.out.println();
                            if (memberYear == 0 && memberYear < 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int memberMonth ;
                        Scanner input12 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born month of the member : ");
                            memberMonth  = input12.nextInt();
                            System.out.println();
                            if (memberMonth == 0 && memberMonth < 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int memberDay ;
                        Scanner input13 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born day of the member : ");
                            memberDay  = input13.nextInt();
                            System.out.println();
                            if (memberDay == 0 && memberDay < 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        String memberProfession ;
                        Scanner input14 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the profession of the member : ");
                            memberProfession  = input14.nextLine();
                            System.out.println();
                            if (memberProfession.length() == 0) {
                                System.out.print("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }
                        Date startDate = new Date(memberYear,memberMonth,memberDay);
                        Over60Member over60Member = new Over60Member(memberName, memberAge , memberAddress ,memberPhoneNumber,startDate ,memberProfession) ;

                        addMember(over60Member);
                        break;

                    case 2 :

                        System.out.println("You are going to enter a Student member");

                        String studentMemberName;
                        Scanner input15 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the name of Student member : ");
                            studentMemberName = input15.nextLine();
                            System.out.println();
                            if (studentMemberName.length() == 0) {
                                System.out.println("Don't insert a null value...Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        int studentMemberAge ;
                        Scanner input16 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the age of the Student member : ");
                            studentMemberAge  = input16.nextInt();
                            System.out.println();
                            if (studentMemberAge == 0 && studentMemberAge < 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        String studentMemberAddress ;
                        Scanner input17 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the address of the Student member");
                            studentMemberAddress  = input17.nextLine();
                            System.out.println();
                            if (studentMemberAddress.length() == 0) {
                                System.out.println("Don't insert a null value...Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int studentMhoneNumber ;
                        Scanner input18 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the mobile number of the Student member : ");
                            studentMhoneNumber  = input18.nextInt();
                            System.out.println();
                            if (studentMhoneNumber == 0 && studentMhoneNumber < 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int studentMemberYear ;
                        Scanner input19 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born year of the member : ");
                            studentMemberYear  = input19.nextInt();
                            System.out.println();
                            if (studentMemberYear == 0 && studentMemberYear < 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int studentMemberMonth ;
                        Scanner input20 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born month of the member : ");
                            studentMemberMonth  = input20.nextInt();
                            System.out.println();
                            if (studentMemberMonth == 0 && studentMemberMonth < 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }


                        int studentMemberDay ;
                        Scanner input21 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the born day of the member : ");
                            studentMemberDay  = input21.nextInt();
                            System.out.println();
                            if (studentMemberDay == 0 && studentMemberDay < 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }

                        String studentSchoolName ;
                        Scanner input22 = new Scanner(System.in) ;
                        while (true)
                        {
                            System.out.print("Enter the school name of the Student member : ");
                            studentSchoolName  = input22.nextLine();
                            System.out.println();
                            if (studentSchoolName.length() == 0) {
                                System.out.println("Don't insert incorrect values, Age Can'Try again");
                            }
                            else
                            {
                                System.out.println();
                                break;
                            }
                        }
                        Date startDateStudent = new Date(studentMemberYear,studentMemberMonth,studentMemberDay);
                        StudentMember studentMember = new StudentMember(studentMemberName, studentMemberAge , studentMemberAddress ,studentMhoneNumber,startDateStudent ,studentSchoolName) ;

                        addMember(studentMember);
                        break;
                }
                break;

            case 2 :
                Scanner deleteItem = new Scanner(System.in);
                System.out.println("Number ?");
                int index = deleteItem.nextInt() ;
                deleteMember(index);
                break;

            case 3 :
                printMembers();
                break;

            case 4 :
                sortItems();
                break;

            case 5 :
                saveMembers();
                break;

            case 6 :
                exit = true ;
                break;
        }
        return exit ;
    }


}
