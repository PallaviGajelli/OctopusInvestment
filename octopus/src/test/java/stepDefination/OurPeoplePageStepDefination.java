package stepDefination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurPeoplePageStepDefination {

	WebDriver driver;

//	public WebElement ScrollDown = driver.findElement(By.className("hero-scroll__txt"));
//	public WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"info-modal\"]/div[2]/div/button"));
//	public WebElement PersonNameH3 = driver
//			.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[1]/h3"));
//	public WebElement PersonTeam = driver
//			.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[1]/p"));
//	public WebElement PersonContactNo = driver
//			.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[2]/a[1]"));
//	public WebElement PersonEmailID = driver
//			.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[2]/a[2]"));
//	public WebElement PersonImg = driver.findElement(By.xpath("//*[@id=\"grid\"]/div/a/div/img"));
//	public WebElement Noresultsfound = driver.findElement(By.xpath("//*[@id=\"grid\"]/p"));
//
//	public WebElement SearchBox = driver
//			.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
//	public WebElement SearchNameValidation = driver.findElement(By.xpath("//*[@id=\"grid\"]/div/a/h2"));
//	public WebElement SearchBtn = driver.findElement(
//			By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/span/img"));
//	public WebElement SortBy = driver.findElement(By.className("jq-selectbox__select-text"));
//	public WebElement SortAZ = driver.findElement(
//			By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[3]/div/div[2]/ul/li[1]"));
//	public WebElement SortZA = driver.findElement(
//			By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[3]/div/div[2]/ul/li[2]"));
//	public WebElement ClientRelationsTeam = driver.findElement(
//			By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[4]/label[2]/span"));
//	public WebElement   = driver.findElement(By));
//	public WebElement   = driver.findElement(By));
//	public WebElement   = driver.findElement(By));
//	public WebElement   = driver.findElement(By));
//	public WebElement   = driver.findElement(By));

	@After
	public void close() {
		System.out.println("close");
		// driver.close();
	}

	@Given("^you are on octopus website$")
	public void you_are_on_octopus_website() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Working\\Pallavi\\testing\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://octopusinvestments.com/investor/about-us/our-people/");
		driver.manage().window().maximize();
		Thread.sleep(2);

		Actions a = new Actions(driver);
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();

	}

	@When("^search for Chloe Allan ,who is there in the list\\.$")
	public void search_for_who_is_there_in_the_list() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement ScrollDown = driver.findElement(By.className("hero-scroll__txt"));
		ScrollDown.click();

//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(ScrollDown)).click();;

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", SearchBox);

//		Actions action = new Actions(driver);
//		action.moveToElement(SearchBox).release(SearchBox);
		// action.moveToElement(SearchBox).sendKeys("Patrick Deane").build().perform();
		WebElement SearchBtn = driver.findElement(
				By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/span/img"));
		WebElement SearchBox = driver
				.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
		SearchBox.sendKeys("Chloe Allan");
		SearchBtn.click();

	}

	@Then("^Then Validate that Chloe Allan found was correct$")
	public void Then_Validate_that_Chloe_Allan_found_was_correct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchNameValidation = driver.findElement(By.xpath("//*[@id=\"grid\"]/div/a/h2"));
		SearchNameValidation.getText().equalsIgnoreCase("Chloe Allan");

	}

	@When("^Click on the image$")
	public void click_on_the_image() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement PersonImg = driver.findElement(By.linkText("Chloe Allan"));
		PersonImg.click();
	}

	@Then("^verify that the profile details match the person found$")
	public void verify_that_the_profile_details_match_the_person_found() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement PersonNameH3 = driver
				.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[1]/h3"));
		 WebElement PersonTeam = driver
				.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[1]/p"));
		 WebElement PersonContactNo = driver
				.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[2]/a[1]"));
		 WebElement PersonEmailID = driver
				.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div[2]/a[2]"));
		PersonNameH3.getText().equalsIgnoreCase("Chloe Allan");
		PersonTeam.getText().equalsIgnoreCase("Business Development Manager");
		PersonContactNo.getText().equalsIgnoreCase("020 7131 3237");
		PersonEmailID.getText().equalsIgnoreCase("callan@octopusinvestments.com");

	}

	@Given("^go back on our-people search page$")
	public void go_back_on_our_people_search_page() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();

	}

	@When("^selected for Sort by A-Z$")
	public void selected_for_Sort_by_A_Z() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement SearchBtn = driver.findElement(
					By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/span/img"));
		 WebElement SearchBox = driver
					.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
		 WebElement SortBy = driver.findElement(By.className("jq-selectbox__select-text"));
		SearchBox.clear();
		SearchBox.sendKeys("A");
		 WebElement SortAZ = driver.findElement(
					By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[3]/div/div[2]/ul/li[1]"));
		SearchBtn.click();
		SortBy.click();
		SortAZ.click();

	}

	@Then("^Validate A-Z sorting order is correct$")
	public void validate_A_Z_sorting_order_is_correct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// List<WebElement> elementName=driver.findElements(By.className("search-result
		// row"));

		ArrayList<String> obtainedList = new ArrayList<>();
		List<WebElement> elementList = driver.findElements(By.className("search-result row"));
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));

	}

	@When("^selected for Sort by Z-A$")
	public void selected_for_Sort_by_Z_A() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SortBy = driver.findElement(By.className("jq-selectbox__select-text"));
		WebElement SortZA = driver.findElement(
				By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[3]/div/div[2]/ul/li[2]"));
		WebElement SearchBox = driver
				.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
		SearchBox.clear();

		SortBy.click();
		SortZA.click();

	}

	@Then("^Validate Z-A  sorting order is correct$")
	public void validate_Z_A_sorting_order_is_correct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ArrayList<String> obtainedList = new ArrayList<>();
		List<WebElement> elementList = driver.findElements(By.className("search-result row"));
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Collections.reverse(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));

	}

	@When("^search for Person Pallavi Gajelli$")
	public void search_for_Person_Pallavi_Gajelli() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchBox = driver
				.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
		WebElement SearchBtn = driver.findElement(
				By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/span/img"));
		SearchBox.clear();
		SearchBox.sendKeys("Pallavi Gajelli");
		SearchBtn.click();

	}

	@Then("^Validate that correst error msg is shown$")
	public void validate_that_correst_error_msg_is_shown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Noresultsfound = driver.findElement(By.xpath("//*[@id=\"grid\"]/p"));
		Noresultsfound.isDisplayed();
		Noresultsfound.getText().equalsIgnoreCase("No results found");

	}

	@When("^search for Chloe Allan ,who is there in the list$")
	public void search_for_Chloe_Allan_who_is_there_in_the_list() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchBox = driver
				.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/input"));
		SearchBox.clear();
		SearchBox.sendKeys("Chloe Allan");

	}

	@When("^Client relations team is selected$")
	public void client_relations_team_is_selected() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchBtn = driver.findElement(
				By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[1]/label/span/img"));
		WebElement ClientRelationsTeam = driver.findElement(
				By.xpath("/html/body/main/section[2]/div/div/div[1]/section/div[2]/form/div[4]/label[2]/span"));
		ClientRelationsTeam.click();
		SearchBtn.click();

	}

	@Then("^verify error msg No results found$")
	public void verify_error_msg_No_results_found() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Noresultsfound = driver.findElement(By.xpath("//*[@id=\"grid\"]/p"));
		Noresultsfound.isDisplayed();

	}

}
