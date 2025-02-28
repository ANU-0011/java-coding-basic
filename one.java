import java.util.*;
public class one{
   /*  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticExceptionrith E){
            System.out.println("b is 0");
        }
    }*/

    /*//public class SumOfArray {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of elements: " + sum);
        }
    }




    min value in the array
    public static void main(String[] args){
        int array[]={2,3,4,5,1};
        int min=array[0];
        for(int i=0;i<array.length;++i){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}



sum and avg
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        double average;
        for(int num:arr){
            sum=sum+num;
        }
        System.out.println(sum);
        int arrlen=arr.length;
        average = ((double)sum /(double)arrlen);
        System.out.println(average);
    }
}


min value of an array


    public static void main(String[] args){
        int arr[]={5,43,34,3,2,7,8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}



max val of array
    public static void main(String[] args){
        int arr[]={5,43,34,3,2,7,8};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}


table
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=0;i<=10;i++){
            int a=num*i;
            if(a%2==0){
                System.out.println(num+"*"+i+"="+a);
            }
            
        }
    }
    
}


*/
    public static void main(String[] args){
        int arr[]={2,2,3,4,5,6,7,8,9,9,9,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
                 
            }
        }
    }
}