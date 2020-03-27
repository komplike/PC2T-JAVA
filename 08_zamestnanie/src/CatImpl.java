import java.io.Serializable;

public class CatImpl implements Animal, Serializable{

	private static final long serialVersionUID = 1L;
	public CatImpl(byte age) {
		this.age=age;
	}
	@Override
	public void sound() {
		System.out.println("The sound of cat.");
	}
	private byte age;
	@Override
    public String toString() {
        return new StringBuffer("Animal: Cat").append(" , Age: ").append(this.age).append(", Sound : Meow.").toString();
    }
}
