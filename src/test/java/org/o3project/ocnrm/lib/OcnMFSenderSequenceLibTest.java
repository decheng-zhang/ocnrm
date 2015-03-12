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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OcnMFSenderSequenceLibTest {
    private OcnMFSenderSequenceLib target;

    @Before
    public void setUp() throws Exception {
        target = OcnMFSenderSequenceLib.createInstance();
    }

    @After
    public void tearDown() throws Exception {
        target = null;
    }

    /**
     * Test method for
     * {@link org.o3project.ocnrm.lib.OcnMFSenderSequenceLib#createInstance()}
     */
    @Test
    public void testCreateInstance() {
        assertThat(OcnMFSenderSequenceLib.createInstance(),
                is(instanceOf(OcnMFSenderSequenceLib.class)));
    }

    /**
     * Test method for
     * {@link org.o3project.ocnrm.lib.OcnMFSenderSequenceLib#getNoToString()}
     */
    @Test
    public void testGetNoToString() {
        int result = target.getNo();
        assertThat(target.getNoToString(), is(Integer.toString(result)));
    }

    /**
     * Test method for
     * {@link org.o3project.ocnrm.lib.OcnMFSenderSequenceLib#requestNo()}
     */
    @Test
    public void testRequestNo() {
        int result = target.getNo() + 1;

        assertThat(target.requestNo(), is(result));
    }

    /**
     * Test method for
     * {@link org.o3project.ocnrm.lib.OcnMFSenderSequenceLib#requestNoToString()}
     */
    @Test
    public void testRequestNoToString() {
        int result = target.getNo() + 1;
        assertThat(target.requestNoToString(), is(Integer.toString(result)));
    }

    /**
     * Test method for
     * {@link org.o3project.ocnrm.lib.OcnMFSenderSequenceLib#clear()}
     */
    @Test
    public void testClear() {
        target.clear();
        assertThat(target.getNo(), is(0));
    }

}
