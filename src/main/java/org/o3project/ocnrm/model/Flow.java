/*
* Copyright 2015 FUJITSU LIMITED.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.o3project.ocnrm.model;

import java.util.List;

public class Flow {
    private String flowId;
    private List<String> linkId;
    private String srcTTP;
    private String dstTTP;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getSrcTTP() {
        return srcTTP;
    }

    public void setSrcTTP(String srcTTP) {
        this.srcTTP = srcTTP;
    }

    public String getDstTTP() {
        return dstTTP;
    }

    public void setDstTTP(String dstTTP) {
        this.dstTTP = dstTTP;
    }

    public List<String> getLinkId() {
        return linkId;
    }

    public void setLinkId(List<String> linkId) {
        this.linkId = linkId;
    }

}
