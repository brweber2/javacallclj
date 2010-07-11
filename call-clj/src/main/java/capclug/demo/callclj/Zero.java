/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

//import capclug.demo.cljfromjava.zero;
import capclug.demo.cljfromjava.zero__init;

import java.lang.reflect.Constructor;

/**
 * @version $Rev$
 */
public class Zero
{
    public static void main( String[] args )
    {
        zero__init.load();  // 

        // even this type of crap doesn't work
//        zero.whereDidIGo yuck = zero.whereDidIGo.class.getConstructors()[0].newInstance( new zero() );
//        System.out.println( "yuck is " + yuck );
    }
}
