class GardenTester{
public static void main(String args[]){

	Garden.createflower("hibiscus");
	Garden.createflower("rose");
	Garden.createflower("lotus");
	Garden.createflower("sun flower");
	Garden.createflower("lily");
	Garden.createflower("tulips");
	Garden.createflower("jasmine");
	
	
	Garden.getflowers();
	
	Garden.updateFlower("hibiscus","Hibiscus");
	Garden.updateFlower("rose","Rose");
	Garden.updateFlower("lotus","Lotus");
	Garden.updateFlower("sun flower","Sun flower");
	Garden.updateFlower("lily","Lily");
	Garden.updateFlower("tulips","Tulips");
	Garden.updateFlower("jasmine","Jasmine");
	
	Garden.getflowers();
	
	Garden.deleteFlower("rose");
	Garden.getDeletedFlower(2);
}
}