/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.geosolutions.geobatch.task;

import it.geosolutions.geobatch.configuration.event.action.ActionConfiguration;

import java.util.Map;

/**
 * Comments here ...
 * 
 * @author Daniele Romagnoli, GeoSolutions S.a.S.
 */
public class TaskExecutorConfiguration extends ActionConfiguration {

    public String getXsl() {
        return xsl;
    }

    public void setXsl(String xsl) {
        this.xsl = xsl;
    }

    public String getExecutable() {
        return executable;
    }

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    public String getErrorFile() {
        return errorFile;
    }

    public void setErrorFile(String errorFile) {
        this.errorFile = errorFile;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public String getDefaultScript() {
        return defaultScript;
    }

    public void setDefaultScript(String defaultScript) {
        this.defaultScript = defaultScript;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public String getOutputName() {
        return outputName;
    }

    private String executable;

    private String errorFile;

    private Long timeOut;

    private String outputName;

    private String defaultScript;

    private String output;

    // private boolean spawn;

    private Map<String, String> variables;

    private String xsl;

//    public TaskExecutorConfiguration() {
//        super();
//    }

    public TaskExecutorConfiguration(String id, String name, String description) {
        super(id, name, description);
    }

    public TaskExecutorConfiguration clone() { // throws
        // CloneNotSupportedException {
        final TaskExecutorConfiguration copy=(TaskExecutorConfiguration)super.clone();
        
        copy.setDefaultScript(getDefaultScript());
        copy.setErrorFile(getErrorFile());
        copy.setExecutable(getExecutable());
        copy.setOutput(getOutput());
        copy.setOutputName(getOutputName());
//        copy.setServiceID(getServiceID());
        copy.setTimeOut(getTimeOut());
        copy.setVariables(getVariables());
        copy.setXsl(getXsl());
        
        return copy;
    }

    /**
     * @param output
     *            the output to set
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * @return the output
     */
    public String getOutput() {
        return output;
    }

}
