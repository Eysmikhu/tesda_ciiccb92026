package Task13;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Subclass 1: Mechado extends Afritada
class Mechado extends Afritada {
    @Override
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste"
        };
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Subclass 2: Menudo extends Afritada
class Menudo extends Afritada {
    @Override
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Liver Spread",
            "Raisins",
            "Hotdog"
        };
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Subclass 3: Caldereta extends Afritada
class Caldereta extends Afritada {
    @Override
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Siling Labuyo",
            "Cheese"
        };
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

public class Task131 {
    public static void main(String[] args) {
        // Instantiate 4 objects referenced by the base class (Afritada)
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // Demonstrate polymorphism by invoking overridden methods
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
