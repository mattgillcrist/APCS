
public interface AESCipher {

	public void encrypt(String text, String key);

	public void decrypt(byte[][] cipher, String key);

	public byte[][] shiftRows(byte[][] state);

	public byte[][] mixColumns(byte[][] state);

	public byte[][] addRoundKey(byte[][] state, byte[][] key);

	public byte[][] subBytes(byte[][] state);
}
