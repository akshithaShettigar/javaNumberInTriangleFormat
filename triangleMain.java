class triangle{
	int n;
	triangle(int n){
		this.n=n;
	}
	void display(){
		//this for loop focuses on row
		for(int i=1;i<=n;i++){
			//this for loop focuses on column but once j loop iterated then again j will increment until 			//j<=i condition become false then only i incremented
			for(int j=1;j<=i;j++){
				System.out.print(j+"");

			}
		System.out.println();

		}
	}
}
class triangleMain{
	public static void main(String args[]){
		triangle t1=new triangle(7);
		t1.display();
	}
}