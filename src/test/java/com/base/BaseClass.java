package com.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author PC
 * @Date 23.01.2023
 * @see Used to maintain all reusable methods
 *
 */
public class BaseClass {
	public static WebDriver driver;
	
	
	//1
	/**
	 * @see To initialize the browser
	 */
	public static void webdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	//2
	/**
	 * @see To launch the application
	 * @param url
	 */
	public static void webAppln(String url) {
		driver.get(url);
	}
	//3
	/**
	 * @see To get the current url from the browser
	 * @return
	 */
	public String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	//4
	/**
	 * @see To close the current window 
	 */
	public static void close() {
		driver.close();
	}
	//5
	/**
	 * @see To close all the windows
	 */
	public static void quit() {
		driver.quit();
	}
	//6
	/**
	 * @see To maximize the window
	 */
	public static void maximizewindow() {
		driver.manage().window().maximize();
	}
	//7
	/**
	 * @see To send values to the WebElement 
	 * @param element
	 * @param data
	 */
	public void sendkeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	//8
	/**
	 * @see to get the locator of WebElement by using name
	 * @param Attributevalue
	 * @return
	 */
	public WebElement findelementbyname(String Attributevalue) {
		WebElement element = driver.findElement(By.name(Attributevalue));
		return element;
	}
	//9
	/**
	 * @see to get the locator of WebElement by using id
	 * @param Attributevalue
	 * @return
	 */
	public WebElement findelementbyid(String Attributevalue) {
		WebElement element = driver.findElement(By.id(Attributevalue));
		return element;
	}
	//10
	/**
	 * @see to get the locator of WebElement by using classname
	 * @param Attributevalue
	 * @return
	 */
	public WebElement findelementbyclass(String Attributevalue) {
		WebElement element = driver.findElement(By.className(Attributevalue));
		return element;

	}
	//11
	/**
	 * @see to get the locator of WebElement by using xpath
	 * @param Attributevalue
	 * @return
	 */
	public WebElement findelementbyxpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	//12
	/**
	 * @see To click on the particular WebElement
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();
	}
	//13
	/**
	 * @see To clear/delete the values in the particular WebElement
	 * @param element
	 */
	public void clear(WebElement element) {
		element.clear();
	}
	//14
	/**
	 * @see To the Title of the page
	 * @return
	 */
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	//15
	/**
	 * @see To get text from the webPage
	 * @param element
	 * @return
	 */
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	//16
	/**
	 * @see To get Attribute value from the page
	 * @param element
	 * @param AttributeName
	 * @return
	 */
	public String getAttribute(WebElement element,String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}
	//17
	/**
	 * @see To get the pagesource or HTML source from webpage
	 * @return
	 */
	public String pagesource() {
		String source = driver.getPageSource();
		return source;

	}
	//18
	/**
	 * @see To get the particular window
	 * @return
	 */
	public String window() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	//19
	/**
	 * @see To get all the active windows
	 * @return
	 */
	public Set<String> allwindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	//20
	/**
	 * @see To get the hashcode of the given inputs
	 * @return
	 */
	public int hashcode() {
		int hashCode = driver.hashCode();
		return hashCode;
	}
	//21
	/**
	 * @see To send the values in the webElement using Javascript
	 * @param element
	 * @param data
	 */
	public void sendkeysjs(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', data )",element );
	}
	//22
	/**
	 * @see To click the particular webElement using javascript
	 * @param element
	 */
	public void clickjs(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}
	//23
	/**
	 * @see To select option from the dropdown by visible text
	 * @param element
	 * @param text
	 */
	public void selectbyvisibletext(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	//24
	/**
	 * @see To select option from the dropdown by attribute
	 * @param element
	 * @param text
	 */
	public void selectbyattribute(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	//25
	/**
	 * @see To select option from the dropdown by index value
	 * @param element
	 * @param text
	 */
	public void selectbyindex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	//26
	/**
	 * @see To Launch the browser
	 */
	public void browserlaunch() {
		WebDriver driver=new ChromeDriver();
	}
	//27
	/**
	 * @see To switch to another frame by index value
	 * @param index
	 * @return
	 */
	public WebDriver framebyindex(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}
	//28
	/**
	 * @see To switch to another frame by id
	 * @param index
	 * @return
	 */
	public WebDriver framebyid(String id) {
		WebDriver frame = driver.switchTo().frame("id");
		return frame;
	}
	//29
	/**
	 * @see To select all options from the dropdown by text
	 * @param element
	 * @param text
	 * @return
	 */
	public String dropdownalltext(WebElement element,String text) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element1 = options.get(i);
			String text1 = element1.getText();
			return text;
		}
		return text;


	}
	//30
	/**
	 * @see To select all options from the dropdown by attribute
	 * @param element
	 * @param text
	 * @return
	 */
	public String dropdownallAttribute(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element2 = options.get(i);
			String attribute2 = element.getAttribute("value");
			return attribute2;

		}
		return null;

	}
	//31
	/**
	 * @see To get the first selected option from the dropdown
	 * @param element
	 * @return
	 */
	public String firstselectedtext(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;

	}
	//32
	/**
	 * @see To check whether the dropdown is multiple or not
	 * @param element
	 * @return
	 */
	public boolean dropdownmultiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;


	}//33
	/**
	 * @see To perform explicitly wait
	 * @param timeout
	 */
	public void explicitlywait(Duration timeout) {
		WebDriver wait=(WebDriver) new WebDriverWait(driver,timeout);

	}
	//34
	/**
	 * @see To perform fluent wait
	 * @param input
	 */
	public void fluentwait(String input) {
		WebDriver wait=(WebDriver) new FluentWait(input);

	}
	//35
	/**
	 * @see To check whether the WebElement is displayed or not
	 * @param element
	 * @return
	 */
	public boolean webelementisdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	//36
	/**
	 * @see To check whether the WebElement is enabled or not
	 * @param element
	 * @return
	 */
	public boolean webelementisenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	//37
	/**
	 * @see To check whether the WebElement is selected or not
	 * @param element
	 * @return
	 */
	public boolean webelementisselected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	//38
	/**
	 * @see To deselect option from the dropdown by index
	 * @param element
	 * @param index
	 */
	public void deselectbyindex(WebElement element,int index) {
		Select s =new Select(element);
		s.deselectByIndex(index);

	}
	//39
	/**
	 * @see To deselect option from the dropdown by attribute
	 * @param element
	 * @param index
	 */
	public void deselectbyAttribute(WebElement element) {
		Select s =new Select(element);
		s.deselectByValue("value");

	}
	//40
	/**
	 * @see To deselect option from the dropdown by visible text
	 * @param element
	 * @param index
	 */
	public void deselectbyvisibletext(WebElement element, String text) {
		Select s =new Select(element);
		s.deselectByVisibleText(text);

	}
	//41
	/**
	 * @see To deselect all from the dropdown
	 * @param element
	 * @param index
	 */
	public void deselectall(WebElement element) {
		Select s =new Select(element);
		s.deselectAll();

	}
	//42
	/**
	 * @see To take screenshot for the page
	 * @return
	 */
	public File Screenshotfile() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotas=ts.getScreenshotAs(OutputType.FILE);
		return screenshotas;
	}
	//43
	/**
	 * @see To take screenshot for the particular WebElement
	 * @param element
	 * @return
	 */
	public File ScreenshotElement(WebElement element) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotas=ts.getScreenshotAs(OutputType.FILE);
		return screenshotas;
	}
	//44
	/**
	 * @see To perform mouseover action
	 * @param element
	 */
	public void mouseover(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();

	}
	//45
	/**
	 * @see To perform drag and drop for the element
	 * @param source
	 * @param target
	 */
	public void draganddrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	//46
	/**
	 * @see To rightclick at the particular WebElement
	 * @param element
	 */
	public void rightclick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();

	}//47
	/**
	 * @see To doubleclick at the particular WebElement
	 * @param element
	 */
	public void doubleclick(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	//48
	/**
	 * @see To send values using enter key
	 * @param element
	 * @param keysToSend
	 */
	public void textBox(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend,Keys.ENTER);

	}
	//49
	/**
	 * @see To refresh the page
	 */
	public void refresh() {
		driver.navigate().refresh();
	}
	//50
	/**
	 * @see To move to next page forward 
	 */
	public void forward() {
		driver.navigate().forward();

	}
	//51
	/**
	 * @see To move to next page backward
	 */
	public void backward() {
		driver.navigate().back();

	}
	//52
	/**
	 * @see To navigate to url
	 * @param url
	 */
	public void navigatetourl(String url) {
		driver.navigate().to(url);

	}
	//53
	/**
	 * @see To perform scroll up using javascript
	 * @param element
	 */
	public void scrollup(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(false)",element);

	}
	//54
	/**
	 * @see To perform scroll down using javascript
	 * @param element
	 */
	public void scrolldown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);

	}
	//55
	/**
	 * @see To perform get text using javascript
	 * @param element
	 */
	public void gettextjs(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')");
	}
	//56
	/**
	 * @see To Switch to alert
	 * @return
	 */
	public String getextalert() {
		String text = driver.switchTo().alert().getText();
		return text;

	}
	//57
	/**
	 * @see To click ok in the alert
	 * @return
	 */
	public String alertok() {
		driver.switchTo().alert().accept();
		return null;
	}
	//58
	/**
	 * @see To click cancel in the alert
	 * @return
	 */
	public String alertcancel() {
		driver.switchTo().alert().dismiss();
		return null;
	}
	//59
	/**
	 * @see To Sendvalues and click ok in the alert
	 * @return
	 */
	public void alertsendkeys(String keysToSend) {
		driver.switchTo().alert().sendKeys(keysToSend);

	}
	//60
	/**
	 * @see To change decimal value to string
	 * @param val
	 * @return
	 */
	public String tostring(int val) {
		BigDecimal b=new BigDecimal(val);
		String string = b.toString();
		return string;
	}
	//61
	/**
	 * @see To swtich to parent frame
	 */
	private void Swtichtoparentframe() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
    }
	//62
	/**
	 * @see To Check whether the webElement is equals or not
	 * @param element
	 * @return
	 */
	private boolean isequals(WebElement element) {
		boolean equals = driver.equals(element);
		return equals;

	}
	//63
	/**
	 * @see To switch to default page
	 */
	private void swichtoweb() {
		driver.switchTo().defaultContent();

	}
	//64
	/**
	 * @see To get the size of the WebElement
	 * @param element
	 * @return
	 */
	private Dimension elementsize(WebElement element) {
		Dimension size = element.getSize();
		return size;

	}
	//65
	/**
	 * @see To check whether the framesource contains character or not
	 * @return
	 */
	private boolean framesource() {
		String pageSource = driver.getPageSource();
		boolean contains = pageSource.contains("s");
		return contains;
	}
	//66 get value from excel
	/**
	 * @see To get value from excel
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws IOException
	 */
		public String readcelldata(String sheetname,int rownum,int cellnum) throws IOException {
			String res="";
	File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Task\\Excel\\Adact data.xlsx");
	FileInputStream input=new FileInputStream(file);
	Workbook work=new XSSFWorkbook(input);
	Sheet sheet = work.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	CellType type = cell.getCellType();
	switch (type) {
	case STRING:
		res=cell.getStringCellValue();
		break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			 Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");
			res=dateformat.format(dateCellValue);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
			res=valueOf.toString();
		}
		break;

	default:
		break;
	}
	return res;
	}
	//67 update value in excel	
		/**
		 * @see To update value in excel
		 * @param sheetname
		 * @param rownum
		 * @param cellnum
		 * @param olddata
		 * @param newdata
		 * @throws IOException
		 */
		public void updatecelldata(String sheetname,int rownum,int cellnum,String olddata,String newdata) throws IOException {
	File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Task\\Excel\\Country.xlsx");
	FileInputStream input=new FileInputStream(file);
	Workbook work=new XSSFWorkbook(input);
	Sheet sheet = work.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	String value = cell.getStringCellValue();
	if (value.equals(olddata)) {
		cell.setCellValue(newdata);
	}
	FileOutputStream output=new FileOutputStream(file);
	work.write(output);
		
	}
	//68 insert value by creating cell
		/**
		 * @see To insert value by creating cell
		 * @param sheetname
		 * @param rownum
		 * @param cellnum
		 * @param data
		 * @throws IOException
		 */
		public void insertcelldata(String sheetname,int rownum,int cellnum,String data) throws IOException {
	File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Task\\Excel\\Adact data.xlsx");
	FileInputStream input=new FileInputStream(file);
	Workbook work=new XSSFWorkbook(input);
	Sheet sheet = work.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.createCell(cellnum);
	cell.setCellValue(data);
	FileOutputStream output=new FileOutputStream(file);
	work.write(output);
}
	  //69
		/**
		 * @see Thread sleep
		 * @throws InterruptedException
		 */
		public void threadsleep() throws InterruptedException {
		Thread.sleep(10000);

	}
		//70
		/**
		 * @see To get the attribute value from the webElement
		 * @param element
		 * @return
		 */
		public String getAttributevalue(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
}
		//71
		/**
		 * @see 
		 * @param time
		 */
		public void implicitlywaits(int time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		//72
		/**
		 * @see To get the path of the Project
		 * @return
		 */
		public static String getProjectPath() {
			String path = System.getProperty("user.dir");
			return path;
        }
		//73
		/**
		 * @see To get property value from property file
		 * @param key
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 */
		public static String getPropertyvalue(String key) throws FileNotFoundException, IOException {
			Properties properties=new Properties();
			properties.load(new FileInputStream(getProjectPath()+"\\Config\\config.properties"));
			Object obj = properties.get(key);
			String value=(String) obj;
			return value;
		}
		//74
		/**
		 * @see To get the browser 
		 * @param browser
		 */
		public void getDriver(String browser) {
			switch (browser) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
		        break;
		        case "Internetexplorer":
		        	WebDriverManager.iedriver().setup();
		        	driver=new InternetExplorerDriver();
		        	break;
		        case "Edge":
		        	WebDriverManager.edgedriver().setup();
		        	driver=new EdgeDriver();
			default:
			}
		}
		//75
		/**
		 * @see To the screenshot of the page in byte format
		 * @return
		 */
		public byte[] screenshotbyte() {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] bs = ts.getScreenshotAs(OutputType.BYTES);
			return bs;
		}
	
		}
























