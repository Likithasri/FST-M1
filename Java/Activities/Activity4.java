package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int[] sort= {10,40,30,20,15};
		
		int slength=sort.length;
		
		for(int i=0;i<slength;i++) {	
			for(int j=i+1;j<slength;j++) {
				if(sort[i]>sort[i+1]) {
					temp=sort[i];
					sort[i]=sort[i+1];
					sort[i+1]=temp;
				}
				
			}
		}
		
		

	}

}
