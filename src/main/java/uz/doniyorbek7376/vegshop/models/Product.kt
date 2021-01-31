package uz.doniyorbek7376.vegshop.models

data class Product(
    val id: Int,
    val productName: String,
    val image: String,
    val from: String,
    val nutrients: String,
    val quantity: String,
    val price: String,
    val organic: Boolean,
    val description: String
) {
}