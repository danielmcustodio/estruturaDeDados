package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {
	
	@Test
	public void loadStocksTest() throws IOException{
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("Z:/Ibovespa/COTAHIST_A2016.txt");
		
		for (Stock stock : stocks) {
			if(stock.getCodigo().equals("PETR4") && stock.getData().getDayOfMonth() == 21 & stock.getData().getMonthValue() == 3 & stock.getData().getYear() == 2016){
				System.out.println(stock.getCodigo() + "\t" + stock.getData() + "\t" + stock.getOpenPrice() + "\t" + stock.getMinPrice() + "\t" + stock.getMaxPrice());
			}
		}
	}

}
