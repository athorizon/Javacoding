import java.util.Arrays;

public class Hindex {
    public static int hIndex(int[] citations) {
        if(citations.length==1){
            if(citations[0]>0){
                return 1;
            }else{
                return 0;
            }}
        
        Arrays.sort(citations);
        int start = 0, end = citations.length-1;
        // System.out.println(Arrays.toString(citations));
        int index=-1;
        while(start<=end){
            int mid = (end+start)/2;
            System.out.println("checking element: "+citations[mid]+" at index: "+mid+" with length: "+(citations.length-mid));
            if(citations[mid]>=citations.length-mid){
                index = citations.length-mid;
            
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
            return index;
    }
    public static int hIndex1(int[] citations) {
        if(citations.length==1){
            if(citations[0]>0){
                return 1;
            }else{
                return 0;
            }}
        
        Arrays.sort(citations);
        int start = 0, end = citations.length-1;
        // System.out.println(Arrays.toString(citations));
        int mid=0;
        while(start<=end){
            mid = (end+start)/2;
            // System.out.println("checking element: "+citations[mid]+" at index: "+mid+" with length: "+(citations.length-mid));
            if(citations[mid]>=citations.length-mid){
                if(mid==0){
                    return citations.length;
                }
                if(mid!=0 && citations[mid-1]<citations.length-mid+1){
                    // System.out.println("found the target at: "+mid);
                    return citations.length-mid;
                }
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        // System.out.println("returning after while loop");
            return 0;
    }
    public static int hIndex2(int[] arr){
        int[] count = new int[arr.length+1];
        int i=0;
        while(i<arr.length){
            if(arr[i]>=arr.length){
                count[arr.length]++;
            }else{
                count[arr[i]]++;
            }
            i++;
        }
        System.out.println(Arrays.toString(count));
        int n=arr.length;
        int hindex = count[arr.length];
        while(hindex<n){
            // System.out.println("Hindex: "+hindex+" n: "+n+" count[n]: "+count[n]);
                hindex=hindex+count[n];
                n--;
        }
        return n;
    }
    public static void main( String arg[]){
        int arr[] = {6,5,3,0,1};
        System.out.println(hIndex2(arr));
    }


        
}
