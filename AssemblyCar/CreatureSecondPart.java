package AssemblyCar;

public class CreatureSecondPart implements ILineStep {
	@Override
	public IProductPart buildProductPart() {
		System.out.println("Двигатель поступил на склад");
		return new ProductEngine("Двигатель");
	}

}
