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
package org.o3project.ocnrm.model.och;

import java.util.List;

public class OchFlowCreationResponse {
    private LswFlow lsw;
    private List<OchFlow> och;

    public LswFlow getLsw() {
        return lsw;
    }
    public void setLsw(LswFlow lsw) {
        this.lsw = lsw;
    }
    public List<OchFlow> getOch() {
        return och;
    }
    public void setOch(List<OchFlow> och) {
        this.och = och;
    }

}
