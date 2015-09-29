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
public class FastUtilShortListAdapter implements ShortList {
    private final it.unimi.dsi.fastutil.shorts.ShortList list;

    public FastUtilShortListAdapter(it.unimi.dsi.fastutil.shorts.ShortList list) {
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

    public short[] toArray() {
        return list.toShortArray();
    }

    public boolean add(short s) {
        return list.add(s);
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public void clear() {
        list.clear();
    }

    public short get(int index) {
        return list.get(index);
    }

    public short set(int index, short s) {
        return list.set(index, s);
    }

    public void add(int index, short s) {
        list.add(index, s);
    }

    public short remove(int index) {
        return list.remove(index);
    }

    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }
}