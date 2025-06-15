package com.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.v129.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	Select select;

	// 1.Browser Launch
	public static void BrowserLaunch() {
		driver = new ChromeDriver();

	}

	// 5 Enter url
	public static void enterUrl(String Url) {
		driver.get(Url);
	}

	// 6 Maximizw Window
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// 7 Sendkeys
	public void Elementsendkeys(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {

			element.sendKeys(data);
		}
	}

	// 8 Element Click
	public void elementClick(WebElement element) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

	// 9 Accept alert
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

	// 10 AlertClose
	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// 11 GetText
	public String getTextFromWebPage(WebElement element) {
		String string = element.getText();
		return string;

	}

	// 12 GetAttributeValue
	public String getValueFromTextBox(WebElement element, String value) {
		String string = element.getDomProperty(value);
		return string;
	}

	// 13 CloseWindow
	public void closeWindow() {
		driver.close();

	}

	// 14.GetTitle
	public String getTitle() {
		String title2 = driver.getTitle();
		return title2;
	}

	// 15 GetCurrentUrl
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 16 Select BY text
	public void selectByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 17 Select by Attribute Value
	public void selectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	// 18 Select by index
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 19 InsertValueByJavaScript
	public void insertValueByJavaScript(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','data')", element);
	}

	// 20 ClickByJavaScript
	public void clickByJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	// 21 Switch to Child Window
	public void switchToChildWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String eachWindow : windowHandles) {
			if (!eachWindow.equals(windowHandle)) {
				driver.switchTo().window(eachWindow);
			}
		}
	}

	// 22 Switch To Index
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 23 Switch to frame by Id or name
	public void switchToFrameIdorName(String IdorName) {
		driver.switchTo().frame(IdorName);
	}

	// 24 Switch frame by webelement
	public void SwitchFrameByWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 25 Find locator by id
	public WebElement findlocatorby(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	// 26 Find locator by Name
	public WebElement FindLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	// 27 Find Locator By Class name
	public WebElement FindLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className("attributeValue"));
		return element;
	}

	// 28. Find Locator by Xpath
	public WebElement FindlocatorByxpath(String exp) {
		WebElement element = driver.findElement(By.xpath(exp));
		return element;
	}

	// 30. Get The First Select option
	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 32. Multi Select Option
	public boolean isMultiSelect(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 33. Implicit Wait
	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	// 34. Explicit wait for visibility of
	public WebElement webDriverWait(String attributeValue, int secs) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(secs));
		WebElement element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(attributeValue)));
		return element;
	}

	// 36. is Displayed
	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 37. Is Enabled
	public boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 38. Is Selected
	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 39. Deselect by Index
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 40. Deselect By Text
	public void deSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 41. Deselect By Value
	public void deSelectByValue(WebElement element, String Value) {
		Select select = new Select(element);
		select.deselectByValue(Value);
	}

	// 42. Deselect All Selected Option
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 43. Clear Value
	public void clear(WebElement element) {
		element.clear();
	}

	// 44. Screenshot of the Page
	public void screenshot(String fileName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AMBatch\\screenshots\\" + fileName + ".png"));
	}

	// 45. ScreenShot of Element
	public void screenshotByWebElement(WebElement element, String fileName) throws IOException {
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AMBatch\\screenshots\\" + fileName + ".png"));
	}

	// 46. MouseOver Action for Single option
	public void mouseOverActions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	// 47. Drag and Drop
	public void dragAndDrop(String Attributevalue, String Attributevalue2) {
		WebElement element = driver.findElement(By.id(Attributevalue));
		WebElement element2 = driver.findElement(By.id(Attributevalue2));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element2);
	}

	// 48. Right Click
	public void rightClick() {
		Actions actions = new Actions(driver);
		actions.contextClick();
	}

	// 49. Double Click
	public void doubleClick() {
		Actions actions = new Actions(driver);
		actions.doubleClick();
	}

	// 50. SendKeysEnter
	public void SendkeysEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);

	}

	// 51 Navigate Command
	public void navigationCommands(String url) {
		Navigation navigate = driver.navigate();
		navigate.to(url);
		navigate.back();
		navigate.forward();
		navigate.back();
	}

	public void quitWindow() {
		driver.quit();

	}

	// 52 Page scroll
	public void scroll(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView()", element);

	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	// Update cell data
	private void updateCellData(String sheetName, int rownum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\MavenProject\\ExcelSheets\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		book.write(fileOutputStream);
	}

	// Create cell and give value
	public void createCellData(String sheetname, int rownum, int columnNum, String data) throws IOException {
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\MavenProject\\ExcelSheets\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(columnNum);
		cell.setCellValue(data);
		FileOutputStream fileoutput = new FileOutputStream(file);
		book.write(fileoutput);
	}

	// read value from cell
	public String getcelldata(String sheetName, int rownum, int cellnum) throws IOException {

		String res = null;
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\MavenProject\\ExcelSheets\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yy");
				DateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					String valueOf = String.valueOf(round);
				} else {
					String valueOf = String.valueOf(numericCellValue);

				}
			}
			break;
		default:
			break;
		}
		return res;

	}
}
