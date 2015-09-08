package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		Random rand = new Random();
		PrintWriter write = new PrintWriter("randomized_list.txt");
		
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}
		//For testing purposes, output all the lines
		int length = lines.size();
		while(length>0){
			int index = rand.nextInt(length);
			System.out.println(lines.get(index));
			write.println(lines.remove(index));
			length--;
		}
		
		input.close();
	}

}
