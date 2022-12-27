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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        for(int i = 1 ; i < n + 1 ; i++){
            if(i== 1 || i==n){
                System.out.print("*".repeat(n));
                System.out.println("");
            }else{
                System.out.print("*");
                System.out.print(" ".repeat(n-2));
                System.out.print("*");
                System.out.println("");
            }
        }
    }
}