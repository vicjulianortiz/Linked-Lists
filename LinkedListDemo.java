public class LinkedListDemo{
	public static void main(String[] args){
		LinkedList userList = new LinkedList();

		userList.insertCarToRear(4, "Ford");
		userList.insertCarToFront(2, "Ford");
		userList.insertCarToRear(2, "GMC");
		userList.insertCarToRear(2, "RAM");
		userList.insertCarToFront(3, "Chevy");

		System.out.println("The list contains " + userList.getLength() + " items.");
		userList.printList();

		int firstFordPosition = userList.findFirstItem("Ford");
		userList.deleteNode(firstFordPosition);

		System.out.println("\nThe list now contains " + userList.getLength() + " items.");
		userList.printList();

		userList.insertPlaneToFront(3, 6, "Boeing");
		userList.insertPlaneToFront(2, 1, "Piper");
		userList.insertPlaneToFront(4, 4, "Cessna");

		System.out.println("\nThe list now contains " + userList.getLength() + " items.");
		userList.printList();
	}
}
