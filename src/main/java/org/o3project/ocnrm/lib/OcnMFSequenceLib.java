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
package org.o3project.ocnrm.lib;

public class OcnMFSequenceLib {
    private static OcnMFSequenceLib mf = new OcnMFSequenceLib();
    private int sequenceNo = 0;

    private OcnMFSequenceLib() {

    }

    public static OcnMFSequenceLib getInstance() {
        return mf;
    }

    public int getNo() {
        return sequenceNo;
    }

    public String getNoToString() {
        return Integer.toString(sequenceNo);
    }

    public synchronized int requestNo() {
        sequenceNo++;
        return sequenceNo;
    }

    public synchronized String requestNoToString() {
        sequenceNo++;
        return Integer.toString(sequenceNo);
    }

    public void clear() {
        sequenceNo = 0;
    }

}
