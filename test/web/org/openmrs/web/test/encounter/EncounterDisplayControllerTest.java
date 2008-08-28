/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.web.test.encounter;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.test.testutil.BaseContextSensitiveTest;
import org.openmrs.test.testutil.SkipBaseSetup;
import org.openmrs.web.controller.encounter.EncounterDisplayController;
import org.openmrs.web.controller.encounter.EncounterDisplayController.FieldHolder;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

/**
 * Test the methods on the org.openmrs.web.controller.encounter.EncounterDisplayController
 */
public class EncounterDisplayControllerTest extends BaseContextSensitiveTest {

	protected static final String DISPLAY_CONTROLLER_DATA = "org/openmrs/web/test/encounter/include/EncounterDisplayControllerTest.xml";
	
	/**
	 * Makes sure that the processing done in the encounter form
	 * controller is done properly for a normal encounter
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
    @Test
    @SkipBaseSetup
    public void shouldGetNormalEncounterPageData() throws Exception {
		initializeInMemoryDatabase();
		executeDataSet(DISPLAY_CONTROLLER_DATA);
		authenticate();
		
		MockHttpServletRequest request = new MockHttpServletRequest();
		request.setParameter("encounterId", "3");
		
		HttpServletResponse response = new MockHttpServletResponse();
		
		EncounterDisplayController controller = new EncounterDisplayController();
		
		ModelAndView modelAndView = controller.handleRequest(request, response);
		
		Map<String, Object> model = (Map<String, Object>)modelAndView.getModel().get("model");
		
		// make sure there is a "pages" element on the page
		Map<Integer, List<FieldHolder>> pages = (Map<Integer, List<FieldHolder>>)model.get("pages");
		Assert.assertNotNull(pages);
		
	}

}
