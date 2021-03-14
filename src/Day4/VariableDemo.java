package Day4;

public class VariableDemo {
	public static void main(String[] args) {
		ClassRoom Rohanroom= new ClassRoom();
		ClassRoom Aryaroom= new ClassRoom();
	}
}


class ClassRoom{
	static Canteen canteen = new Canteen();
	Projector projector = new Projector();
}

class Projector{
	public Projector() {
		System.out.println("projecter created");
	}
}

class Canteen{
	public Canteen() {
		System.out.println("canteen created");
	}
}