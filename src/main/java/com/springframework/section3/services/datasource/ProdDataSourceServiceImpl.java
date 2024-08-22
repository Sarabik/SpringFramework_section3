package com.springframework.section3.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("DataSourceService")
public class ProdDataSourceServiceImpl implements DataSourceService {

	@Override
	public String getDataSource() {
		return "prod";
	}

}
