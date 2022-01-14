/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Random;

/**
 *
 * @author bedirhan
 */
public class Util {

    public static int random() {
        Random random = new Random();
        return random.nextInt(10000);
    }
}
