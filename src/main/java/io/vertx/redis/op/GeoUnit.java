/**
 * Copyright (c) 2011-2016 The original author or authors
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.redis.op;

import io.vertx.codegen.annotations.VertxGen;

/**
 * GeoUnit represents a geo spatial unit it covers both the metric and imperial systems.
 *
 * @author <a href="mailto:plopes@redhat.com">Paulo Lopes</a>
 */
@VertxGen
public enum GeoUnit {

  /**
   * Meter
   */
  m,

  /**
   * Kilometer
   */
  km,

  /**
   * Mile
   */
  mi,

  /**
   * Feet
   */
  ft
}
