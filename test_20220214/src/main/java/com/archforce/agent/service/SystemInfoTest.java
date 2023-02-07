package com.archforce.agent.service;

/**
 * @author zhang
 * @className: SystemInfoTest
 * @description:
 * @date: 2022-02-14 14:16
 * @since JDK 13
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class SystemInfoTest {

    public static void main(String[] args) {

        Logger LOG = LoggerFactory.getLogger(SystemInfoTest.class);
        LOG.info("Initializing System...");

        SystemInfo si = new SystemInfo();

        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();

        System.out.println(os);

        LOG.info("Checking Computer System...");
        System.out.println(hal.getComputerSystem());

        
    }
}