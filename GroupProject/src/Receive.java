
public class Receive implements AESCipher {

	private byte[][] cipher;

	@Override
	public void encrypt(String text, String key) {

	}

	@Override
	public void decrypt(byte[][] cipher, String key) {

	}

	@Override
	public byte[][] shiftRows(byte[][] state) {
		byte[][] shiftList = state;
		for (int r = 0; r < shiftList.length; r++) {
			for (int c = 0; c < shiftList[0].length; c++) {
				shiftList[r][c] = state[r][(c + r) % (shiftList.length)];
			}
		}
		return shiftList;
	}

	@Override
	public String toString() {
		String output = "";

		return output;
	}
}
