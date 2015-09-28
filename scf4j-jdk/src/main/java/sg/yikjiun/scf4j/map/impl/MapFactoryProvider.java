/*
 * Copyright 2015 Lee Yik Jiun
 *
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
 */

package sg.yikjiun.scf4j.map.impl;

import sg.yikjiun.scf4j.map.JDKMapFactory;
import sg.yikjiun.scf4j.map.MapFactoryDelegate;

/**
 * @author Lee Yik Jiun
 */
public class MapFactoryProvider {
    private static final MapFactoryProvider instance = new MapFactoryProvider();

    private static final MapFactoryDelegate factory = new JDKMapFactory();

    public static MapFactoryProvider getInstance() {
        return instance;
    }

    public MapFactoryDelegate getMapFactory() {
        return factory;
    }
}