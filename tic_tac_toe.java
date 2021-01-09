import java.util.*;
public class tic_tac_toe {
	void display(char a[][])
	{
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				if(i%2!=0&&j%2==0)
					System.out.print("-"+a[i][j]+"-");
				else if(i%2!=0&&j%2!=0)
				    System.out.print(a[i][j]);
				else if(i%2==0&&j%2!=0)
					System.out.print(a[i][j]);
				else
					System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		tic_tac_toe ob = new tic_tac_toe();
		System.out.println("*******WELCOME*******");
		System.out.print("Enter player 1 name : ");
		String p1 = in.next().toUpperCase();
		System.out.print("Enter player 2 name : ");
		String p2 = in.next().toUpperCase();
		System.out.println("some basic guide line");
		System.out.println("1.Each player choose the place where they want to make their move\n"
				+ "2.Try to make a move in that placed which is empty or you will get an error but will be given a chance to mave your move again\n"
				+"3.Make your move by using the numpad of your system\n"
				+"4.Choose no between 1-9 inclusive\n"
				+"5.You can play the game as many time as you want\nfor each win 2 point will be rewarded to winner\nin case of draw 1 point will be provided to both players\nno point will be awarded to the losing pplayer");
		System.out.println("No designated for each move is given below : ");
		System.out.println("1|2|3\n-+-+-\n4|5|6\n-+-+-\n7|8|9");
		String mp1="" , mp2="";
		char playagain;
		int fp1=0 , fp2 =0;
		do
		{
			char a[][]= {{' ','|',' ','|',' '},
					{'-','+','-','+','-'},
					{' ','|',' ','|',' '},
					{'-','+','-','+','-'},
					{' ','|',' ','|',' '}};
			ob.display(a);
			System.out.println(p1+" gets to choose heads(1) or tails(0)");
			int p1c = in.nextInt();
			int p2c = (p1c==1)?0:1;
			Random rand = new Random();
			int toss =rand.nextInt(2);
			if(toss==1)
				System.out.println("_____IT's HEADS____");
			else
				System.out.println("_____IT's TAILS____");
			int move ;
			char c1 , c2;
			if(p1c==toss)
			{
				System.out.println(p1+" gets to choose his desired letter X or O and he/she will go first");
				  c1 = in.next().charAt(0);
				 move=1;
				  c2 = (c1=='X')?'O':'X';
			}
			else
			{
				System.out.println(p2+" gets to choose his desired letter X or O and he/she will go first");
				  c2 = in.next().charAt(0);
				 move=2;
				  c1 = (c2=='X')?'O':'X';
			}
		   int count=9 , win=0 ;
		   do
		     {
     	     	if(move==1)
	     	    {
     	     		int n1 , n2 , flag=0 ;
     	     		do
     	     		{
     	     		   do
     	     		    {
		    	          System.out.print(p1+" choose your move in between 1-9 : ");
		    	           n1=in.nextInt();
     	     		    }while(n1<1&&n1>9);
     	     		   switch(n1)
     	     		   {
     	     		   case 1 :
     	     		    {
     	     			 if(a[0][0]==' ')
     	     			 {
     	     				 a[0][0]=c1;     	     				 flag=1;     	     				 mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
     	     		 case 2 :
  	     		    {
  	     			 if(a[0][2]==' ')
  	     			 {
  	     				 a[0][2]=c1;  	     				 flag=1;  	     				mp1+=String.valueOf(n1);
  	     			 }
  	     			 else
  	     				 System.out.println("Place is not empty choose wisely");
  	     		    }
  	     		    break;
     	     		case 3 :
 	     		    {
 	     			 if(a[0][4]==' ')
 	     			 {
 	     				 a[0][4]=c1;	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 4 :
 	     		    {
 	     			 if(a[2][0]==' ')
 	     			 {
 	     				 a[2][0]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 5 :
 	     		    {
 	     			 if(a[2][2]==' ')
 	     			 {
 	     				 a[2][2]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 6 :
 	     		    {
 	     			 if(a[2][4]==' ')
 	     			 {
 	     				 a[2][4]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 7 :
 	     		    {
 	     			 if(a[4][0]==' ')
 	     			 {
 	     				 a[4][0]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 8 :
 	     		    {
 	     			 if(a[4][2]==' ')
 	     			 {
 	     				 a[4][2]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		case 9 :
 	     		    {
 	     			 if(a[4][4]==' ')
 	     			 {
 	     				 a[4][4]=c1; 	     				 flag=1; 	     				mp1+=String.valueOf(n1);
 	     			 }
 	     			 else
 	     				 System.out.println("Place is not empty choose wisely");
 	     		    }
 	     		    break;
     	     		   }
     	     		}while(flag==0);
     	     		ob.display(a);
     	     		if((mp1.indexOf("1")>=0&&mp1.indexOf("2")>=0&&mp1.indexOf("3")>=0)||(mp1.indexOf("4")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("6")>=0)||(mp1.indexOf("7")>=0&&mp1.indexOf("8")>=0&&mp1.indexOf("9")>=0)||
                        (mp1.indexOf("1")>=0&&mp1.indexOf("4")>=0&&mp1.indexOf("7")>=0)||(mp1.indexOf("2")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("8")>=0)||(mp1.indexOf("3")>=0&&mp1.indexOf("6")>=0&&mp1.indexOf("9")>=0)||
                        (mp1.indexOf("1")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("9")>=0)||(mp1.indexOf("3")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("7")>=0))
                        {
	                        win=1;
	                        break;
                        }
     	     		if(count==1) break;
     	     		flag=0;
     	     		do
     	     		{
     	     		   do
     	     	     	{
		    	        System.out.print(p2+" choose your move in between 1-9 : ");
		    	        n2=in.nextInt();
     	     		    }while(n2<1&&n2>9);
     	     		 switch(n2)
   	     		   {
   	     		   case 1 :
   	     		    {
   	     			 if(a[0][0]==' ')
   	     			 {
   	     				 a[0][0]=c2;   	     				 flag=1;   	     				mp2+=String.valueOf(n2);
   	     			 }
   	     			 else
   	     				 System.out.println("Place is not empty choose wisely");
   	     		    }
   	     		    break;
   	     		 case 2 :
	     		    {
	     			 if(a[0][2]==' ')
	     			 {
	     				 a[0][2]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 3 :
	     		    {
	     			 if(a[0][4]==' ')
	     			 {
	     				 a[0][4]=c2;	     				 flag=1;	     				 mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 4 :
	     		    {
	     			 if(a[2][0]==' ')
	     			 {
	     				 a[2][0]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 5 :
	     		    {
	     			 if(a[2][2]==' ')
	     			 {
	     				 a[2][2]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 6 :
	     		    {
	     			 if(a[2][4]==' ')
	     			 {
	     				 a[2][4]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 7 :
	     		    {
	     			 if(a[4][0]==' ')
	     			 {
	     				 a[4][0]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 8 :
	     		    {
	     			 if(a[4][2]==' ')
	     			 {
	     				 a[4][2]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		case 9 :
	     		    {
	     			 if(a[4][4]==' ')
	     			 {
	     				 a[4][4]=c2;	     				 flag=1;	     				mp2+=String.valueOf(n2);
	     			 }
	     			 else
	     				 System.out.println("Place is not empty choose wisely");
	     		    }
	     		    break;
   	     		   }
     	          }while(flag==0);
     	     		ob.display(a);
     	     		if((mp2.indexOf("1")>=0&&mp2.indexOf("2")>=0&&mp2.indexOf("3")>=0)||(mp2.indexOf("4")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("6")>=0)||(mp2.indexOf("7")>=0&&mp2.indexOf("8")>=0&&mp2.indexOf("9")>=0)||
 	                        (mp2.indexOf("1")>=0&&mp2.indexOf("4")>=0&&mp2.indexOf("7")>=0)||(mp2.indexOf("2")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("8")>=0)||(mp2.indexOf("3")>=0&&mp2.indexOf("6")>=0&&mp2.indexOf("9")>=0)||
 	                        (mp2.indexOf("1")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("9")>=0)||(mp2.indexOf("3")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("7")>=0))
 	                        {
 		                        win=2;
 		                        break;
 	                        }
	     	    }
     	     		else {
     	     			int n1 , n2 , flag=0 ;
     	     			do
         	     		{
         	     		   do
         	     	     	{
    		    	        System.out.print(p2+" choose your move in between 1-9 : ");
    		    	        n2=in.nextInt();
         	     		    }while(n2<1&&n2>9);
         	     		 switch(n2)
       	     		   {
       	     		   case 1 :
       	     		    {
       	     			 if(a[0][0]==' ')
       	     			 {
       	     				 a[0][0]=c2;       	     				 flag=1;       	     				mp2+=String.valueOf(n2);
       	     			 }
       	     			 else
       	     				 System.out.println("Place is not empty choose wisely");
       	     		    }
       	     		    break;
       	     		 case 2 :
    	     		    {
    	     			 if(a[0][2]==' ')
    	     			 {
    	     				 a[0][2]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 3 :
    	     		    {
    	     			 if(a[0][4]==' ')
    	     			 {
    	     				 a[0][4]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 4 :
    	     		    {
    	     			 if(a[2][0]==' ')
    	     			 {
    	     				 a[2][0]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 5 :
    	     		    {
    	     			 if(a[2][2]==' ')
    	     			 {
    	     				 a[2][2]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 6 :
    	     		    {
    	     			 if(a[2][4]==' ')
    	     			 {
    	     				 a[2][4]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 7 :
    	     		    {
    	     			 if(a[4][0]==' ')
    	     			 {
    	     				 a[4][0]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 8 :
    	     		    {
    	     			 if(a[4][2]==' ')
    	     			 {
    	     				 a[4][2]=c2;    	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		case 9 :
    	     		    {
    	     			 if(a[4][4]==' ')
    	     			 {
    	     				 a[4][4]=c2;   	     				 flag=1;    	     				mp2+=String.valueOf(n2);
    	     			 }
    	     			 else
    	     				 System.out.println("Place is not empty choose wisely");
    	     		    }
    	     		    break;
       	     		   }
         	          }while(flag==0);
     	     			ob.display(a);
     	     			if((mp2.indexOf("1")>=0&&mp2.indexOf("2")>=0&&mp2.indexOf("3")>=0)||(mp2.indexOf("4")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("6")>=0)||(mp2.indexOf("7")>=0&&mp2.indexOf("8")>=0&&mp2.indexOf("9")>=0)||
     	                        (mp2.indexOf("1")>=0&&mp2.indexOf("4")>=0&&mp2.indexOf("7")>=0)||(mp2.indexOf("2")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("8")>=0)||(mp2.indexOf("3")>=0&&mp2.indexOf("6")>=0&&mp2.indexOf("9")>=0)||
     	                        (mp2.indexOf("1")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("9")>=0)||(mp2.indexOf("3")>=0&&mp2.indexOf("5")>=0&&mp2.indexOf("7")>=0))
     	                        {
     		                        win=2;
     		                        break;
     	                        }
     	     			if(count==1) break;
     	     			flag=0;
         	     		do
         	     		{
         	     		   do
         	     		    {
    		    	          System.out.print(p1+" choose your move in between 1-9 : ");
    		    	           n1=in.nextInt();
         	     		    }while(n1<1&&n1>9);
         	     		   switch(n1)
         	     		   {
         	     		   case 1 :
         	     		    {
         	     			 if(a[0][0]==' ')
         	     			 {
         	     				 a[0][0]=c1;         	     				 flag=1;         	     				mp1+=String.valueOf(n1);
         	     			 }
         	     			 else
         	     				 System.out.println("Place is not empty choose wisely");
         	     		    }
         	     		    break;
         	     		 case 2 :
      	     		    {
      	     			 if(a[0][2]==' ')
      	     			 {
      	     				 a[0][2]=c1;      	     				 flag=1;      	     				mp1+=String.valueOf(n1);
      	     			 }
      	     			 else
      	     				 System.out.println("Place is not empty choose wisely");
      	     		    }
      	     		    break;
         	     		case 3 :
     	     		    {
     	     			 if(a[0][4]==' ')
     	     			 {
     	     				 a[0][4]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 4 :
     	     		    {
     	     			 if(a[2][0]==' ')
     	     			 {
     	     				 a[2][0]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 5 :
     	     		    {
     	     			 if(a[2][2]==' ')
     	     			 {
     	     				 a[2][2]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 6 :
     	     		    {
     	     			 if(a[2][4]==' ')
     	     			 {
     	     				 a[2][4]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 7 :
     	     		    {
     	     			 if(a[4][0]==' ')
     	     			 {
     	     				 a[4][0]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 8 :
     	     		    {
     	     			 if(a[4][2]==' ')
     	     			 {
     	     				 a[4][2]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		case 9 :
     	     		    {
     	     			 if(a[4][4]==' ')
     	     			 {
     	     				 a[4][4]=c1;     	     				 flag=1;     	     				mp1+=String.valueOf(n1);
     	     			 }
     	     			 else
     	     				 System.out.println("Place is not empty choose wisely");
     	     		    }
     	     		    break;
         	     		   }
         	     		}while(flag==0);
         	     		ob.display(a);
         	     		if((mp1.indexOf("1")>=0&&mp1.indexOf("2")>=0&&mp1.indexOf("3")>=0)||(mp1.indexOf("4")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("6")>=0)||(mp1.indexOf("7")>=0&&mp1.indexOf("8")>=0&&mp1.indexOf("9")>=0)||
                                (mp1.indexOf("1")>=0&&mp1.indexOf("4")>=0&&mp1.indexOf("7")>=0)||(mp1.indexOf("2")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("8")>=0)||(mp1.indexOf("3")>=0&&mp1.indexOf("6")>=0&&mp1.indexOf("9")>=0)||
                                (mp1.indexOf("1")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("9")>=0)||(mp1.indexOf("3")>=0&&mp1.indexOf("5")>=0&&mp1.indexOf("7")>=0))
                                {
        	                        win=1;
        	                        break;
                                }
         	     		
     	     		}
     	     	count=count-2;
		     }while(count>0);
		   if(win==1)
		   {
			   System.out.println(p1+" WINS ");
			   fp1=fp1+2;
			   mp1=mp2="";
		   }
		   if(win==2)
		   {
			   System.out.println(p2+" WINS ");
			   fp2=fp2+2;
			   mp1=mp2="";
		   }
		   if(win==0)
			   {
			   System.out.println("DRAW");
			   fp1=fp1+1;
			   fp2=fp2+2;
			   mp1=mp2="";
			   }
		   win=0;
		   System.out.println("If you want to play again enter Y|y or else press any key");
		   playagain=in.next().charAt(0);
		}while(playagain=='Y'||playagain=='y');
		System.out.println("Final Score");
		System.out.println(p1+" score : "+fp1);
		System.out.println(p2+" score : "+fp2);
		

	}

}
