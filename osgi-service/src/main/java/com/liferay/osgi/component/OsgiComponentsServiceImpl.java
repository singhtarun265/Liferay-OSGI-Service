package com.liferay.osgi.component;

import com.liferay.osgi.component.api.OsgiComponentService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Argil DX
 */
@Component(
		name="com.liferay.osgi.component.OsgiComponentsServiceImpl",
	    immediate = true,
	    property = {
	    		"service.vendore=Liferay OSGI",
                "service.description=Sample OSGI Component Service",
	    },
	    service = OsgiComponentService.class
	)
public class OsgiComponentsServiceImpl implements OsgiComponentService {

	@Override
	public void checkOsgiComponentService(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Hello i am implement interface" + msg);
	}

	@Reference
	private OsgiComponentService osgiComponentService;

}