/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/
package com.thoughtworks.go.config.remote;


import com.thoughtworks.go.config.EnvironmentsConfig;
import com.thoughtworks.go.config.PipelineConfigs;
import com.thoughtworks.go.config.Validatable;
import com.thoughtworks.go.config.ValidationContext;
import com.thoughtworks.go.domain.ConfigErrors;
import com.thoughtworks.go.domain.PipelineGroups;

/**
 * Part of cruise configuration that can be stored outside of main cruise-config.xml.
 * It can be merged with others and main configuration.
 */
public class PartialConfig implements Validatable, ConfigOriginTraceable {
    // consider to include source of this part.

    private ConfigOrigin origin;

    private EnvironmentsConfig environments = new EnvironmentsConfig();
    private PipelineGroups pipelines = new PipelineGroups();

    public PartialConfig(){
    }
    public PartialConfig(PipelineGroups pipelines){
        this.pipelines = pipelines;
    }
    public PartialConfig(EnvironmentsConfig environments,PipelineGroups pipelines){
        this.environments = environments;
        this.pipelines = pipelines;
    }

    @Override
    public void validate(ValidationContext validationContext) {

    }

    @Override
    public ConfigErrors errors() {
        return null;
    }

    @Override
    public void addError(String fieldName, String message) {

    }


    @Override
    public ConfigOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(ConfigOrigin origin) {
        this.origin = origin;
    }

    public EnvironmentsConfig getEnvironments() {
        return environments;
    }

    public void setEnvironments(EnvironmentsConfig environments) {
        this.environments = environments;
    }

    public PipelineGroups getGroups() {
        return pipelines;
    }

    public void setPipelines(PipelineGroups pipelines) {
        this.pipelines = pipelines;
    }
}
