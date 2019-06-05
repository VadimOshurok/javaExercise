package AssemblyCar;

public class InstaletionProduct implements IProduct{
	IProductPart body;
	IProductPart engine;
	IProductPart chassis;
	
	InstaletionProduct(){}
	
	InstaletionProduct(ProductBody body, ProductEngine engine, ProductChassis chassis){
		this.body=body;
		this.engine=engine;
		this.chassis=chassis;
	}
	
	@Override 
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Корпус готов к сборке");
	}
	
	@Override 
	public void installSecondPart(IProductPart productPart) {
		System.out.println("Двигатель установлен в корпус");
	}
	
	@Override 
	public void installThirdPart(IProductPart productPart) {
		System.out.println("Шасси установлено в машину");
	}
	
}
