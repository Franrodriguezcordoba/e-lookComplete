public class sortByFrom implements SortStrategy{
	@Override
	public boolean gBefore (Email e1, Email e2) {
		if(e1.from.compareToIgnoreCase(e2.from)> 0) {
			return false;
			
		}
		else {
			return true;
		}
	}
	

}
