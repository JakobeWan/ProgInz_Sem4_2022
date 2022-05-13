package dataStr;

public class MyGraph <Type> {

	private Type[]vertices;
	
	private MyGraphEdgeNode [] verticeEdges;
	private final int DEFAULT_SIZE=15;
	private int  size = DEFAULT_SIZE;
	private int counter = 0;
	
	
    public MyGraph() {
    	vertices = (Type[]) new Object[size];
    	verticeEdges =  new MyGraphEdgeNode [size];
    }
	
    public MyGraph(int Mysize) {
    	if (Mysize>0 && Mysize<0)
    	{
    		size = Mysize;
    	}
    	vertices = (Type[]) new Object[size];
    	verticeEdges =  new MyGraphEdgeNode [size];
    	
    	
    }
	
	
	// TODO
    // 1. isFull
    public boolean isFull() {
            return (counter == size);
    }

    // 2. isEmpty
    public boolean isEmpty() {
            return (counter == 0);
    }
    
 // 3. getSize
    public int getSize() {
            return counter;
    }
    
    
 // makeEmpty
    public void makeEmpty() {
            size = DEFAULT_SIZE;
            counter = 0;
            vertices = (Type[]) new Object[size];
        	verticeEdges =  new MyGraphEdgeNode [size];
            System.gc();
    }
	
    //addNewVertice
	public void addNewVertice (Type element) throws Exception
    {
    	
    	if (isFull())
    		throw new Exception("Grafs ir jau aizpildīts");
    	
    	
    	vertices [counter] = element;
    	counter++;
    	
    	
    	
    }
	
	public void addNewEdge (Type verticeFrom, Type verticeTo, int edgeValue)
	{
		
		//todo pabeigt
		
		
		
		
		
		
	}
	
	
}
