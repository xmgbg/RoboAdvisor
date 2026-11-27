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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nageoffer.ai.ragent.user.dao.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserAvatarTest {

    @Test
    void existingAdminGetsLocalPortraitAndExplicitAvatarWins() {
        UserDO admin = UserDO.builder().username("admin")
                .avatar("https://static.deepseek.com/user-avatar/G_6cuD8GbD53VwGRwisvCsZ6").build();
        assertEquals("/avatars/admin.jpg", admin.displayAvatarUrl());
        admin.setAvatar("https://example.org/custom.jpg");
        assertEquals(admin.getAvatar(), admin.displayAvatarUrl());
    }

    @Test
    void employeeUsesDefaultUntilAnAvatarIsSet() {
        UserDO employee = UserDO.builder().id("100").username("employee").build();
        assertEquals("/avatars/employee-default.png", employee.displayAvatarUrl());
        employee.setAvatar("  ");
        assertEquals("/avatars/employee-default.png", employee.displayAvatarUrl());
        employee.setAvatar("https://example.org/member.jpg");
        assertEquals(employee.getAvatar(), employee.displayAvatarUrl());
        employee.setAvatar("");
        assertEquals("/avatars/employee-default.png", employee.displayAvatarUrl());
    }
}
