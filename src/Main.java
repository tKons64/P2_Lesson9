import java.util.HashMap;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // Урок 9. Домашние задания
        System.out.println();
        System.out.println("Урок 9. Домашнее задание №1. Блок 2");

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


    }
}