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

package sg.yikjiun.scf4j.set;

import sg.yikjiun.scf4j.set.impl.SetFactoryProvider;

/**
 * @author Lee Yik Jiun
 */
public class SetFactory {
    public static IntSet createIntHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createIntHashSet();
    }

    public static ShortSet createShortHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createShortHashSet();
    }

    public static ByteSet createByteHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createByteHashSet();
    }

    public static CharSet createCharHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createCharHashSet();
    }

    public static LongSet createLongHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createLongHashSet();
    }

    public static DoubleSet createDoubleHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createDoubleHashSet();
    }

    public static FloatSet createFloatHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createFloatHashSet();
    }

    public static BooleanSet createBooleanHashSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createBooleanHashSet();
    }

    public static IntSet createIntTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createIntTreeSet();
    }

    public static ShortSet createShortTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createShortTreeSet();
    }

    public static ByteSet createByteTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createByteTreeSet();
    }

    public static CharSet createCharTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createCharTreeSet();
    }

    public static LongSet createLongTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createLongTreeSet();
    }
    public static DoubleSet createDoubleTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createDoubleTreeSet();
    }

    public static FloatSet createFloatTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createFloatTreeSet();
    }

    public static BooleanSet createBooleanTreeSet() {
        SetFactoryDelegate factory = SetFactoryProvider.getInstance().getSetFactory();
        return factory.createBooleanTreeSet();
    }
}
