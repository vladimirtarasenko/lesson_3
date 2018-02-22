public class HelloWorld {
	public static void main (String[] Args) {
	
int arr[]= {12, 55, 7, 12, 9, 8, 14, 8, 32, 12};
int i;
int counts=1;
int digit=0;
int j;
for(i=0;i<9;i++) {
	if(arr[i]!=digit) {
	for(j=i+1;j<10;j++) {
		if(arr[i]==arr[j]) {
		counts++;
		digit=arr[i];	
				}		
			}
	if(counts!=1) {
		System.out.println("["+digit+"]"+"встречается" +counts+ " раз");
	}
	}	
	counts=1;	  	
}
}
}


