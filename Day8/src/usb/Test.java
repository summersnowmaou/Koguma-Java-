package usb;

public class Test {

	public static void main(String[] args) {
		Udisk disk=new Udisk();  // U��
		USB usb=new Mouse();   // ����ת��
        Computer c=new Computer(disk);
        c.work();
        c.setUsb(usb);
        c.work();
	}

}
