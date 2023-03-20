import java.util.Arrays;
import java.util.Random;

/*
The general approach is correct, but there will be one fewer pass.
For five elements in an array, the algorithm will only need four loops to be sorted.
 */
public class M15_PracticeQuestion_1 {
	
	public static void main(String[] args) {

		Random generator = new Random();
		Integer[] numbers = new Integer[100000];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = generator.nextInt(100);
		}
		
//		System.out.println(Arrays.toString(numbers));
//		selectionSort(numbers);
//		System.out.println(Arrays.toString(numbers));
		
/*		Student s1 = new Student("Jane Doe", "K123", 4000);
		Student s2 = new Student("Sam Smith", "A654", 4000);
		Student s3 = new Student("Al Adams", "Z777", 4000);
		Student s4 = new Student("Ray Jones", "Q519", 4000);
		Student[] students = {s1, s2, s3, s4};
		System.out.println(Arrays.toString(students));
		insertionSort(students);
		System.out.println(Arrays.toString(students));
	*/


        Comparable intArray[] = {12,14,7,4,1};
        Comparable intArray2[] = {5,4,3,2,1};

        System.out.println("For {12,14,7,4,1}");
        selectionSort(intArray);
        System.out.println();
        System.out.println("For {5,4,3,2,1}");
        selectionSort(intArray2);


    }
	
	public static void selectionSort(Comparable[] array) {
		for (int index=0; index<array.length; index++) {
			Comparable currentMin = array[index];
			int indexOfMin = index;
			
			for(int j=index+1; j<array.length; j++) {
				if(array[j].compareTo(currentMin) < 0) { 
					// array[j] smaller than currentMin
					currentMin = array[j];
					indexOfMin = j;
				}
			}
			swap(array, index, indexOfMin);
            System.out.println(Arrays.toString(array));

        }
	}

	/* helper method */
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void insertionSort(Comparable[] array) {
		for (int index = 1; index < array.length; index++) {
			Comparable firstUnsorted = array[index];

			int position = index;
			while (position > 0 && 
				firstUnsorted.compareTo(array[position - 1]) < 0) {
				
				array[position] = array[position - 1]; // make room (shift)
				position--;
			}
			array[position] = firstUnsorted; // insert
		}
	}
}






