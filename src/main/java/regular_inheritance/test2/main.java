package regular_inheritance.test2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassDog fido = new SubClassDog();
		
//		does not work bc there is no constructor
//		SubClassDog cujo = new SubClassDog("Cujo", 76);
		
		fido.walk();
		
	}

}
