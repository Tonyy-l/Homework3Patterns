package mediatorAndSingleton;

public abstract class User {
	
	protected MessageMediator mediator;
	protected String name;

	public User(MessageMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
		
		// TODO Auto-generated constructor stub
	}

	
	public abstract void send(String message);
	
	public abstract void recieve(String message);


	protected abstract void remove(Singleton singleton);
}
