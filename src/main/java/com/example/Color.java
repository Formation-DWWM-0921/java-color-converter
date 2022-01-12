package com.example;

/**
 * Représente une couleur
 */
public class Color
{
    /**
     * La valeur du canal rouge
     */
    private int red;
    /**
     * La valeur du canal vert
     */
    private int green;
    /**
     * La valeur du canal bleu
     */
    private int blue;

    /**
     * Crée une nouvelle couleur à partir de trois valeurs rouge, vert, bleu
     * @param red La valeur du canal rouge
     * @param green La valeur du canal vert
     * @param blue La valeur du canal bleu
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Crée une nouvelle couleur à partir d'un code hexadécimal
     * @param hexa Le code hexadécimal à analyser
     */
    public Color(String hexa)
    {
        this.red = Integer.valueOf(hexa.substring(0, 2), 16);
        this.green = Integer.valueOf(hexa.substring(2, 4), 16);   
        this.blue = Integer.valueOf(hexa.substring(4, 6), 16);
    }

    /**
     * @return Une représentation de la couleur sous forme de code hexadécimal
     */
    public String asHex()
    {
        return String.format("#%02X%02X%02X", this.red, this.green, this.blue);
    }

    /**
     * @return Une représentation de la couleur sous forme de code rgb()
     */
    public String asRgb()
    {
        return String.format("rgb(%d, %d, %d)", this.red, this.green, this.blue);
    }

        /**
     * @return La valeur du canal rouge
     */
    public int getRed()
    {
        return this.red;
    }

    /**
     * @return La valeur du canal vert
     */
    public int getGreen()
    {
        return this.green;
    }

    /**
     * @return La valeur du canal vert
     */
    public int getBlue()
    {
        return this.blue;
    }
}
