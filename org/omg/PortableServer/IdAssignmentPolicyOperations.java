package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-OS12.X-Xcode12.4-sans-NAS/jdk8u431/1359/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, September 30, 2024 8:07:08 AM GMT
*/


/**
	 * IdAssignmentPolicy specifies whether Object Ids in 
	 * the created POA are generated by the application or 
	 * by the ORB. The default is SYSTEM_ID.
	 */
public interface IdAssignmentPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.IdAssignmentPolicyValue value ();
} // interface IdAssignmentPolicyOperations
