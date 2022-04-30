
public class sortByPriority implements SortStrategy {
	
	public boolean gBefore (Email e1, Email e2) {
		if(e1.priority.compareTo(e2.priority)>0) {
			return false;
			
		}
		else {
			return true;
		}
	}

}
