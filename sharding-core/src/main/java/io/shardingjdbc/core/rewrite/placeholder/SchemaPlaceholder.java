/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.core.rewrite.placeholder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Schema placeholder for rewrite.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
public final class SchemaPlaceholder implements ShardingPlaceholder {
    
    private final String logicSchemaName;
    
    private final String logicTableName;
    
    @Override
    public String toString() {
        return logicSchemaName;
    }
}
