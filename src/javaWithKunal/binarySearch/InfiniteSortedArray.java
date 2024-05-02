package javaWithKunal.binarySearch;

public class InfiniteSortedArray
{
    static int bsearch(int[] arr, int tar,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(tar > arr[mid] )
                start = mid+1;
            else if(tar < arr[mid])
                end = mid-1;
            else return mid;
        }
        return -1;
    }
    // Simple binary search algorithm
    static int findPos(int[] arr, int tar){
        int start = 0;
        int end = 1;
        while(tar > arr[end]){
            int gap = end - start;
            start  = end+1;
            end = end + gap*2 +1;
        }

        return bsearch(arr,tar,start,end);

    }// Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170,178,234,345,346,348,456,457,567,671,672,789,890,897,898,899};

        int ans = findPos(arr,90);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
}
