package newshelf;

record TextBook(String subject) implements IBook {
    @Override
    public String getTitle() {
        return subject();
    }
}