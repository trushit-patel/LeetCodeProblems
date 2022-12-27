//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        int k = 0;
        for(int i = 1 ; i < n + 1; i++){
            
            if(i%2==0){k=1;}else{k=0;}
        	for(int j = 1 ; j <= i ; j++){
        	    
        	    k++;
        	    System.out.print(String.valueOf(k%2)+" ");
        	}
        	    
        	System.out.println("");
        }
    }
}