package jeps_126;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
	
	public static void main(String args[]) throws Exception {
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		a.add("t");
		a.add("e");
		a.add("s");
		a.add("t");
		copyCollection(a, b);
	}
	
	protected static void copyCollection(List<String> origen, List<String> destino) {
		try {
			for (int i = 0; i < origen.size(); ++i) {
				destino.add(origen.get(i));
			}
			System.out.println("Collection copied: " + destino.stream().map(i -> i.toString()).collect(Collectors.joining("")));
		} catch (Exception e) {
			System.out.println("Exception in method copyCollection");
		}
	}
}
