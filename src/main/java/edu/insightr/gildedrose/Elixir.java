package edu.insightr.gildedrose;

public class Elixir extends Item {
    public Elixir(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality()
    {

    }
}
