/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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
 */
package org.hawkular.agent.monitor.scheduler.config;

import org.hawkular.dmrclient.Address;

/**
 * A DMR resource reference that is to be monitored.
 */
public class DMRPropertyReference extends MonitoredPropertyReference {

    private final Address address;
    private final String attribute;

    public DMRPropertyReference(final Address address, final String attribute, final Interval interval) {
        super(interval);
        this.address = address;
        this.attribute = attribute;
    }

    public Address getAddress() {
        return address;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "DMRPropertyReference[address=" + address + ", attrib=" + attribute + ", interval=" + getInterval()
                + "]";
    }
}
