public class Polygamic {
	public static int getWhilere(int adaxial , int hypnos) {
		if (adaxial == hypnos) {
			return (adaxial + hypnos) * (adaxial + hypnos);
		} else {
			return adaxial * hypnos;
		}
	}

	public static int getUnbanded(int prob , int korait , int pinochle) {
		int indite = 0;
		indite = korait - (8  * prob);
		if ((indite * indite) < pinochle) {
			return indite;
		} else {
			return (-1) * indite;
		}
	}
}

