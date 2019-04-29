package chessBoard;

public class Space {
	static int X=10;
	static int Y=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char [][]a=new char[X+1][Y+1];                    //开X+1,Y+1个位置把一行一列空出来方便调整
      for(int i=1;i<=X;i++) 
      {
    	  for(int j=1;j<=Y;j++)
    	  {
    		  a[i][j]='*';
    	  }
      }
      
      
      //下面测试
	for(int i=1;i<=X;i++) 
    {
  	  for(int j=1;j<=Y;j++)
  	  {
  		System.out.print(a[i][j]);
  	  }
  	    System.out.println();
    }
}

}
