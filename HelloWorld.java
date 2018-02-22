public class HelloWorld {
	public static void main (String[] Args) {
	
int digit=123452;
String digit1=Integer.toString(digit);
int count=0;
int i;
char[] arr=digit1.toCharArray();
for(i=0;i<arr.length-1;i++) {
if(arr[i+1]>arr[i]) {
	count++;
}
}
if(count==arr.length-1) {
	System.out.println("Цифры образуют возрастающую последовательность");
}
else {
	System.out.println("Цифры не образуют возрастающую последовательность");
	}
}		
}



