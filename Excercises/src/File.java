import java.io.FileWriter;
import java.io.IOException;

public class File {
	
	public static void main (String[] args )
	{
		FileWriter datei;
		String text;
		text = "1/n";
		
		try
		{
			datei = new FileWriter("ausgabe.txt");
			for(int i=2; i<=100; i++)
			{
				text +=i;
				text+= "\n";
			}
			datei.write(text, 0 , text.length());
			datei.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
