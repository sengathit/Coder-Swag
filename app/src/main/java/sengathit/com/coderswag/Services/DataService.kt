package sengathit.com.coderswag.Services

import sengathit.com.coderswag.Model.Category
import sengathit.com.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$18","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie White","$20","hoodie2"),
        Product("Devslopes Hoodie Red","$32","hoodie3"),
        Product("Devslopes Hoodie Black","$25","hoodie4")
    )

    var shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray","$20","shirt2"),
        Product("Devslopes Logo Shirt Red","$22","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
    )
}
