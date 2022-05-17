
public class Chocolate {
	
	private String description;
	private double weight;
	private double price;
	private String packing;
	private boolean sugarFree;
	private String brand;
	
	public Chocolate() {
		
		
		
	}

	public Chocolate(String description, double weight, double price, String packing, boolean sugarFree) {
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.packing = packing;
		this.sugarFree = sugarFree;
	}

	public Chocolate(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public boolean isSugarFree() {
		return sugarFree;
	}

	public void setSugarFree(boolean sugarFree) {
		this.sugarFree = sugarFree;
	}

	@Override
	public String toString() {
		return "Chocolate [description=" + description + ", weight=" + weight + ", price=" + price + ", packing="
				+ packing + ", sugarFree=" + sugarFree + ", brand=" + brand + "]";
	}

	
	
	
	

}
