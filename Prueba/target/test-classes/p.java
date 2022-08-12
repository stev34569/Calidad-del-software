
public class p {
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://localhost:44370/login.aspx");
	}
}
