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
        return null;
    }

    public static ByteSet createByteHashSet() {
        return null;
    }

    public static CharSet createCharHashSet() {
        return null;
    }

    public static LongSet createLongHashSet() {
        return null;
    }

    public static DoubleSet createDoubleHashSet() {
        return null;
    }

    public static FloatSet createFloatHashSet() {
        return null;
    }

    public static BooleanSet createBooleanHashSet() {
        return null;
    }

    public static IntSet createIntTreeSet() {
        return null;
    }

    public static ShortSet createShortTreeSet() {
        return null;
    }

    public static ByteSet createByteTreeSet() {
        return null;
    }

    public static CharSet createCharTreeSet() {
        return null;
    }

    public static LongSet createLongTreeSet() {
        return null;
    }

    public static DoubleSet createDoubleTreeSet() {
        return null;
    }

    public static FloatSet createFloatTreeSet() {
        return null;
    }

    public static BooleanSet createBooleanTreeSet() {
        return null;
    }
}
