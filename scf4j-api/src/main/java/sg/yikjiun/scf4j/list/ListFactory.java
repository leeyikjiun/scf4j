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
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createByteArrayList();
    }

    public static BooleanList createBooleanArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createBooleanArrayList();
    }

    public static ShortList createShortArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createShortArrayList();
    }

    public static IntList createIntArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createIntArrayList();
    }

    public static LongList createLongArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createLongArrayList();
    }

    public static DoubleList createDoubleArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createDoubleArrayList();
    }

    public static FloatList createFloatArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createFloatArrayList();
    }

    public static CharList createCharArrayList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createCharArrayList();
    }

    public static ByteList createByteLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createByteLinkedList();
    }

    public static BooleanList createBooleanLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createBooleanLinkedList();
    }

    public static ShortList createShortLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createShortLinkedList();
    }

    public static IntList createIntLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createIntLinkedList();
    }

    public static LongList createLongLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createLongLinkedList();
    }

    public static DoubleList createDoubleLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createDoubleLinkedList();
    }

    public static FloatList createFloatLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createFloatLinkedList();
    }

    public static CharList createCharLinkedList() {
        ListFactoryDelegate factory = ListFactoryProvider.getInstance().getListFactory();
        return factory.createCharLinkedList();
    }
}
