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

import gnu.trove.list.TShortList;

/**
 * @author Lee Yik Jiun
 */
public class TroveShortListAdapter implements ShortList {
    private final TShortList list;

    public TroveShortListAdapter(TShortList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(short s) {
        return list.contains(s);
    }

    public short[] toArray() {
        return list.toArray();
    }

    public boolean add(short s) {
        return list.add(s);
    }

    public boolean remove(short s) {
        return list.remove(s);
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
        list.insert(index, s);
    }

    public short removeAt(int index) {
        return list.removeAt(index);
    }

    public int indexOf(short s) {
        return list.indexOf(s);
    }

    public int lastIndexOf(short s) {
        return list.lastIndexOf(s);
    }
}