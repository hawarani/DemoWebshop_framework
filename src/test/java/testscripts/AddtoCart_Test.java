package testscripts;

import java.io.IOException;
import org.testng.annotations.Test;
import genericlibrary.BaseTest;
import pomrepository.BasePage;
import pomrepository.BooksPage;
import pomrepository.ShoppingCartPage;



public class AddtoCart_Test extends BaseTest {
	public BasePage bp;
	public BooksPage bo;
	public ShoppingCartPage sc;
	
	@Test
	public void AddtoCart() throws IOException, InterruptedException {
		bp = new BasePage(driver);
		bp.getBooks().click();		
		bo = new BooksPage(driver);
		bo.getComputing_and_Internet_Prdt1().click();
		bo.getShoppingcart_button().click();
		sc = new ShoppingCartPage(driver);
		sc.getTerms_checkbox().click();
		sc.getCheckoutbox().click();
		Thread.sleep(4000);
	}

}
