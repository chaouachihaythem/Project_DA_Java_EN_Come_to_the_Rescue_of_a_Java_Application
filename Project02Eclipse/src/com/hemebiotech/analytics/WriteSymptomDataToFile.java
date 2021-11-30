package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter{

    private Writer writer ;

	public WriteSymptomDataToFile( Writer writer) {

		
		this.writer = writer;

	}

    @Override
	public void WriteSymptoms (String sypmtoms, int count) throws IOException {

		//ecrire les resultats nombre d'occurence pour chaque symptom

		this.writer.write(sypmtoms + ":" + count + "\n");
	}



	@Override
	public void Close() throws IOException {
		// TODO Auto-generated method stub
		this.writer.close();
	}

}
