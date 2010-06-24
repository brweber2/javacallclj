/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import capclug.demo.HelloOne;

/**
 * @author bweber
 * @version $Rev$, $Date$
 */
public class CallCompiledClojure
{
    public static void main( String[] args )
    {
        HelloOne hello = new HelloOne();
        hello.hiya("Charlie Brown!");
        
        HelloOne.main( new String[] {"move","the","football"} );
    }
}
