import java.util.ArrayList;
import java.util.List;

public class Node<T>{

	private Node<T> parent;
	private T data;
	private List<Node<T>> children;

	public Node(T data){
		this.parent = null;
		this.data = data;
		this.children = new ArrayList<Node<T>>();
	}
	
	public Node(T data, Node<T> parent)
	{
		this.parent = parent;
		this.data = data;
		this.children = new ArrayList<Node<T>>();
	}

	public T getData(){
		return data;
	}

	public void addChild(T data){
		children.add( new Node<T>(data, this) );
	}

	public void addChild(T data, int pos){
		children.add( pos, new Node<T>(data,this) );
	}

	public void removeChild(int pos){
		children.remove(pos);
	}

	public Node<T> getChild(int pos){
		return children.get(pos);
	}
}
