import java.util.*;
class printfact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println("the factprial of "+num+" is "+sum);

    }
}