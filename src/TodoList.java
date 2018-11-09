import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<TodoListItem> toDoList = new ArrayList<>();
	/*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
    	toDoList.add(new TodoListItem(description, priority));
    }
    
    public void addItem(String description, int priority, String name) {
        toDoList.add(new TodoListItem(description, priority, name));
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        return toDoList.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return toDoList.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(TodoListItem item : toDoList) {
        	if (!item.isDone()) {
        		return item;
        	}
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
    	TodoListItem itemHighestPriority = null;
    	int HighestPriority = 0;
        for(TodoListItem item : toDoList) {
        	if (!item.isDone()) {
        		if (item.getPriority() > HighestPriority) {
        			itemHighestPriority = item;
        			HighestPriority = item.getPriority();
        		}
        	}
        }
        if (itemHighestPriority != null) {
        	return itemHighestPriority;
        }
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
    	List<String> searchList = new ArrayList<>();
    	for(TodoListItem item : toDoList) {
    		if(item.getDescription().contains(text)) {
    			searchList.add(item.getDescription());
    		}
    	}
        return searchList;
    }

	public List<String> searchByName(String name) {
		List<String> searchList = new ArrayList<>();
		for(TodoListItem item : toDoList) {
			if(item.getUsername().equals(name)) {
				searchList.add(item.getDescription());
			}
		}
		return searchList;
	}
    
    
}
