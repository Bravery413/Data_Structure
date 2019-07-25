package design_pattern.creational_patters.abstract_factory_pattren;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
