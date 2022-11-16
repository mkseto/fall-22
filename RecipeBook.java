/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author onolanshafer
 */
public class RecipeBook {
    private Recipe[] book;
    int numrecipes = 0;
    
    public void addRecipe(Recipe recipe){
        book[numrecipes] = recipe;
        numrecipes++;
    }
    
    public Recipe[] searchByName(String name){
        return book;
    }
    
    public Recipe[] searchByIngredient(String[] ingredients){
        return book;
    }
    
    public Recipe[] sortByPreptime(int preptime){
        return book;
    }
    
    public String displayRecipe(){
        return "";
    }

    public void printName(){
        System.out.println(book[0]);
    }
    
}
