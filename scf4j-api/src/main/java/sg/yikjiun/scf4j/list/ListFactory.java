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

package sg.yikjiun.scf4j.list;

import sg.yikjiun.scf4j.list.impl.ListFactoryProvider;

/**
 * @author Lee Yik Jiun
 */
public class ListFactory {
    public static ByteList createByteArrayList() {
        return createByteArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static ByteList createByteArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createByteArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteList createByteArrayList(ListFactoryDelegate factory) {
        return factory.createByteLinkedList();
    }

    public static BooleanList createBooleanArrayList() {
        return createBooleanArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static BooleanList createBooleanArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createBooleanArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanList createBooleanArrayList(ListFactoryDelegate factory) {
        return factory.createBooleanLinkedList();
    }

    public static ShortList createShortArrayList() {
        return createShortArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static ShortList createShortArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createShortArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortList createShortArrayList(ListFactoryDelegate factory) {
        return factory.createShortLinkedList();
    }

    public static IntList createIntArrayList() {
        return createIntArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static IntList createIntArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createIntArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntList createIntArrayList(ListFactoryDelegate factory) {
        return factory.createIntLinkedList();
    }

    public static LongList createLongArrayList() {
        return createLongArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static LongList createLongArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createLongArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongList createLongArrayList(ListFactoryDelegate factory) {
        return factory.createLongLinkedList();
    }

    public static DoubleList createDoubleArrayList() {
        return createDoubleArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static DoubleList createDoubleArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createDoubleArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleList createDoubleArrayList(ListFactoryDelegate factory) {
        return factory.createDoubleLinkedList();
    }

    public static FloatList createFloatArrayList() {
        return createFloatArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static FloatList createFloatArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createFloatArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatList createFloatArrayList(ListFactoryDelegate factory) {
        return factory.createFloatLinkedList();
    }

    public static CharList createCharArrayList() {
        return createCharArrayList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static CharList createCharArrayList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createCharArrayList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharList createCharArrayList(ListFactoryDelegate factory) {
        return factory.createCharLinkedList();
    }

    public static ByteList createByteLinkedList() {
        return createByteLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static ByteList createByteLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createByteLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteList createByteLinkedList(ListFactoryDelegate factory) {
        return factory.createByteLinkedList();
    }

    public static BooleanList createBooleanLinkedList() {
        return createBooleanLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static BooleanList createBooleanLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createBooleanLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanList createBooleanLinkedList(ListFactoryDelegate factory) {
        return factory.createBooleanLinkedList();
    }

    public static ShortList createShortLinkedList() {
        return createShortLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static ShortList createShortLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createShortLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortList createShortLinkedList(ListFactoryDelegate factory) {
        return factory.createShortLinkedList();
    }

    public static IntList createIntLinkedList() {
        return createIntLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static IntList createIntLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createIntLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntList createIntLinkedList(ListFactoryDelegate factory) {
        return factory.createIntLinkedList();
    }

    public static LongList createLongLinkedList() {
        return createLongLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static LongList createLongLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createLongLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongList createLongLinkedList(ListFactoryDelegate factory) {
        return factory.createLongLinkedList();
    }

    public static DoubleList createDoubleLinkedList() {
        return createDoubleLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static DoubleList createDoubleLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createDoubleLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleList createDoubleLinkedList(ListFactoryDelegate factory) {
        return factory.createDoubleLinkedList();
    }

    public static FloatList createFloatLinkedList() {
        return createFloatLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static FloatList createFloatLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createFloatLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatList createFloatLinkedList(ListFactoryDelegate factory) {
        return factory.createFloatLinkedList();
    }

    public static CharList createCharLinkedList() {
        return createCharLinkedList(ListFactoryProvider.getInstance().getListFactory());
    }

    public static CharList createCharLinkedList(Class<ListFactoryDelegate> clazz) {
        try {
            ListFactoryDelegate factory = clazz.newInstance();
            return createCharLinkedList(factory);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharList createCharLinkedList(ListFactoryDelegate factory) {
        return factory.createCharLinkedList();
    }
}