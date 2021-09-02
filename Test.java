import java.lang.*;
import java.io.*;
import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		// array add, nhưng không khả quan lắm
		int[] a= {0};
		a = Arrays.copyOf(a,a.length +1);
		a[a.length -1] = 1;
		a = Arrays.copyOf(a,a.length +1);
		a[a.length -1] = 2;
		a = Arrays.copyOf(a,a.length +1);
		a[a.length -1] = 3;

		for(int i =0;i< a.length; i++)
		{
			System.out.print(a[i]);
		}

		System.out.println();
		
		// Sắp xếp Array tăng dần
		int[] array = {0,8,5,10,1,55,12,4,5};
		for(int i = 0; i< array.length -1;i++)
		{
			for(int j= i+1; j<array.length;j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for(int i =0; i< array.length;i++){
			System.out.print(array[i]+ " ");
		}


		System.out.println();
		// Sắp xếp Aray tăng dần
		int[] array2 = {0,8,5,10,1,55,12,4,5};
		for(int i = 0; i< array2.length -1;i++)
		{
			for(int j= i+1; j<array2.length;j++)
			{
				if(array2[i] < array2[j])
				{
					int temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}
		for(int i =0; i< array2.length;i++){
			System.out.print(array2[i]+ " ");
		}

		System.out.println();
		 //List : thao tác
		ArrayList<String> dongvat = new ArrayList<>();
		dongvat.add("Lion King");
		dongvat.add("Tiger Beer ");
		dongvat.add("Pink Panther");

		for(int i = 0; i< dongvat.size();i++)
		{
			String tam = dongvat.get(i);
			System.out.println(tam);
		}
		// xóa element
		boolean dongvatloai = dongvat.remove("Pink Panther");
		if(dongvatloai == true)
		{
			System.out.println("Pink Panther has removed");
		}
		else
		{
			System.out.println("Pink Panther doesn't in this List");
		}

		// addAll phần tử List
		List<String> pet = new ArrayList<>();
		pet.add("Cat");
		pet.add("Dog");
		pet.add("Hamter");

		System.out.println(pet);
		dongvat.addAll(pet); 
		// tương tự nếu removeAll(pet) thì các con pet có trong động vật sẽ bị xóa
		System.out.println(dongvat);

		// Tạo một Array list
        ArrayList<String> thuNuoi = new ArrayList<>(Arrays.asList("Dog", "Cat", "Hamter"));
        System.out.println("Pet: " + thuNuoi);

        // Xóa tại vị trí
        String thu = thuNuoi.remove(2);
        System.out.println("Pet: " + thuNuoi);
        System. out.println("Removed :" + thu);

        // vòng lặp forEach của Java
        for (String tam : thuNuoi) {
            System.out.println(tam);
        }

        // Sử dụng Collections để sort hay change phần tử
        Collections.sort(dongvat);
        System.out.println("dong vat sort :" + dongvat);

        Collections.swap(dongvat,2,3);
        System.out.println("dong vat swap :" + dongvat);
	}
}