import java.io.IOException;


public class Main {

	public static void main(String[] args) {
                int i = 0;
                boolean raw = false;
                int start = 0;
		if (args.length < 1) {
			System.err.println("No argument");
			System.err.println("Usage:\njava VaxDisasm [-r] [-s <start>] <file>");
			return;
		}
		if (args[i].equals("-r")) {
                    raw = true;
                    i = i + 1;
                }
		if (args[i].equals("-s")) {
                    i = i + 1;
                    start = Integer.parseInt(args[i], 16);
                    System.err.println("Start address 0x" + args[i]);
                    i = i + 1;
                }
                if (raw) {
                    System.err.println("Assuming raw binary");
                }
                else {
                    System.err.println("Assuming program binary");
                }
		VaxDisasm vax = new VaxDisasm();
		try {
			vax.load(args[i], raw, start);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		vax.disasm();
		
	}

}
