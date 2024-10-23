package newshelf;

import oldshelf.FictionType;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Comic c) {
			return c.getTitle();
		}
		if (o instanceof TextBook t){
			return t.getTitle();
		}
		if(o instanceof Fiction f){
			return f.getTitle();
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		Comic c = new Comic("Captain America", 106);
		TextBook t = new TextBook("Discrete Structures");
		Fiction f = new Fiction("Hamlet", FictionType.Tragedy);
	
		System.out.println(NewSelection.getAgeOrTitle(c));
		System.out.println(NewSelection.getAgeOrTitle(t));
		System.out.println(NewSelection.getAgeOrTitle(f));
	}
}
