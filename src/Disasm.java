import java.io.IOException;


public interface Disasm {
	void load(String path, boolean binary) throws IOException;
	void disasm();
}
