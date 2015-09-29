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
public interface IntList {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    int[] toArray();

    boolean add(int i);

    boolean remove(Object o);

    void clear();

    int get(int index);

    int set(int index, int i);

    void add(int index, int i);

    int remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);
}