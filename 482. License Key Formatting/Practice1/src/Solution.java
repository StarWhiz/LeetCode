
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String output = new String();
        int groupCounter = 0;
        
        S = S.replaceAll("-", "");
        S = S.toUpperCase();
        
        // Case where string is smaller than K
        if (S.length() < K) {
            for (int i = 0; i < S.length(); i++){
                char c = S.charAt(i); 
            	output = output + c;
            }
        }
        // Case no need for odd first group
        else if (S.length() % K == 0) {         
            for (int i = 0; i < S.length(); i++){
                char c = S.charAt(i); 
                
                if (groupCounter >= K) {
                    output = output + '-';
                    groupCounter = 0; 
                    output = output + c;
                    groupCounter++;
                }
                else {
                    groupCounter++;
                    output = output + c;
                }   

            }
        }
        // Case need for odd first group
        else {
        	int firstGroupSize = S.length() % K;
            for (int i = 0; i < firstGroupSize; i++){
            	char c = S.charAt(i); 
            	output = output + c;
            }
                output = output + '-';
            for (int i = firstGroupSize; i < S.length(); i++){
            	char c = S.charAt(i); 	
                if (groupCounter >= K) {
                    output = output + '-';      
                    groupCounter = 0;
                    output = output + c;
                    groupCounter++;
                }
                else {
                    output = output + c;
                    groupCounter++;
                }              
            }
        }    
        return output;
    }
}

