package com.cybage.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cybage.model.Role;
import com.cybage.model.UserPassword;
import com.cybage.services.UserService;
import com.cybage.services.UserServiceImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring/appServlet/servlet-context.xml"})
@WebAppConfiguration
public class UnitTesting 
{
	 private MockMvc mockMvc; 
	 @Autowired
	 private WebApplicationContext wac;
	
	
	 	@Before
		public void setup()
	 	{
			MockitoAnnotations.initMocks(this);
			this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
			System.out.println("In setup");
		}
	  
	    protected MockMvc getMockMvc() 
	    {
	    	if (mockMvc == null)
	        {
	            throw new RuntimeException("MockMVC has not been initialized");
	        }
	        return mockMvc;
	    }
	
	    
	     protected WebApplicationContext getWebApplicationContext()
	    {
	    	if (wac == null) 
	        {
	            throw new RuntimeException("WebApplicationContext is null");
	        }
	        return wac;
	    }
	
	    @Test
	    public void controllerTest() throws Exception
		{	
	    		 
	    
		mockMvc.perform(get("/user/roleinfo/cxo")).andExpect(status().isOk());

					
			
		}
	    @Test
	    public void serviceTest() throws Exception
		{	
	    	Role r=new Role("cxo", "create,update,view(client)","active");
	    	UserService us=new UserServiceImpl();
	    	Role a=us.searchRole("cxo");
	    	System.out.println(a.toString());
	    	assertEquals(a.getR_name(), r.getR_name());
	    	assertEquals(a.getR_desc(), r.getR_desc());
	    	assertEquals(a.getR_status(), r.getR_status());
	    	

					
			
		}
	    

}
