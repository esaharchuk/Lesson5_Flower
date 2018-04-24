package by.htp.lsn.flower.model;

public class Flower {

	public String title;
	public String colour;
	public Petal[] petal;

	public Flower() {

	}

	public Flower(String title, String colour) {
		this.colour = colour;
		this.title = title;
	}

	public void bloom(int petalCount) {

		if (petalCount > 0) {
			petal = new Petal[petalCount];

			for (int i = 0; i < petalCount; i++) {
				petal[i] = new Petal(4, "oval", "white");
			}
			System.out.println();
		}
	}

	public void litleFade() {
		this.colour = "brown";
		for (int i = 0; i < this.petal.length; i += 3) {
			this.petal[i] = null;
		}
	}

	public void totalFade() {

		this.colour = "black";
		for (int i = 0; i < this.petal.length; i++) {
			if (this.petal[i] != null) {
				this.petal[i] = null;

			}
		}
	}
}