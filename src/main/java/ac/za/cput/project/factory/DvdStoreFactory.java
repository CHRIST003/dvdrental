package ac.za.cput.project.factory;


import ac.za.cput.project.domain.DvdStore;

public class DvdStoreFactory {

    public static DvdStore getDvdStore( String name, String address) {
        return new DvdStore.Builder()
                .name(name)
                .address(address)
                .build();
    }
}
