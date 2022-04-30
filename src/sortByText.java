
public class sortByText implements SortStrategy {
	public boolean gBefore (Email e1, Email e2) {
		if(e1.text.compareToIgnoreCase(e2.text)>0) {
			return false;
			
		}
		else {
			return true;
		}
	}
	
	

}
