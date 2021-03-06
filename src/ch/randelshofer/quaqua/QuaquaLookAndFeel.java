/*
 * @(#)QuaquaLookAndFeel.java  
 *
 * Copyright (c) 2003-2010 Werner Randelshofer, Immensee, Switzerland.
 * All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the
 * license agreement you entered into with Werner Randelshofer.
 * For details see accompanying license terms.
 */
package ch.randelshofer.quaqua;

/**
 * The QuaquaLookAndFeel is an extension for Apple's Mac Look and Feel and to
 * Apple's Aqua Look and Feel for Java 1.3 through 1.4 on Mac OS X 10.0 through 
 * 10.3. 
 * <p>
 * The Quaqua Look and Feel can not be used on other platforms than Mac OS X.
 * <p>
 * This class acts as a proxy to the look and feel provided by
 * <code>QuaquaManager.getLookAndFeel</code>.
 * <p>
 * This class may be less compatible than the look and feel instances provided 
 * by QuaquaManager, but it can be used in a chooser for look and feel's.
 * 
 * <h4>Usage</h4>
 * <pre>
 * import javax.swing.*;
 * 
 * UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
 * <pre>
 *
 * @author Werner Randelshofer, Hausmatt 10, CH-6405 Immensee, Switzerland
 * @version $Id: QuaquaLookAndFeel.java 361 2010-11-21 11:19:20Z wrandelshofer $
 */
public class QuaquaLookAndFeel extends LookAndFeelProxy {

    /** Creates a new instance of QuaquaLookAndFeel */
    public QuaquaLookAndFeel() {
        super(QuaquaManager.getLookAndFeel());
    }
}
