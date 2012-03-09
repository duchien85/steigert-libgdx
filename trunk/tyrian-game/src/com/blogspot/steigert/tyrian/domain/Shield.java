package com.blogspot.steigert.tyrian.domain;

import java.util.Locale;

/**
 * A shield for the ship.
 */
public enum Shield
    implements
        Item
{
    SIF( "Structural Field", 100, 1 ),
    AIF( "Advanced Field", 250, 2 ),
    GLES( "Gencore LE Shield", 500, 3 ),
    GHEF( "Gencore HE Shield", 1000, 4 ),
    MLXS( "MicroCorp LXS-A", 2000, 5 );

    private final String name;
    private final int price;
    private final int armor;

    private Shield(
        String name,
        int price,
        int armor )
    {
        this.name = name;
        this.price = price;
        this.armor = armor;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    /**
     * Retrieves the armor level for this shield (1-5).
     * <p>
     * 1 means 10% less damage received.
     */
    public int getArmor()
    {
        return armor;
    }

    @Override
    public String toString()
    {
        return String.format( Locale.US, "%s ($%d) - Armor: %d", name, price, armor );
    }
}
