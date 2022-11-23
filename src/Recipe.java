import java.util.*;

public class Recipe {

    private String titleRecipe;

    private HashMap<Product, Float> products = new HashMap<>();

    private double recipePrice;

    public Recipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return titleRecipe.equals(recipe.titleRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleRecipe);
    }

    public String getTitleRecipe() {
        return titleRecipe;
    }

    public void setTitleRecipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }

    public HashMap<Product, Float> getProducts() {
        return products;
    }

    public void addProduct(Product product, Float quantity) {
        if (quantity == 0) {
            quantity = 1f;
        }
        this.products.put(product, quantity);
    }

    public double getRecipePrice() {
        return recipePrice;
    }

    public void calculateRecipePrice() {
        double sum = 0;
        for (Product product: products.keySet()) {
            sum = sum + products.get(product) * product.getPrice();
        }
        this.recipePrice = sum;
    }

    @Override
    public String toString() {
        return "Рецепт: " + titleRecipe +
                ", состав продуктов: " + products.toString() +
                ", стоимость:" + recipePrice;
    }
}
