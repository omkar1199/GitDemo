import java.util.ArrayList;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mynum =5;
		int mynum1 =6;
		int sum = mynum+mynum1;
		System.out.println(sum);
		
		String s = "a,b,c,d,e";
		
		String m=s.toUpperCase();
		int[] arr = {1,2,3,4,5,6,7,8,9,10,12};
		for(int i= 0; i<arr.length;i++)
		{
			if(arr[i]%2==0) {
			
			System.out.println(arr[i]);
			
			}
			else
				
				System.out.println(arr[i] + " no divide by 2 ");
			
		}
		
		//enhanced for loop
		for(int num:arr) {
			System.out.println(num + " - Num is printed");
		}
		
		
		System.out.println(s +" String is in lowercase");
		System.out.println(arr[2]);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Omkar");
		names.add("kunal");
		names.add("Animehs");
		//names.remove(1);
		names.add(1, "sagar");
		System.out.println(names);
		
		System.out.println("############################################");
		
		for(int i=0;i<names.size();i++) {
			String a = names.get(i);
			System.out.println(a);
		}
		
		//item is present in arraylist or not
		
		System.out.println(names.contains("Animehs"));
		

	}

}
