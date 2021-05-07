package mediatorAndSingleton;

public class Main {

	public static void main(String[] args) {
		Singleton connection = Singleton.getInstance();
		connection.addBot("The bot is added.");
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Georgi");
		User user2 = new ChatUser(chat, "Ivan");
		User user3 = new ChatUser(chat, "Krisi");
		
		
		user1.send("cat");
		
	
		System.out.println("The word cat is not allowed, you will be banned!");
	}

}
