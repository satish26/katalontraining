
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.util.List



def static "sampleLoginpage.Shop.navigatetoDetailsPage"(
    	String productName	
     , 	String urlProduct	) {
    (new sampleLoginpage.Shop()).navigatetoDetailsPage(
        	productName
         , 	urlProduct)
}


def static "sampleLoginpage.Shop.addToCart"(
    	String productName	
     , 	String urlProduct	) {
    (new sampleLoginpage.Shop()).addToCart(
        	productName
         , 	urlProduct)
}


def static "sampleLoginpage.Shop.applyCouponAndAddToCart"(
    	String productName	
     , 	String urlProduct	
     , 	String coupan	) {
    (new sampleLoginpage.Shop()).applyCouponAndAddToCart(
        	productName
         , 	urlProduct
         , 	coupan)
}


def static "sampleLoginpage.Shop.addToCartWithGlobalVariable"() {
    (new sampleLoginpage.Shop()).addToCartWithGlobalVariable()
}


def static "sampleLoginpage.Shop.applyCouponAndAddToCartWithGlobalVariable"() {
    (new sampleLoginpage.Shop()).applyCouponAndAddToCartWithGlobalVariable()
}

/**
	 * Click on select2 text box.
	 */
def static "sampleLoginpage.Utils.clickOnSelect2"(
    	TestObject to	) {
    (new sampleLoginpage.Utils()).clickOnSelect2(
        	to)
}

/**
	 * Find the container class after the select element.
	 */
def static "sampleLoginpage.Utils.findContainer"(
    	TestObject to	) {
    (new sampleLoginpage.Utils()).findContainer(
        	to)
}

/**
	 * Select the result after filling text search to select2 text box.
	 */
def static "sampleLoginpage.Utils.selectResult"(
    	String option	
     , 	String subContainerOpenClass	) {
    (new sampleLoginpage.Utils()).selectResult(
        	option
         , 	subContainerOpenClass)
}

/**
	 * Enter text search to the select2 text box.
	 */
def static "sampleLoginpage.Utils.enterText"(
    	String option	) {
    (new sampleLoginpage.Utils()).enterText(
        	option)
}


def static "sampleLoginpage.Checkout.CheckoutShoplistpage"(
    	String firstname	
     , 	String lastname	
     , 	String companyname	
     , 	String Country	
     , 	String address	
     , 	String postcode	
     , 	String city	
     , 	String Phone	) {
    (new sampleLoginpage.Checkout()).CheckoutShoplistpage(
        	firstname
         , 	lastname
         , 	companyname
         , 	Country
         , 	address
         , 	postcode
         , 	city
         , 	Phone)
}

/**
	 * Select an option by label.
	 */
def static "sampleLoginpage.Select2.selectOptionByLabel"(
    	TestObject to	
     , 	String option	) {
    (new sampleLoginpage.Select2()).selectOptionByLabel(
        	to
         , 	option)
}

/**
	 * Select many options by labels. This method just applies for multiple value select boxes.
	 */
def static "sampleLoginpage.Select2.selectManyOptionsByLabel"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new sampleLoginpage.Select2()).selectManyOptionsByLabel(
        	to
         , 	options)
}

/**
	 * Get labels of selected options.
	 */
def static "sampleLoginpage.Select2.getSelectedOptionsLabel"(
    	TestObject to	) {
    (new sampleLoginpage.Select2()).getSelectedOptionsLabel(
        	to)
}

/**
	 * Get elements of selected options.
	 */
def static "sampleLoginpage.Select2.getSelectedOptionsList"(
    	TestObject to	) {
    (new sampleLoginpage.Select2()).getSelectedOptionsList(
        	to)
}

/**
	 * Get labels of all options.
	 */
def static "sampleLoginpage.Select2.getAllOptionsLabel"(
    	TestObject to	) {
    (new sampleLoginpage.Select2()).getAllOptionsLabel(
        	to)
}

/**
	 * Remove selected options. This method just applies for multiple value select boxes.
	 */
def static "sampleLoginpage.Select2.removeOptions"(
    	TestObject to	
     , 	java.util.List<String> options	) {
    (new sampleLoginpage.Select2()).removeOptions(
        	to
         , 	options)
}


def static "sampleLoginpage.Login.loginIntoApplication"(
    	String url	
     , 	String username	
     , 	String password	) {
    (new sampleLoginpage.Login()).loginIntoApplication(
        	url
         , 	username
         , 	password)
}


def static "sampleLoginpage.Login.loginIntoApplicationWithGlobalVariable"() {
    (new sampleLoginpage.Login()).loginIntoApplicationWithGlobalVariable()
}
