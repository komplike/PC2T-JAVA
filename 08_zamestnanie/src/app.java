import java.io.FileOutputStream;

/**
 * @author roman
 * 
 * Rozdiel medzi Abstract class a Interface:
 * Metody v interface nemozu byt implementovane, v abstract class moze byt instancia metody ktora implementuje jej spravanie.
 * Premenne v interface su final, abstract class moze obsahovat aj ine premenne.
 * Interface sa pouziva klucovym slovom "implements", abstract class "extends".
 * Interface moze rozsirit len dalsi interface, abstract class moze rozsirit inu class ako aj implementovat interface.
 * ...
 * Proc se pouziva v nekterych pripadech enumerace misto Stringu:
 * enum sa da pouzit v switch()
 * porovnanie enum je rychlejsie ako porovnanie String
 * pri behu programu nehrozi typova chyba
 */

public class app{

	public static void fillwithData(employee[] employees, secretarian secretarian_1) {
		employees[0] = new employee();
		employees[0].setNickname("Boris".toCharArray());
		employees[0].setEmail("Boris@mail.com".toCharArray());
		employees[0].setPassword("passwordB".toCharArray());
		employees[1] = new employee();
		employees[1].setNickname("Adam".toCharArray());
		employees[1].setEmail("adam@mail.com".toCharArray());
		employees[1].setPassword("passwordA".toCharArray());
		employees[2] = new employee();
		employees[2].setNickname("Zdeno".toCharArray());
		employees[2].setEmail("zdeno@mail.com".toCharArray());
		employees[2].setPassword("passwordZ".toCharArray());
		employees[3] = new employee();
		employees[3].setNickname("Andrej".toCharArray());
		employees[3].setEmail("andrej@mail.com".toCharArray());
		employees[3].setPassword("passwordA".toCharArray());
		
		secretarian_1.setNickname("Rob".toCharArray());
		secretarian_1.setEmail("rob_sec@mail.com".toCharArray());
		secretarian_1.setPassword("password".toCharArray());
		secretarian_1.setAge(20);
	}

	public static void main(String[] args) {
		
		//generating instances
		employee employees[] = new employee[4];
		secretarian secretarian_1 = new secretarian();
		//manager relative to secretarian
		manager<secretarian> manager_1 = new manager<>(secretarian_1);
		
		//filling objects with data
		fillwithData(employees, secretarian_1);
		
		//adding employees
		for (int i=0;i<employees.length;i++)
			manager_1.addEmployee(employees[i]);		
		
		manager_1.printManager();
		manager_1.printEmployees();
		//sort employees
		manager_1.sortEmployee();
		System.out.println("Sorting...");
		manager_1.printEmployees();
		
		AbstractAnimal cat = new Cat();
		AbstractAnimal dog = new Dog();
		AbstractAnimal pig = new Pig();
		AbstractAnimal cow = new Cow();
		AbstractAnimal goat = new Goat();
		
		sound(cat,dog,pig,cow,goat);
		
		Animal catimpl = new CatImpl((byte)2);
		Animal dogimpl = new DogImpl((byte)7);
		Animal pigimpl = new PigImpl((byte)12);
		Animal cowimpl = new CowImpl((byte)14);
		Animal goatimpl = new GoatImpl((byte)13);
		
		sound(catimpl,dogimpl,pigimpl,cowimpl,goatimpl);
		
		WriteObjectToFile(catimpl,dogimpl,pigimpl,cowimpl,goatimpl);
	}
	
	public static void sound(AbstractAnimal cat, AbstractAnimal dog, AbstractAnimal pig,AbstractAnimal cow,AbstractAnimal goat) {
		cat.sound();
		dog.sound();
		pig.sound();
		cow.sound();
		goat.sound();
	}
	public static void sound(Animal catimpl, Animal dogimpl, Animal pigimpl,Animal cowimpl, Animal goatimpl) {
		catimpl.sound();
		dogimpl.sound();
		pigimpl.sound();
		cowimpl.sound();
		goatimpl.sound();
	}
	public static void WriteObjectToFile(Object ... Objs) {
		 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir").concat("\\output.txt"));
            for (Object Obj : Objs)
            	fileOut.write(Obj.toString().concat("\n").getBytes());
            fileOut.close();
            System.out.println("Data succesfully written to a file");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}