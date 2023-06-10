package org.example;

import java.util.ArrayList;

public class Dessert extends Course implements Cookable {

    public Dessert(String name, String description, ArrayList<String> ingredients, String recipe) {
        super(name, description, ingredients, recipe);
    }

    @Override
    public String prepare() {
        return "Preparing" + getName();
    }

    @Override
    public String present() {
        return "Presenting " + getName() + " " + getDescription() + " ";
    }

    @Override
    public String getFullRecipe() {
        String fullRecipe = "";
        fullRecipe += getName() + '\n' + getDescription() + '\n';
        fullRecipe += "Ingredienti: " + '\n';
        for (String i : getIngredients()) {
            fullRecipe += i + " ";
        }
        fullRecipe += '\n' + getRecipe();
        return fullRecipe;
    }


    @Override
    public boolean needsHeating() {
        return false;
    }
}