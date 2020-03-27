import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class manager<Type> extends employee{
	private ArrayList<employee> listOfEmployees;
	private ArrayList<Type> listOfRelationships;
	
	public List<employee> getListOfEmployees() {
		return listOfEmployees;
	}
	public void setListOfEmployees(ArrayList<employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	public List<Type> getListOfRelationships() {
		return listOfRelationships;
	}
	public void setListOfRelationships(ArrayList<Type> listOfRelationships) {
		this.listOfRelationships = listOfRelationships;
	}
	public manager(Type man) {
		listOfEmployees = new ArrayList<>();
		listOfRelationships = new ArrayList<>();
		this.listOfRelationships.add(man);
	}
	public void addEmployee(employee man) {
		this.listOfEmployees.add(man);
	}
	public void sortEmployee() {
		Collections.sort(this.getListOfEmployees(), new EmailComparator());
	}
	public void printManager() {
		if (this.getListOfRelationships().isEmpty())
			System.out.println("Manager has no relationships");
		else {
			System.out.println("List of relationships:");
			for(Type man : listOfRelationships) {
				System.out.println("Nickname: "+String.valueOf(((employee)man).getNickname())+", Email: "+String.valueOf(((employee) man).getEmail())+", Status: "+((employee)man).getType());
			}
		}
	}
	public void printEmployees() {
		if (this.getListOfEmployees().isEmpty())
			System.out.println("Manager has no employees");
		else {
			System.out.println("List of employees:");
			for(employee man : listOfEmployees) {
				System.out.println("Nickname: "+String.valueOf(man.getNickname())+", Email: "+String.valueOf(man.getEmail())+", Status: "+man.getType());
			}
		}
	}
	
}
class EmailComparator implements Comparator<employee> {
    public int compare(employee a, employee b) {
        return String.valueOf(a.getEmail()).compareToIgnoreCase(String.valueOf(b.getEmail()));
    }
}