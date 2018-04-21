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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choise){
        if(choise.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choise.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
