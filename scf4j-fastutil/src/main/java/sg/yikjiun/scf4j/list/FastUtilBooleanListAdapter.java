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
public class FastUtilBooleanListAdapter implements BooleanList {
    private final it.unimi.dsi.fastutil.booleans.BooleanList list;

    public FastUtilBooleanListAdapter(it.unimi.dsi.fastutil.booleans.BooleanList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(boolean b) {
        return list.contains(b);
    }

    public boolean[] toArray() {
        return list.toBooleanArray();
    }

    public boolean add(boolean b) {
        return list.add(b);
    }

    public boolean remove(boolean b) {
        return list.remove((Object) b);
    }

    public void clear() {
        list.clear();
    }

    public boolean get(int index) {
        return list.get(index);
    }

    public boolean set(int index, boolean b) {
        return list.set(index, b);
    }

    public void add(int index, boolean b) {
        list.add(index, b);
    }

    public boolean removeAt(int index) {
        return list.remove(index);
    }

    public int indexOf(boolean b) {
        return list.indexOf(b);
    }

    public int lastIndexOf(boolean b) {
        return list.lastIndexOf(b);
    }
}