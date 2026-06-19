//Binary Search using Java.
//The algorithm searches through an array and returns index of the value.
//This can work only with a sorted array.
//Time complexity is log n (base 2) for binary search only.
//This code uses bubble sort therefore the time complexity is n^2 because that is the worst case.


import java.util.Scanner;

public class BinarySearch {

    // Sorting the user-given array first using bubble sort.

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array: ");
        int arraySize = sc.nextInt();
        int[] myArray = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        for(int element=0; element<arraySize; element++){
            myArray[element] = sc.nextInt();
        }
        

        System.out.print("Array before sorting: ");
        for(int element=0; element<arraySize; element++){
            System.out.print(myArray[element] + " ");
        }

        for (int i=0; i<arraySize;i++){
            for (int j=0; j<arraySize-1;j++){
                if (myArray[j] > myArray[j+1]){
                    int tempNum= myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempNum;
                }
            }
        }

        System.out.print("\nArray after sorting: ");
        for(int element=0; element<arraySize; element++){
            System.out.print(myArray[element] + " ");
        }

        int [] sortedArray = myArray;


        //Element to be searched

        System.out.println("\nEnter the element you want to find the index of: ");
        int findElement= sc.nextInt();

        int firstIndex = 0;
        int lastIndex = arraySize - 1;

        //Conditions to search for the element.
        //Binary search works by halving its sample space.

        while (firstIndex <= lastIndex){
            int midIndex = (firstIndex + lastIndex)/2;

            if (sortedArray[midIndex] == findElement){
                System.out.println("Element found at index: " + midIndex);
                break;
            } 
             else if (sortedArray[midIndex] < findElement){
            firstIndex = midIndex + 1;
            }
            else if (sortedArray[midIndex] > findElement){
            lastIndex = midIndex - 1;
            }
            else{
            System.out.println("Element not found in the array.");
            }


        }

        

        sc.close();




    }
}
