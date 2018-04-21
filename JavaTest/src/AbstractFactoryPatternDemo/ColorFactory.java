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
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
         //To change body of generated methods, choose Tools | Templates.
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
         return null;
    }

    @Override
    public Shape getShape(String shapeType) {
         //To change body of generated methods, choose Tools | Templates.
         return null;
    }
    
    
}
