/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.cljfromjava.two.Foo;

/**
 * @version $Rev$
 */
public class Two
{
    public static void main( String[] args )
    {
        Foo foo = new Foo("bar string", "baz string");
        System.out.println( "foo.bar is " + foo.bar );
        System.out.println( "foo.baz is " + foo.baz );
    }
}
