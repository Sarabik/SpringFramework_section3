package com.springframework.section3.controllers.datasource;

import com.springframework.section3.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

	private final DataSourceService service;

	public DataSourceController(@Qualifier("DataSourceService") final DataSourceService service) {
		this.service = service;
	}

	public String getSource() {
		return service.getDataSource();
	}
}
