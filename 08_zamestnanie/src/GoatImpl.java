import java.io.Serializable;

public class GoatImpl implements Animal, Serializable{
	private static final long serialVersionUID = 1L;
	public GoatImpl(byte age) {
		this.age=age;
	}
	@Override
	public void sound() {
		System.out.println("The sound of goat.");
	}
	private byte age;
	@Override
    public String toString() {
        return new StringBuffer("Animal: Goat").append(" , Age: ").append(this.age).append(", Sound : Baaa.").toString();
    }
}