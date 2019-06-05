package AssemblyCar;

public class CreatureThirdPart implements ILineStep {
	@Override
	public IProductPart buildProductPart() {
		System.out.println("Шасси поступило на склад");
		return new ProductChassis("Шасси");
	}
}
