/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author onolanshafer
 */
public record Recipe(String name, String[] ingredients, int preptime, String[] steps) {
    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public int getPreptime() {
        return preptime;
    }

    public String[] getSteps() {
        return steps;
    }
    
    public String toString(){
        return "Name: " + name.toString() + "\nIngredients: " + ingredients.toString() + 
        "\nPreptime: " + preptime.toString() +  "\nSteps: " + steps.toString();
;
    }
    
}
