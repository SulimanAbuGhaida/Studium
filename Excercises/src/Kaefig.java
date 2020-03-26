
public class Kaefig {
	
	private B Boden;
	private Gitter [] G ;
	private Hase [] H = new Hase [2];
	
	//أستطيع أن أعمل 2 كونستركوتل واحد مع حمار وواحد بدون حمار
	public Kaefig(Boden B, Gitter[] C, Hase[2] H )
	{
		setBoden(B);
		setGitter(G);
		setHase(H);
	}

	public void setBoden(Boden B) {
		this.B = B; 
	}
	

	public void setGitter(Boden G) {
		for(int i = 0 ; i<G.length; i++)
		{
			this.G[i] = G[i] ;
		}
		

		public void setHase(Hase H) {
			for(int i = 0 ; i<=1; i++)
			{
				System.out.println("please enter Gitter No. " + (i+1));
				Scanner input = new Scanner(System.in);
				B[i] = input.nextInt();
				this.H[i] =H
			}
			
			public Boden getBoden() {
					return Boden;
				}
			}
			
			public Boden getGitter() {
				for(int i = 0 ; i<4; i++) {
					return B[i]
				}
			
			public Boden getHase() {
				for(int i = 0 ; i<2; i++) {
					return H[i];
				}
				
				
				
				protected finalize() {
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
}
