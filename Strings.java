import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        String[] array = new String[size];
        int total=0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextLine();
            total+=array[i].length();
        }
        System.out.println(total);
    }
    
}
