import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

//        System.out.println();
//        System.out.println("Урок 8. Домашнее задание №1");

        Product apples = new Product("Яблоки", 99, 2);
        Product tomatoes = new Product("Помидоры", 100, 1);
        Product bananas = new Product("Бананы", 60, 1);
        Product apples2 = new Product("Яблоки", 99, 2);

        // Урок 9. Домашние задания
        System.out.println();
        System.out.println("Урок 9. Домашнее задание №1. Блок 1");

        HashMap<String, String> phoneReference = new HashMap<>();
        phoneReference.put("Петров", "+1");
        phoneReference.put("Иванов", "+2");
        phoneReference.put("Сидоров", "+3");
        phoneReference.put("Машков", "+4");
        phoneReference.put("Кузяков", "+5");
        phoneReference.put("Дряблов", "+6");
        phoneReference.put("Висков", "+7");
        phoneReference.put("Успехов", "+8");
        phoneReference.put("Дамин", "+9");
        phoneReference.put("Картов", "+10");
        phoneReference.put("Изиков", "+11");
        phoneReference.put("Водимов", "+12");
        phoneReference.put("Изабрелов", "+13");
        phoneReference.put("Кортошов", "+14");
        phoneReference.put("Строкова", "+15");
        phoneReference.put("Киримова", "+16");
        phoneReference.put("Изабеллова", "+17");
        phoneReference.put("Крутова", "+18");
        phoneReference.put("Коллектова", "+19");
        phoneReference.put("Смурнова", "+20");

        System.out.println(phoneReference.values());

        System.out.println();
        System.out.println("Урок 9. Домашнее задание №2. Блок 1");

        Recipe borch = new Recipe("Борщ");
        borch.addProduct(apples, apples.getQuantity());
        borch.addProduct(tomatoes, tomatoes.getQuantity());
        borch.addProduct(bananas, bananas.getQuantity());
        borch.calculateRecipePrice();
        System.out.println(borch);

        System.out.println();
        System.out.println("Урок 9. Домашнее задание №3. Блок 1");

        HashMap<String, Integer> tempList = new HashMap<>();
        while (tempList.size() < 10) {
            tempList.put("str" + (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        System.out.println(tempList);
        addValueInTempList(tempList, "str6", 6);
        //addValueInTempList(tempList, "str11", 6);
        System.out.println(tempList);

        System.out.println();
        System.out.println("Урок 9. Домашнее задание №1. Блок 2");

        Map<String, List<Integer>> originaList = new HashMap<>();
        while (originaList.size() < 5) {
            List<Integer> tempListInteger = new ArrayList<>();
            while (tempListInteger.size() < 3) {
                tempListInteger.add((int)(Math.random() * 1000));
            }
            originaList.put("string" + (int) (Math.random() * 10), tempListInteger);
        }
        System.out.println(originaList);

        Map<String, Integer> convertedList = new HashMap<>();
        for (String s : originaList.keySet()) {
            int sum = 0;
            List<Integer> tempListInteger = originaList.get(s);
            for (Integer value : tempListInteger) {
                sum = sum + value;
            }
            convertedList.put(s, sum);
        }
        System.out.println(convertedList);

        System.out.println();
        System.out.println("Урок 9. Домашнее задание №2. Блок 2");

        LinkedHashMap<Integer, String> tempLinkedList = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            tempLinkedList.put(i+1, "string" + (int) (Math.random() * 1000));
        }
        System.out.println(tempLinkedList);

    }

    public static void addValueInTempList(HashMap<String, Integer> list, String key, Integer value) {
        if (list.get(key) == value) {
            throw new RuntimeException("В списке уже есть такое же значение по заданному ключю!");
        } else {
            list.put(key, value);
        }
    }

    public static void addProduct(Set<Product> listOfProducts, Product product) {

        if (!listOfProducts.add(product)) {
            throw new RuntimeException("Продукт с таким именнем уже есть в списке!");
        }

    }

    public static void addRecipe(Set<Recipe> listOfRecipes, Recipe recipe) {
        if (!listOfRecipes.add(recipe)) {
            throw new RuntimeException("Рецепт с таким именнем уже есть в списке!");
        }
    }

    public static void delProduct(Set<Product> listOfProducts, Product product) {

        if (listOfProducts.remove(product)) {
            System.out.println("Продукт - /*" + product.getName() + "*/ удален из списка покупок");
        }
    }

    public static void markPurchase(Product product) {
        product.setPurchased(true);
    }
}