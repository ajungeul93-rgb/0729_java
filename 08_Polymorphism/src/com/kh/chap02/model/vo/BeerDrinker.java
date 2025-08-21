package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker {
	
	private boolean gout;
	
	public BeerDrinker() {}
	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	
	
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	public boolean isGout() {
		return gout;
	}
	
	
	@Override
	public void drink() {
		System.out.println("∏∆¡÷∏¶ «— ¿‘ ∏∂Ω ¥œ¥Ÿ. ≤‹≤©≤‹≤©");
	}
	@Override	
	public void eat() {
		System.out.println("ƒ°≈≤¿ª «— ¿‘ ∏‘Ω¿¥œ¥Ÿ.æ‰æ‰");
	}
	

}
