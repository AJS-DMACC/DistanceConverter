package model;

import java.text.DecimalFormat;

public class DistConverter {
	private int inches;
	final int FEET = 12;//how many inches in a foot
	final DecimalFormat df = new DecimalFormat("#.##");
	private float centimeters;
	private float meters;
	private float miles;
	private float mountEverest;
	private float statueOfLiberty;
	
	public DistConverter() {
		super();
	}
	
	public DistConverter(int feet, int inches) {
		super();
		this.inches = inches + (FEET * feet);
		//System.out.println("Inches:" + this.inches);
		setDistances(this.inches);
	}

	private void setDistances(int inch) {
		final float CENTIMETERS = 0.393701f;//inches in a centimeter
		final float METERS = 39.3701f;//inches in a meter
		final float MILES = 63360;//inches in a mile
		final float EVEREST = 348348f;//inches in mount everest
		final float STATUE = 3660f;//inches in statue of liberty
		
		setCentimeters(inch/CENTIMETERS);
		setMeters(inch/METERS);
		setMiles(inch/MILES);
		setMountEverest(inch/EVEREST);
		setStatueOfLiberty(inch/STATUE);
	}
	
	@Override
	public String toString() {
		return "Distance Converter [" + getCentimeters() + "cm] [" + getMeters() + "m] [" + getMountEverest() + "]";
	}

	public int getInches() {
		return Integer.parseInt(df.format(inches));
	}

	public void setInches(int inches) {
		this.inches = inches;
		setDistances(inches);
	}

	public float getCentimeters() {
		return Float.parseFloat(df.format(centimeters));
	}

	public void setCentimeters(float centimeters) {
		this.centimeters = centimeters;
	}

	public float getMeters() {
		return Float.parseFloat(df.format(meters));
	}

	public void setMeters(float meters) {
		this.meters = meters;
	}

	public float getMiles() {
		return Float.parseFloat(df.format(miles));
	}

	public void setMiles(float miles) {		
		this.miles = miles;
	}

	public float getMountEverest() {
		return Float.parseFloat(df.format(mountEverest));
	}

	public void setMountEverest(float mountEverest) {
		this.mountEverest = mountEverest;
	}

	public float getStatueOfLiberty() {
		return Float.parseFloat(df.format(statueOfLiberty));
	}

	public void setStatueOfLiberty(float statueOfLiberty) {
		this.statueOfLiberty = statueOfLiberty;
	}

}
