package AssemblyCar;

public class Car implements IAssemblyLine {
	@Override
	public IProduct assembleProduct (IProduct iProduct) {
		ProductBody body = (ProductBody) new CreatureFirstPart().buildProductPart();
		iProduct.installFirstPart(body);
		
		ProductEngine engine = (ProductEngine) new CreatureSecondPart().buildProductPart();
		iProduct.installSecondPart(engine);
		
		ProductChassis chassis = (ProductChassis) new CreatureThirdPart().buildProductPart();
		iProduct.installThirdPart(chassis);
		
		InstaletionProduct finishedAssembly = new InstaletionProduct(body, engine, chassis);
		System.out.println("Машина готова");
		
		return finishedAssembly;
	}
}
