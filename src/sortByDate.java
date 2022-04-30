
public class sortByDate implements SortStrategy {
	@Override
	
	public boolean gBefore (Email e1, Email e2) {
		if(e1.date.isBefore(e2.date)) {
			return true;
			
		}
		else {
			return false;
		}
	}

}
