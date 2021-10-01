package test;

public class ArrayInsertion{
    static int size = 0;
public static int [] insert(int [] array, int numbertoinsert, int indextoinsertat){
	//check if array is full or not.
	if(size>=array.length){
		System.out.println("Array Full!");
		return array;
	}
	
	//shift elements towards right from indextoinsertat.
	for(int i=size+1; i>indextoinsertat; i--){
		array[i] = array[i-1];
	}

	//insert the given element.
	array[indextoinsertat]=numbertoinsert;

	// increase the size of the array.
	size++; 
	
	//display array
	System.out.println("After Inserting " + numbertoinsert + " at index " + indextoinsertat + ": ");
	display(array);

	return array;
}

//function to display the array.
private static void display(int [] array){
	for(int i=0;i<array.length;i++){
		System.out.print(array[i] + " ");
	}
	System.out.println();
}

public static void main(String [] args){
	int [] array = new int[10];
	insert(array,1,0);
	insert(array,5,2);
	insert(array,56,1);
	insert(array,12,4);
	insert(array,2,6);
	insert(array,90,3);
	insert(array,16,7);
}
}