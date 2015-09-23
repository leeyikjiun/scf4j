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

package sg.yikjiun.scf4j;

import sg.yikjiun.scf4j.impl.IntIntMapFactoryAdapter;
import sg.yikjiun.scf4j.impl.IntSetFactoryAdapter;

/**
 * @author Lee Yik Jiun
 */
public class IntSetFactory {
    public static IntSet createIntHashSet() {
        IntSetFactoryAdapter factoryAdapter = IntSetFactoryAdapter.getInstance();
        return factoryAdapter.createIntSet();
    }

    public static IntSet createIntHashSet(Class<? extends IIntSetFactory> clazz) {
        IntSet set = null;
        try {
            IIntSetFactory factory = clazz.newInstance();
            set = factory.createIntHashSet();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return set;
    }
}
