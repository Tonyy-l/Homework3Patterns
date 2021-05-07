package mediatorAndSingleton;

public interface MessageMediator {

	void addUser(User user);
	
	void sendMessage(String message, User user);
	void recieveMessage(String message);

	void removeUser(User user);

	
}
