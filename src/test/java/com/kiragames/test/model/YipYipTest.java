package com.kiragames.test.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.kiragames.controller.YipYipController;
import com.kiragames.dao.interfaces.IYipYipDAO;
import com.kiragames.model.YipYip;
import com.kiragames.service.YipYipService;

@RunWith(SpringRunner.class)
class YipYipTest {
	private YipYip yy = new YipYip();
	
	@Autowired
	private YipYipService yys;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void makeYipYip() {
		yy.setMessage("YipYip, Appa!");
		yys.save(yy);
		YipYip yy2 = yys.findAll().get(0);
		System.out.println(yy2.toString() );
		
		assertTrue(yy == yy2);
	}

}
