/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author onolanshafer
 */
public class Recipe {
    private String name;
    private String[] ingredients;
    private int preptime;
    private String[] steps;

    public Recipe(String name, String[] ingredients, int preptime, String[] steps) {
        this.name = name;
        this.ingredients = ingredients;
        this.preptime = preptime;
        this.steps = steps;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPreptime(int preptime) {
        this.preptime = preptime;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }
    
    public String toString(){
        return "";
    }
    
    
    
}
