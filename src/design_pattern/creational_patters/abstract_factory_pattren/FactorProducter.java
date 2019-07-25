package design_pattern.creational_patters.abstract_factory_pattren;


public class FactorProducter {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactor();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
