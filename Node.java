public class Node<T> {
	public Node(T nuevo){
		datos=nuevo;
	}
	public void setDatos(T nuevoValor) {
		datos=nuevoValor;
	}
	public T data() {
		return datos;
	}
	public T root() {
		return datos;
	}
	
	private T datos;
}
