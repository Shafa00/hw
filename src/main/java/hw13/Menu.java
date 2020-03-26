package hw13;

import hw13.dao.FamilyController;
import hw13.entity.Human;
import hw13.entity.Man;
import hw13.entity.Pet;
import hw13.entity.Woman;
import hw13.util.FamilyOverflowException;

import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    public static void addMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("1. Fill with test data\n");
        sb.append("2. Display the entire list of families\n");
        sb.append("3. Display a list of families which members are greater than the specified number\n");
        sb.append("4. Display a list of families which members are less than the specified number\n");
        sb.append("5. Calculate the number of families which members are equal to the specified number\n");
        sb.append("6. Create a new family\n");
        sb.append("7. Delete a family by its index in the general list\n");
        sb.append("8. Edit a family by its index in the general list\n");
        sb.append("9. Remove all children over the age of majority\n");
        sb.append("10. Exit");

        System.out.println(sb.toString());

        FamilyController familyController = new FamilyController();
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while(!option.equals("exit")){
            System.out.print("Enter your option: ");
            option = scanner.nextLine();
            switch (option){
                case "1":
                    familyController.getData();
                    System.out.print("Data filled...");
                    option = scanner.nextLine();
                    break;
                case "2":
                    familyController.displayAllFamilies();
                    option = scanner.nextLine();
                    break;
                case "3":
                    try{
                    System.out.print("Input number: ");
                    int count = scanner.nextInt();
                   if (familyController.getFamiliesBiggerThan(count).size() ==0) {
                        while (familyController.getFamiliesBiggerThan(count).size() == 0) {
                            System.out.println("There is no family with this size. Try again with less number");
                            System.out.print("Input number: ");
                            count = scanner.nextInt();
                        }
                    }
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again");
                    }
                    option = scanner.nextLine();
                    break;
                case "4":
                    try{
                    System.out.print("Input number: ");
                    int count = scanner.nextInt();
                    if (familyController.getFamiliesLessThan(count).size()== 0) {
                        while (familyController.getFamiliesLessThan(count).size() == 0) {
                            System.out.println("There is no family with this size. Try again with bigger number");
                            System.out.print("Input number: ");
                            count = scanner.nextInt();
                        }
                    }
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again");
                    }
                    option = scanner.nextLine();
                    break;
                case "5":
                    try {
                        System.out.print("Input number: ");
                        int count = scanner.nextInt();
                        if (familyController.countFamiliesWithMemberNumber(count).size() == 0) {
                            while (familyController.countFamiliesWithMemberNumber(count).size() == 0) {
                                System.out.println("There is no family with this size. Try again");
                                System.out.print("Input number: ");
                                count = scanner.nextInt();
                            }
                        }
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again");
                    }
                    option = scanner.nextLine();
                    break;
                case "6":
                    try {
                        System.out.print("Input mother's name:");
                        String motherName = scanner.nextLine();
                        System.out.print("Input mother's lastname:");
                        String motherLname = scanner.nextLine();
                        System.out.print("Input mother's birth year:");
                        String motherByear = scanner.nextLine();
                        System.out.print("Input mother's birth month:");
                        String motherBmonth = scanner.nextLine();
                        System.out.print("Input mother's birth day:");
                        String motherBirthday = scanner.nextLine();
                        String motherBirth = motherBirthday + '/' + motherBmonth + '/' + motherByear;
                        System.out.print("Input mother's iq:");
                        int motherIq = scanner.nextInt();

                        System.out.print("Input father's name:");
                        String fatherName = scanner.next();
                        System.out.print("Input father's lastname:");
                        String fatherLname = scanner.next();
                        System.out.print("Input father's birth year:");
                        String fatherByear = scanner.next();
                        System.out.print("Input father's birth month:");
                        String fatherBmonth = scanner.next();
                        System.out.print("Input father's birth day:");
                        String fatherBirthday = scanner.next();
                        String fatherBirth = fatherBirthday + '/' + fatherBmonth + '/' + fatherByear;
                        System.out.print("Input father's iq:");
                        int fatherIq = scanner.nextInt();

                        HashSet<String> habits = new HashSet<>();
                        habits.add("eat");
                        habits.add("drink");
                        Pet pet = new Pet("Rock", 4, 67, habits);
                        familyController.createNewFamily(new Woman(motherName, motherLname, motherBirth, motherIq), new Man(fatherName, fatherLname, fatherBirth, fatherIq),pet);
                        System.out.println("New family saved.");
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again.");
                    }
                    option = scanner.nextLine();
                    break;
                case "7":
                    try {
                        System.out.print("Input id: ");
                        int id = scanner.nextInt();
                        if (familyController.deleteFamilyByIndex(id)){
                        System.out.println("Family deleted.");
                            option = scanner.nextLine();
                        }
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again");
                    }
                    break;
                case "8":
                    System.out.println("1. Give birth to a baby\n2. Adopt a child\n3. Return to main menu");
                    System.out.print("Enter your option: ");
                    String option2 = scanner.nextLine();
                    try {
                        if (option2.equals("1")) {
                            System.out.print("Input id: ");
                            int id = scanner.nextInt();
                            if (familyController.getFamilyById(id).countFamily() <= 5) {
                                System.out.print("Input boyName:");
                                String boyName = scanner.next();
                                System.out.print("Input girlName:");
                                String girlName = scanner.next();
                                familyController.bornChild(familyController.getFamilyById(id), boyName, girlName);
                                System.out.println("Child added to the family.");
                            } else {
                                throw new FamilyOverflowException("Exception: Count of family is more than 5.");
                            }
                        } else if (option2.equals("2")) {
                            System.out.print("Input id: ");
                            int id = scanner.nextInt();
                            if (familyController.getFamilyById(id).countFamily() <=5) {
                                System.out.print("Input name:");
                                String name = scanner.next();
                                System.out.print("Input surname:");
                                String surname = scanner.next();
                                System.out.print("Input year of birth in given format - dd/mm/yyyy: ");
                                String year = scanner.next();
                                System.out.print("Input level of intelligence: ");
                                int iq = scanner.nextInt();
                                familyController.adoptChild(familyController.getFamilyById(id), new Human(name, surname, year, iq));
                                System.out.println("Child added to the family.");
                            } else {
                                throw new FamilyOverflowException("Exception: Count of family is more than 5.");
                            }
                        } else if (option2.equals("3")) {
                            System.out.println("To return to the main menu please enter.");
                        }
                    }catch (FamilyOverflowException ex){
                        System.out.println(ex.getMessage());
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again.");
                    }
                    option = scanner.nextLine();
                    break;
                case "9":
                    try {
                        System.out.print("Input age: ");
                        int age = scanner.nextInt();
                        if (familyController.deleteAllChildrenOlderThen(age)){
                            System.out.println("Children deleted.");
                        }
                    }catch (Exception e){
                        System.out.println("Wrong input format. Please try again.");
                    }
                    option = scanner.nextLine();
                    break;
                case "10":
                    System.out.print("Input exit to close app: ");
                    String input =scanner.nextLine().toLowerCase();
                    if (input.equals("exit")){
                        familyController.loadData();
                    return;}
                    System.out.println("Try again.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    option = scanner.nextLine();
            }
        }
    }


}
