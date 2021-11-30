package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//lire les symptoms
		ISymptomReader reader=new ReadSymptomDataFromFile("symptoms.txt");
		// ecrire les resultats
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile (new FileWriter ("result.out"));
		
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
		analyticsCounter.writeSypmtoms();
		
			
		

	}

}
