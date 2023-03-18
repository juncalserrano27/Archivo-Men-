import java.io.File;
import java.util.Scanner;
public class Menu {
	private String name;
	Scanner scan= new Scanner (System.in);
	public Menu(){
		this.name=Menuu();	
	}
	public String Menuu() {
		System.out.println("¡¡¡Bienvenido a Adivina Quien!!!");
		System.out.println("Ingresa el nombre del usuario:");
		String name=scan.nextLine();
		
		personas gettt=new personas();
		gettt.getInfo();
}
	public String comparar(File name) {
		if (name.exists()) {
			
		}else {
			
		}
	}
	}
