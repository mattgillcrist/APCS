
public interface AESCipher {

	public byte[][] encrypt(byte[][] state);

	public void decrypt(byte[][] cipher, String key);

	public byte[][] shiftRows(byte[][] state);

	public byte[][] mixColumns(byte[][] state);

	public byte[][] addRoundKey(byte[][] state);

	public byte[][] subBytes(byte[][] state);
}
