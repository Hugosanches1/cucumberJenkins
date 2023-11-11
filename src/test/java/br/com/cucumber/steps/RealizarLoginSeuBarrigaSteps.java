package br.com.cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RealizarLoginSeuBarrigaSteps {
	
	WebDriver driver;
	
	@Dado("^que acessei o endereco da aplicacao")
	public void queAcesseiOEnderecoDaAplicacao() {
		
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
		//driver  = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
	}
	
	@Quando("^informar os dados de acesso e confirmar")
	public void informarOsDadosDeAcessoEConfirmar() {
		
		driver.findElement(By.id("email")).sendKeys("hugos@hugos");
		driver.findElement(By.id("senha")).sendKeys("134");
		driver.findElement(By.xpath("//button[text()='Entrar']")).click();
		
	}
	
	@Entao("^o login eh realizado com sucesso")
	public void oLoginEhRealizadoComSucesso() {
		
		Assert.assertEquals("Bem vindo, hugos!", driver.findElement(By.xpath("//div[text()='Bem vindo, hugo!']")).getText());
		
		driver.close();
		
	}

}
