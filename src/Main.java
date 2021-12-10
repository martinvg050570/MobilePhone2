import java.util.Scanner;

public class Main {
    private static MobilePhone newMobilePhone = new MobilePhone("06 33930789");
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //MobilePhone newMobilePhone = new MobilePhone("06 33930789");

        boolean quit = true;
        while (quit){
            System.out.println("Please select a choice in the choice menu: ");
            choiceMenu();
            int choiceNumber= scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            switch(choiceNumber){
                case 0:
                    quit = false;
                    break;

                case 1:
                    newMobilePhone.printContacts();

                    //System.out.println("This is test 1");
                    break;

                case 2:
                    addNewContact();
                    break;

                //case 3:
                  //  updateContact();
                    //break;

            }


        }
    }

    public static void choiceMenu(){
        System.out.print("\n 0: Quit");
        System.out.print("\n 1: Print the contact list");
        System.out.print("\n 2: Add a new contact");
        System.out.print("\n 3: Update a new contact");
        System.out.print("\n 4: Remove a contact");
        System.out.println("\n 5: Search/find a contact");
    }

    public static void addNewContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new name, please");
        String name= scanner.nextLine();
        System.out.println("Enter a new number, please");
        String number= scanner.nextLine();
        Contact newContact;
        newContact = Contact.createContact(name,number);
        if (newMobilePhone.addNewContact(newContact)) {
            System.out.println("New name " + name + " added with phone number " + number);
            } else {
            System.out.println("Name already exists in the contact list.");
        }
    }

    //public static void updateContact() {
      //  Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the name to be replaced, please ");
        //String oldName = scanner.nextLine();
        //Contact existingRecord = newMobilePhone.queryContact(oldName);
        //System.out.println("Exisitng name is " + existingRecord);
        //if (existingRecord == null) {
          //  System.out.println("The name was not in the list and cannot be updated");
        //} else {
          //  System.out.println("Enter the new name, please ");
            //String newName = scanner.nextLine();
            //System.out.println("Enter the new number, please ");
            //String newNumber = scanner.nextLine();
            //Contact nRecord = Contact.createContact(newName, newNumber);
            //if (newMobilePhone.updateContact(existingRecord, nRecord)) {
              //  System.out.println("The modified name is changed in the list");
            //}else {
              //  System.out.println("Error updating record.");
            //}
        //}
    //}
 }


