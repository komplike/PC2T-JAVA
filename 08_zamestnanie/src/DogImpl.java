import java.io.Serializable;

public class DogImpl implements Animal, Serializable{
	private static final long serialVersionUID = 1L;
	public DogImpl(byte age) {
		this.age=age;
	}
	@Override
	public void sound() {
		System.out.println("The sound of dog.");
	}
	private byte age;
	@Override
    public String toString() {
        return new StringBuffer("Animal: Dog").append(" , Age: ").append(this.age).append(", Sound : Haf.").toString();
    }
}