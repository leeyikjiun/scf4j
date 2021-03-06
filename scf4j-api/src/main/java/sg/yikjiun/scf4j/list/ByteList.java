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
public interface ByteList {

    int size();

    boolean isEmpty();

    boolean contains(byte b);

    byte[] toArray();

    boolean add(byte b);

    boolean remove(byte b);

    void clear();

    byte get(int index);

    byte set(int index, byte b);

    void add(int index, byte b);

    byte removeAt(int index);

    int indexOf(byte b);

    int lastIndexOf(byte b);
}
