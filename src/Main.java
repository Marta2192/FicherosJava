import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static String route = "C:\\Users\\user\\eclipse-workspace\\FicheSara\\src\\NewText.txt";
	private static FileReader fr;
	private static File file;
	
	
	
	public static void main(String[] args) {
		
			
		file = new File(route);
		
		
		create(file);
		type();
		try {
			write(convertToCharArray(getUserText()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		read(file);
		
		
		
		
		/*
		 * VAMOS A COGER UN FICHERO, COMPROBAR SI ESTÁ SINO CREARLO
		 * VAMOS TAMBIÉN A PEDIR QUE NOS INTRODUZCAN UN TEXTO (CONSOLE)
		 * VAMOS A COGER ESE TEXTO Y CADA LETRA DE ESE TEXTO SE VA A PONER EN UNA LÍNEA DEL FICHERO
		 * TRAS CADA LETRA HABRÁ QUE AÑADIR UNA LÍNEA EN BLANCO (VERTICAL)
		 * 
		 */
		
	}


	private static char[] convertToCharArray(String text) {
//		for (int i = 0; i < text.length(); i++) {
			return text.toCharArray();
//		}
		
		
	}

	private static void read(File file) {
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e){
			
			e.printStackTrace();
		}
	}
		
	
	private static void write(char[] text) throws IOException {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
			
		for(int i = 0; i < text.length; i++) {
			bw.write(text[i]);
			bw.newLine();
			bw.newLine();
		}
			
		bw.close();
		fw.close();
	}

	private static void type() {
		System.out.println("Enter a text: ");
		
	}

	private static void create(File file) {		
		try {
			if (file.exists()) {
				System.out.println("File already exist");
			} else {
				file.createNewFile();
				System.out.println("New file created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String getUserText() {
		return new Scanner(System.in).next();
	}
	
	
	
	
}
