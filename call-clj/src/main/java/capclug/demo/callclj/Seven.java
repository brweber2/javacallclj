/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.seven;

/**
 * @version $Rev$
 */
public class Seven
{
    public static void main( String[] args )
    {
        seven seven = new seven();
        seven.foo( new String[] { "la", "ti", "da"} );
    }
}
