/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/OperationDescription.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:51 AM PDT
*/

public final class OperationDescription implements org.omg.CORBA.portable.IDLEntity
{
    public String name = null;
    public String id = null;
    public String defined_in = null;
    public String version = null;
    public org.omg.CORBA.TypeCode result = null;
    public com.sun.org.omg.CORBA.OperationMode mode = null;
    public String contexts[] = null;
    public com.sun.org.omg.CORBA.ParameterDescription parameters[] = null;
    public com.sun.org.omg.CORBA.ExceptionDescription exceptions[] = null;

    public OperationDescription ()
    {
    } // ctor

    public OperationDescription (String _name, String _id, String _defined_in, String _version, org.omg.CORBA.TypeCode _result, com.sun.org.omg.CORBA.OperationMode _mode, String[] _contexts, com.sun.org.omg.CORBA.ParameterDescription[] _parameters, com.sun.org.omg.CORBA.ExceptionDescription[] _exceptions)
    {
	name = _name;
	id = _id;
	defined_in = _defined_in;
	version = _version;
	result = _result;
	mode = _mode;
	contexts = _contexts;
	parameters = _parameters;
	exceptions = _exceptions;
    } // ctor

} // class OperationDescription
