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

import gnu.trove.list.*;
import gnu.trove.list.array.*;
import gnu.trove.list.linked.*;

/**
 * @author Lee Yik Jiun
 */
public class TroveListFactory implements ListFactoryDelegate {
    public ByteList createByteArrayList() {
        TByteList list = new TByteArrayList();
        return new TroveByteListAdapter(list);
    }

    public BooleanList createBooleanArrayList() {
        throw new UnsupportedOperationException("Trove does not support boolean list");
    }

    public ShortList createShortArrayList() {
        TShortList list = new TShortArrayList();
        return new TroveShortListAdapter(list);
    }

    public IntList createIntArrayList() {
        TIntList list = new TIntArrayList();
        return new TroveIntListAdapter(list);
    }

    public LongList createLongArrayList() {
        TLongList list = new TLongArrayList();
        return new TroveLongListAdapter(list);
    }

    public DoubleList createDoubleArrayList() {
        TDoubleList list = new TDoubleArrayList();
        return new TroveDoubleListAdapter(list);
    }

    public FloatList createFloatArrayList() {
        TFloatList list = new TFloatArrayList();
        return new TroveFloatListAdapter(list);
    }

    public CharList createCharArrayList() {
        TCharList list = new TCharArrayList();
        return new TroveCharListAdapter(list);
    }

    public ByteList createByteLinkedList() {
        TByteList list = new TByteLinkedList();
        return new TroveByteListAdapter(list);
    }

    public BooleanList createBooleanLinkedList() {
        throw new UnsupportedOperationException("Trove does not support boolean list");
    }

    public ShortList createShortLinkedList() {
        TShortList list = new TShortLinkedList();
        return new TroveShortListAdapter(list);
    }

    public IntList createIntLinkedList() {
        TIntList list = new TIntLinkedList();
        return new TroveIntListAdapter(list);
    }

    public LongList createLongLinkedList() {
        TLongList list = new TLongLinkedList();
        return new TroveLongListAdapter(list);
    }

    public DoubleList createDoubleLinkedList() {
        TDoubleList list = new TDoubleLinkedList();
        return new TroveDoubleListAdapter(list);
    }

    public FloatList createFloatLinkedList() {
        TFloatList list = new TFloatLinkedList();
        return new TroveFloatListAdapter(list);
    }

    public CharList createCharLinkedList() {
        TCharList list = new TCharLinkedList();
        return new TroveCharListAdapter(list);
    }
}