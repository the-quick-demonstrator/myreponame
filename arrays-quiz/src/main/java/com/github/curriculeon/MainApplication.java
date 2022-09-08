package com.github.curriculeon;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        String result = "";
        String[] blues = "blue, light-blue, dark-blue, sky-blue, sapphire-blue".split(", ");
        String[] greens = "green, light-green, dark-green, forest-green, emerald-green".split(", ");
        String[] reds = "red, light-red, dark-red, scarlet-red, ruby-red".split(", ");
        String[][] colors = {blues, greens, reds};
        for(String[] colorArray : colors) {
            String baseColorType = colorArray[0];
            result += "\nThe current base color is = " + baseColorType;

            for(String color : colorArray) {
                result += "\n\tThe current color is = " + color;
            }
        }
        System.out.println(result);
    }
}