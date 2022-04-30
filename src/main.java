import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Mailbox mb = new Mailbox();
			
			sortByFrom from = new sortByFrom();
			sortBySubject subject = new sortBySubject();
			sortByDate date = new sortByDate();
			sortByPriority priority = new sortByPriority();
			sortByText text = new sortByText();
			
			Email m1 = new Email("Fran", "Asignaturas", LocalDate.of(2022, 01, 03), Priority.IMPORTANTES, "ISA");
			Email m2 = new Email("Juanillo", "Informe", LocalDate.of(2022, 02, 03), Priority.SPAM, "Fecha de entrega...");
			Email m3 = new Email("Pedro", "Deporte", LocalDate.of(2022, 03, 03), Priority.DESTACADOS, "Mañana hay partido");
			
			//System.out.println(m.toString());
			mb.addEmail(m1);
			mb.addEmail(m2);
			mb.addEmail(m3);
			
			mb.setOrder(subject);
			System.out.println("Order by subject");
			mb.show();
			
			mb.setOrder(priority);
			System.out.println("Order by priority");
			mb.show();
			
			mb.setOrder(date);
			System.out.println("Order by date");
			mb.show();
			
			
			
		


	}

}
