package com.gildedrose.data.constants

import com.gildedrose.data.model.Item

object ItemRepository {
    val items = listOf(
        Item("+5 Dexterity Vest", 10, 20), //
        Item("Aged Brie", 2, 0), //
        Item("Elixir of the Mongoose", 5, 7), //
        Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        Item("Sulfuras, Hand of Ragnaros", -1, 80),
        Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        // this conjured item does not work properly yet
        Item("Conjured Mana Cake", 3, 6)
    )
}