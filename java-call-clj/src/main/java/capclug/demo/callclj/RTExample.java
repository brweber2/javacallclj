/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import clojure.lang.Compiler;
import clojure.lang.ISeq;
import clojure.lang.RT;
import clojure.lang.Symbol;

/**
 * @version $Rev$
 */
public class RTExample
{
    /**
     * Java code for:
     * (println (+ 3 4))
     *
     * @param args ignored
     * @throws Exception uh oh
     */
    public static void main( String[] args ) throws Exception
    {
        // reader - build the data structure
        ISeq callMe = RT.list( Symbol.create( "+" ), 3, 4 );
        // evaluator - compile the data structure
        Object result = Compiler.eval( callMe, true );
        // print the result
        System.out.println("this nasty code gave me: " + result );
    }
}
