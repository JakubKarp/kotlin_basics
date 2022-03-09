fun main() {
    // interfejsy anonimowe

    var button = Button()
    // implementacja konkretna, a nie anonimowa
    // button.clickListener = MyClickListener()

    // implementacja anonimowa
    button.clickListener = object: OnClickListener{
        override fun onClick() {
        println("Button Clicked")
        }
    }
    button.click()

    // implementacja anonimowa drugi, popularny sposób
    var image = Image()
    image.setMyListener(object: OnClickListener{
        override fun onClick() {
            println("Image clicked")
        }
    })
    image.click()
}

// implementacja konkretna, a nie anonimowa
//class MyClickListener: OnClickListener {
//    override fun onClick() {
//        println("Clicked")
//    }
//}

interface OnClickListener {
    fun onClick()
}

open abstract class UiView() {
    lateinit var clickListener: OnClickListener

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        clickListener.onClick()
    }
}

class Button: UiView()
class Image: UiView()

