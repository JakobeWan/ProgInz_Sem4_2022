package dataStr;

public class MyGraphEdgeNode {
	
	private int indexOfNeighbour;
	private int edgeValue;
	private MyGraphEdgeNode next = null;
	
	public int getIndexOfNeighbour() {
		return indexOfNeighbour;
	}
	public void setIndexOfNeighbour(int indexOfNeighbour) {
		this.indexOfNeighbour = indexOfNeighbour;
	}
	public int getEdgeValue() {
		return edgeValue;
	}
	public void setEdgeValue(int edgeValue) {
		this.edgeValue = edgeValue;
	}
	public MyGraphEdgeNode getNext() {
		return next;
	}
	public void setNext(MyGraphEdgeNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "MyGraphEdgeNode [indexOfNeighbour=" + indexOfNeighbour + ", edgeValue=" + edgeValue + "]";
	}
	
	
	
	
	
	
	

}
