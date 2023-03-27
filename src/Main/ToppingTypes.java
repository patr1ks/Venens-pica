package Main;

public class ToppingTypes {
	String Name;
	Double Price;
	int Count;
	public ToppingTypes(String Name, Double Price,int Count) {
		this.Name = Name;
		this.Price = Price;
		this.Count = Count;
		
		
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
}

