
public class KaefigFinn {
	
	public class Kaefig {
		
		private B Boden;
		
		Gitter[] G;
		Hase[] H ;
		
		
		public Kaefig(Boden B, Gitter[] G, Hase[] H )
		{
			setBoden(B);
			setGitter(G);
			setHase(H);
		}

		public void setBoden(Boden B) {
			this.B = B; 
		}
		

		public void setGitter(Gitter G[]) {
			this.G = G; 
		}
			

			public void setHase(Hase H[]) {
					this.H =H; 
				}
				
				public Boden getBoden() {
						return B;
					}
				
				
				public Gitter getGitter() {
				return G; 
			}
				
				public Hase getHase() {
				return H; 
			}
	}
	protected finalize ()
	{
		
	}

}
