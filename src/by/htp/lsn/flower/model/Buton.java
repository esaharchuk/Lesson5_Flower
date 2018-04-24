package by.htp.lsn.flower.model;

public class Buton {

	public String color;
	public int size;

	public Buton() {

	}

	public Buton(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public void bloom() {
		this.color = "Red";
		this.size = 30;
	}

	public void startFade() {
		this.color = "Brown";
		this.size = 20;
	}

	public void totalFade() {
		this.color = "Gray";
		this.size = 5;
	}

}
