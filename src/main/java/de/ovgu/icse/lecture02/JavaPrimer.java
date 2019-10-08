package de.ovgu.icse.lecture02;

public class JavaPrimer {

    public static void main(String[] args) {
        int num = 42;
        int n=3;
        int x = 1;
        
        for (int i=1;i<=n;i++) {
            x=x*i;
        }
        System.out.println(x);
        
        //int min = minFunction(num, 2);
        //System.out.println(min);
        
        int[] numArr = {1,2,3};
        
        System.out.println(numArr[0]);
        
        int res = minFunction(numArr);
        
        System.out.println(numArr[0]);

    }
    
    public static int minFunction(int[] a) {
        
        a[0] = 42;
        return a[0];
    }
}
