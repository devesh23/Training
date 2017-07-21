package devesh;

import java.util.HashSet;
import java.util.Iterator;

class ProductUtil{
	String name;
	String brand;
	public ProductUtil(String name,String brand) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int)name.charAt(0) + (int)brand.charAt(0);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

public class Product {
	HashSet<ProductUtil> hs = new HashSet<>();
	public static void main(String[] args) {
		Product p = new Product();
		ProductUtil pu = new ProductUtil("Devesh", "NIT");
		p.hs.add(pu);
		pu = new ProductUtil("Devesh", "NIT");
		p.hs.add(pu);
		pu = new ProductUtil("Ankush", "IIT");
		p.hs.add(pu);
		
		Iterator<ProductUtil> i = p.hs.iterator();
		while(i.hasNext()){
			pu = (ProductUtil)i.next();
			System.out.println(pu.name + " " +pu.brand);
		}
	}
}
