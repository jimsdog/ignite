/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.managers.systemview.walker;

import java.net.InetSocketAddress;
import org.apache.ignite.spi.systemview.view.ClientConnectionView;
import org.apache.ignite.spi.systemview.view.SystemViewRowAttributeWalker;

/**
 * Generated by {@code org.apache.ignite.codegen.SystemViewRowAttributeWalkerGenerator}.
 * {@link ClientConnectionView} attributes walker.
 * 
 * @see ClientConnectionView
 */
public class ClientConnectionViewWalker implements SystemViewRowAttributeWalker<ClientConnectionView> {
    /** {@inheritDoc} */
    @Override public void visitAll(AttributeVisitor v) {
        v.accept(0, "connectionId", long.class);
        v.accept(1, "localAddress", InetSocketAddress.class);
        v.accept(2, "remoteAddress", InetSocketAddress.class);
        v.accept(3, "type", String.class);
        v.accept(4, "user", String.class);
        v.accept(5, "version", String.class);
    }

    /** {@inheritDoc} */
    @Override public void visitAll(ClientConnectionView row, AttributeWithValueVisitor v) {
        v.acceptLong(0, "connectionId", row.connectionId());
        v.accept(1, "localAddress", InetSocketAddress.class, row.localAddress());
        v.accept(2, "remoteAddress", InetSocketAddress.class, row.remoteAddress());
        v.accept(3, "type", String.class, row.type());
        v.accept(4, "user", String.class, row.user());
        v.accept(5, "version", String.class, row.version());
    }

    /** {@inheritDoc} */
    @Override public int count() {
        return 6;
    }
}
