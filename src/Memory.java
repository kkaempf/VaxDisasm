
public class Memory {

	private final byte[] mem;
	private final int offset;
	public Memory(int size, int start) {
		mem = new byte[size];
                offset = start;
	}

	public void load(byte[] raw, int addr) {
		System.arraycopy(raw, 0, mem, addr-offset, raw.length);
	}
	
	public int fetch(int addr, int size) {
		int val = 0;
		for (int i = size-1; i >= 0; i--) {
			val = (val << 8) + (mem[addr-offset+i] & 0xff);
		}
		return val;
	}
	
	public void dump() {
		//TODO dump memory
	}

}
