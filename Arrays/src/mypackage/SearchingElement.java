package mypackage;

public class SearchingElement {
public static void main(String[] args) {
	int SearchNumber=8;
	int a[]= {5,9,9,1,8,6,9};
	for(int i=0;i<a.length;i++) {
		if(a[i]==SearchNumber) {
			System.out.println("number found "+i);
			System.exit(0);
		}
			
	}
	System.out.println("number not found ");
}

		
	

}




