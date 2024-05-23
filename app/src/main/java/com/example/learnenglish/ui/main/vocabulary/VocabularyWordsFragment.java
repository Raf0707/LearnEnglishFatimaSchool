package com.example.learnenglish.ui.main.vocabulary;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnenglish.R;
import com.example.learnenglish.adapters.CategoryAdapter;
import com.example.learnenglish.databinding.FragmentVocabularyWordsBinding;
import com.example.learnenglish.domain.model.DictionaryEntry;

import java.util.ArrayList;
import java.util.List;

public class VocabularyWordsFragment extends Fragment {

    FragmentVocabularyWordsBinding binding;
    private CategoryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVocabularyWordsBinding.inflate(getLayoutInflater());



        return binding.getRoot();
    }

    public static List<DictionaryEntry> getFamilyData() {
        List<DictionaryEntry> family = new ArrayList<>();
        family.add(new DictionaryEntry("Father", "Отец"));
        family.add(new DictionaryEntry("Mother", "Мать"));
        family.add(new DictionaryEntry("Brother", "Брат"));
        family.add(new DictionaryEntry("Sister", "Сестра"));
        family.add(new DictionaryEntry("Son", "Сын"));
        family.add(new DictionaryEntry("Daughter", "Дочь"));
        family.add(new DictionaryEntry("Grandfather", "Дедушка"));
        family.add(new DictionaryEntry("Grandmother", "Бабушка"));
        family.add(new DictionaryEntry("Uncle", "Дядя"));
        family.add(new DictionaryEntry("Aunt", "Тетя"));
        family.add(new DictionaryEntry("Cousin", "Двоюродный брат/сестра"));
        family.add(new DictionaryEntry("Nephew", "Племянник"));
        family.add(new DictionaryEntry("Niece", "Племянница"));
        family.add(new DictionaryEntry("Husband", "Муж"));
        family.add(new DictionaryEntry("Wife", "Жена"));
        family.add(new DictionaryEntry("Father-in-law", "Тесть / Свёкор"));
        family.add(new DictionaryEntry("Mother-in-law", "Теща / Свекровь"));
        family.add(new DictionaryEntry("Brother-in-law", "Шурин / Зять"));
        family.add(new DictionaryEntry("Sister-in-law", "Золовка / Невестка"));
        family.add(new DictionaryEntry("Stepfather", "Отчим"));
        family.add(new DictionaryEntry("Stepmother", "Мачеха"));
        family.add(new DictionaryEntry("Stepson", "Пасынок"));
        family.add(new DictionaryEntry("Stepdaughter", "Падчерица"));
        family.add(new DictionaryEntry("Godfather", "Крестный отец"));
        family.add(new DictionaryEntry("Godmother", "Крестная мать"));
        family.add(new DictionaryEntry("Godson", "Крестник"));
        family.add(new DictionaryEntry("Goddaughter", "Крестница"));

        return family;
    }

    public static List<DictionaryEntry> getFoodData() {
        List<DictionaryEntry> food = new ArrayList<>();
        food.add(new DictionaryEntry("Bread", "Хлеб"));
        food.add(new DictionaryEntry("Milk", "Молоко"));
        food.add(new DictionaryEntry("Cheese", "Сыр"));
        food.add(new DictionaryEntry("Apple", "Яблоко"));
        food.add(new DictionaryEntry("Orange", "Апельсин"));
        food.add(new DictionaryEntry("Potato", "Картофель"));
        food.add(new DictionaryEntry("Meat", "Мясо"));
        food.add(new DictionaryEntry("Fish", "Рыба"));
        food.add(new DictionaryEntry("Chicken", "Курица"));
        food.add(new DictionaryEntry("Salad", "Салат"));
        food.add(new DictionaryEntry("Soup", "Суп"));
        food.add(new DictionaryEntry("Egg", "Яйцо"));
        food.add(new DictionaryEntry("Rice", "Рис"));
        food.add(new DictionaryEntry("Burger", "Бургер"));
        food.add(new DictionaryEntry("Pizza", "Пицца"));
        food.add(new DictionaryEntry("Pasta", "Паста"));
        food.add(new DictionaryEntry("Steak", "Стейк"));
        food.add(new DictionaryEntry("Sandwich", "Бутерброд"));
        food.add(new DictionaryEntry("Cake", "Торт"));
        food.add(new DictionaryEntry("Ice cream", "Мороженое"));
        food.add(new DictionaryEntry("Chocolate", "Шоколад"));
        food.add(new DictionaryEntry("Coffee", "Кофе"));
        food.add(new DictionaryEntry("Tea", "Чай"));
        food.add(new DictionaryEntry("Juice", "Сок"));
        food.add(new DictionaryEntry("Water", "Вода"));
        food.add(new DictionaryEntry("Wine", "Вино"));
        food.add(new DictionaryEntry("Beer", "Пиво"));
        food.add(new DictionaryEntry("Soda", "Газировка"));

        return food;
    }

    public static List<DictionaryEntry> getClothesData() {
        List<DictionaryEntry> clothes = new ArrayList<>();
        clothes.add(new DictionaryEntry("Shirt", "Рубашка"));
        clothes.add(new DictionaryEntry("Pants", "Штаны"));
        clothes.add(new DictionaryEntry("Dress", "Платье"));
        clothes.add(new DictionaryEntry("Skirt", "Юбка"));
        clothes.add(new DictionaryEntry("Shoes", "Обувь"));
        clothes.add(new DictionaryEntry("Hat", "Шляпа"));
        clothes.add(new DictionaryEntry("Jacket", "Куртка"));
        clothes.add(new DictionaryEntry("Coat", "Пальто"));
        clothes.add(new DictionaryEntry("Socks", "Носки"));
        clothes.add(new DictionaryEntry("Gloves", "Перчатки"));
        clothes.add(new DictionaryEntry("Scarf", "Шарф"));
        clothes.add(new DictionaryEntry("Sweater", "Свитер"));
        clothes.add(new DictionaryEntry("T-shirt", "Футболка"));
        clothes.add(new DictionaryEntry("Jeans", "Джинсы"));
        clothes.add(new DictionaryEntry("Blouse", "Блузка"));
        clothes.add(new DictionaryEntry("Suit", "Костюм"));
        clothes.add(new DictionaryEntry("Tie", "Галстук"));
        clothes.add(new DictionaryEntry("Skirt", "Юбка"));
        clothes.add(new DictionaryEntry("Shorts", "Шорты"));
        clothes.add(new DictionaryEntry("Dress shoes", "Туфли на каблуке"));
        clothes.add(new DictionaryEntry("Boots", "Ботинки"));
        clothes.add(new DictionaryEntry("Sandals", "Сандалии"));
        clothes.add(new DictionaryEntry("Slippers", "Тапочки"));
        clothes.add(new DictionaryEntry("Swimsuit", "Купальник"));
        clothes.add(new DictionaryEntry("Raincoat", "Плащ"));
        clothes.add(new DictionaryEntry("Sunglasses", "Солнцезащитные очки"));
        clothes.add(new DictionaryEntry("Belt", "Пояс"));
        clothes.add(new DictionaryEntry("Jumpsuit", "Комбинезон"));

        return clothes;
    }

    public static List<DictionaryEntry> getTransportData() {
        List<DictionaryEntry> transport = new ArrayList<>();
        transport.add(new DictionaryEntry("Car", "Машина"));
        transport.add(new DictionaryEntry("Bus", "Автобус"));
        transport.add(new DictionaryEntry("Train", "Поезд"));
        transport.add(new DictionaryEntry("Bicycle", "Велосипед"));
        transport.add(new DictionaryEntry("Airplane", "Самолет"));
        transport.add(new DictionaryEntry("Ship", "Корабль"));
        transport.add(new DictionaryEntry("Motorcycle", "Мотоцикл"));
        transport.add(new DictionaryEntry("Taxi", "Такси"));
        transport.add(new DictionaryEntry("Tram", "Трамвай"));
        transport.add(new DictionaryEntry("Subway", "Метро"));
        transport.add(new DictionaryEntry("Helicopter", "Вертолет"));
        transport.add(new DictionaryEntry("Scooter", "Самокат"));
        transport.add(new DictionaryEntry("Truck", "Грузовик"));
        transport.add(new DictionaryEntry("Boat", "Лодка"));
        transport.add(new DictionaryEntry("Van", "Фургон"));
        transport.add(new DictionaryEntry("Jet", "Реактивный самолет"));
        transport.add(new DictionaryEntry("Cruise ship", "Круизный корабль"));
        transport.add(new DictionaryEntry("RV (Recreational Vehicle)", "Дом на колёсах"));
        transport.add(new DictionaryEntry("Submarine", "Подводная лодка"));
        transport.add(new DictionaryEntry("Hovercraft", "Судно на воздушной подушке"));
        transport.add(new DictionaryEntry("Rickshaw", "Рикша"));
        transport.add(new DictionaryEntry("Segway", "Сегвей"));
        transport.add(new DictionaryEntry("Golf cart", "Гольфкарт"));
        transport.add(new DictionaryEntry("Skateboard", "Скейтборд"));
        transport.add(new DictionaryEntry("Roller skates", "Роликовые коньки"));
        transport.add(new DictionaryEntry("Electric scooter", "Электросамокат"));
        transport.add(new DictionaryEntry("Trolleybus", "Троллейбус"));
        transport.add(new DictionaryEntry("Cable car", "Канатная дорога"));
        transport.add(new DictionaryEntry("Ferry", "Паром"));
        transport.add(new DictionaryEntry("Hot air balloon", "Аэростат"));
        transport.add(new DictionaryEntry("Spaceship", "Космический корабль"));

        return transport;
    }
}