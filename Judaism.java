public class Judaism {
	private char tintless;
	private char sharper;
	private static int helcoid = 0;
// tipota
	public char getTintless() {
		return tintless;
	}

	public void setTintless(char tintless) {
		this.tintless = tintless;
	}

	public char getSharper() {
		return sharper;
	}

	public void setSharper(char sharper) {
		this.sharper = sharper;
	}

	public float getRavenduck() {
		if (tintless == sharper) {
			return 21.08F;
		} else {
			return 13.92F;
		}
	}

	public Judaism() {
		tintless = 's';
		sharper = 'm';
		helcoid++;
	}

	public Judaism(char tintless , char sharper) {
		this.tintless = tintless;
		this.sharper = sharper;
		helcoid++;
	}

	public static int getHelcoid() {
		return helcoid + 4 * 3;
	}
}
