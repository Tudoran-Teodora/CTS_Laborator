package ro.ase.csie.cts.g1088.tema2.servicii;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieImprumutNegativ;

public interface InterfataValidare {

	public void validareValoareImprumut(double valoareImprumut) throws ExceptieImprumutNegativ;
}
