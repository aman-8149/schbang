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
		
		for(int i =0; i < freq.length; i++){
			if(arr[i]!=' ' && arr[i]!='0'){
				int max = freq[0];
				if(max <= freq[i] ){
					System.out.println(arr[i]+": "+freq[i]);
					max = freq[i];
				}
				else if(max > freq[i]){
					System.out.println(arr[i]+": "+freq[i]);
					max = freq[i];
				}
			}
		}
	}
}

