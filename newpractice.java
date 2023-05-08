//coding challange schbang
import java.util.Arrays;
public class newpractice
{
	public static void main(String[] args) {
		String str = "hello_world";
		int [] freq = new int[str.length()];  //array for frequency count
		char [] arr = str.toCharArray();    
		for(int i =0; i < str.length(); i++){
			freq[i] = 1;                           // initializing the count of letter
			for(int j = i+1; j < str.length(); j++){
				if(arr[i] == arr[j]){
					freq[i]++;
					arr[j] ='0';                   // avoiding to print same letter again
				}
			}
		}
		//sorting the characters with there frequency count 
		for (int i = 0; i < freq.length - 1; i++) {
            for (int j = i + 1; j < freq.length; j++) {
                if (freq[i] < freq[j]) {
                    int tempFreq = freq[i];     //shorting the frequency 
                    freq[i] = freq[j];
                    freq[j] = tempFreq;
                    char tempChar = arr[i];     // shorting the character
                    arr[i] = arr[j];
                    arr[j] = tempChar;
                }
            }
        }
        
        // print characters and their frequency counts
        for (int i = 0; i < freq.length; i++) {
            if (arr[i] != ' ' && arr[i] != '0') {
                System.out.println(arr[i] + ": " + freq[i]);
            }
        }
	}
}
