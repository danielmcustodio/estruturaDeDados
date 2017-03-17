package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {
	
	@Test
	public void loadStocks() throws IOException{
		StockManager stockManager = new StockManager();
		stockManager.loadStocks("Z:/Ibovespa/COTAHIST_A2016_TEST.txt");
	}

}
