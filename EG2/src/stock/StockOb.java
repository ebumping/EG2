package stock;

import java.util.Scanner;

public class StockOb {
	private Double currentPrice;
	private String symbol;
	private Double yHigh;
	private Double yLow;
	private int volume;
	
	public Double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public Double getyHigh() {
		return yHigh;
	}
	
	public void setyHigh(Double yHigh) {
		this.yHigh = yHigh;
	}
	
	public Double getyLow() {
		return yLow;
	}
	
	public void setyLow(Double yLow) {
		this.yLow = yLow;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public StockOb(Double currentPrice, String symbol, Double yHigh, Double yLow, int volume){
		this.currentPrice = currentPrice;
		this.symbol = symbol;
		this.yHigh = yHigh;
		this.yLow = yLow;
		this.volume = volume;
	}
	//no arg contructor allows no arg objects
	public StockOb(){
		
	}
	
	public String calcRise(){
		double rise = (this.yHigh - this.currentPrice)/this.currentPrice*100;
		return "%" + String.valueOf(rise);
	}
	
	public String calcFall(){
		double fall = (this.yLow - this.currentPrice)/this.currentPrice*100;
		return "%" + String.valueOf(fall);
	}
	
	public String toString(){
		return "Symbol : " + this.symbol + "\nCurrent Price : " + this.currentPrice + "\nYearly High: "+  this.yHigh  + "\nRise: " + calcRise() + "\nFall: " + calcFall() + "\nYearly Low: " + this.yLow + "\nVolume : " + this.volume;
	}
	
	
}
