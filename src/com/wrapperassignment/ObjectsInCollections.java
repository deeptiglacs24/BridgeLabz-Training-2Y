package com.wrapperassignment;
import java.util.*;
public class ObjectsInCollections {
	public static void main(String[] args) {
		double[] p= {10.5, 20.0, 35.75, 5.5};
		ArrayList<Double> al=new ArrayList<>();
		for(int i=0;i<p.length;i++) {
			al.add(p[i]);
		}
		double h=Collections.max(al);
		double sum = 0;
        for (double l : al) {
            sum += l;
        }
        double avg = sum / al.size();
        System.out.println("Prices: " + al);
        System.out.println("Highest Price: " + h);
        System.out.println("Average Price: " + avg);
	}

}
