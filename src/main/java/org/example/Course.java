package org.example;


import java.util.ArrayList;

public class Course implements Cookable {
    private String name;
    ArrayList<String> ingredients = new ArrayList<String>();
    private String recipe;

    public Course(String name, ArrayList<String> ingredients, String recipe) {
        this.name = name;
        this.ingredients = ingredients;
        this.recipe = recipe;
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
    public String getRecipe() {
        return null;
    }

    @Override
    public boolean needsHeating() {
        return false;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}