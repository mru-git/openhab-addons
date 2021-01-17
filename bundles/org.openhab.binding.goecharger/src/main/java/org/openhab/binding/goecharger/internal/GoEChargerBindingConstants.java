/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.goecharger.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link GoEChargerBindingConstants} class defines common constants, which
 * are used across the whole binding.
 *
 * @author Samuel Brucksch - Initial contribution
 */
@NonNullByDefault
public class GoEChargerBindingConstants {

    private static final String BINDING_ID = "goecharger";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_GOE = new ThingTypeUID(BINDING_ID, "goe");

    // List of all Channel ids
    public static final String MAX_CURRENT = "maxCurrent";
    public static final String ACCESS_CONFIGURATION = "accessConfiguration";
    public static final String PWM_SIGNAL = "pwmSignal";
    public static final String ERROR = "error";
    public static final String VOLTAGE_L1 = "voltageL1";
    public static final String VOLTAGE_L2 = "voltageL2";
    public static final String VOLTAGE_L3 = "voltageL3";
    public static final String CURRENT_L1 = "currentL1";
    public static final String CURRENT_L2 = "currentL2";
    public static final String CURRENT_L3 = "currentL3";
    public static final String POWER_L1 = "powerL1";
    public static final String POWER_L2 = "powerL2";
    public static final String POWER_L3 = "powerL3";
    public static final String ALLOW_CHARGING = "allowCharging";
    public static final String CABLE_ENCODING = "cableCurrent";
    public static final String PHASES = "phases";
    public static final String TEMPERATURE = "temperature";
    public static final String SESSION_CHARGE_CONSUMPTION = "sessionChargedEnergy";
    public static final String SESSION_CHARGE_CONSUMPTION_LIMIT = "sessionChargeEnergyLimit";
    public static final String TOTAL_CONSUMPTION = "totalChargedEnergy";
    public static final String FIRMWARE = "firmware";
    public static final String RF_01_CHARGE_CONSUMPTION = "rf01ChargedEnergy";
    public static final String RF_02_CHARGE_CONSUMPTION = "rf02ChargedEnergy";
    public static final String RF_03_CHARGE_CONSUMPTION = "rf03ChargedEnergy";
    public static final String RF_04_CHARGE_CONSUMPTION = "rf04ChargedEnergy";
    public static final String RF_05_CHARGE_CONSUMPTION = "rf05ChargedEnergy";
    public static final String RF_06_CHARGE_CONSUMPTION = "rf06ChargedEnergy";
    public static final String RF_07_CHARGE_CONSUMPTION = "rf07ChargedEnergy";
    public static final String RF_08_CHARGE_CONSUMPTION = "rf08ChargedEnergy";
    public static final String RF_09_CHARGE_CONSUMPTION = "rf09ChargedEnergy";
    public static final String RF_10_CHARGE_CONSUMPTION = "rf10ChargedEnergy";
    
    public static final String API_URL = "http://%IP%/status";
    public static final String MQTT_URL = "http://%IP%/mqtt?payload=%KEY%=%VALUE%";
}
