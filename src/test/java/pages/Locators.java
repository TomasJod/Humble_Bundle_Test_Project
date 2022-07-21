package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class HomePage {

        public static By inputSearchMessage = By.xpath("//*[@id=\"site-search\"]");
        public static By buttonViewAllResults = By.xpath("//*[@class=\"site-search-link js-search-link\"]");

        public static By fieldSearchViewAllResults = By.xpath("//span[contains(text(),'BATMAN')]");

        public static By firstResultClick = By.xpath("//*[@class = 'product-title'][1]");
        public static By fieldSearchDropDownResults = By.xpath("//span[contains(text(),'Lego')]");
        public static By clickAddToCart = By.xpath("//*[@class = 'add']");
        public static By fieldCartItemNumber = By.xpath("//*[@class = 'nav-item-content js-cart no-style-button white bounce']");
    }

    public static class GamesSection {

        public static By hoverOverFilter = By.xpath("//div[contains(@class, 'filter-dropdown')][1]");
        public static By selectFromDropDown = By.xpath("//*[@data-option-value='new']");
        public static By fieldResultsNewReleases = By.xpath("//h1[@class = 'js-title-text']");
    }

    public static class AgeOfEmpiresPublisher {

        public static By buttonPublisherName = By.xpath("//*[@class='property-view publishers-view js-admin-edit']");
        public static By buttonFirstGameInList = By.xpath("//*[@class='entity-link js-entity-link'][1]");
        public static By fieldPublisherName = By.xpath("//*[@class='property-view publishers-view js-admin-edit']");
    }
}
