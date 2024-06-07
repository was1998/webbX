package ActionHelper;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class ActionHelper implements ActionHelperInterface {
	@Override
	public void enterText(Page page,String locator,String text) {

		page.locator(text).fill(locator);
	}
	

}
