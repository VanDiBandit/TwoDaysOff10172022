package OpenClosedPrinciple;

import lombok.AllArgsConstructor;
import lombok.Data;

public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}


@Data
@AllArgsConstructor
class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

@Data
@AllArgsConstructor
class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

@Data
@AllArgsConstructor
class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
    }
}