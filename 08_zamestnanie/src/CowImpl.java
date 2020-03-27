import java.io.Serializable;

public class CowImpl implements Animal, Serializable{

	private static final long serialVersionUID = 1L;
	public CowImpl(byte age) {
		this.age=age;
	}
	@Override
	public void sound() {
		System.out.println("The sound of cow.");
	}
	private byte age;
	@Override
    public String toString() {
        return new StringBuffer("Animal: Cow").append(" , Age: ").append(this.age).append(", Sound : Moooo.").toString();
    }
}
