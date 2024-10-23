package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static final FictionType type;
	public Fiction(String name, FictionType ft) {
		this.name=name;
		Fiction.type=f;
		// TODO  correct the above.
	}
	
	public String getName(){
		return name;
	}
	
	public static FictionType getType(){
		return type;
	}

}
