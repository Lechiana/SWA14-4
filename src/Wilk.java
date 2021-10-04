public class Wilk extends CondimentDecorator {

	Beverage beverage;
	
	public Wilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Wilk";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
