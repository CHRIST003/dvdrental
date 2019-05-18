package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.repository.customers.CustomerContactRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerContactRepositoryImpl implements CustomerContactRepository {


    private static CustomerContactRepositoryImpl repository = null;
    private Set<CustomerContact> customerContacts;

    private CustomerContactRepositoryImpl(){
        this.customerContacts = new HashSet<>();
    }

    private CustomerContact findCustomerContact(String phoneNumber) {
        return this.customerContacts.stream()
                .filter(customerContact -> customerContact.getPhoneNumber().trim().equals(phoneNumber))
                .findAny()
                .orElse(null);
    }

    public static CustomerContactRepositoryImpl getRepository(){

        if(repository == null) repository = new CustomerContactRepositoryImpl();
        return repository;
    }


    @Override
    public CustomerContact create(CustomerContact customerContact) {
        this.customerContacts.add(customerContact);
        return customerContact;
    }

    @Override
    public CustomerContact update(CustomerContact customerContact) {

        CustomerContact toDelete = findCustomerContact(customerContact.getPhoneNumber());
        if(toDelete != null) {
            this.customerContacts.remove(toDelete);
            return create(customerContact);
        }
        return null;
    }

    @Override
    public void delete(String phoneNumber) {

        CustomerContact customerContact = findCustomerContact(phoneNumber);
        if (customerContact != null) this.customerContacts.remove(customerContact);

    }

    @Override
    public CustomerContact read(final String phoneNumber) {

        CustomerContact customerContact = findCustomerContact(phoneNumber);
        return customerContact;
    }

    @Override
    public Set<CustomerContact> getAll() {

        return this.customerContacts;
    }
}
