package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/ObjectReferenceFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-OS12.X-Xcode12.4-sans-NAS/jdk8u431/1359/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, September 30, 2024 8:07:08 AM GMT
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public final class ObjectReferenceFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.ObjectReferenceFactory value = null;

  public ObjectReferenceFactoryHolder ()
  {
  }

  public ObjectReferenceFactoryHolder (org.omg.PortableInterceptor.ObjectReferenceFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.type ();
  }

}
