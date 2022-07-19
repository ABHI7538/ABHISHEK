class reverse
{
	public static void num(int n)
	{
		int res=0;
		int a=n;
		while(n!=0)
		{
			int b=n%10;
			res=res*10+b;
			n=n/10;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		num(43728);
	}
}