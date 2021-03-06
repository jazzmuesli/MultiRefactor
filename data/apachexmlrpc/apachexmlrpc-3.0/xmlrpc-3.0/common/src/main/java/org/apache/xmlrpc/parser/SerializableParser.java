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
package org.apache.xmlrpc.parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.xmlrpc.XmlRpcException;


/** A parser for serializable objects.
 */
public class SerializableParser extends ByteArrayParser {
	public Object getResult() throws XmlRpcException {
		try {
			byte[] res = (byte[]) super.getResult();
			ByteArrayInputStream bais = new ByteArrayInputStream(res);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (IOException e) {
			throw new XmlRpcException("Failed to read result object: " + e.getMessage(), e);
		} catch (ClassNotFoundException e) {
			throw new XmlRpcException("Failed to load class for result object: " + e.getMessage(), e);
		}
	}
}
