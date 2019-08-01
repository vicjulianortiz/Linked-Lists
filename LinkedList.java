class LinkedList{
	private Node head;
	private Node tail;
	private int length;

	public LinkedList()
	{
		head = null;
		tail = null;
		length = 0;
	}

	public void insertCarToFront(int door, String make){
		CarNode link = new CarNode(door, make, null, null);

		if(head == null){
			head = link;
			tail = head;
		}
		else{
			head.setPrevious(link);
			link.setNext(head);
			head = link;
		}
		length++;
	}

	public void insertPlaneToFront(int door,int engine, String type){
		PlaneNode link = new PlaneNode(door, engine, type, null, null);

		if(head == null){
			head = link;
			tail = head;
		}
		else{
			head.setPrevious(link);
			link.setNext(head);
			head = link;
		}
		length++;
	}

	public void insertCarToRear(int door, String type){
		CarNode link = new CarNode(door, type, null, null);

		if(head == null){
			head = link;
			tail = head;
		}
		else
		{
			link.setPrevious(tail);
			tail.setNext(link);
			tail = link;
		}
		length++;
	}

	public void insertPlaneToRear(int door, int engine, String type){
		PlaneNode link = new PlaneNode(door, engine, type, null, null);

		if(head == null){
			head = link;
			tail = head;
		}
		else
		{
			link.setPrevious(tail);
			tail.setNext(link);
			tail = link;
		}
		length++;
	}

	public void deleteNode(int pos){

		if(pos == 1){
			head = null;
			tail = null;
			length = 0;
		}
		else if(pos == length){
			tail = tail.getPrevious();
			tail.setNext(null);
			length--;
		}
		else{
			Node link = head;

			for(int i = 2; i <= length; i++){
				link = link.getNext();

				if(i == pos){
					Node next = link.getNext();
					Node prev = link.getPrevious();

					next.setPrevious(prev);
					prev.setNext(next);
					length--;
				}
			}
		}
	}

	/*Searches for items from front to rear, to find first appearance*/
	public int findFirstItem(String type){
		Node tempNode = head;
		int position = 1;
		while(tempNode.getVehicleMake() != type)
		{
			if(position < length){
			tempNode = head.getNext();
			position++;
			}
			else if(position == length){
				if(tempNode.getVehicleMake() != type)
					System.out.println("There is no node in the list with this value.");
			}
		}
		return position;
	}

	public int getLength(){
		return length;
	}


	public void printList(){
			Node tempNode = head;
			int position = 1;

			if(position > length){
				System.out.println("The list is empty");
			}

			while(position <= length){
				try{
					if(tempNode.getVehicleMake() != null)
						System.out.print("Vehincle make: " + tempNode.getVehicleMake() + "\t");
					if(tempNode.getNumOfDoors() != 0)
						System.out.print("Number of doors: " + tempNode.getNumOfDoors() + "\t");
					if(tempNode.getNumOfEngines() != 0)
						System.out.print("Number of engines: " + tempNode.getNumOfEngines() + "\t");
				}
				catch(Exception e){
					System.out.println("There was an error printing.");
				}
				position++;

				System.out.println();
				tempNode = tempNode.getNext();
			}
		}

}

