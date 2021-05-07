package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {
	
	private List<User> users;

	public Chat() {
		this.users = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		
		// TODO Auto-generated method stub

	}
	
	@Override
	public void removeUser(User user) {
		this.users.remove(user);
		
		// TODO Auto-generated method stub

	}

	@Override
	public void sendMessage(String message, User user) {
		for(User chatUser: this.users) {
			if(user != chatUser) {
				chatUser.recieve(message);
			}
			if(message == "cat") {
				System.out.println("This word is forbidden");
				
				
				} else { System.out.println(message);
				
				}
			
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void recieveMessage(String message) {
		if (message == "cat") {
			System.out.println("You can't use this word");
		}

		// TODO Auto-generated method stub
		
	}

}
