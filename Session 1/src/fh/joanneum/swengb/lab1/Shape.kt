package fh.joanneum.swengb.lab1

import javafx.scene.shape.Circle

open class Shape (val color:String = "black") {
    open fun getArea() :Double {
        return 0.0
    }

    override fun toString(): String {
        return "Shape(color='$color')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Shape

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }

}


class Rectangle(color:String = "black", val width:Double = 1.0, val length:Double = 1.0): Shape(color){
    override fun getArea(): Double {
        return width * length
    }

    override fun toString(): String {
        return "Rectangle(width=$width, length=$length)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rectangle

        if (width != other.width) return false
        if (length != other.length) return false

        return true
    }

    override fun hashCode(): Int {
        var result = width.hashCode()
        result = 31 * result + length.hashCode()
        return result
    }


}

class Circle(color:String = "black", val radius:Double = 1.0): Shape(color) {
    override fun getArea(): Double {
        return radius * radius * Math.PI
    }

    override fun toString(): String {
        return "Circle(radius=$radius, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as fh.joanneum.swengb.lab1.Circle

        if (radius != other.radius) return false

        return true
    }

    override fun hashCode(): Int {
        return radius.hashCode()
    }

}

class Canvas(){
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }
    fun getTotalArea(): Double {

    }

    fun shapesCountPerType(): Map<String, Int> {
    }
}

fun main() {
    val testShape = Shape()
    println(testShape.color)

    val testRectangle = Rectangle (width = 5.0, length = 2.0)
    println(testRectangle.getArea())
    testRectangle.length

    val aShape: Shape = testRectangle
    //aShape.width
    println(aShape.getArea())

    val circle= Circle (radius = 10.0, color = "red")
    println(circle)

    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")

    println(circle1 === circle2)
    println(circle1 == circle2)
    println(setOf<fh.joanneum.swengb.lab1.Circle>(circle1, circle2).size)
}







