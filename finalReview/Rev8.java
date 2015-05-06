package finalReview;
import java.util.*;
public class Rev8 {

//	public static void main(String[] args) {
//		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
//        int[] output = removeDuplicates(input1);
//        for(int i:output){
//            System.out.print(i+" ");
//        }
//	}
//	public static int[] removeDuplicates(int[] input){
//         
//	        int j = 0;
//	        int i = 1;
//	        //return if the array length is less than 2
//	        if(input.length < 2){
//	            return input;
//	        }
//	        while(i < input.length){
//	            if(input[i] == input[j]){
//	                i++;
//	            }else{
//	                input[++j] = input[i++];
//	            }  
//	        }
//	        int[] output = new int[j+1];
//	        for(int k=0; k<output.length; k++){
//	            output[k] = input[k];
//	        }
//	         
//	        return output;
//	    }
//
//}
	//In terms of efficiency though, it's terrible. How important that is only matters on how it's marked
	public static ArrayList<Integer> deleteDuplicates (ArrayList <Integer> list) 
	{
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) 
		{
			newList.add(list.get(i)); 
			for (int k = 0; k < list.size(); k++)
			{
				if (list.get(k) == newList.get(i) && i!=k)
				{ 
					list.remove(k); 
					}
				}
			}
		return list; 
		}
		public static void main (String [] args) 
		{
		ArrayList <Integer> list = new ArrayList<Integer>(); 
		list.add(3); 
		list.add(4); 
		list.add(7); 
		list.add(3); 
		list.add(7); 
		list.add(9); 
		ArrayList <Integer> list2 = deleteDuplicates(list); 
		System.out.println(list2); 
		} 
		}