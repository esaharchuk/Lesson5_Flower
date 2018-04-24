package by.htp.lsn.flower.model;

public class Gardener {

	public String name;

	public Gardener(String name) {
		this.name = name;
	}

	public void informAboutFlowerState(Flower flower) {

		if (flower != null) {
			System.out.println("Flower title" + flower.title);
			System.out.println("Flower color" + flower.colour);
			if (flower.petal != null) {
				informAboutFloerPetals(flower.petal);
			}

		}
	}

	public void informAboutFloerPetals(Petal[] petals) {
		System.out.println("Flower petals count" + getPetalsCount(petals));

		System.out.println("========Info about petals==========");
		for (Petal petal : petals) {
			if (petal != null) {
				System.out.println("petal size: " + petal.size);
				System.out.println("petal shape: " + petal.shape);
				System.out.println("petal color: " + petal.colour);
				System.out.println("_______________________________");
			}

		}
	}

	public int getPetalsCount(Petal[] petals) {

		int count = 0;
		for (Petal petal : petals) {
			if (petal != null) {
				count++;
			}
		}
		return count;
	}
}
