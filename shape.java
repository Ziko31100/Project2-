package PrepareView;

import java.awt.*;

/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.

 */
public interface shape {
    int calculateArea(int num1,int num2);
    int calculatePerimeter(int num1,int num2);

}
class Circle implements shape {
    public int calculateArea(int num1,int num2){
        return num1*num2;
    }


    @Override
    public int calculatePerimeter(int num1, int num2) {
        return (num1+num2)*2;
    }
}
