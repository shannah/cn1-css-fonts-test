/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.cssfontstest;

import com.codename1.testing.AbstractTest;
import com.codename1.ui.Font;

/**
 *
 * @author shannah
 */
public class LoadFontsTest extends AbstractTest {

    @Override
    public boolean runTest() throws Exception {
        Font alexBrush = Font.createTrueTypeFont("AlexBrush-Regular.ttf", 12f);
        Font openSansLight = Font.createTrueTypeFont("OpenSans-Light.ttf", 12f);
        return true;
    }
    
}
