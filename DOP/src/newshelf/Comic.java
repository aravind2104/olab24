package newshelf;


record Comic(String title,int ageOfMainCharacter) implements IBook {
    
    @Override
    public String getTitle() {
        return title;
    }
}
