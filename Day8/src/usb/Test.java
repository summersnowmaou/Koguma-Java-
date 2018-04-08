package usb;

public class Test {

	public static void main(String[] args) {
		Udisk disk=new Udisk();  // U盘
		USB usb=new Mouse();   // 向上转型
        Computer c=new Computer(disk);
        c.work();
        c.setUsb(usb);
        c.work();
	}

}
