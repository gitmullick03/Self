/*
 Program: Write a Java program to input plaintext from keyboard and display its equivalent
		  chipertext after encryption. Also, decrypt the chipertext to get the same plaintext. Your
		  program should have three methods main(), encrypt() and decrypt(). You are allowed to add 
		  extra methods if required. The method headers are as follows:
			
			public static void main(String args[]) { } 
			public static String encrypt(String plaintext) { } 
			public static String decrypt(String chipertext) { }
			
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.Scanner;
public class AffineCipher {
    static final int alpha_size = 26;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext: ");
        String plaintext = sc.nextLine();
        System.out.print("Enter a multiplicative key: ");
        int multiplicativeKey = sc.nextInt();
        System.out.print("Enter a additive key: ");
        int additiveKey = sc.nextInt();
       
        String ciphertext = encrypt(plaintext, multiplicativeKey, additiveKey);
        System.out.println("Ciphertext: " + ciphertext);
       
        String decryptedMessage = decrypt(ciphertext, multiplicativeKey, additiveKey);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
   
    public static String encrypt(String plaintext, int multiplicativeKey, int additiveKey) {
        char[] plaintextArr = plaintext.toCharArray();
        for (int i = 0; i < plaintextArr.length; i++) {
            if (Character.isLetter(plaintextArr[i])) {
                int newChar = (multiplicativeKey * (Character.toLowerCase(plaintextArr[i]) - 'a') + additiveKey) % alpha_size;
                plaintextArr[i] = (char) (newChar + 'a');
            }
        }
        return new String(plaintextArr);
    }
   
    public static String decrypt(String ciphertext, int multiplicativeKey, int additiveKey) {
        char[] ciphertextArr = ciphertext.toCharArray();
        int inverseKey = -1;
        for (int i = 0; i < alpha_size; i++) {
            if ((multiplicativeKey * i) % alpha_size == 1) {
                inverseKey = i;
                break;
            }
        }
        for (int i = 0; i < ciphertextArr.length; i++) {
            if (Character.isLetter(ciphertextArr[i])) {
                int newChar = (inverseKey * ((Character.toLowerCase(ciphertextArr[i]) - 'a') - additiveKey + alpha_size)) % alpha_size;
                ciphertextArr[i] = (char) (newChar + 'a');
            }
        }
        return new String(ciphertextArr);
    }
}