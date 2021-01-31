package uz.doniyorbek7376.vegshop.dao

import org.springframework.stereotype.Component
import uz.doniyorbek7376.vegshop.models.Product

@Component
class ProductDAO {
    // Available products
    private val products = ArrayList<Product>().apply {
        add(
            Product(
                0,
                "Fresh Avocados",
                "🥑",
                "Spain",
                "Vitamin B, Vitamin K",
                "4 🥑",
                "6.50",
                true,
                "A ripe avocado yields to gentle pressure when held in the palm of the hand and squeezed. The fruit is not sweet, but distinctly and subtly flavored, with smooth texture. The avocado is popular in vegetarian cuisine as a substitute for meats in sandwiches and salads because of its high fat content. Generally, avocado is served raw, though some cultivars, including the common 'Hass', can be cooked for a short time without becoming bitter. It is used as the base for the Mexican dip known as guacamole, as well as a spread on corn tortillas or toast, served with spices."
            )
        )
        add(
            Product(
                1,
                "Goat and Sheep Cheese",
                "🧀",
                "Portugal",
                "Vitamin A, Calcium",
                "250g",
                "5.00",
                false,
                "Creamy and distinct in flavor, goat cheese is a dairy product enjoyed around the world. Goat cheese comes in a wide variety of flavors and textures, from soft and spreadable fresh cheese to salty, crumbly aged cheese. Although it’s made using the same coagulation and separation process as cheese made from cow’s milk, goat cheese differs in nutrient content."
            )
        )
        add(
            Product(
                2,
                "Apollo Broccoli",
                "🥦",
                "Portugal",
                "Vitamin C, Vitamin K",
                "3 🥦",
                "5.50",
                true,
                "Broccoli is known to be a hearty and tasty vegetable which is rich in dozens of nutrients. It is said to pack the most nutritional punch of any vegetable. When we think about green vegetables to include in our diet, broccoli is one of the foremost veggies to come to our mind. Broccoli is a cruciferous vegetable and part of the cabbage family, which includes vegetables such as Brussel sprouts and kale. Although the tastes are different, broccoli and these other vegetables are from the same family."
            )
        )
        add(
            Product(
                3,
                "Baby Carrots",
                "🥕",
                "France",
                "Vitamin A, Vitamin K",
                "20 🥕",
                "3.00",
                true,
                "The carrot is a root vegetable that is often claimed to be the perfect health food. It is crunchy, tasty and highly nutritious. Carrots are a particularly good source of beta-carotene, fiber, vitamin K, potassium and antioxidants. Carrots have a number of health benefits. They are a weight loss friendly food and have been linked to lower cholesterol levels and improved eye health."

            )
        )
        add(
            Product(
                4,
                "Sweet Corncobs",
                "🌽",
                "Germany",
                "Vitamin C, Magnesium",
                "2 🌽",
                "2.00",
                false,
                "Also known as maize, corn is one of the most popular cereal grains in the world. Popcorn and sweet corn are commonly eaten varieties, but refined corn products are also widely consumed, frequently as ingredients in foods. These include tortillas, tortilla chips, polenta, cornmeal, corn flour, corn syrup, and corn oil. Whole-grain corn is as healthy as any cereal grain, rich in fiber and many vitamins, minerals, and antioxidants."
            )
        )
    }

    // Get all products:
    fun getAll(): List<Product> {
        return products
    }

    // Get one product according to the id
    fun getOneById(id: Int): Product? {
        return products.stream().filter { it.id == id }.findAny().orElse(null)
    }
}