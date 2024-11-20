package mypackage;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,4,55,23};
		int max2;
		int max1=max2=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(max1<a[i]) {
				max2=max1;
				max1 = a[i];
		//	System.out.println(max1);	
				
			}else if(max2<a[i])
			{
				max2=a[i];
				//System.out.println(max2);
			}
		//	System.out.println(max2);
		}
		System.out.println(max2);
	}

}
