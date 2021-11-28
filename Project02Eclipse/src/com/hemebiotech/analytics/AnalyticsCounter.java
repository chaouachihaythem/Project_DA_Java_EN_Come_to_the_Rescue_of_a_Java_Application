package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	private TreeMap<String,Integer> symptoms;
	private ISymptomReader reader;
	private ISymptomWriter writer;
	



	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
    }
	
	
	public int countSymptoms() {
		int count=0;
		this.symptoms=new TreeMap<String,Integer>();

		for(String symptom : this.reader.GetSymptoms())
		{
			if(this.symptoms.containsKey(symptom))
			{
				this.symptoms.put(symptom, this.symptoms.get(symptom) + 1);
			}
			else
			{
				this.symptoms.put(symptom, +1);
			}
			count=count+this.symptoms.get(symptom);
		}
		return count;
	} 
	
	public void writeSypmtoms() {
		this.countSymptoms();
		
		for (Map.Entry<String, Integer> entry : this.symptoms.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    try {
				this.writer.WriteSymptoms(key, value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // ..
		}
		try {
			this.writer.Close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	}
	

