/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Data class representing a recipe in a cookbook
 * @author onolanshafer
 */
public record Recipe(String name, String[] ingredients, int preptime, String[] steps) {
    public String getName() {
        /* 
         Returns name of a recipe
         Params: none
         Returns 
         */
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
    
    public int compareTo(Object other){
        /*
        Compares Recipe objects based on prep time alone. 
        Returns difference between prep times of two Recipe objects. 
        */
    
        if(this.getClass() != other.getClass()){
            throw new java.lang.RuntimeException("compareTo: incompatible objects");
       }
        if(this == other) return 0; 
        Recipe otherRecipe = (Recipe)other;
        return this.preptime() - otherRecipe.preptime();
    } 

    public String toString(){
        return "Name: " + name.toString() + "\nIngredients: " + ingredients.toString() + 
        "\nPreptime: " + preptime.toString() +  "\nSteps: " + steps.toString();
;
    }
    
}
