package newshelf;

import oldshelf.FictionType;

record Fiction(String name, FictionType ft) implements IBook {
    
    @Override
    public String getTitle(){
        return name;
    }
}