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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lee Yik Jiun
 */
public class JDKListFactory implements ListFactoryDelegate {
    public ByteList createByteArrayList() {
        List<Byte> list = new ArrayList<Byte>();
        return new JDKByteListAdapter(list);
    }

    public BooleanList createBooleanArrayList() {
        List<Boolean> list = new ArrayList<Boolean>();
        return new JDKBooleanListAdapter(list);
    }

    public ShortList createShortArrayList() {
        List<Short> list = new ArrayList<Short>();
        return new JDKShortListAdapter(list);
    }

    public IntList createIntArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        return new JDKIntListAdapter(list);
    }

    public LongList createLongArrayList() {
        List<Long> list = new ArrayList<Long>();
        return new JDKLongListAdapter(list);
    }

    public DoubleList createDoubleArrayList() {
        List<Double> list = new ArrayList<Double>();
        return new JDKDoubleListAdapter(list);
    }

    public FloatList createFloatArrayList() {
        List<Float> list = new ArrayList<Float>();
        return new JDKFloatListAdapter(list);
    }

    public CharList createCharArrayList() {
        List<Character> list = new ArrayList<Character>();
        return new JDKCharListAdapter(list);
    }

    public ByteList createByteLinkedList() {
        List<Byte> list = new LinkedList<Byte>();
        return new JDKByteListAdapter(list);
    }

    public BooleanList createBooleanLinkedList() {
        List<Boolean> list = new LinkedList<Boolean>();
        return new JDKBooleanListAdapter(list);
    }

    public ShortList createShortLinkedList() {
        List<Short> list = new LinkedList<Short>();
        return new JDKShortListAdapter(list);
    }

    public IntList createIntLinkedList() {
        List<Integer> list = new LinkedList<Integer>();
        return new JDKIntListAdapter(list);
    }

    public LongList createLongLinkedList() {
        List<Long> list = new LinkedList<Long>();
        return new JDKLongListAdapter(list);
    }

    public DoubleList createDoubleLinkedList() {
        List<Double> list = new LinkedList<Double>();
        return new JDKDoubleListAdapter(list);
    }

    public FloatList createFloatLinkedList() {
        List<Float> list = new LinkedList<Float>();
        return new JDKFloatListAdapter(list);
    }

    public CharList createCharLinkedList() {
        List<Character> list = new LinkedList<Character>();
        return new JDKCharListAdapter(list);
    }
}
