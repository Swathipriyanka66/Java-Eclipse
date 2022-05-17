package ai.jobiak.ifaces;

public interface CImpl extends PackingIfaces {
	
	public default void doPacking() {
		System.out.println("intiated packing....");
	}
}