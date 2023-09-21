package Controller;

import data.model.Contact;
import data.model.MyGUI;
import data.model.PhoneBook;
import data.repositories.PhoneBookImpl;

import java.util.List;
import java.util.Objects;

public class ContactAppController {
    private final PhoneBookImpl server = new PhoneBookImpl();
    private final MyGUI gui = new MyGUI();
    private void phoneBookCreator(){
            gui.display("Phone Book Creation In Progress");
            String name = gui.input("Enter Username");
            PhoneBook phonebook;
            phonebook = new PhoneBook(server.createId(), name);
            server.save(phonebook);
            String string = "PhoneBook Creator";
            gui.info("PhoneBook Creation Successful\nYour ID IS " + phonebook.getId() + "\nYour UserName Is " + phonebook.getUserName(),string);}
    private int welcome(){
        String s = "PhoneBook App";
        String [] res = {"Create New PhoneBook","Delete PhoneBook","Update PhoneBook","Open Existing PhoneBook","Close Application"};
        return gui.options("Welcome",res,s);
    }
    private PhoneBook finder(){
        String userName = gui.input("Enter user name");
        String id = gui.input("Enter ID");
        PhoneBook book = null;
        for (PhoneBook bb: server.findAll()) {
            if (verification(userName, id)) {book = bb;   gui.info("Logging Okay","Logging Status");}}
        return book;}

    private boolean verification(String name, String pin){
        for (PhoneBook bb: server.findAll()) {
            if (bb.getUserName().equals(name) && bb.getId().equals(pin)){
               return true;}}return false;}
    private void updatePhoneBook(PhoneBook book){
        String [] res = {"Update NameUser", "Back"};
        int command;
        command = gui.options("Update Alert",res,"Update Request");
        if (command == 0){
            book.updateUserName(gui.input("Enter New User"));
            gui.info("UserNameUpdated Successfully", "User Alert");
            displayScreen();}
        if (command == 1) displayScreen();}
    private void openPhoneBook(PhoneBook phoneBook){
        String [] command = {"Create Contact","Delete Contact","Update Contact","View Contact List","Back"};
        int command1 = gui.options("ContactMenu",command,"ContactBox");
        if (command1 == 0){
            phoneBook.createContact();
            openPhoneBook(phoneBook);
        }
        if (command1 == 1){
            String name = gui.input("Enter Contact Name To Delete");
            Contact cc = phoneBook.findContactByName(name);
            if (cc != null){
                phoneBook.deleteContact(Objects.requireNonNull(cc).getName());}
              else gui.error("Contact Does Not Exist","Error");
            openPhoneBook(phoneBook);}
        if (command1 == 2){
            String name = gui.input("Enter Contact Name To Update");
            Contact cc = phoneBook.findContactByName(name);
            if (cc != null){
                String [] command2 = {"Update Name", "Update Telephone Number", "Update Address", "Update Email", "Back"};
                int command3 = gui.options(cc.getName(), command2,"ContactBox");
                if (command3 == 0) updateName(cc);
                if (command3 == 1) updateNumber(cc);
                if (command3 == 2) updateAddress(cc);
                if (command3 == 3) updateEmail(cc);
                if (command3 == 4) openPhoneBook(phoneBook);}
            else gui.error("Contact Does Not Exist","Error");
            openPhoneBook(phoneBook);}
        if (command1 == 3){
            phoneBook.getContactList();openPhoneBook(phoneBook);}
        if (command1 == 4)displayScreen();
    }

    private void updateName(Contact contact){
        gui.warning("You Are About To Update Contact Name?\n"
                + contact.getName(),"Warning");
        contact.updateName(gui.input("Enter New Name"));
        gui.info("Update Successful","Update Information");}
    private void updateNumber(Contact contact){
        gui.warning("You Are About To Update Contact Telephone Number?\n"
                + contact.getTelephoneNumber(),"Warning");
        contact.updateTelephoneNumber(gui.input("Enter New Telephone Number"));
        gui.info("Update Successful","Update Information");}
    private void updateEmail(Contact contact){
        gui.warning("You Are About To Update Contact Email?\n"
                + contact.getEmail(),"Warning");
        contact.updateEmail(gui.input("Enter New Email"));
        gui.info("Update Successful","Update Information");}
    private void updateAddress(Contact contact){
        gui.warning("You Are About To Update Contact Address?\n"
                + contact.getAddress(),"Warning");
        contact.updateAddress(gui.input("Enter New Address"));
        gui.info("Update Successful","Update Information");}

    public void displayScreen(){
        int command = welcome();
        if (command == 0 ){
            phoneBookCreator();displayScreen();}
        if (command == 1) {
            PhoneBook a = finder();
            if ( a != null){
              server.delete(Objects.requireNonNull(a));}
            else gui.error("PhoneBook Not Found","Error");
            displayScreen();
          }
        if (command == 2) {
          PhoneBook book =  finder();
          if (book != null){
          updatePhoneBook(book);}
          else gui.error("PhoneBook Not Found","Error");displayScreen();
        }
        if (command == 3){
            PhoneBook book =  finder();
            if (book != null){
                openPhoneBook(book); }
            else gui.error("PhoneBook Not Found","Error");displayScreen();}
        if (command == 4) System.exit(2);
    }
}
