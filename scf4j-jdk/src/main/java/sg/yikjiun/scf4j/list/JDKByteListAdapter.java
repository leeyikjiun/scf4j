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

import java.util.List;
/**
 * @author Lee Yik Jiun
 */
public class JDKByteListAdapter implements ByteList {
    private final List<Byte> list;

    public JDKByteListAdapter(List<Byte> list) {
        this.list = list;
    }

public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public byte[] toArray() {
        byte[] arr = new byte[list.size()];
        int i = 0;
        for (Byte b : list) {
            arr[i++] = b;
        }
        return arr;
    }

    public boolean add(byte b) {
        return list.add(b);
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public void clear() {
        list.clear();
    }

    public byte get(int index) {
        return list.get(index);
    }

    public byte set(int index, byte b) {
        return list.set(index, b);
    }

    public void add(int index, byte b) {
        list.add(index, b);
    }

    public byte remove(int index) {
        return list.remove(index);
    }

    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }
}