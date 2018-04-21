/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPatternDemo;

/**
 *
 * @author mhcrnl
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
         //To change body of generated methods, choose Tools | Templates.
        return null; 
    }

    @Override
    public Shape getShape(String shapeType) {
         //To change body of generated methods, choose Tools | Templates.
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
    
    
}
