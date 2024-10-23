package newshelf;

public sealed interface IBook permits Fiction, Comic, TextBook{
	String getTitle();
}




