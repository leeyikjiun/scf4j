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
    public static ByteSet createByteHashSet() {
        return createByteHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static ByteSet createByteHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createByteHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteSet createByteHashSet(SetFactoryDelegate factory) {
        return factory.createByteHashSet();
    }

    public static BooleanSet createBooleanHashSet() {
        return createBooleanHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static BooleanSet createBooleanHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createBooleanHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanSet createBooleanHashSet(SetFactoryDelegate factory) {
        return factory.createBooleanHashSet();
    }

    public static ShortSet createShortHashSet() {
        return createShortHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static ShortSet createShortHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createShortHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortSet createShortHashSet(SetFactoryDelegate factory) {
        return factory.createShortHashSet();
    }

    public static IntSet createIntHashSet() {
        return createIntHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static IntSet createIntHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createIntHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntSet createIntHashSet(SetFactoryDelegate factory) {
        return factory.createIntHashSet();
    }

    public static LongSet createLongHashSet() {
        return createLongHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static LongSet createLongHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createLongHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongSet createLongHashSet(SetFactoryDelegate factory) {
        return factory.createLongHashSet();
    }

    public static DoubleSet createDoubleHashSet() {
        return createDoubleHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static DoubleSet createDoubleHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createDoubleHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleSet createDoubleHashSet(SetFactoryDelegate factory) {
        return factory.createDoubleHashSet();
    }

    public static FloatSet createFloatHashSet() {
        return createFloatHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static FloatSet createFloatHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createFloatHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatSet createFloatHashSet(SetFactoryDelegate factory) {
        return factory.createFloatHashSet();
    }

    public static CharSet createCharHashSet() {
        return createCharHashSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static CharSet createCharHashSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createCharHashSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharSet createCharHashSet(SetFactoryDelegate factory) {
        return factory.createCharHashSet();
    }

    public static ByteSet createByteTreeSet() {
        return createByteTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static ByteSet createByteTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createByteTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteSet createByteTreeSet(SetFactoryDelegate factory) {
        return factory.createByteTreeSet();
    }

    public static BooleanSet createBooleanTreeSet() {
        return createBooleanTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static BooleanSet createBooleanTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createBooleanTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanSet createBooleanTreeSet(SetFactoryDelegate factory) {
        return factory.createBooleanTreeSet();
    }

    public static ShortSet createShortTreeSet() {
        return createShortTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static ShortSet createShortTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createShortTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortSet createShortTreeSet(SetFactoryDelegate factory) {
        return factory.createShortTreeSet();
    }

    public static IntSet createIntTreeSet() {
        return createIntTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static IntSet createIntTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createIntTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntSet createIntTreeSet(SetFactoryDelegate factory) {
        return factory.createIntTreeSet();
    }

    public static LongSet createLongTreeSet() {
        return createLongTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static LongSet createLongTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createLongTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongSet createLongTreeSet(SetFactoryDelegate factory) {
        return factory.createLongTreeSet();
    }

    public static DoubleSet createDoubleTreeSet() {
        return createDoubleTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static DoubleSet createDoubleTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createDoubleTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleSet createDoubleTreeSet(SetFactoryDelegate factory) {
        return factory.createDoubleTreeSet();
    }

    public static FloatSet createFloatTreeSet() {
        return createFloatTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static FloatSet createFloatTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createFloatTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatSet createFloatTreeSet(SetFactoryDelegate factory) {
        return factory.createFloatTreeSet();
    }

    public static CharSet createCharTreeSet() {
        return createCharTreeSet(SetFactoryProvider.getInstance().getSetFactory());
    }

    public static CharSet createCharTreeSet(Class<SetFactoryDelegate> clazz) {
        try {
            return createCharTreeSet(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharSet createCharTreeSet(SetFactoryDelegate factory) {
        return factory.createCharTreeSet();
    }
}