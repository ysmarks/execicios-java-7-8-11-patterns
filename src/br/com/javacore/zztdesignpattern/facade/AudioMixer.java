package br.com.javacore.zztdesignpattern.facade;

import java.io.File;

public class AudioMixer {
	
	public File fix(VideoFile result) {
		System.out.println("AudioMixer: fixing audio...");
		return new File("tmp");
	}

}
