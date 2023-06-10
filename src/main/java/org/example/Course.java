package org.example;


import java.util.ArrayList;

public class Course implements Cookable {
    private String name;
    private String description;
    private ArrayList<String> ingredients = new ArrayList<String>();
    private String recipe;

    public Course(String name, String description, ArrayList<String> ingredients, String recipe) {
        this.setName(name);
        this.setDescription(description);
        this.setIngredients(ingredients);
        this.setRecipe(recipe);
    }

    @Override
    public String prepare() {
        return null;
    }

    @Override
    public String present() {
        return null;
    }

    @Override
    public String getFullRecipe() {
        return null;
    }

    @Override
    public boolean needsHeating() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient (String ingredient) {
        ArrayList<String> newIngredients = getIngredients();
        newIngredients.add(ingredient);
        setIngredients(newIngredients);
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }
}