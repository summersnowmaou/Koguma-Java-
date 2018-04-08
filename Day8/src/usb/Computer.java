package usb;

public class Computer {
	private USB usb;

	public Computer() {
	}

	public Computer(USB usb) {
		super();
		this.usb = usb;
	}
	
	public void work(){
		this.usb.usbWork();
	}

	public USB getUsb() {
		return usb;
	}

	public void setUsb(USB usb) {
		this.usb = usb;
	}

}
