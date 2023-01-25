package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {

    private ContactList contact_list;

    public ContactListController (ContactList contact_list) {
        this.contact_list = contact_list;
    }

    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }

    public Contact getContact(int pos) {
        return contact_list.getContact(pos);
    }

    public Boolean hasContact(Contact contact) {
        return contact_list.hasContact(contact);
    }
    public ArrayList<Contact> getContacts() {
        return contact_list.getContacts();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        contact_list.setContacts(contacts);
    }

    public ArrayList<String> getAllUsernames() {
        return contact_list.getAllUsernames();
    }

    public void loadContacts(Context context) {
        contact_list.loadContacts(context);
    }
    public boolean addContact (Contact contact, Context context) {
        AddContactCommand addContactCommand = new AddContactCommand(contact_list, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }

    public boolean deleteContact (Contact contact, Context context) {
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contact_list, contact, context);
        deleteContactCommand.execute();
        return deleteContactCommand.isExecuted();
    }

    public boolean editContact (Contact oldContact, Contact newContact, Context context) {
        EditContactCommand editContactCommand = new EditContactCommand(contact_list, oldContact, newContact, context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }

    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public Boolean isUsernameAvailable(String username) {
        return contact_list.isUsernameAvailable(username);
    }


    public void addObserver(Observer observer) {
        contact_list.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact_list.removeObserver(observer);
    }

}
