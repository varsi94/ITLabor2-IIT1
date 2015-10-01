package torpedo;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface="torpedo.ITorpedo", targetNamespace="http://itlabor2/torpedo")
public class Torpedo implements ITorpedo {
	private boolean table[][];
	
	public Torpedo() {
		table = new boolean[10][];
		Random r = new Random();
		for (int i = 0; i < table.length; i++) {
			table[i] = new boolean[10];
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = r.nextBoolean();
			}
		}
	}

	@Override
	public boolean shot(int i, int j) {
		if (i > 0 && i <= 10 && j > 0 && j <= 10) {
			boolean result = table[i-1][j-1];
			System.out.println(String.format("(%d,%d)=%s", i, j, result));
			return result;
		} else {
			return false;
		}
	}

}