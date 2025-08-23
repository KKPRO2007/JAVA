package Constructor;
public class Con_display {
	int a;
	int b;
	Con_display()
	{
		this(4,5);
		System.out.println("a= "+a+" "+"b= "+b);
	}
	Con_display(int a){
		this.a=a;
		
		System.out.println("a="+a+" "+"b= "+b);
	}
	
	Con_display(int a, int b){
		this.a=a;
	this.b=b;
	System.out.println("a="+a+" "+"b="+b);
	}
void display()
{
	System.out.println(a+b);
}
	
	public static void main(String[] args) {
		Con_display g1= new Con_display();
		Con_display g2= new Con_display(3);
		Con_display g3= new Con_display(6,7);
		g1.display();
		g2.display();
		g3.display();
		
		

	}
	}


