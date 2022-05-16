import java.util.*;
public class Principal {
	public static void main(String[]args) {
		List<Node> Personas = new ArrayList<>();
		Personas.add(new Node(new Lista("Maria",27,2000)));
		Personas.add(new Node(new Lista("Pedro",32,3000)));
		Personas.add(new Node(new Lista("Osbaldo",28,1500)));
		
		Personas.get(0).root();
		Personas.get(1).data();
	}
}
