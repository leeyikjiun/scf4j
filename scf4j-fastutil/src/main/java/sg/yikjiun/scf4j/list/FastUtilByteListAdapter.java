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

/**
 * @author Lee Yik Jiun
 */
public class FastUtilByteListAdapter implements ByteList {
    private final it.unimi.dsi.fastutil.bytes.ByteList list;

    public FastUtilByteListAdapter(it.unimi.dsi.fastutil.bytes.ByteList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(byte b) {
        return list.contains(b);
    }

    public byte[] toArray() {
        return list.toByteArray();
    }

    public boolean add(byte b) {
        return list.add(b);
    }

    public boolean remove(byte b) {
        return list.remove((Object) b);
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

    public byte removeAt(int index) {
        return list.remove(index);
    }

    public int indexOf(byte b) {
        return list.indexOf(b);
    }

    public int lastIndexOf(byte b) {
        return list.lastIndexOf(b);
    }
}