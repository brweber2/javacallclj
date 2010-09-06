/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.six;

/**
 * @version $Rev$
 */
public class Six
{
    public static void main( String[] args )
    {
        six six = new six();
        six.datila( "ooohh", 4 );
        // six.foo( "huh?", 2 ); // silently didn't compile????
        six.latida( 3, "uggh" ); // runtime exception!
    }
}
