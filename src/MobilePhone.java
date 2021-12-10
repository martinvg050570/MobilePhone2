import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts= new ArrayList<Contact>();

    }

    private static Scanner scanner = new Scanner(System.in);

    public boolean addNewContact(Contact contacts) {
        //System.out.println("Return indexnumber " + findContact(contacts) ) ;
        //int i=myContacts.indexOf(contacts.getName());
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Name found. Name not added to the contact list");
            return false;
        } else {
            System.out.println("Name not found. Name added to the contact list");
            this.myContacts.add(contacts);
            return true;

        }
    }

    private int findContact(String fcontact) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println("The this.myContacts.get(index) is : " + this.myContacts.get(i).getName());
           if (this.myContacts.contains(fcontact)){
                return this.myContacts.indexOf(fcontact);
            }
        }
        return -1;
    }

    private int findContact(Contact contacts) {
        return findContact(contacts.getName());
    }


    public void printContacts(){
        System.out.println("Contact List :");
        //ArrayList<Contact> newList;
        for (int i=0; i< this.myContacts.size() ; i++){
            System.out.println((i)+ ". Name :" + this.myContacts.get(i).getName() + "-> Number " +this.myContacts.get(i).getPhoneNumber());

        }
    }

    public Contact queryContact(String contactFound){
        int pos = myContacts.indexOf(contactFound);
        System.out.println("The result of queryContact is " + pos);
        if (this.myContacts.contains(contactFound)){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) < 0){
            System.out.println("This name is not in the list and cannot be updated");
            return false;
        }
        int index = findContact(oldContact);
        this.myContacts.set(index,newContact);
        return true;
    }


}
