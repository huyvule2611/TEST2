import java.lang.*;
import java.io.*;
import java.util.*;
public class Sort
{
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        selectionSort(arr);
        InsertSort(arr);
        bubbleSort(arr);
        

          
    }
    public static void selectionSort(int arr[])
    {
        for(int i = 0; i < arr.length -1;i++)
		{
			for(int j= i+1; j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
        }
        System.out.println("SelectSorted:");
        printArray(arr);
    }
    public static void InsertSort(int arr[])
    {
       
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
            System.out.println("InsertSorted:");
            printArray(arr);
        
    }

    public static void bubbleSort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {

				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			

		}
        System.out.println("BubbleSorted:");
        printArray(arr);
	}
}
