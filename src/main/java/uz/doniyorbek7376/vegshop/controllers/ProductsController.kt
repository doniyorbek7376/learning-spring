package uz.doniyorbek7376.vegshop.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import uz.doniyorbek7376.vegshop.dao.ProductDAO

@Controller
@RequestMapping("/products")
class ProductsController @Autowired constructor(private val productDAO: ProductDAO) {

    @GetMapping
    fun getAllProducts(model: Model): String {
        model.addAttribute("products", productDAO.getAll())
        return "products/products"
    }

    @GetMapping("/{id}")
    fun getProduct(@PathVariable("id") id:Int, model: Model):String {
        model.addAttribute("product", productDAO.getOneById(id))
        return "products/product"
    }
}