import java.util.Arrays;

public class HelloWorld {
	public static void main (String[] Args) {
int[] arr=new int [20];
int i;
for(i=0;i<20;i++) {
	arr[i]=(int)(Math.random()*100);
	System.out.print(arr[i]+" ");
}
	Arrays.sort(arr);	
	System.out.println();
	for(i=0;i<20;i++) {
		System.out.print(arr[i]+" ");
	}
	}		
}



