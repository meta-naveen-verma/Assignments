
public final class Matrix {
	int[][] arr;
	int m=0,n=0;
	public Matrix(int[][] arr,int m, int n){
		if(m!=n){
			System.out.println("matrix should be square matrix");
			System.exit(0);
		}
		this.arr=arr;
		this.m=m;
		this.n=n;
	}
	public int[][] transpose(){
		int[][] trans = new int[n][m];
		//n^2
		for(int i=0;i<m;i++){    
			for(int j=0;j<n;j++){    
			trans[i][j]=arr[j][i];  
			}    
		}    
		return trans;
	}
	public boolean symmetrical(){
		//nlon(n)
		int[][] trans= this.transpose();
		for(int i=0;i<m;i++){    
			for(int j=0;j<n;j++){
				if(trans[i][j]!=arr[i][j]){
					return false;
				}
			}    
		}
		return true;
	}
	public int[][] add(int[][] arr2){
		int [][] result = new int[m][n];
		//n^2
		for(int i=0;i<m;i++){    
			for(int j=0;j<n;j++){
				result[i][j]=arr[i][j]+arr2[i][j];
			}    
		}
		return result;
	}
	public int[][] mul(int[][] arr2){
		int[][]result= new int[m][n];
		//n^3
		for(int i=0;i<m;i++){    
			for(int j=0;j<n;j++){    
				result[i][j]=0;      
				for(int k=0;k<n;k++)      
				{      
					result[i][j]+=arr[i][k]*arr2[k][j];      
				}  
			} 
		} 
		return result;
	}
}
