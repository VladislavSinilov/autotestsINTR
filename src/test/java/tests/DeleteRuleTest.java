package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import mainpages.RuleMainPage;
import org.junit.jupiter.api.Test;
import pages.DeleteRulePage;
import utils.Constants;

public class DeleteRuleTest {

    @Test
    @Owner("Vladislav Sinilov")
    @Description("Canceling the deletion of the script execution rule")
    public void deleteRule() throws InterruptedException {
        String URL = Constants.URL;
        RuleMainPage deleteRuleMainPage = new RuleMainPage(URL);
        deleteRuleMainPage.actionsOnPage("CancelDeteleRule");
        Thread.sleep(5000);
        DeleteRulePage deleteRulePage = new DeleteRulePage();
        deleteRulePage.chooseButton("Cancel");
      //  need to finish
    }

    @Test
    @Owner("Vladislav Sinilov")
    @Description("Delete a Script Execution rule")
    public void cancelDeleteRule() throws InterruptedException {
        String URL = Constants.URL;
        RuleMainPage deleteRuleMainPage = new RuleMainPage(URL);
        deleteRuleMainPage.actionsOnPage("DeteleRule");
        Thread.sleep(5000);
        DeleteRulePage deleteRulePage = new DeleteRulePage();
        deleteRulePage.chooseButton("Delete");
        //  need to finish
    }
}
