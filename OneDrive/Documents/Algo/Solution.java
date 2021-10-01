package p0;

import java.util.*;
public class Solution {


    /*
    return index-order statistic
    for example in array array[] = "101, 45, 33, 22, 57, 84, 72 ,69, 90, 14"
    if index = 0, return 14
    if index = 1, return 22
    if index = 2, return 33
    if index = 3, return 45
    if index = 4, return 57
    if index = 5, return 69
    if index = 6, return 72
    if index = 7, return 84
    if index = 8, return 90
    if index = 9, return 101
    Implement using randmozinzaton where you select the pivot randomly
    
    if array is empty return -1
    if index is greater than length of array return -1
    
    Note: You will have to implement partition function that will be called by both RSelect and DSelect
    */
public static int rSelect(int num[], int start, int high, int req)
    {
       
        if (req > 0 && req <= high - start + 1)
        {           
            int temp = high-start+1;
            int randomPos = (int)(Math.random()) * (temp-1);
            int swapPos = start + randomPos;

            int pivotPos = partition(num, start, high,swapPos);

            if (pivotPos-start == req-1) return num[pivotPos];
            else if (pivotPos-start > req-1) return rSelect(num, start, pivotPos-1, req);
            return rSelect(num, pivotPos+1, high, req-pivotPos+start-1);
        }

        return -1;
    }
    public int RSelect(int array[], int index)
    {
    	// TODO: implement this function
	if(num.length==0 || num.length<req)
	{
		return -1;
	}
	return rSelect(num,0, num.length-1, req+1);
	
    	return -1;
    }
    
    
    
    /*
    return index-order statistic
    for example in array array[] = "101, 45, 33, 22, 57, 84, 72 ,69, 90, 14"
    if index = 0, return 14
    if index = 1, return 22
    if index = 2, return 33
    if index = 3, return 45
    if index = 4, return 57
    if index = 5, return 69
    if index = 6, return 72
    if index = 7, return 84
    if index = 8, return 90
    if index = 9, return 101
    Implement using median of mendian method
    
    if array is empty return -1
    if index is greater than length of array return -1
    
    Note: You will have to implement partition function that will be called by both RSelect and DSelect
    */
   public static int partition(int num[], int first, int last,int piv){
        
        exchangeElements(num,piv,last);
        
        int pivot = num[last]; 
        int i = (first-1);
        int j = first;
        
        while (j < last)
        {
            if (num[j] < pivot)
            {
                i = i+1;
                
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
            j = j+1;
        }
        
        int temp = num[i+1];
        num[i+1] = num[last];
        num[last] = temp;
 
        return ++i;
    }

 public  static void sortElements(int arr[], int start, int high)
    {
        for (int i = start; i < high-1; i++)
        {
            
            int index = i;
            for (int j = i+1; j < high; j++)
                if (arr[j] < arr[index])
                    index = j;
                    
            exchangeElements(arr,index,i);
        }   
   }
   
  public static void exchangeElements(int ar[],int pos1, int pos2){
       int temp = ar[pos1];
       ar[pos1] = ar[pos2];
       ar[pos2] = temp;
   }
 
 public static int pivotPosition(int num[], int low, int high, int pivPosition)
    {
        int temp = low;
        while(temp<=high)
        {
         if(num[temp]==pivPosition) return temp;
         temp = temp+1;
        }
        return -1;
    }
  public static int getDivLength(int length){
       if (length%5 !=0) return (length/5) + 1;
       
       return (length/5);
   }
   
 public static void arrangeElements(int num[],int temp[],int length){
       int j=0;
       for(int start=0,end=0;start < length;start = end +1)
         {
             end = start + 4;
             if(end > length) end = length-1;
             sortElements(num, start, end);
             temp[j] = num[(start + end)/2]; 
             ++j;
         }
   }
   public static int dSelect(int [] num, int length, int req, boolean check)
    {
     if (length <= 5)
     {
        int i =0;
        while(i < length-1)
        {
            
            int index = i;
            for (int j = i+1; j < length; j++)
                if (num[j] < num[index])
                    index = j;
                    
            exchangeElements(num,index,i);
            i++;
        }  
        
         if(!check) return num[req];
         else if(length%2 != 0)    return num[(length/2)];
         else return num[(length/2)-1];
     }
     else{
         int len = getDivLength(length);
        
         int temp[]= new int[len];
         arrangeElements(num,temp,length);
         
         int piv = DSelect(temp, len, length/10, true);
         int pivotIndex = pivotPosition(num, 0, length-1, piv);
         int pivotPosition = partition(num, 0, length-1, pivotIndex);
         
         if (req==pivotPosition) return piv;
         if (pivotPosition > req) return dSelect(getDivision(num, 0, pivotPosition), pivotPosition, req, false);
         else if(pivotPosition < req) return dSelect(getDivision(num, pivotPosition+1, length), length-pivotPosition-1, req-pivotPosition-1, false);
         
         return -1;
     }
     
   }
   
 public  static int[] getDivision(int num[], int start, int end){
       int temp[] = new int[end-start];
       for(int i=0;i<temp.length;i++,start++)  temp[i] = num[start];
       return temp;
   }

    public int DSelect(int array[], int index)
    {
	// TODO: implement this function
	int len = num.length;
	   if(len < req || len==0)	return -1;
    	return dSelect(num, len, req, false);
    	
    }
}

  

