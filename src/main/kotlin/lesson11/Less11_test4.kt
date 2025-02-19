package org.example.lesson11

import java.awt.Image

class Category(
    val name: String,
    val image: Image,
)

class Recipe(
    val name: String,
    val image: Image,
    val portion: Int,
    val ingredients: Array<String>,
    val sequence: Array<String>,
)

class Ingredient(
    val name: String,
    val quantity: Int,
    val unit: String,
)

