package mypackage;

public class MaxiumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,4,5,88};
int max=0;
for(int i=0;i<a.length;i++) {
	if (a[i]>max) {
		
		max=a[i];
	}
	
}
System.out.println("maxium number "+max);
	}

}
