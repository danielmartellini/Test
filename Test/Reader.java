import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Reader {
	public void fileReader() {
	String myInputFileName = "songs.txt";
	String myOutputFileName = "EditedPlaylist.txt";
	
	try {
		Scanner reader = new Scanner (new FileReader(myInputFileName));
		BufferedWriter myWriter = new BufferedWriter(new FileWriter(myOutputFileName, false));
		
			do {
				if (reader.hasNext()) {
					String input = reader.nextLine();
					System.out.println("The file \""+myInputFileName+"\" had \""+input+"\" Written on it");
			}
			
				
			else {
                System.out.println("The file \""+myInputFileName+"\" was empty");
                }
	
	}
			while (reader.hasNext());
	}
			
	catch (Exception e) {
		System.out.println("It was impossible to locate the file \""+myInputFileName+"\"" );
		}
	
	
	}
	}
	

