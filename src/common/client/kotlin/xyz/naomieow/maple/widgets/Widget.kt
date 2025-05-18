package xyz.naomieow.maple.widgets

interface Widget<T> {
    val children: Array<Widget<T>>
}
