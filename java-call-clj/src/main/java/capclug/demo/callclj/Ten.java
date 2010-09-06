/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.ten;

/**
 * @version $Rev$
 */
public class Ten
{
    public static void main( String[] args )
    {
        ten ten = new ten();
        ten.foo( "42d" );
        ten.bar( "43d" );
        ten.baz( "44d" ); // runtime exception!
    }
}
