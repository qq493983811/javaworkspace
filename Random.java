public class Random {
		static void printing(int a[]) {
			for(int i=0;i<100;i++) {	
				a[i]=(int)(1 + (int)(Math.random()*100));
				System.out.print(" "+a[i]);
			}
		}
		 static int maxnumber(int a[]) {
			int max=a[0];
			for(int i=0;i<100;i++)
			{
				if(max<a[i]) {
					max=a[i];
				}	
			}
			return max;
		}
		static int minnumber(int a[]) {
			int min=a[0];
			for(int i=0;i<100;i++) {
				if(min>a[i]) {
					min=a[i];
				}
			}
			return min;
		}
		static int avgnumber(int a[]){
			int sum=0,avg;
			for(int i=0;i<100;i++) {
			sum+=a[i];}
			avg=sum/100;
			return avg;
		}
	public static void main(String []args) {
		int a[]=new int[100];
		printing(a);
		System.out.println();
		System.out.println("max="+maxnumber(a));
		System.out.println("min="+minnumber(a));
		System.out.println("avg="+avgnumber(a));
	}		
		}
