 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = input.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
        int hitung=0;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
             hitung +=fib[i];
        }
        System.out.println("");
        System.out.println("Output :"+ hitung);
       }   
    }
