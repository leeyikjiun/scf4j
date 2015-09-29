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

import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.chars.CharArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;

/**
 * @author Lee Yik Jiun
 */
public class FastUtilListFactory implements ListFactoryDelegate {
    public ByteList createByteArrayList() {
        it.unimi.dsi.fastutil.bytes.ByteList list = new ByteArrayList();
        return new FastUtilByteListAdapter(list);
    }

    public BooleanList createBooleanArrayList() {
        it.unimi.dsi.fastutil.booleans.BooleanList list = new BooleanArrayList();
        return new FastUtilBooleanListAdapter(list);
    }

    public ShortList createShortArrayList() {
        it.unimi.dsi.fastutil.shorts.ShortList list = new ShortArrayList();
        return new FastUtilShortListAdapter(list);
    }

    public IntList createIntArrayList() {
        it.unimi.dsi.fastutil.ints.IntList list = new IntArrayList();
        return new FastUtilIntListAdapter(list);
    }

    public LongList createLongArrayList() {
        it.unimi.dsi.fastutil.longs.LongList list = new LongArrayList();
        return new FastUtilLongListAdapter(list);
    }

    public DoubleList createDoubleArrayList() {
        it.unimi.dsi.fastutil.doubles.DoubleList list = new DoubleArrayList();
        return new FastUtilDoubleListAdapter(list);
    }

    public FloatList createFloatArrayList() {
        it.unimi.dsi.fastutil.floats.FloatList list = new FloatArrayList();
        return new FastUtilFloatListAdapter(list);
    }

    public CharList createCharArrayList() {
        it.unimi.dsi.fastutil.chars.CharList list = new CharArrayList();
        return new FastUtilCharListAdapter(list);
    }

    public ByteList createByteLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public BooleanList createBooleanLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public ShortList createShortLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public IntList createIntLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public LongList createLongLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public DoubleList createDoubleLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public FloatList createFloatLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }

    public CharList createCharLinkedList() {
        throw new UnsupportedOperationException("FastUtil does not support linked list");
    }
}