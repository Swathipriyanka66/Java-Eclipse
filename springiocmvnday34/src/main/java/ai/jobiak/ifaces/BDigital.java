package ai.jobiak.ifaces;

public class BDigital {
	
	Printable printable;
	PackingIfaces packing;
	
	public BDigital() {
		
	}
	
	public BDigital(PackingIfaces Packing) {
		this.packing=packing;
	}
	
	public Printable getPrintable() {
		return printable;
	}

	public void setPrintable(Printable printable) {
		this.printable = printable;
	}
	
	public void publish() {
		
		printable.print();
		packing.doPacking();
	}
	
	

}
