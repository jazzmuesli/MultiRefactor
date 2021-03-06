/*
 * Copyright 1999,2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xmlrpc.client;

import org.apache.xmlrpc.common.XmlRpcRequestProcessorFactory;


/** Interface of a client configuration for local rpc calls. Local
 * rpc calls are mainly useful for testing, because you don't need
 * a running server.
 */
public interface XmlRpcLocalClientConfig extends XmlRpcClientConfig,
		XmlRpcRequestProcessorFactory {
}
