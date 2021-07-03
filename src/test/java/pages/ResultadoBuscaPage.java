package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;

	final String PRODUTO_BUSCA = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]";
	final String PRECO_PRODUTO = "//span[@id='price_inside_buybox']";

	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarProduto() {

		driver.findElement(By.xpath(PRODUTO_BUSCA)).click();

	}

	public String retornarValorProduto() {

		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();

	}

}
