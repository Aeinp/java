package exam;

class A3 
{ 
    static final int n = 5; 
    static void printSumSimple(int mat[][], int k) 
    { 
  
        if (k > n) return; 
          
         
        for (int i = 0; i < n-k+1; i++) 
        { 
          for (int j = 0; j < n-k+1; j++) 
            { 
                int sum = 0; 
                for (int p = i; p < k+i; p++) 
                    for (int q = j; q < k+j; q++) 
                        sum += mat[p][q]; 
  
                System.out.print(sum+ " "); 
            } 
            System.out.println(); 
        } 
    } 
      
    public static void main(String arg[]) 
    { 
        int mat[][] = {{1, 1, 1, 1, 1}, 
                       {2, 2, 2, 2, 2}, 
                       {3, 3, 3, 3, 3}, 
                       {4, 4, 4, 4, 4}, 
                       {5, 5, 5, 5, 5}}; 
        int k = 3; 
        printSumSimple(mat, k); 
    } 
} 
