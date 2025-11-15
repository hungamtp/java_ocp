package interfaces.sealedInterface;

public sealed interface Shape
        permits Circle, Square {
    // Interface methods go here
    double area();
}
