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
public class FastUtilCharListAdapter implements CharList {
    private final it.unimi.dsi.fastutil.chars.CharList list;

    public FastUtilCharListAdapter(it.unimi.dsi.fastutil.chars.CharList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(char c) {
        return list.contains(c);
    }

    public char[] toArray() {
        return list.toCharArray();
    }

    public boolean add(char c) {
        return list.add(c);
    }

    public boolean remove(char c) {
        return list.remove((Object) c);
    }

    public void clear() {
        list.clear();
    }

    public char get(int index) {
        return list.get(index);
    }

    public char set(int index, char c) {
        return list.set(index, c);
    }

    public void add(int index, char c) {
        list.add(index, c);
    }

    public char removeAt(int index) {
        return list.remove(index);
    }

    public int indexOf(char c) {
        return list.indexOf(c);
    }

    public int lastIndexOf(char c) {
        return list.lastIndexOf(c);
    }
}