package model;

public class BMIConverter {
	private float BMI;
	private float pounds;
	private float inches;
	
	public BMIConverter() {
		super();
	}
	
	public BMIConverter(float pounds, float inches) {
		super();
		this.pounds = pounds;
		this.inches = inches;
		CalcBMI();
	}
	
	private void CalcBMI() {
		setBMI(pounds * 703 / (inches * inches));
	}

	public float getPounds() {
		return pounds;
	}

	public void setPounds(float pounds) {
		this.pounds = pounds;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	public float getBMI() {
		return BMI;
	}

	public void setBMI(float bMI) {
		BMI = bMI;
	}
}
