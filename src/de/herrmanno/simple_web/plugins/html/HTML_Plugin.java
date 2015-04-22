package de.herrmanno.simple_web.plugins.html;

import de.herrmanno.simple_web.plugins.file.File_Plugin;
import de.herrmanno.simple_web.plugins.html.config.Html_Config;

public class HTML_Plugin extends File_Plugin {


	public HTML_Plugin(Html_Config c) {
		super(c);
	}
	
	@Override
	public void register(de.herrmanno.simple_web.config.Config config) {
		config.getTypeConfig().register(new HTML_TypeHandler(c.getResourceDir()));
	}

	
}
