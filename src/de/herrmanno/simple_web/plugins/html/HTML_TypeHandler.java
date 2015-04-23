package de.herrmanno.simple_web.plugins.html;

import de.herrmanno.simple_web.plugins.file.File;
import de.herrmanno.simple_web.plugins.file.File_TypeHandler;

public class HTML_TypeHandler extends File_TypeHandler {

	public HTML_TypeHandler(String dir) {
		super(dir);
	}

	@Override
	public Class<? extends File> getHandledType() {
		return HTML.class;
	}

	
}
