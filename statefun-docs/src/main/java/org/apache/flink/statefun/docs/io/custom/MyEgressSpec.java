/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.flink.statefun.docs.io.custom;

import org.apache.flink.statefun.sdk.EgressType;
import org.apache.flink.statefun.sdk.io.EgressIdentifier;
import org.apache.flink.statefun.sdk.io.EgressSpec;

public class MyEgressSpec<T> implements EgressSpec<T> {

  public static final EgressType TYPE = new EgressType("org.apache.flink", "my-egress");

  private final EgressIdentifier<T> identifier;

  public MyEgressSpec(EgressIdentifier<T> identifier) {
    this.identifier = identifier;
  }

  @Override
  public EgressType type() {
    return TYPE;
  }

  @Override
  public EgressIdentifier<T> id() {
    return identifier;
  }
}
