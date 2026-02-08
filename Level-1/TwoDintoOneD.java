class TwoDintoOneD{
	public static void main(String[] args){
		int arr2D[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=arr2D.length;
		int col=arr2D[0].length;
		int[] arr1D=new int[row*col];
		int index=0;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr1D[index++]=arr2D[i][j];
			}
		}
		for(int k=0;k<index;k++){
			System.out.println(arr1D[k]);}
	}	
}