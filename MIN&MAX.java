import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int size;
    System.out.print("enter the Size");
    size = input.nextInt();
    
    int[] a = new int[size];
    
    int i = 0;
    while(i<a.length){
        System.out.print("position " + (i+1)+": "+i);
        a[i]=input.nextInt();
        i++;
    }
    
    int min = min(a);
    int max = max(a);
    System.out.print("minimum value is: "+min);
    System.out.print("Maximum value is: "+max);
    }
    
    public static int min(int[] a){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i<a.length){
            if(min>a[i]){
            min = a[i];
            }
            i++;
        }
        return min;
    }
    
    
    public static int max(int[] a){
        int max = a[0];
        int i = 0;
        while(i<a.length){
            if(max<a[i]){
                max =a[i];
            }
            i++;
        }
        return max;
    }
}
