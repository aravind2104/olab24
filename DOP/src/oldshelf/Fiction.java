package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;
	
	public Fiction(String name, FictionType ft) {
		this.name=name;
		this.type=ft;
		// TODO  correct the above.
	}
	
	public String getName(){
		return name;
	}
	
	public FictionType getType(){
		return type;
	}

}
