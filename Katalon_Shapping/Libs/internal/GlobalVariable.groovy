package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : This is for e-shopping url</p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object waitPresentTimeout
     
    /**
     * <p></p>
     */
    public static Object urlProduct
     
    /**
     * <p></p>
     */
    public static Object firstname
     
    /**
     * <p></p>
     */
    public static Object lastname
     
    /**
     * <p></p>
     */
    public static Object companyname
     
    /**
     * <p></p>
     */
    public static Object Country
     
    /**
     * <p></p>
     */
    public static Object address
     
    /**
     * <p></p>
     */
    public static Object postcode
     
    /**
     * <p></p>
     */
    public static Object city
     
    /**
     * <p></p>
     */
    public static Object Phone
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object prod
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            username = selectedVariables['username']
            password = selectedVariables['password']
            waitPresentTimeout = selectedVariables['waitPresentTimeout']
            urlProduct = selectedVariables['urlProduct']
            firstname = selectedVariables['firstname']
            lastname = selectedVariables['lastname']
            companyname = selectedVariables['companyname']
            Country = selectedVariables['Country']
            address = selectedVariables['address']
            postcode = selectedVariables['postcode']
            city = selectedVariables['city']
            Phone = selectedVariables['Phone']
            email = selectedVariables['email']
            prod = selectedVariables['prod']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
