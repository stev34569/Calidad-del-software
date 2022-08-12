import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	private WebDriver driver;
	
	By registerLinkLocator = By.linkText("Registro");
    By registerPacienteLinkLocator = By.linkText("Registro de Pacientes");
    By registerMedicosLinkLocator = By.linkText("Registro de Medicos");
    By registerEnfermerasLinkLocator = By.linkText("Registro de Enfermeras");
    By registerUsuariosLinkLocator = By.linkText("Registro de Usuario");
    By registerReservadeCitasLinkLocator = By.linkText("Reserva de Citas");
    By registerAtencióndeCitasLinkLocator = By.linkText("Atención de Citas");
    By HoraiosLinkLocator = By.linkText("Horarios");
    By registerHorariosMedicosLinkLocator = By.linkText("Horarios Medicos");
    By registerAgregarHorarioLinkLocator = By.linkText("Agregar Horario");
    By registerHorariosEnfermerasLinkLocator = By.linkText("Horarios Enfermeras");

    
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://localhost:44370/PanelGeneral.aspx");
	}
	

@Test
    public void testGooglepage() throws InterruptedException {
        WebElement buscar = driver.findElement(By.name("LoginUser$UserName"));
        buscar.sendKeys("security");
        WebElement buscar1 = driver.findElement(By.name("LoginUser$Password"));
        buscar1.sendKeys("security");
        Thread.sleep(1500);
        WebElement btnbuscar = driver.findElement(By.name("LoginUser$btnIngresar"));
        btnbuscar.click();
        Thread.sleep(1500);
        
    ;
        
        
    }
    @After
    public void turdown() {
        driver.quit();
    }

}


		
  