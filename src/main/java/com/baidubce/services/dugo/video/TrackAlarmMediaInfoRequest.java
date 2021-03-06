/*
 * Copyright 2019 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.dugo.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.baidubce.services.dugo.AbstractDuGoRequest;

/**
 * track alarm media info request
 *
 * @Author: shihuike
 * @Date: Created in 2019-08-01 16:55
 */
public class TrackAlarmMediaInfoRequest extends AbstractDuGoRequest {
    private String vehicleId;
    private Long startTime;
    private Long endTime;
    private List<String> AlarmTypeList = new ArrayList<String>();

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public List<String> getAlarmTypeList() {
        return AlarmTypeList;
    }

    public void setAlarmTypeList(List<String> alarmTypeList) {
        AlarmTypeList = alarmTypeList;
    }
}
