package br.com.javacore.zztdesignpattern.facade.testes;

import java.io.File;

import br.com.javacore.zztdesignpattern.facade.VideoConversionFacade;

public class FacadeDemo {

	public static void main(String[] args) {
		VideoConversionFacade conversionFacade = new VideoConversionFacade();
		File mp4Video = conversionFacade.convertVideo("youtubevideo.ogg", "mp4");
	}
}
