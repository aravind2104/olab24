package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		return switch(o) {
			case Comic c -> c.getTitle();
			case Fiction f -> f.getName();
			case TextBook t -> t.subject();
			default -> "";
		};
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Data Structures by CLRS");
		Comic c = new Comic("Iron Man",35);
		Fiction f=new Fiction("Macbeth",FictionType.Tragedy);
		
		System.out.println(OldSelection.getAgeOrTitle(t));
		System.out.println(OldSelection.getAgeOrTitle(c));
		System.out.println(OldSelection.getAgeOrTitle(f));
		
	}
}
