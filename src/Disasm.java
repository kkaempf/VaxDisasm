import java.io.IOException;


public interface Disasm {
	void load(String path, boolean binary, int start) throws IOException;
	void disasm();
}
