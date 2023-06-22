// package com.example.demo.controller;

// import java.util.Arrays;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.test.context.ActiveProfiles;
// import org.springframework.test.web.servlet.MockMvc;
// import com.example.demo.util.PersonTestData;
// import com.example.demo.data.PersonData;
// import com.example.demo.service.data.DataServiceImpl;

// @SpringBootTest
// @AutoConfigureMockMvc
// @ActiveProfiles("test")
// public class DataTest {
    
//     @MockBean
//     DataServiceImpl manager;

//     @InjectMocks
//     Data data;

//     @Autowired
//     MockMvc mvc;

// 	@Autowired
// 	PersonTestData test;	
    
// 	@Test
// 	void testDeleteAllData() {
		
// 	}

// 	@Test
// 	void testDeleteData() {
		
// 	}

// 	@Test
// 	void testGetAllData() {
// 		PersonData data = test.getPersonData(Long.valueOf(1));
// 		List<PersonData> personDatas = Arrays.asList(data);

// 		Mockito.when(manager.getAllData()).thenReturn(personDatas);

		
// 	}

// 	@Test
// 	void testGetData() {
		
// 	}

// 	@Test
// 	void testSaveData() {
		
// 	}

// 	@Test
// 	void testUpdateData() {
		
// 	}

// }
