package com.parvez.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GreetingImplTest {
    private Greeting greeting;

    @Before
    public void setup() {
        System.out.println ("Setup");
        greeting = new GreetingImpl ();
    }


    @Test
    public void greetShouldReturnVallidOutput() {
        System.out.println ("greetShouldReturnValidOutput");
        //fail ("Not yet Implemented");
        String result = greeting.greet ( "Junit" );
        assertNotNull ( result );
        assertEquals ( "Hello Junit", result );
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsNull() {
        System.out.println ("greetShouldThrowAnExceptionForNameIsNull");
        greeting = new GreetingImpl ();
        greeting.greet ( null );

    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionForNameIsBlank() {
        System.out.println ("greetShouldThrowAnExceptionForNameIsBlank");
        greeting = new GreetingImpl ();
        greeting.greet ( "" );
    }

    @After
    public void teardown()
    {
        System.out.println ("teardown");
        greeting = null;
    }

} 
