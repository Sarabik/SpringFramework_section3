package com.springframework.section3.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class QADataSourceControllerTest {

	@Autowired
	DataSourceController controller;

	@Test
	void getSource() {
		System.out.println(controller.getSource());
	}
}