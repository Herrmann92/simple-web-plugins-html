package de.herrmanno.simple_web.plugins.html;

import de.herrmanno.simple_web.plugins.file.File;

public class HTML extends File {

	public HTML(String path) {
		super(path);
	}
	
	@Override
	public String getPath() {
		return path.endsWith(".html") ? path : (path+".html");
	}
}
