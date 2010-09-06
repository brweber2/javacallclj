/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package capclug.demo.callclj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @version $Rev$
 */
public class Generics<T,E extends Enum,Q extends Comparator>
{
    public enum DAYS_OF_THE_WEEK {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    private List<E> foos = new ArrayList<E>();
    private List<T> bars = new ArrayList<T>();
    private List<C> sees = new ArrayList<C>();

    static class C implements Comparator
    {
        public int compare( Object o1, Object o2 )
        {
            return o1.hashCode() - o2.hashCode(); // don't ever do this!!!
        }
    }

    public static void main( String[] args )
    {
        Generics<String,DAYS_OF_THE_WEEK,C> g = new Generics<String,DAYS_OF_THE_WEEK,C>();
        g.foo(  DAYS_OF_THE_WEEK.MON );
        g.foo( "TUE" );
        g.foo( new C() );

        // this can't work... b/c two are of type enum and now we can't disambiguate....
//        Generics<DAYS_OF_THE_WEEK,DAYS_OF_THE_WEEK,C> g2 = new Generics<DAYS_OF_THE_WEEK,DAYS_OF_THE_WEEK,C>();
//        g2.foo( DAYS_OF_THE_WEEK.WED );
//        g2.foo( DAYS_OF_THE_WEEK.THU );
//        g2.foo( new C() );
    }

    public void foo(E e)
    {
        System.out.println( "calling foo with type E" );
        foos.add(e);
    }

    public void foo(T t)
    {
        System.out.println( "calling foo with type T" );
        bars.add(t);
    }

    public void foo(C c)
    {
        System.out.println( "calling foo with type C" );
        sees.add(c);
    }
}
