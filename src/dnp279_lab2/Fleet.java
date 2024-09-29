package dnp279_lab2;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;


public class Fleet {
	private String name;
	private ArrayList<Airship> airship;
	
	public Fleet(String name) {
		this.name = name;
		this.airship = new ArrayList<>();
	}
	
	public int getSizeOfFleet() {
		return airship.size();
		
	}
	public void addAirShip(Airship airships) {
		airships.add(airship);
	}
	@Override
    public String toString() {
        return "Fleet Name: " + name + ", Number of Airships: " + airships.size();
    }
	
	public void loadAirships(String directoryPath) throws FileNotFoundException {
		File directory = new File(directoryPath);
		
	if (!directory.exists() || !directory.isDirectory()) {
		throw new FileNotFoundException("Path does not exist: " + directoryPath);
		
		
	} 
	for (File file :directory.listFiles()) {
		if (file.isFile() && file.getName() .endsWith(".csv")) {
			Scanner scanner = new Scanner(file);
			String name = scanner.nextLine();
			String registry = scanner.nextLine();
			String airshipClass = scanner.nextLine();
			Airship airship = new Airship (name, registry, airshipClass);
			addAirship(airship);
			scanner.close();
		
			
			
			
		}
	
	}
		
	}
	public String getName() {
		return name;
	}
	
	public void setNmae(String Name) {
		this.name = name;
	}
	public ArrayList<Airship> getAirships(){
		return airships;
	}
	public void setAirships(ArrayList<Airship> airships) {
		this.airships = airships;
		
	}
		
	
}

