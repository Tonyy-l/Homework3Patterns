package mediatorAndSingleton;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
		mediator.removeUser(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		
		System.out.println(this.name + " sends " + message); 
		mediator.sendMessage(message, this);
		// TODO Auto-generated method stub

	}

	@Override
	public void recieve(String message) {
		
		System.out.println(this.name + " recieved " + message); 
		
		// TODO Auto-generated method stub

	}

	@Override
	protected void remove(Singleton singleton) {
		// TODO Auto-generated method stub
		
	}

}
