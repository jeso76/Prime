package se.ehm.prime;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Prime.
 */
public class PrimeTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrime()
    {
        assertTrue( true );
    }
}
