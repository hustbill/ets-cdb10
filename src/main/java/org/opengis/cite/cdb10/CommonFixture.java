package org.opengis.cite.cdb10;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;

/**
 * A supporting base class that sets up a common test fixture. These
 * configuration methods are invoked before those defined in a subclass.
 */
public class CommonFixture {

    /**
     * Root test suite package (absolute path).
     */
    public static final String ROOT_PKG_PATH = "/org/opengis/cite/cdb10/";
    /**
     * Path to embedded sample CDB.
     */
    public static final String SAMPLE_CDB_PATH = "src/test/resources/CDB";
    
    protected String path;
    protected String directories;
    protected String latlong;
    protected String minmaxlod;

    /**
     * Obtains the test subject from the ISuite context. The suite attribute
     * {@link org.opengis.cite.cdb10.SuiteAttribute#TEST_SUBJECT} should
     * evaluate to a DOM Document node.
     *
     * @param testContext The test (group) context.
     */
    @BeforeClass
    public void obtainTestSubject(ITestContext testContext) {
        path = testContext.getSuite().getAttribute(
                SuiteAttribute.TEST_SUBJECT.getName()).toString().trim();
    }
}
