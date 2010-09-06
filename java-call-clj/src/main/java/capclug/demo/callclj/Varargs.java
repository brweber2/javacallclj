/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

/**
 * @version $Rev$
 */
public class Varargs<T extends Enum>
{
    public enum DAYS_OF_THE_WEEK {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public enum TIME {
        AM, PM
    }

    public static void main( String[] args )
    {
        Varargs<TIME> v = new Varargs<TIME>();
        v.foo("1", "2", "3");
        v.foo(TIME.AM, TIME.PM);
        v.foo(DAYS_OF_THE_WEEK.SAT, DAYS_OF_THE_WEEK.SUN );

        // this can't compile b/c it can't disambiguate the enum types
//        Varargs<DAYS_OF_THE_WEEK> v2 = new Varargs<DAYS_OF_THE_WEEK>();
//        v2.foo("1", "2", "3");
//        v2.foo(DAYS_OF_THE_WEEK.MON, DAYS_OF_THE_WEEK.WED, DAYS_OF_THE_WEEK.FRI );
//        v2.foo(DAYS_OF_THE_WEEK.SAT, DAYS_OF_THE_WEEK.SUN );
    }

    public void foo(String... args)
    {
        System.out.println( "args: " + args );
    }

    public void foo(T... args)
    {
        System.out.println( "args: " + args );
    }

    public void foo(DAYS_OF_THE_WEEK ... args )
    {
        System.out.println( "args: " + args );
    }
}
