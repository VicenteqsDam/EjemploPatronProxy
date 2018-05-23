package es.vqs.decorator;

import java.util.Base64;

public class SecureEmailDecorator extends EmailDecorator {
	private String content;

	public SecureEmailDecorator(IEmail basicEmail) {
		this.originalEmail = basicEmail;
	}

	@Override
	public String getContents() { // secure original
		this.content = this.encrypt(originalEmail.getContents());
		return this.content;
	}

	private String encrypt(String message) { // encrypt the string
		String encryptedMessage = Base64.getEncoder().encodeToString(message.getBytes());
		return encryptedMessage;
	}
}
