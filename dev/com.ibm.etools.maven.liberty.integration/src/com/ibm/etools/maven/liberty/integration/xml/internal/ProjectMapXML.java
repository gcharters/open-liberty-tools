/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.etools.maven.liberty.integration.xml.internal;

import com.ibm.etools.maven.liberty.integration.internal.Activator;
import com.ibm.ws.st.liberty.buildplugin.integration.xml.internal.AbstractProjectMapXML;

public class ProjectMapXML extends AbstractProjectMapXML {

    private static ProjectMapXML instance;
    public static final String PROJECT_MAP_FILE_NAME = "mavenProjectMapping.xml";

    private ProjectMapXML() {
        super(Activator.getLibertyMavenMetadataPath().append(PROJECT_MAP_FILE_NAME).toFile());
    }

    public static ProjectMapXML instance() {
        if (instance != null)
            return instance;
        instance = new ProjectMapXML();
        return instance;
    }

}
