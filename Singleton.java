package mediatorAndSingleton;

public class Singleton {

	private static Singleton instance;
	private Singleton() {
	
		// TODO Auto-generated constructor stub
	}
	
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			
		}
		
		return instance;
	}
	
	
	public void addBot(String message) {
		
		System.out.println("The bot is added.");
		
	}
	
	public void forbiddenWord(String message, User user) {
		if (message == "cat") {
			System.out.println("You can't write this word");
			user.remove(this);
		} else {
			System.out.println(message);
		}
	}

}
