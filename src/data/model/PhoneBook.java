package data.model;

import data.repositories.PhoneBookRepositories;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private final List<Contact> contactList = new ArrayList<>();
    private String id;
    private String userName;
    private final MyGUI gui = new MyGUI();
    private  int warning = 3;


    public void getContactList() {
        List<String> con = new ArrayList<>();
        for (Contact cc: contactList) {
            gui.info("\t" + cc.toString(),"Contact List");con.add(cc.toString());
        }
        }

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;}

    public String getUserName() {
        return userName;}

    public void updateUserName(String userName) {
        while (warning > 0){
            try {
                this.userName = userName;
                warning = 3;
            }
            catch (IllegalArgumentException n){
                gui.error("Illegal Argument Detected","Error");
                warning--;
                gui.warning("Invalid Value detected","Warning");}}}

    public PhoneBook(String id, String userName) {
        try {
            this.id = id;
            this.userName = userName;
        }
        catch (IllegalArgumentException n){
            gui.error("Invalid Data Detected","Error");}}
    public void createContact(){
        String name = gui.input("Enter contact name");
        String phoneNumber = gui.input("Enter contact Number");
        String email = gui.input("Enter contact email");
        String address = gui.input("Enter contact address");
        Contact contact = new Contact(name,address,phoneNumber,email);
        contactList.add(contact);
        gui.info("Contact Creation Successful", "Contact Status");
    }
    public void deleteContact(String name){
        try {
            gui.warning("You Are About To Delete Contact With The Name\n"
                    + name + "?","Warning");
            contactList.remove(findContactByName(name));
            gui.info("Delete Successful","Delete Information");
        }
        catch (IllegalArgumentException n){
            gui.error("Illegal Value!!!","Error");}}
    public Contact findContactByName(String userName){
             Contact cp = null;
                for (Contact cc: contactList) {
                    if (Objects.equals(cc.getName(), userName)){
                        cp = cc;}
                }return cp;}


    @Override
    public String toString() {
        return "PhoneBook{" +
                "contactList=" + contactList +
                ", id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", gui=" + gui +
                ", warning=" + warning +
                '}';
    }
}
