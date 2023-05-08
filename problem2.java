//coding challange schbang

public class problem2
{
	public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int odd=1,even=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                even += arr[i];
            }
            else{
                odd = odd * arr[i];
            }
        }
        System.out.println("Even sum= "+ even+ " odd product= "+odd);
    }
}

