public class HelloWorld {
	public static void main (String[] Args) {
	
int arr[]= {14, 55, 7, 12, 9, 8, 14, 10, 32, 12};
int i;
int temp;
int arrmiddle=arr.length/2;
int arrlength=arr.length-1;
for(i=0;i<10;i++) {
	System.out.print(arr[i]+" ");
}
for(i=0;i<arrmiddle;i++) {
	temp=arr[i];
	arr[i]=arr[arrlength-i];
	arr[arrlength-i]=temp;
}
System.out.println();
for(i=0;i<10;i++) {
	System.out.print(arr[i]+" ");
}		
}
}



