import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	public List<Email> email = new ArrayList<Email>();
	private static SortStrategy strategy;
	

	private void sort() {
		for (int i = 1; i <= email.size(); i++) {
			for (int j = email.size()-1; j >= i; j--) {

				if (before(email.get(j), email.get(j - 1))) {
					Email nuevoOrden = email.get(j);
					email.set(j, email.get(j - 1));
					email.set(j - 1, nuevoOrden);
				}

			}
		}

	}

	public void addEmail(Email e) {
		email.add(e);
	}

	public void setOrder(SortStrategy st) {
		strategy = st;
	}

	public void show() {
		sort();
		for (int i = 0; i < email.size(); i++) {
			System.out.println(email.get(i).toString());
		}	
	}

	private boolean before(Email e1, Email e2) {
		return strategy.gBefore(e1, e2);

	}
	

}
