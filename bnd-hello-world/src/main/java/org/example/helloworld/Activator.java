package org.example.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
  public void start( final BundleContext bundleContext )
  {
    System.out.println( "Hello World!" );
  }

  public void stop( final BundleContext bundleContext )
  {
    System.out.println( "Goodbye World!" );
  }
}
