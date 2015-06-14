package it.rhai.test;

import it.rhai.identification.JTSASequencer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class JTSASequencerTest {
	
	private static JTSASequencer sequencer = new JTSASequencer();
	private static File file = new File("lavatrice.csv");
	
	
	static{
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("ciao");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBuildSequence() throws IOException {
		sequencer.buildSequence(file );
	}

}