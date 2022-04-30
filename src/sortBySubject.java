
public class sortBySubject implements SortStrategy{
	
	public boolean gBefore (Email e1, Email e2) {
		if(e1.subject.compareToIgnoreCase(e2.subject)>0) {
			return false;
			
		}
		else {
			return true;
		}
	}

}
