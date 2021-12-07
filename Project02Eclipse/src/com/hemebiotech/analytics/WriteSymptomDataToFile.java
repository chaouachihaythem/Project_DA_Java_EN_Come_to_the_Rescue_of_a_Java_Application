package com.hemebiotech.analytics;

import java.io.IOException;
import java.io.Writer;

public class WriteSymptomDataToFile implements ISymptomWriter {

	// ecrire les symptoms dans un fichier 
	
	private Writer writer;

	public WriteSymptomDataToFile(Writer writer) {

		this.writer = writer;

	}

	public void WriteSymptoms(String sypmtoms, int count) throws IOException {

		// ecrire les resultats : nombre d'occurence pour chaque symptom

		this.writer.write(sypmtoms + ":" + count + "\n");
	}

	public void Close() throws IOException {

		this.writer.close();
	}

}
