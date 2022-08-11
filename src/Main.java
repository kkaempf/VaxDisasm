import java.io.IOException;


public class Main {

	public static void main(String[] args) {
                int i = 0;
                boolean raw = false;
		if (args.length < 1) {
			System.err.println("No argument");
			return;
		}
		if (args[i].equals("-r")) {
                    raw = true;
                    i = i + 1;
                    System.err.println("Assuming raw binary");
                    if (args.length < 2) {
			System.err.println("No file to disassemble");
			return;
                    }
                }
                else {
                    System.err.println("Assuming program binary");
                }
		VaxDisasm vax = new VaxDisasm();
		try {
			vax.load(args[i], raw);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		vax.disasm();
		
	}

}
