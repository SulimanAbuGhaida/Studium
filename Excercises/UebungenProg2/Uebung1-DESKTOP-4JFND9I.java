import java.io.FileWriter;

public class Uebung1 {
	public static void main(String[] args) {
		
		
		String text;
		
		FileWriter datei = new FileWriter("ausgabe.txt");
		
		text = "1\n";
		for(int i = 2; i <=100; i++) {
		text += i;
		text += "\n";
		}
		datei.write(text, 0, text.length());
		datei.flush();
		
		
		}
	
		}

