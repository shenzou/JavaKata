package edu.insightr.gildedrose;

public class Dexterity_vest extends Item {

    public Dexterity_vest(String name, int sellIn, int quality)
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
