
public interface AESCipher {
	public void encrypt(String text, String key);

	public void decrypt(byte[][] cipher, String key);
}
