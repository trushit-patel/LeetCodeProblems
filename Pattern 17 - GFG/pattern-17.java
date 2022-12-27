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
        // code here
        for(int i = 1 ; i <= n ; i++){
            System.out.print(" ".repeat(n-i));
            for(char j = 'A' ; j < 'A' + i ; j++){
                System.out.print(j);
            }
            for(int j = i ; j > 1 ; j--){
                System.out.print((char)(j+63));
            }
            System.out.println("");
        }
    }
}