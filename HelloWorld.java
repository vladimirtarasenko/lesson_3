public class HelloWorld {
	public static void main (String[] Args) {
	
int arr[]= {12, 55, 7, 11, 9, 43, 14, 8, 32, 15};
int i;
int minvalue=arr [0];
int maxvalue=arr[0];
int imin = 0;
int imax=0;
for(i=0;i<10;i++) {
	if(arr[i]<minvalue) {
		minvalue=arr[i];
		imin=i;
			}
	if(arr[i]>maxvalue){
		maxvalue=arr[i];
		imax=i;
	}
}
	arr[imin]=0;
	arr[imax]=99;

for(i=0;i<10;i++) {
	System.out.print(arr[i]+" ");
    	
}
}
}


