import java.util.*;

public class QuickSort{
	
	private static int c=0;
	public static void main(String [ ]args ){
	
		int [] arr = {87,43,813,74,821,34,8,73,48,732,76,32,874,32,17,13,87,21,83,72,18,3,17,23,82,173,821,73,2371};
		
		int begin = 0; 
		int end = arr.length-1;	
		sort(arr, begin, end ); 
			
		System.out.println(Arrays.toString(arr)); 
		System.out.println("c="+c);
	}

	public static void sort(int [] arr, int begin, int end){
		int i=begin;
		int j=end; 
		int styIndex = begin; 
		for(;i<j;){
			for( ;i<j ; j-- ){
				if( arr[j] < arr[styIndex] ){
					c++;		
					int temp = arr[j];
					arr[j] = arr[styIndex];
					arr[styIndex] = temp;  
					styIndex = j; 
					break; 
				}
			}
			for( ; i<j ; i++){
				if( arr[i] > arr[styIndex] ){
					c++;
					int temp = arr[i];
					arr[i] = arr[styIndex]; 
					arr[styIndex] = temp;
					styIndex = i;
					break; 
				}
			}
		}
		//begin       styIndex-1   styIndex   styIndex+1   end 
		if( begin<styIndex-1 ) {
			sort(arr, begin, styIndex-1 ); 
		} 
		if( styIndex+1<end ){
			sort(arr, styIndex+1, end ); 
		}
	}
}
