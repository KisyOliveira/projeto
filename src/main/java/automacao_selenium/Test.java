package automacao_selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	WebDriver driver;
	
	@Before
	public void criarDriver() {
	
		
		driver = new ChromeDriver();
		driver.get("https://www.casasbahia.com.br/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
	}
	
	@org.junit.Test
	public void acessarDuvidas() {
		driver.findElement(By.id("Duvidas")).click();
		
	}
	@org.junit.Test
	public void fazerBusca() {
		String termoBusca = "panela";
		driver.findElement(By.id("strBusca")).sendKeys(termoBusca.toLowerCase());
		driver.findElement(By.id("stnOK")).click();
		String result = driver.findElement(By.className("nm-product-name")).getText();
		result = result.toLowerCase();
		
		boolean resultadoTeste;
		
		if (result.contains(termoBusca)) {
			System.out.println("Teste ok");
			resultadoTeste = true;
		} else {
			System.out.println("Erro na Pesquisa");
			System.out.println("O resultado encontrado foi:" + result);
			resultadoTeste = false;
		}
		
		Assert.assertTrue(resultadoTeste);
	}
	
	@After
	public void fecharDriver() {
		driver.close();
		driver.quit();
	}
	
	
	
}
