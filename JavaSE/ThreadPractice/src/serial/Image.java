package serial;

import java.io.Serializable;

public class Image implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String author;
	private byte[] data;

	public Image() {
	}

	public Image(String author, byte[] data) {
		super();
		this.author = author;
		this.data = data;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
