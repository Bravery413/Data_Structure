package design_pattern.behavioral_patterns.observer_pattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
