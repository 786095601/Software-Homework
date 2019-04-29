import java.util.*;
public class Main {
    static String[][]world; //缓存区的游戏地图
public static void main(String[] args) {
	System.out.println("ArmyAutomatica Loaded, Ready to Launch!");
	//国际惯例欢迎标语
	Work map1 = new Work();//抽象带师展开棋盘
	world= map1.gen();            //棋盘粗线了！
	map1.print(world);          //棋盘被打印出来了！
	System.out.println("Map generated, release the Characters! Press Enter");
	new Scanner(System.in).nextLine(); //这行其实就是个回车继续= =||
	Work.spawn();
	map1.print(world);          //kono game, hajimaru！
	while (true){
		Work.run();
		map1.print(world);
		new Scanner(System.in).nextLine();
	}
}
}
class Work //开创工作序列
{
	static int X=10;
	static int Y=10;
	//这个棋盘大小的接口以后再改，目前先这样放着吧
	public String[][] gen() //初始化棋盘生成方法
	{
      String [][]a=new String[X+1][Y+1];                    //开X+1,Y+1个位置把一行一列空出来方便调整
      for(int i=1;i<=X;i++) 
      {
    	  for(int j=1;j<=Y;j++)
    	  {
    		  a[i][j]="\ud83c\ude33 ";
    	  }
      }
     return a; //把这个初始化的棋盘拿出来
	}
	public void print(String[][] map) //初始化打印方法
	{
		for(int i=1;i<=X;i++) 
	    {
	  	  for(int j=1;j<=Y;j++)
	  	  {
	  		System.out.print(map[i][j]);
	  	  }
	  	    System.out.println();
	}
	}
	public static void spawn()
	{
		Horse.spawn();
	}
	public static void run()//一轮游戏进行中
	{
		Horse.AI();
	}
}
//邪恶势力登场
class Horse
{
	static Random r = new Random();
	public static int x=(int)(Math.random()*10+1), y=(int)(Math.random()*10+1);
	public static void spawn()
	{
		Main.world[x][y] ="\ud83d\udc34 ";
	}
	public static void AI()
	{
		Main.world[x][y] ="\ud83c\ude33 ";
		if (x>1&&x<10) {
		x+=(int)((Math.random()+1)*(Math.random()<=0.5?1:-1));
		}
		else if(x<=1) {x++;}
		else {x--;}
		if (y>1&&y<10) {
			y+=(int)((Math.random()+1)*(Math.random()<=0.5?1:-1));
			}
			else if(y<=1) {y++;}
			else {y--;}
		Main.world[x][y] ="\ud83d\udc34 ";
	}
}
