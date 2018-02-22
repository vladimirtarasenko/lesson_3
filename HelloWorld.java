public class HelloWorld {
	public static void main (String[] Args) {
	
int arr[]= {12, 55, 7, 11, 9, 43, 14, 8, 32, 15};
int i;
int minvalue=arr [0];
int maxvalue=arr[0];;
for(i=0;i<10;i++) {
	if(arr[i]<minvalue) {
		minvalue=arr[i];
			}
	if(arr[i]>maxvalue){
		maxvalue=arr[i];
	}
}
	System.out.println("Мин. значение -"+minvalue);
    System.out.print("Макс. значение -"+maxvalue);
	
		
}

	
}


