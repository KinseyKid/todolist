
public class TodoListItem {
	String description;
	int priority;
	boolean isDone;
	User user;

	public TodoListItem(String string, int i, String name) {
		description = string;
		priority = i;
		isDone = false;
		user = new User(name);
	}
	
	public TodoListItem(String string, int i) {
		description = string;
		priority = i;
		isDone = false;
	}

	public String getDescription() {
		return this.description;
	}

	public int getPriority() {
		return this.priority;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public void markDone() {
		this.isDone = true;
	}

	public String getUsername() {
		return user.getName();
	}

}
