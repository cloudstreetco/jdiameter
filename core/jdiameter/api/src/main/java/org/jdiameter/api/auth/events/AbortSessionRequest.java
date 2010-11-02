/**
 * Copyright (c) 2006 jDiameter.
 * https://jdiameter.dev.java.net/
 *
 * License: Lesser General Public License (LGPL)
 *
 * e-mail: erick.svenson@yahoo.com
 *
 */
package org.jdiameter.api.auth.events;

import org.jdiameter.api.AvpDataException;
import org.jdiameter.api.app.AppRequestEvent;

/**
 * A Abort Session Request is a request from a client to a server
 * 
 * @version 1.5.1 Final
 */

public interface AbortSessionRequest extends AppRequestEvent {

  public static final String _SHORT_NAME = "ASR";
  public static final String _LONG_NAME = "Abort-Session-Request";

  public static final int code = 274;

  /**
   * Return Auth-Application-Id value of request
   * 
   * @return Auth-Application-Id value of request
   * @throws org.jdiameter.api.AvpDataException
   *             if avp is not integer
   */
  long getAuthApplicationId() throws AvpDataException;

  boolean hasAuthApplicationId();

  void setAuthApplicationId(long val);

  long getOriginStateId() throws AvpDataException;

  boolean hasOriginStateId();

  void setOriginStateId(long val);

  boolean hasTerminationCause();

  int getTerminationCause() throws AvpDataException;

  void setTerminationCause(int val);

  boolean hasUserName();

  String getUserName() throws AvpDataException;

  void setUserName(String val);
}
