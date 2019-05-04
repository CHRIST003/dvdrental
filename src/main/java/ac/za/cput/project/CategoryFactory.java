package ac.za.cput.project;

import ac.za.cput.project.domain.*;

public class CategoryFactory {

    public static Category CreateCategory(String name){

        Category c = null;
        if (name.equals("Horror")){
            c = new Horror(23,"Horror","Very dangerous");
        }else {
            if (name.equals("Action")){
                c = new Action(45,"Action","war movie");
            }else {
                if(name.equals("Comedy")){
                    c = new Comedy(32,"Comedy","funny movie");
                }else {
                    if(name.equals("Romance")){
                        c = new Romance(78,"Romance","Romantic movie");
                    }else {
                        if (name.equals("Drama")){
                            c = new Drama(98,"Drama","a bit funny");
                        }else {
                            if(name.equals("Cartoon")){
                                c = new Cartoon(54,"Cartoon","Mostly for children");
                            }
                        }
                    }
                }
            }
        }

        return c;

    }
}
