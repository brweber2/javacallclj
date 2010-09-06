/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.eight;

/**
 * @version $Rev$
 */
public class Eight
{
    public static void main( String[] args )
    {
        eight eight = new eight();
        eight.foo( 42d ); // takes any object!
        eight.bar( 43d ); // runtime exception! tries to cast Double to String
    }
}
