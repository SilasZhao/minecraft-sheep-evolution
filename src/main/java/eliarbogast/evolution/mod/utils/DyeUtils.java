package eliarbogast.evolution.mod.utils;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DyeUtils {
    public static final String[] DyeColors = {"brown", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "purple", "magenta", "pink", "white", "light_gray", "gray", "black"};
    /*
    MaterialColor has ID, we can put them in to the color Ring by these ids. It should have all 64 material types,
    for mock process, I only put 16.
     */
    //<id, the corresponding position of colorRingOfDyeColors>
    public static final Map<Integer,Integer> colorRingOfMaterials = Stream.of(new Object[][]{
            {1,0},
            {2,1},
            {3,2},
            {4,3},
            {5,4},
            {6,5},
            {7,6},
            {8,7},
            {9,8},
            {10,9},
            {11,10},
            {12,11},
            {13,12},
            {14,13},
            {15,14},
            {16,15},
            {17,0},
            {18,1},
            {19,2},
            {20,3},
            {21,4},
            {22,5},
            {23,6},
            {24,7},
            {25,8},
            {26,9},
            {27,10},
            {28,11},
            {29,12},
            {30,13},
            {31,14},
            {32,15},
            {33,0},
            {34,1},
            {35,2},
            {36,3},
            {37,4},
            {38,5},
            {39,6},
            {40,7},
            {41,8},
            {42,9},
            {43,10},
            {44,11},
            {45,12},
            {46,13},
            {47,14},
            {48,15},
            {49,0},
            {50,1},
            {51,2},
            {52,3},
            {53,4},
            {54,5},
            {55,6},
            {56,7},
            {57,8},
            {58,9},
            {59,10},
            {60,11},
            {61,12},
            {62,13},
            {63,14},
            {64,15},
    }).collect(Collectors.toMap(color -> (Integer) color[0], color -> (Integer) color[1]));
/*
there are 16 colors for sheep. Put these colors into a color ring by its name.
However, white and black are not in the color spectrum, and different color have different shades and hues,
which are also playing rolls of recognizing colors.
 */

    public static final Map<String,Integer> colorRingOfDyeColors = Stream.of(new Object[][]{
            {"white",0},
            {"orange",1},
            {"magenta",2},
            {"light_blue",3},
            {"yellow",4},
            {"lime",5},
            {"pink",6},
            {"gray",7},
            {"light_gray",8},
            {"cyan",9},
            {"purple",10},
            {"blue",11},
            {"brown",12},
            {"green",13},
            {"red",14},
            {"black",15},
    }).collect(Collectors.toMap(color -> (String) color[0], color -> (Integer) color[1]));
}
