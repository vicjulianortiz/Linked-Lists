class Node{
	private String vehicleMake;
	private int numOfDoors, numOfEngines;
	private Node next, prev;

	public Node(){
		vehicleMake = null;
		numOfDoors = 0;
		numOfEngines = 0;
		next = null;
		prev = null;
	}

	public Node(int door, String make, Node n, Node p){
		numOfDoors = door;
		vehicleMake = make;
		next = n;
		prev = p;
	}

	public Node(int door, int engine, String make, Node n, Node p){
		numOfDoors = door;
		numOfEngines = engine;
		vehicleMake = make;
		next = n;
		prev = p;
	}
	public void setNext(Node n){
		next = n;
	}

	public void setPrevious(Node p){
		prev = p;
	}

	public void setVehicleMake(String make){
		vehicleMake = make;
	}

	public void setDoors(int door){
		numOfDoors = door;
	}

	public void setEngines(int engine){
		numOfEngines = engine;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrevious(){
		return prev;
	}

	public String getVehicleMake(){
		return vehicleMake;
	}

	public int getNumOfDoors(){
			return numOfDoors;
	}

	public int getNumOfEngines(){
			return numOfEngines;
	}
}

class CarNode extends Node{
	private int numOfDoors = 0;

	public CarNode(int door, String make, Node n, Node p){
		super(door, make, n, p);
		numOfDoors = door;
	}
	public void setDoors(int door){
		numOfDoors = door;
	}

	public int getNumOfDoors(){
		return numOfDoors;
	}
}

class PlaneNode extends Node{
	private int numOfDoors = 0;
	private	int numOfEngines = 0;

	public PlaneNode(int door, int engine, String make, Node n, Node p){
		super(door, engine, make, n, p);
		numOfDoors = door;
		numOfEngines = engine;
	}

	public void setDoors(int door){
		numOfDoors = door;
	}

	public void setEngines(int engine){
		numOfEngines = engine;
	}

	public int getNumOfDoors(){
		return numOfDoors;
	}

	public int getNumOfEngines(){
		return numOfEngines;
	}
}

