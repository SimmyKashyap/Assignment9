import java.util.*;
import java.io.*;
class writefile{
	public static void main(String[] args) throws Exception {
File input = new File("abc.txt");
        File output = new File("def.txt");
        Scanner sc = new Scanner(input);
        PrintWriter printer = new PrintWriter(output);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            printer.write(s);
        }
		printer.flush();
}}