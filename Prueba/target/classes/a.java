
public class a {
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "/Prueba/src/test/java/chromedriver.exee");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://localhost:44370/login.aspx");
	}
}
