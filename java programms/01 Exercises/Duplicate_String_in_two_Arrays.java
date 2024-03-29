import java.util.*;

public class Duplicate_String_in_two_Arrays {

	public static void main(String[] args) {
		String[] array1 = { "chiku", "aman", "rohan", "ram", "mohan", "ali" };

		String[] array2 = { "rohan", "Aman", "Ali", "dangi", "pinku", "Mohan"  };


		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					set.add(array1[i]);
				}
				if (array1[i].equalsIgnoreCase(array2[j])) {
					System.out.println(array1[i] + " is dulpicat of " + array2[j]);
					//System.out.println("the difference is only of cases");
				}
			}
		}

		System.out.println("Common element : " + (set)); 
	}
}
/*output:
Array1 : [chiku, aman, rohan, ram, mohan, ali]
Array2 : [rohan, Aman, Ali, dangi, pinku, Mohan]
aman is dulpicat of Aman
rohan is dulpicat of rohan
mohan is dulpicat of Mohan
ali is dulpicat of Ali
Common element : [rohan]
*/