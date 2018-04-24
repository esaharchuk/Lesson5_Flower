package by.htp.lsn.flower.runner;

import by.htp.lsn.flower.model.Flower;
import by.htp.lsn.flower.model.Gardener;

public class MainApp {

	public static void main(String[] args) {

		Gardener gardener = new Gardener("John");

		Flower fl = new Flower("Rose", "Red");
		gardener.informAboutFlowerState(fl);

		fl.bloom(5);
		gardener.informAboutFlowerState(fl);

		fl.litleFade();
		gardener.informAboutFlowerState(fl);

		fl.totalFade();
		gardener.informAboutFlowerState(fl);

	}

}
