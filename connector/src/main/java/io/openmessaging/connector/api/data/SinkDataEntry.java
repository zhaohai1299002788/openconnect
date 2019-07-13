/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.connector.api.data;

/**
 * SinkDataEntry is read from message queue and includes the queueOffset of the data in message queue.
 *
 * @version OMS 0.1.0
 * @since OMS 0.1.0
 */
public class SinkDataEntry extends DataEntry {

    public SinkDataEntry(Long queueOffset,
        Long timestamp,
        EntryType entryType,
        String queueName,
        Schema schema,
        Object[] payload) {
        super(timestamp, entryType, queueName, schema, payload);
        this.queueOffset = queueOffset;
    }

    /**
     * Offset in the message queue.
     */
    private Long queueOffset;

    public Long getQueueOffset() {
        return queueOffset;
    }

    public void setQueueOffset(Long queueOffset) {
        this.queueOffset = queueOffset;
    }

    @Override public String toString() {
        return "SinkDataEntry{" +
            "queueOffset=" + queueOffset +
            "} " + super.toString();
    }
}
