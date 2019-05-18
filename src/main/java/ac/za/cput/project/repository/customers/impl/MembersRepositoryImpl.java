package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.repository.customers.MembersRepository;

import java.util.HashSet;
import java.util.Set;

public class MembersRepositoryImpl implements MembersRepository {

    private static MembersRepositoryImpl repository = null;
    private Set<Members> membersl;

    private MembersRepositoryImpl(){
        this.membersl = new HashSet<>();
    }

    private Members findMembers(String CustID) {
        return this.membersl.stream()
                .filter(members -> members.getCustID().trim().equals(CustID))
                .findAny()
                .orElse(null);
    }

    public static MembersRepositoryImpl getRepository(){

        if(repository == null) repository = new MembersRepositoryImpl();
        return repository;
    }


    @Override
    public Members create(Members members) {
        this.membersl.add(members);
        return members;
    }

    @Override
    public Members update(Members members) {

        Members toDelete = findMembers(members.getCustID());
        if(toDelete != null) {
            this.membersl.remove(toDelete);
            return create(members);
        }
        return null;
    }

    @Override
    public void delete(String CustID) {

        Members members = findMembers(CustID);
        if (members != null) this.membersl.remove(members);

    }

    @Override
    public Members read(final String CustID) {

        Members members = findMembers(CustID);
        return members;
    }

    @Override
    public Set<Members> getAll() {
        return this.membersl;
    }
}
