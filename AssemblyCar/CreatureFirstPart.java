package AssemblyCar;

public class CreatureFirstPart implements ILineStep {
	@Override
	public IProductPart buildProductPart() {
		System.out.println("Корпус поступил на склад");
		return new ProductBody("Корпус");
	}
}
