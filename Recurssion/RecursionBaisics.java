public class RecursionBaisics{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);

    }

    public static void printInc(int n ){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){

        if(n ==0){
            return 1;
        }
        int fnm1n = fact(n-1);
        int fn = n * fnm1n;
        return fn;
    }

    public static int sum(int n){
        if(n ==1){
            return 1;
        }
        int snmn = sum(n-1);
        int sn = n + snmn;
        return sn;
    }

    public static int fib(int n){
       if(n ==0 || n ==1){
        return n;
       }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurance(int arr[] , int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return  firstOccurance(arr,key,i+1);

    }

        public static int lastOccurance(int arr[] , int key,int i){
            if(i == arr.length){
                return -1;
            }
            int isFound = lastOccurance(arr, key , i+1);
            if(isFound == -1 && arr[i] == key){
                return i;
            }
            return isFound;

        }
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
        
    }

    public static int optimizedPower(int a , int n){
        if(n == 0){
            return 1;
        }

        //if n is even
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower; 

        //if n is odd

        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int arr[] = {3,4,5,8,5,6,8,7,8,0,7};
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr,0));
        // System.out.println(lastOccurance(arr,8,0));
        // System.out.println(power(2,10));
        System.out.println(optimizedPower(a,n));
        
    }
}