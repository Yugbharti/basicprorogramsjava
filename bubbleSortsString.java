public class bubbleSortsString {
    public static void printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        String[] arr = {"delhi","goa","punjab","manipur","thiruvantapuram"};
        //bubble sort 
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    //swap
                    String temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        printArray(arr);
    }
    
}
