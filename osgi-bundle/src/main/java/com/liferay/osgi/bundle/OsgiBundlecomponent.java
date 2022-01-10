package com.liferay.osgi.bundle;

import com.liferay.osgi.component.OsgiComponentsServiceImpl;
import com.liferay.osgi.component.api.OsgiComponentService;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Argil DX
 */

public class OsgiBundlecomponent implements BundleActivator {

	private ServiceRegistration serviceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
		serviceRegistration = context.registerService(OsgiComponentService.class.getName(), new OsgiComponentsServiceImpl(), null);
        System.out.println("###########Service Registered Successfully##############");
    }

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		serviceRegistration.unregister();
        System.out.println("###########Service Unregistered##############");
         
    }
	
}