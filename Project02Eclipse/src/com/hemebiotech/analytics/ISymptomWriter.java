package com.hemebiotech.analytics;

import java.io.IOException;


public interface ISymptomWriter { 
	
	//ecrire les symptoms
	void WriteSymptoms (String sypmtoms, int count) throws IOException;
	void Close () throws IOException;
}
   
