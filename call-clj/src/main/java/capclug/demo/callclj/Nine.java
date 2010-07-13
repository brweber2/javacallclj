/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.nine;

/**
 * @version $Rev$
 */
public class Nine
{
    public static void main( String[] args )
    {
        nine nine = new nine();
        nine.foo( "42d" ); // requires a String!

        nine.bar( "43d" );
    }
}
