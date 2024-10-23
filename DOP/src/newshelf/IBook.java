package newshelf;
import oldshelf.FictionType;

public sealed interface IBook permits Fiction, Comic, TextBook{
	String getTitle();
}

record Fiction(String name, FictionType ft) implements IBook {
    @Override
    public String getTitle() {
        return name;
    }
}

record Comic(String title,int ageOfMainCharacter) implements IBook {
    @Override
    public String getTitle() {
        return title;
    }
}

record TextBook(String subject) implements IBook {
    @Override
    public String getTitle() {
        return subject;
    }
}
