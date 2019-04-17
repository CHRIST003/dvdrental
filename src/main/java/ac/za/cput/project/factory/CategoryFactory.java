package ac.za.cput.project.factory;

import ac.za.cput.project.domain.*;

public class CategoryFactory {
    public static Category CreateCategory(String name){

        Category c = null;
        if (name.equals("Horror")){
            c = new Horror();
        }else {
            if (name.equals("Action")){
                c = new Action();
            }else {
                if(name.equals("Comedy")){
                    c = new Comedy();
                }else {
                    if(name.equals("Romance")){
                        c = new Romance();
                    }else {
                        if (name.equals("Drama")){
                            c = new Drama();
                        }else {
                            if(name.equals("Cartoon")){
                                c = new Cartoon();
                            }
                        }
                    }
                }
            }
        }

        return c;

    }
}
